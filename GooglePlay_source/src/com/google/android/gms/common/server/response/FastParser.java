// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, PostProcessor

public final class FastParser
{
    public static final class ParseException extends Exception
    {

        public ParseException(String s)
        {
            super(s);
        }

        public ParseException(String s, Throwable throwable)
        {
            super(s, throwable);
        }

        public ParseException(Throwable throwable)
        {
            super(throwable);
        }
    }

    private static interface ParseHelper
    {

        public abstract Object parse(FastParser fastparser, BufferedReader bufferedreader)
            throws ParseException, IOException;
    }


    private static final char BASE64_ALLOWED_CONTROL_CHARS[] = {
        '\n'
    };
    private static final ParseHelper BIG_DECIMAL_PARSE_HELPER = new ParseHelper() {

        public final volatile Object parse(FastParser fastparser, BufferedReader bufferedreader)
            throws ParseException, IOException
        {
            return fastparser.parseBigDecimal(bufferedreader);
        }

    };
    private static final ParseHelper BIG_INTEGER_PARSE_HELPER = new ParseHelper() {

        public final volatile Object parse(FastParser fastparser, BufferedReader bufferedreader)
            throws ParseException, IOException
        {
            return fastparser.parseBigInteger(bufferedreader);
        }

    };
    private static final ParseHelper BOOLEAN_PARSE_HELPER = new ParseHelper() {

        public final volatile Object parse(FastParser fastparser, BufferedReader bufferedreader)
            throws ParseException, IOException
        {
            return Boolean.valueOf(fastparser.parseBoolean(bufferedreader));
        }

    };
    private static final ParseHelper DOUBLE_PARSE_HELPER = new ParseHelper() {

        public final volatile Object parse(FastParser fastparser, BufferedReader bufferedreader)
            throws ParseException, IOException
        {
            return Double.valueOf(fastparser.parseDouble(bufferedreader));
        }

    };
    private static final char FALSE_TRAIL[] = {
        'a', 'l', 's', 'e'
    };
    private static final char FALSE_TRAIL_IN_STRING[] = {
        'a', 'l', 's', 'e', '"'
    };
    private static final ParseHelper FLOAT_PARSE_HELPER = new ParseHelper() {

        public final volatile Object parse(FastParser fastparser, BufferedReader bufferedreader)
            throws ParseException, IOException
        {
            return Float.valueOf(fastparser.parseFloat(bufferedreader));
        }

    };
    private static final ParseHelper INTEGER_PARSE_HELPER = new ParseHelper() {

        public final volatile Object parse(FastParser fastparser, BufferedReader bufferedreader)
            throws ParseException, IOException
        {
            return Integer.valueOf(fastparser.parseInt(bufferedreader));
        }

    };
    private static final ParseHelper LONG_PARSE_HELPER = new ParseHelper() {

        public final volatile Object parse(FastParser fastparser, BufferedReader bufferedreader)
            throws ParseException, IOException
        {
            return Long.valueOf(fastparser.parseLong(bufferedreader));
        }

    };
    private static final char NULL_TRAIL[] = {
        'u', 'l', 'l'
    };
    private static final ParseHelper STRING_PARSE_HELPER = new ParseHelper() {

        public final volatile Object parse(FastParser fastparser, BufferedReader bufferedreader)
            throws ParseException, IOException
        {
            return fastparser.parseString(bufferedreader);
        }

    };
    private static final char TRUE_TRAIL[] = {
        'r', 'u', 'e'
    };
    private static final char TRUE_TRAIL_IN_STRING[] = {
        'r', 'u', 'e', '"'
    };
    private final char mChar[] = new char[1];
    private final char mLargeBuf[] = new char[1024];
    private final StringBuilder mLargeSb = new StringBuilder(1024);
    private final char mSmallBuf[] = new char[32];
    private final StringBuilder mSmallSb = new StringBuilder(32);
    private final Stack mStateStack = new Stack();

    public FastParser()
    {
    }

    private void assumePop(int i)
        throws ParseException
    {
        if (mStateStack.isEmpty())
        {
            throw new ParseException((new StringBuilder("Expected state ")).append(i).append(" but had empty stack").toString());
        }
        int j = ((Integer)mStateStack.pop()).intValue();
        if (j != i)
        {
            throw new ParseException((new StringBuilder("Expected state ")).append(i).append(" but had ").append(j).toString());
        } else
        {
            return;
        }
    }

    private void expectChars(BufferedReader bufferedreader, char ac[])
        throws ParseException, IOException
    {
        int k;
        for (int i = 0; i < ac.length; i += k)
        {
            k = bufferedreader.read(mSmallBuf, 0, ac.length - i);
            if (k == -1)
            {
                throw new ParseException("Unexpected EOF");
            }
            for (int j = 0; j < k; j++)
            {
                if (ac[j + i] != mSmallBuf[j])
                {
                    throw new ParseException("Unexpected character");
                }
            }

        }

    }

    private ArrayList parseArray(BufferedReader bufferedreader, ParseHelper parsehelper)
        throws ParseException, IOException
    {
        char c = readNextNonWhitespaceChar(bufferedreader);
        if (c == 'n')
        {
            expectChars(bufferedreader, NULL_TRAIL);
            return null;
        }
        if (c != '[')
        {
            throw new ParseException("Expected start of array");
        }
        mStateStack.push(Integer.valueOf(5));
        ArrayList arraylist = new ArrayList();
        do
        {
            bufferedreader.mark(1024);
            switch (readNextNonWhitespaceChar(bufferedreader))
            {
            default:
                bufferedreader.reset();
                arraylist.add(parsehelper.parse(this, bufferedreader));
                break;

            case 93: // ']'
                assumePop(5);
                return arraylist;

            case 0: // '\0'
                throw new ParseException("Unexpected EOF");

            case 44: // ','
                break;
            }
        } while (true);
    }

    private BigDecimal parseBigDecimal(BufferedReader bufferedreader)
        throws ParseException, IOException
    {
        int i = readValueChars(bufferedreader, mLargeBuf);
        if (i == 0)
        {
            return null;
        } else
        {
            return new BigDecimal(new String(mLargeBuf, 0, i));
        }
    }

    private BigInteger parseBigInteger(BufferedReader bufferedreader)
        throws ParseException, IOException
    {
        int i = readValueChars(bufferedreader, mLargeBuf);
        if (i == 0)
        {
            return null;
        } else
        {
            return new BigInteger(new String(mLargeBuf, 0, i));
        }
    }

    private boolean parseBoolean(BufferedReader bufferedreader, boolean flag)
        throws ParseException, IOException
    {
        do
        {
            char c = readNextNonWhitespaceChar(bufferedreader);
            switch (c)
            {
            default:
                throw new ParseException((new StringBuilder("Unexpected token: ")).append(c).toString());

            case 110: // 'n'
                expectChars(bufferedreader, NULL_TRAIL);
                return false;

            case 116: // 't'
                char ac[];
                if (flag)
                {
                    ac = TRUE_TRAIL_IN_STRING;
                } else
                {
                    ac = TRUE_TRAIL;
                }
                expectChars(bufferedreader, ac);
                return true;

            case 102: // 'f'
                char ac1[];
                if (flag)
                {
                    ac1 = FALSE_TRAIL_IN_STRING;
                } else
                {
                    ac1 = FALSE_TRAIL;
                }
                expectChars(bufferedreader, ac1);
                return false;

            case 34: // '"'
                break;
            }
            if (flag)
            {
                throw new ParseException("No boolean value found in string");
            }
            flag = true;
        } while (true);
    }

    private double parseDouble(BufferedReader bufferedreader)
        throws ParseException, IOException
    {
        int i = readValueChars(bufferedreader, mLargeBuf);
        if (i == 0)
        {
            return 0.0D;
        } else
        {
            return Double.parseDouble(new String(mLargeBuf, 0, i));
        }
    }

    private float parseFloat(BufferedReader bufferedreader)
        throws ParseException, IOException
    {
        int i = readValueChars(bufferedreader, mLargeBuf);
        if (i == 0)
        {
            return 0.0F;
        } else
        {
            return Float.parseFloat(new String(mLargeBuf, 0, i));
        }
    }

    private int parseInt(BufferedReader bufferedreader)
        throws ParseException, IOException
    {
        int i = 0;
        boolean flag = false;
        int j1 = readValueChars(bufferedreader, mLargeBuf);
        if (j1 == 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            bufferedreader = mLargeBuf;
            int l;
            boolean flag1;
            if (j1 > 0)
            {
                int j;
                int i1;
                if (bufferedreader[0] == '-')
                {
                    i1 = 0x80000000;
                    flag1 = true;
                    j = 1;
                } else
                {
                    i1 = 0x80000001;
                    flag1 = false;
                    j = 0;
                }
                l = j;
                if (j < j1)
                {
                    i = Character.digit(bufferedreader[j], 10);
                    if (i < 0)
                    {
                        throw new ParseException("Unexpected non-digit character");
                    }
                    i = -i;
                    l = j + 1;
                }
                for (; l < j1; l++)
                {
                    int k = Character.digit(bufferedreader[l], 10);
                    if (k < 0)
                    {
                        throw new ParseException("Unexpected non-digit character");
                    }
                    if (i < 0xf3333334)
                    {
                        throw new ParseException("Number too large");
                    }
                    i *= 10;
                    if (i < i1 + k)
                    {
                        throw new ParseException("Number too large");
                    }
                    i -= k;
                }

            } else
            {
                throw new ParseException("No number to parse");
            }
            if (flag1)
            {
                if (l <= 1)
                {
                    throw new ParseException("No digits to parse");
                }
            } else
            {
                return -i;
            }
        }
        return i;
    }

    private long parseLong(BufferedReader bufferedreader)
        throws ParseException, IOException
    {
        long l1 = 0L;
        int l = readValueChars(bufferedreader, mLargeBuf);
        if (l != 0)
        {
            bufferedreader = mLargeBuf;
            int i;
            boolean flag;
            if (l > 0)
            {
                long l2;
                if (bufferedreader[0] == '-')
                {
                    l2 = 0x8000000000000000L;
                    i = 1;
                    flag = true;
                } else
                {
                    l2 = 0x8000000000000001L;
                    i = 0;
                    flag = false;
                }
                if (i < l)
                {
                    int j = i + 1;
                    i = Character.digit(bufferedreader[i], 10);
                    if (i < 0)
                    {
                        throw new ParseException("Unexpected non-digit character");
                    }
                    l1 = -i;
                    i = j;
                }
                for (; i < l; i++)
                {
                    int k = Character.digit(bufferedreader[i], 10);
                    if (k < 0)
                    {
                        throw new ParseException("Unexpected non-digit character");
                    }
                    if (l1 < 0xf333333333333334L)
                    {
                        throw new ParseException("Number too large");
                    }
                    l1 *= 10L;
                    if (l1 < (long)k + l2)
                    {
                        throw new ParseException("Number too large");
                    }
                    l1 -= k;
                }

            } else
            {
                throw new ParseException("No number to parse");
            }
            if (flag)
            {
                if (i <= 1)
                {
                    throw new ParseException("No digits to parse");
                }
            } else
            {
                return -l1;
            }
        }
        return l1;
    }

    private boolean parseObject(BufferedReader bufferedreader, FastJsonResponse fastjsonresponse)
        throws ParseException, IOException
    {
        Object obj;
        Map map;
        map = fastjsonresponse.getFieldMappings();
        String s = readFieldKey(bufferedreader);
        obj = s;
        if (s == null)
        {
            assumePop(1);
            return false;
        }
_L26:
        if (obj == null) goto _L2; else goto _L1
_L1:
        FastJsonResponse.Field field;
        field = (FastJsonResponse.Field)map.get(obj);
        if (field == null)
        {
            obj = skipToNextField(bufferedreader);
            continue; /* Loop/switch isn't completed */
        }
        mStateStack.push(Integer.valueOf(4));
        field.getTypeIn();
        JVM INSTR tableswitch 0 11: default 144
    //                   0 173
    //                   1 279
    //                   2 318
    //                   3 357
    //                   4 396
    //                   5 435
    //                   6 474
    //                   7 514
    //                   8 553
    //                   9 601
    //                   10 629
    //                   11 924;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L3:
        throw new ParseException((new StringBuilder("Invalid field type ")).append(field.getTypeIn()).toString());
_L4:
        char c;
        if (field.isTypeInArray())
        {
            fastjsonresponse.setIntegers(field, parseArray(bufferedreader, INTEGER_PARSE_HELPER));
        } else
        {
            fastjsonresponse.setInteger(field, parseInt(bufferedreader));
        }
_L16:
        assumePop(4);
        assumePop(2);
        c = readNextNonWhitespaceChar(bufferedreader);
        String s1;
        char c1;
        switch (c)
        {
        default:
            throw new ParseException((new StringBuilder("Expected end of object or field separator, but found: ")).append(c).toString());

        case 125: // '}'
            obj = null;
            break;

        case 44: // ','
            obj = readFieldKey(bufferedreader);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (field.isTypeInArray())
        {
            fastjsonresponse.setBigIntegers(field, parseArray(bufferedreader, BIG_INTEGER_PARSE_HELPER));
        } else
        {
            fastjsonresponse.setBigInteger(field, parseBigInteger(bufferedreader));
        }
          goto _L16
_L6:
        if (field.isTypeInArray())
        {
            fastjsonresponse.setLongs(field, parseArray(bufferedreader, LONG_PARSE_HELPER));
        } else
        {
            fastjsonresponse.setLong(field, parseLong(bufferedreader));
        }
          goto _L16
_L7:
        if (field.isTypeInArray())
        {
            fastjsonresponse.setFloats(field, parseArray(bufferedreader, FLOAT_PARSE_HELPER));
        } else
        {
            fastjsonresponse.setFloat(field, parseFloat(bufferedreader));
        }
          goto _L16
_L8:
        if (field.isTypeInArray())
        {
            fastjsonresponse.setDoubles(field, parseArray(bufferedreader, DOUBLE_PARSE_HELPER));
        } else
        {
            fastjsonresponse.setDouble(field, parseDouble(bufferedreader));
        }
          goto _L16
_L9:
        if (field.isTypeInArray())
        {
            fastjsonresponse.setBigDecimals(field, parseArray(bufferedreader, BIG_DECIMAL_PARSE_HELPER));
        } else
        {
            fastjsonresponse.setBigDecimal(field, parseBigDecimal(bufferedreader));
        }
          goto _L16
_L10:
        if (field.isTypeInArray())
        {
            fastjsonresponse.setBooleans(field, parseArray(bufferedreader, BOOLEAN_PARSE_HELPER));
        } else
        {
            fastjsonresponse.setBoolean(field, parseBoolean(bufferedreader, false));
        }
          goto _L16
_L11:
        if (field.isTypeInArray())
        {
            fastjsonresponse.setStrings(field, parseArray(bufferedreader, STRING_PARSE_HELPER));
        } else
        {
            fastjsonresponse.setString(field, parseString(bufferedreader));
        }
          goto _L16
_L12:
        obj = parseString(bufferedreader, mLargeBuf, mLargeSb, BASE64_ALLOWED_CONTROL_CHARS);
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = Base64.decode(((String) (obj)), 0);
        }
        fastjsonresponse.setDecodedBytes(field, ((byte []) (obj)));
          goto _L16
_L13:
        fastjsonresponse.setDecodedBytes(field, Base64Utils.decodeUrlSafe(parseString(bufferedreader, mLargeBuf, mLargeSb, BASE64_ALLOWED_CONTROL_CHARS)));
          goto _L16
_L14:
        c1 = readNextNonWhitespaceChar(bufferedreader);
        if (c1 != 'n') goto _L18; else goto _L17
_L17:
        expectChars(bufferedreader, NULL_TRAIL);
        obj = null;
_L24:
        fastjsonresponse.setStringMap(field, ((Map) (obj)));
          goto _L16
_L18:
        if (c1 != '{')
        {
            throw new ParseException("Expected start of a map object");
        }
        mStateStack.push(Integer.valueOf(1));
        obj = new HashMap();
_L19:
        readNextNonWhitespaceChar(bufferedreader);
        JVM INSTR lookupswitch 3: default 744
    //                   0: 747
    //                   34: 757
    //                   125: 916;
           goto _L19 _L20 _L21 _L22
_L20:
        throw new ParseException("Unexpected EOF");
_L21:
        s1 = readString(bufferedreader, mSmallBuf, mSmallSb, null);
        if (readNextNonWhitespaceChar(bufferedreader) != ':')
        {
            throw new ParseException((new StringBuilder("No map value found for key ")).append(s1).toString());
        }
        if (readNextNonWhitespaceChar(bufferedreader) != '"')
        {
            throw new ParseException((new StringBuilder("Expected String value for key ")).append(s1).toString());
        }
        ((HashMap) (obj)).put(s1, readString(bufferedreader, mSmallBuf, mSmallSb, null));
        c = readNextNonWhitespaceChar(bufferedreader);
        if (c == ',') goto _L19; else goto _L23
_L23:
        if (c == '}')
        {
            assumePop(1);
        } else
        {
            throw new ParseException((new StringBuilder("Unexpected character while parsing string map: ")).append(c).toString());
        }
          goto _L24
_L22:
        assumePop(1);
          goto _L24
_L15:
        if (field.isTypeInArray())
        {
            c1 = readNextNonWhitespaceChar(bufferedreader);
            if (c1 == 'n')
            {
                expectChars(bufferedreader, NULL_TRAIL);
                fastjsonresponse.addConcreteTypeArrayInternal(field, field.getOutputFieldName(), null);
            } else
            {
                mStateStack.push(Integer.valueOf(5));
                if (c1 != '[')
                {
                    throw new ParseException("Expected array start");
                }
                fastjsonresponse.addConcreteTypeArrayInternal(field, field.getOutputFieldName(), parseObjectArray(bufferedreader, field));
            }
        } else
        {
            c1 = readNextNonWhitespaceChar(bufferedreader);
            if (c1 == 'n')
            {
                expectChars(bufferedreader, NULL_TRAIL);
                fastjsonresponse.addConcreteTypeInternal(field, field.getOutputFieldName(), null);
            } else
            {
                mStateStack.push(Integer.valueOf(1));
                if (c1 != '{')
                {
                    throw new ParseException("Expected start of object");
                }
                try
                {
                    obj = field.newConcreteTypeInstance();
                    parseObject(bufferedreader, ((FastJsonResponse) (obj)));
                    fastjsonresponse.addConcreteTypeInternal(field, field.getOutputFieldName(), ((FastJsonResponse) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (BufferedReader bufferedreader)
                {
                    throw new ParseException("Error instantiating inner object", bufferedreader);
                }
                // Misplaced declaration of an exception variable
                catch (BufferedReader bufferedreader)
                {
                    throw new ParseException("Error instantiating inner object", bufferedreader);
                }
            }
        }
          goto _L16
_L2:
        bufferedreader = fastjsonresponse.getPostProcessor();
        if (bufferedreader != null)
        {
            bufferedreader.postProcess(fastjsonresponse);
        }
        assumePop(1);
        return true;
        if (true) goto _L26; else goto _L25
_L25:
    }

    private ArrayList parseObjectArray(BufferedReader bufferedreader, FastJsonResponse.Field field)
        throws ParseException, IOException
    {
        char c;
        ArrayList arraylist;
        arraylist = new ArrayList();
        c = readNextNonWhitespaceChar(bufferedreader);
        c;
        JVM INSTR lookupswitch 3: default 52
    //                   93: 77
    //                   110: 181
    //                   123: 85;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new ParseException((new StringBuilder("Unexpected token: ")).append(c).toString());
_L2:
        assumePop(5);
_L6:
        return arraylist;
_L4:
        mStateStack.push(Integer.valueOf(1));
_L10:
        FastJsonResponse fastjsonresponse = field.newConcreteTypeInstance();
        if (!parseObject(bufferedreader, fastjsonresponse)) goto _L6; else goto _L5
_L5:
        arraylist.add(fastjsonresponse);
        c = readNextNonWhitespaceChar(bufferedreader);
        c;
        JVM INSTR lookupswitch 2: default 156
    //                   44: 222
    //                   93: 258;
           goto _L7 _L8 _L9
_L7:
        throw new ParseException((new StringBuilder("Unexpected token: ")).append(c).toString());
_L3:
        expectChars(bufferedreader, NULL_TRAIL);
        assumePop(5);
        return null;
        bufferedreader;
        throw new ParseException("Error instantiating inner object", bufferedreader);
        bufferedreader;
        throw new ParseException("Error instantiating inner object", bufferedreader);
_L8:
        if (readNextNonWhitespaceChar(bufferedreader) != '{')
        {
            throw new ParseException("Expected start of next object in array");
        }
        mStateStack.push(Integer.valueOf(1));
          goto _L10
_L9:
        assumePop(5);
        return arraylist;
    }

    private String parseString(BufferedReader bufferedreader)
        throws ParseException, IOException
    {
        return parseString(bufferedreader, mSmallBuf, mSmallSb, null);
    }

    private String parseString(BufferedReader bufferedreader, char ac[], StringBuilder stringbuilder, char ac1[])
        throws ParseException, IOException
    {
        switch (readNextNonWhitespaceChar(bufferedreader))
        {
        default:
            throw new ParseException("Expected string");

        case 34: // '"'
            return readString(bufferedreader, ac, stringbuilder, ac1);

        case 110: // 'n'
            expectChars(bufferedreader, NULL_TRAIL);
            break;
        }
        return null;
    }

    private String readFieldKey(BufferedReader bufferedreader)
        throws ParseException, IOException
    {
        char c;
        String s;
        s = null;
        mStateStack.push(Integer.valueOf(2));
        c = readNextNonWhitespaceChar(bufferedreader);
        c;
        JVM INSTR lookupswitch 3: default 56
    //                   34: 105
    //                   93: 88
    //                   125: 81;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new ParseException((new StringBuilder("Unexpected token: ")).append(c).toString());
_L4:
        assumePop(2);
_L6:
        return s;
_L3:
        assumePop(2);
        assumePop(1);
        assumePop(5);
        return null;
_L2:
        mStateStack.push(Integer.valueOf(3));
        s = readString(bufferedreader, mSmallBuf, mSmallSb, null);
        assumePop(3);
        if (readNextNonWhitespaceChar(bufferedreader) != ':')
        {
            throw new ParseException("Expected key/value separator");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private char readNextNonWhitespaceChar(BufferedReader bufferedreader)
        throws ParseException, IOException
    {
        if (bufferedreader.read(mChar) == -1)
        {
            return '\0';
        }
        while (Character.isWhitespace(mChar[0])) 
        {
            if (bufferedreader.read(mChar) == -1)
            {
                return '\0';
            }
        }
        return mChar[0];
    }

    private static String readString(BufferedReader bufferedreader, char ac[], StringBuilder stringbuilder, char ac1[])
        throws ParseException, IOException
    {
        boolean flag;
        boolean flag1;
        stringbuilder.setLength(0);
        flag = false;
        flag1 = false;
        bufferedreader.mark(ac.length);
_L9:
        int i;
        int k;
        k = bufferedreader.read(ac);
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L7:
        if (i >= k) goto _L2; else goto _L1
_L1:
        char c;
        int j;
        c = ac[i];
        if (!Character.isISOControl(c))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (ac1 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        j = 0;
_L5:
        if (j >= ac1.length)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        if (ac1[j] != c) goto _L4; else goto _L3
_L3:
        j = 1;
_L6:
        if (j == 0)
        {
            throw new ParseException("Unexpected control character while reading string");
        }
        break MISSING_BLOCK_LABEL_111;
_L4:
        j++;
          goto _L5
        j = 0;
          goto _L6
        if (c == '"' && !flag)
        {
            stringbuilder.append(ac, 0, i);
            bufferedreader.reset();
            bufferedreader.skip(i + 1);
            if (flag1)
            {
                return JsonUtils.unescapeString(stringbuilder.toString());
            } else
            {
                return stringbuilder.toString();
            }
        }
        if (c == '\\')
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = true;
        } else
        {
            flag = false;
        }
        i++;
          goto _L7
_L2:
        stringbuilder.append(ac, 0, k);
        bufferedreader.mark(ac.length);
        if (true) goto _L9; else goto _L8
_L8:
        throw new ParseException("Unexpected EOF while parsing string");
    }

    private int readValueChars(BufferedReader bufferedreader, char ac[])
        throws ParseException, IOException
    {
        char c = readNextNonWhitespaceChar(bufferedreader);
        if (c == 0)
        {
            throw new ParseException("Unexpected EOF");
        }
        if (c == ',')
        {
            throw new ParseException("Missing value");
        }
        if (c == 'n')
        {
            expectChars(bufferedreader, NULL_TRAIL);
            return 0;
        }
        bufferedreader.mark(1024);
        int i = 1;
        int k;
        if (c == '"')
        {
            int j = 0;
            i = 0;
            do
            {
                k = j;
                if (j >= ac.length)
                {
                    break;
                }
                k = j;
                if (bufferedreader.read(ac, j, 1) == -1)
                {
                    break;
                }
                c = ac[j];
                if (Character.isISOControl(c))
                {
                    throw new ParseException("Unexpected control character while reading string");
                }
                if (c == '"' && i == 0)
                {
                    bufferedreader.reset();
                    bufferedreader.skip(j + 1);
                    return j;
                }
                if (c == '\\')
                {
                    if (i == 0)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                } else
                {
                    i = 0;
                }
                j++;
            } while (true);
        } else
        {
            ac[0] = c;
            do
            {
                k = i;
                if (i >= ac.length)
                {
                    break;
                }
                k = i;
                if (bufferedreader.read(ac, i, 1) == -1)
                {
                    break;
                }
                if (ac[i] == '}' || ac[i] == ',' || Character.isWhitespace(ac[i]) || ac[i] == ']')
                {
                    bufferedreader.reset();
                    bufferedreader.skip(i - 1);
                    ac[i] = '\0';
                    return i;
                }
                i++;
            } while (true);
        }
        if (k == ac.length)
        {
            throw new ParseException("Absurdly long value");
        } else
        {
            throw new ParseException("Unexpected EOF");
        }
    }

    private String skipToNextField(BufferedReader bufferedreader)
        throws ParseException, IOException
    {
        bufferedreader.mark(1024);
        readNextNonWhitespaceChar(bufferedreader);
        JVM INSTR lookupswitch 4: default 56
    //                   34: 129
    //                   44: 559
    //                   91: 342
    //                   123: 247;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_342;
_L3:
        break MISSING_BLOCK_LABEL_559;
_L1:
        bufferedreader.reset();
        readValueChars(bufferedreader, mLargeBuf);
_L7:
        char c = readNextNonWhitespaceChar(bufferedreader);
        boolean flag;
        char c1;
        boolean flag1;
        int i;
        int j;
        switch (c)
        {
        default:
            throw new ParseException((new StringBuilder("Unexpected token ")).append(c).toString());

        case 44: // ','
            assumePop(2);
            return readFieldKey(bufferedreader);

        case 125: // '}'
            assumePop(2);
            break;
        }
        break MISSING_BLOCK_LABEL_586;
_L2:
        flag = false;
        if (bufferedreader.read(mChar) == -1)
        {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        c1 = mChar[0];
_L9:
        if (c1 == '"' && !flag) goto _L7; else goto _L6
_L6:
        if (c1 == '\\')
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (bufferedreader.read(mChar) == -1)
        {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        c = mChar[0];
        c1 = c;
        if (!Character.isISOControl(c)) goto _L9; else goto _L8
_L8:
        throw new ParseException("Unexpected control character while reading string");
_L5:
        mStateStack.push(Integer.valueOf(1));
        bufferedreader.mark(32);
        c = readNextNonWhitespaceChar(bufferedreader);
        if (c == '}')
        {
            assumePop(1);
        } else
        if (c == '"')
        {
            bufferedreader.reset();
            readFieldKey(bufferedreader);
            while (skipToNextField(bufferedreader) != null) ;
            assumePop(1);
        } else
        {
            throw new ParseException((new StringBuilder("Unexpected token ")).append(c).toString());
        }
          goto _L7
        mStateStack.push(Integer.valueOf(5));
        bufferedreader.mark(32);
        if (readNextNonWhitespaceChar(bufferedreader) == ']')
        {
            assumePop(5);
        } else
        {
            bufferedreader.reset();
            flag1 = false;
            j = 0;
            for (i = 1; i > 0;)
            {
                c = readNextNonWhitespaceChar(bufferedreader);
                if (c == 0)
                {
                    throw new ParseException("Unexpected EOF while parsing array");
                }
                if (Character.isISOControl(c))
                {
                    throw new ParseException("Unexpected control character while reading array");
                }
                flag = j;
                if (c == '"')
                {
                    flag = j;
                    if (!flag1)
                    {
                        if (j == 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
                j = i;
                if (c == '[')
                {
                    j = i;
                    if (!flag)
                    {
                        j = i + 1;
                    }
                }
                i = j;
                if (c == ']')
                {
                    i = j;
                    if (!flag)
                    {
                        i = j - 1;
                    }
                }
                if (c == '\\' && flag)
                {
                    if (!flag1)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    j = ((flag) ? 1 : 0);
                } else
                {
                    flag1 = false;
                    j = ((flag) ? 1 : 0);
                }
            }

            assumePop(5);
        }
          goto _L7
        throw new ParseException("Missing value");
        return null;
    }

    public final void parse(InputStream inputstream, FastJsonResponse fastjsonresponse)
        throws ParseException
    {
        inputstream = new BufferedReader(new InputStreamReader(inputstream), 1024);
        char c;
        mStateStack.push(Integer.valueOf(0));
        c = readNextNonWhitespaceChar(inputstream);
        c;
        JVM INSTR lookupswitch 3: default 275
    //                   0: 238
    //                   91: 143
    //                   123: 114;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_143;
_L2:
        break MISSING_BLOCK_LABEL_238;
_L1:
        try
        {
            throw new ParseException((new StringBuilder("Unexpected token: ")).append(c).toString());
        }
        // Misplaced declaration of an exception variable
        catch (FastJsonResponse fastjsonresponse) { }
        finally { }
        throw new ParseException(fastjsonresponse);
        Object obj;
        ArrayList arraylist;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.w("FastParser", "Failed to close reader while parsing.");
        }
        throw fastjsonresponse;
_L4:
        mStateStack.push(Integer.valueOf(1));
        parseObject(inputstream, fastjsonresponse);
_L5:
        assumePop(0);
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.w("FastParser", "Failed to close reader while parsing.");
        }
        break MISSING_BLOCK_LABEL_260;
        mStateStack.push(Integer.valueOf(5));
        obj = fastjsonresponse.getFieldMappings();
        if (((Map) (obj)).size() != 1)
        {
            throw new ParseException("Object array response class must have a single Field");
        }
        obj = (FastJsonResponse.Field)((java.util.Map.Entry)((Map) (obj)).entrySet().iterator().next()).getValue();
        arraylist = parseObjectArray(inputstream, ((FastJsonResponse.Field) (obj)));
        fastjsonresponse.addConcreteTypeArrayInternal(((FastJsonResponse.Field) (obj)), ((FastJsonResponse.Field) (obj)).getOutputFieldName(), arraylist);
          goto _L5
        throw new ParseException("No data to parse");
    }

    public final void parse(String s, FastJsonResponse fastjsonresponse)
        throws ParseException
    {
        s = new ByteArrayInputStream(s.getBytes());
        parse(((InputStream) (s)), fastjsonresponse);
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("FastParser", "Failed to close the input stream while parsing.");
        }
        return;
        fastjsonresponse;
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("FastParser", "Failed to close the input stream while parsing.");
        }
        throw fastjsonresponse;
    }









}
