// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.stream;

import com.google.gson.internal.a.e;
import com.google.gson.internal.d;
import com.google.gson.n;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.gson.stream:
//            MalformedJsonException, JsonToken

public class JsonReader
    implements Closeable
{

    private static final long MIN_INCOMPLETE_INTEGER = 0xf333333333333334L;
    private static final char NON_EXECUTE_PREFIX[] = ")]}'\n".toCharArray();
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final char buffer[] = new char[1024];
    private final Reader in;
    private boolean lenient;
    private int limit;
    private int lineNumber;
    private int lineStart;
    private int pathIndices[];
    private String pathNames[];
    private int peeked;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int pos;
    private int stack[];
    private int stackSize;

    public JsonReader(Reader reader)
    {
        lenient = false;
        pos = 0;
        limit = 0;
        lineNumber = 0;
        lineStart = 0;
        peeked = 0;
        stack = new int[32];
        stackSize = 0;
        int ai[] = stack;
        int i = stackSize;
        stackSize = i + 1;
        ai[i] = 6;
        pathNames = new String[32];
        pathIndices = new int[32];
        if (reader == null)
        {
            throw new NullPointerException("in == null");
        } else
        {
            in = reader;
            return;
        }
    }

    private void checkLenient()
        throws IOException
    {
        if (!lenient)
        {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        } else
        {
            return;
        }
    }

    private void consumeNonExecutePrefix()
        throws IOException
    {
        nextNonWhitespace(true);
        pos = pos - 1;
        if (pos + NON_EXECUTE_PREFIX.length <= limit || fillBuffer(NON_EXECUTE_PREFIX.length)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= NON_EXECUTE_PREFIX.length)
                {
                    break label1;
                }
                if (buffer[pos + i] != NON_EXECUTE_PREFIX[i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        pos = pos + NON_EXECUTE_PREFIX.length;
        return;
    }

    private int doPeek()
        throws IOException
    {
        int i = stack[stackSize - 1];
        if (i != 1) goto _L2; else goto _L1
_L1:
        stack[stackSize - 1] = 2;
_L14:
        nextNonWhitespace(true);
        JVM INSTR lookupswitch 7: default 100
    //                   34: 668
    //                   39: 655
    //                   44: 615
    //                   59: 615
    //                   91: 689
    //                   93: 603
    //                   123: 696;
           goto _L3 _L4 _L5 _L6 _L6 _L7 _L8 _L9
_L3:
        pos = pos - 1;
        if (stackSize == 1)
        {
            checkLenient();
        }
        i = peekKeyword();
        if (i == 0) goto _L11; else goto _L10
_L10:
        return i;
_L2:
        if (i == 2)
        {
            switch (nextNonWhitespace(true))
            {
            default:
                throw syntaxError("Unterminated array");

            case 93: // ']'
                peeked = 4;
                return 4;

            case 59: // ';'
                checkLenient();
                break;

            case 44: // ','
                break;
            }
        } else
        {
            if (i == 3 || i == 5)
            {
                stack[stackSize - 1] = 4;
                if (i == 5)
                {
                    switch (nextNonWhitespace(true))
                    {
                    default:
                        throw syntaxError("Unterminated object");

                    case 125: // '}'
                        peeked = 2;
                        return 2;

                    case 59: // ';'
                        checkLenient();
                        break;

                    case 44: // ','
                        break;
                    }
                }
                int j = nextNonWhitespace(true);
                switch (j)
                {
                default:
                    checkLenient();
                    pos = pos - 1;
                    if (isLiteral((char)j))
                    {
                        peeked = 14;
                        return 14;
                    } else
                    {
                        throw syntaxError("Expected name");
                    }

                case 34: // '"'
                    peeked = 13;
                    return 13;

                case 39: // '\''
                    checkLenient();
                    peeked = 12;
                    return 12;

                case 125: // '}'
                    break;
                }
                if (i != 5)
                {
                    peeked = 2;
                    return 2;
                } else
                {
                    throw syntaxError("Expected name");
                }
            }
            if (i == 4)
            {
                stack[stackSize - 1] = 5;
                switch (nextNonWhitespace(true))
                {
                case 59: // ';'
                case 60: // '<'
                default:
                    throw syntaxError("Expected ':'");

                case 61: // '='
                    checkLenient();
                    if ((pos < limit || fillBuffer(1)) && buffer[pos] == '>')
                    {
                        pos = pos + 1;
                    }
                    break;

                case 58: // ':'
                    break;
                }
            } else
            if (i == 6)
            {
                if (lenient)
                {
                    consumeNonExecutePrefix();
                }
                stack[stackSize - 1] = 7;
            } else
            if (i == 7)
            {
                if (nextNonWhitespace(false) == -1)
                {
                    peeked = 17;
                    return 17;
                }
                checkLenient();
                pos = pos - 1;
            } else
            if (i == 8)
            {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (i == 1)
        {
            peeked = 4;
            return 4;
        }
_L6:
        if (i == 1 || i == 2)
        {
            checkLenient();
            pos = pos - 1;
            peeked = 7;
            return 7;
        } else
        {
            throw syntaxError("Unexpected value");
        }
_L5:
        checkLenient();
        peeked = 8;
        return 8;
_L4:
        if (stackSize == 1)
        {
            checkLenient();
        }
        peeked = 9;
        return 9;
_L7:
        peeked = 3;
        return 3;
_L9:
        peeked = 1;
        return 1;
_L11:
        int k;
        k = peekNumber();
        i = k;
        if (k != 0) goto _L10; else goto _L12
_L12:
        if (!isLiteral(buffer[pos]))
        {
            throw syntaxError("Expected value");
        } else
        {
            checkLenient();
            peeked = 10;
            return 10;
        }
        if (true) goto _L14; else goto _L13
_L13:
    }

    private boolean fillBuffer(int i)
        throws IOException
    {
        boolean flag1 = false;
        char ac[] = buffer;
        lineStart = lineStart - pos;
        boolean flag;
        if (limit != pos)
        {
            limit = limit - pos;
            System.arraycopy(ac, pos, ac, 0, limit);
        } else
        {
            limit = 0;
        }
        pos = 0;
        do
        {
            int j = in.read(ac, limit, ac.length - limit);
            flag = flag1;
            if (j == -1)
            {
                break;
            }
            limit = j + limit;
            j = i;
            if (lineNumber == 0)
            {
                j = i;
                if (lineStart == 0)
                {
                    j = i;
                    if (limit > 0)
                    {
                        j = i;
                        if (ac[0] == '\uFEFF')
                        {
                            pos = pos + 1;
                            lineStart = lineStart + 1;
                            j = i + 1;
                        }
                    }
                }
            }
            i = j;
            if (limit < j)
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        return flag;
    }

    private int getColumnNumber()
    {
        return (pos - lineStart) + 1;
    }

    private int getLineNumber()
    {
        return lineNumber + 1;
    }

    private boolean isLiteral(char c)
        throws IOException
    {
        switch (c)
        {
        default:
            return true;

        case 35: // '#'
        case 47: // '/'
        case 59: // ';'
        case 61: // '='
        case 92: // '\\'
            checkLenient();
            // fall through

        case 9: // '\t'
        case 10: // '\n'
        case 12: // '\f'
        case 13: // '\r'
        case 32: // ' '
        case 44: // ','
        case 58: // ':'
        case 91: // '['
        case 93: // ']'
        case 123: // '{'
        case 125: // '}'
            return false;
        }
    }

    private int nextNonWhitespace(boolean flag)
        throws IOException
    {
        char ac[];
        int i;
        int j;
        ac = buffer;
        i = pos;
        j = limit;
_L5:
        int k;
        int l;
        k = j;
        l = i;
        if (i != j) goto _L2; else goto _L1
_L1:
        pos = i;
        if (!fillBuffer(1)) goto _L4; else goto _L3
_L3:
        l = pos;
        k = limit;
_L2:
        i = l + 1;
        j = ac[l];
        if (j == '\n')
        {
            lineNumber = lineNumber + 1;
            lineStart = i;
            j = k;
        } else
        {
            if (j != 32 && j != 13 && j != 9)
            {
                if (j == 47)
                {
                    pos = i;
                    if (i == k)
                    {
                        pos = pos - 1;
                        boolean flag1 = fillBuffer(2);
                        pos = pos + 1;
                        if (!flag1)
                        {
                            return j;
                        }
                    }
                    checkLenient();
                    switch (ac[pos])
                    {
                    default:
                        return j;

                    case 42: // '*'
                        pos = pos + 1;
                        if (!skipTo("*/"))
                        {
                            throw syntaxError("Unterminated comment");
                        }
                        i = pos + 2;
                        j = limit;
                        break;

                    case 47: // '/'
                        pos = pos + 1;
                        skipToEndOfLine();
                        i = pos;
                        j = limit;
                        break;
                    }
                } else
                if (j == 35)
                {
                    pos = i;
                    checkLenient();
                    skipToEndOfLine();
                    i = pos;
                    j = limit;
                } else
                {
                    pos = i;
                    return j;
                }
            } else
            {
                j = k;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (flag)
        {
            throw new EOFException((new StringBuilder("End of input at line ")).append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        } else
        {
            return -1;
        }
        if (true) goto _L7; else goto _L6
_L6:
        break MISSING_BLOCK_LABEL_367;
_L7:
        break; /* Loop/switch isn't completed */
    }

    private String nextQuotedValue(char c)
        throws IOException
    {
        char ac[] = buffer;
        StringBuilder stringbuilder = new StringBuilder();
label0:
        do
        {
            int j = pos;
            int l = limit;
            int i;
            int k;
            for (i = j; i < l; i = k)
            {
                k = i + 1;
                i = ac[i];
                if (i == c)
                {
                    pos = k;
                    stringbuilder.append(ac, j, k - j - 1);
                    return stringbuilder.toString();
                }
                if (i == 92)
                {
                    pos = k;
                    stringbuilder.append(ac, j, k - j - 1);
                    stringbuilder.append(readEscapeCharacter());
                    continue label0;
                }
                if (i == 10)
                {
                    lineNumber = lineNumber + 1;
                    lineStart = k;
                }
            }

            stringbuilder.append(ac, j, i - j);
            pos = i;
            if (!fillBuffer(1))
            {
                throw syntaxError("Unterminated string");
            }
        } while (true);
    }

    private String nextUnquotedValue()
        throws IOException
    {
        Object obj;
        int i;
        obj = null;
        i = 0;
_L2:
        Object obj1;
        int j;
        if (pos + i < limit)
        {
            obj1 = obj;
            j = i;
            switch (buffer[pos + i])
            {
            default:
                i++;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
            case 47: // '/'
            case 59: // ';'
            case 61: // '='
            case 92: // '\\'
                checkLenient();
                j = i;
                obj1 = obj;
                break;

            case 9: // '\t'
            case 10: // '\n'
            case 12: // '\f'
            case 13: // '\r'
            case 32: // ' '
            case 44: // ','
            case 58: // ':'
            case 91: // '['
            case 93: // ']'
            case 123: // '{'
            case 125: // '}'
                break;
            }
        } else
        if (i < buffer.length)
        {
            obj1 = obj;
            j = i;
            if (fillBuffer(i + 1))
            {
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
label0:
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new StringBuilder();
                }
                ((StringBuilder) (obj1)).append(buffer, pos, i);
                pos = i + pos;
                if (fillBuffer(1))
                {
                    break label0;
                }
                j = 0;
            }
        }
        if (obj1 == null)
        {
            obj = new String(buffer, pos, j);
        } else
        {
            ((StringBuilder) (obj1)).append(buffer, pos, j);
            obj = ((StringBuilder) (obj1)).toString();
        }
        pos = j + pos;
        return ((String) (obj));
        i = 0;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int peekKeyword()
        throws IOException
    {
        int i = buffer[pos];
        String s;
        String s1;
        if (i == 116 || i == 84)
        {
            s1 = "true";
            s = "TRUE";
            i = 5;
        } else
        if (i == 102 || i == 70)
        {
            s1 = "false";
            s = "FALSE";
            i = 6;
        } else
        if (i == 110 || i == 78)
        {
            s1 = "null";
            s = "NULL";
            i = 7;
        } else
        {
            return 0;
        }
        do
        {
            int k = s1.length();
            for (int j = 1; j < k; j++)
            {
                if (pos + j >= limit && !fillBuffer(j + 1))
                {
                    return 0;
                }
                char c = buffer[pos + j];
                if (c != s1.charAt(j) && c != s.charAt(j))
                {
                    return 0;
                }
            }

            if ((pos + k < limit || fillBuffer(k + 1)) && isLiteral(buffer[pos + k]))
            {
                return 0;
            }
            pos = pos + k;
            peeked = i;
            return i;
        } while (true);
    }

    private int peekNumber()
        throws IOException
    {
        char ac[];
        int i;
        boolean flag;
        int j;
        int k;
        int k1;
        int j2;
        long l2;
        ac = buffer;
        k1 = pos;
        int l = limit;
        l2 = 0L;
        i = 0;
        flag = true;
        j = 0;
        k = 0;
        j2 = l;
_L7:
        char c;
        int i1;
        int j1;
        j1 = j2;
        i1 = k1;
        if (k1 + k == j2)
        {
            if (k == ac.length)
            {
                return 0;
            }
            if (!fillBuffer(k + 1))
            {
                break MISSING_BLOCK_LABEL_458;
            }
            i1 = pos;
            j1 = limit;
        }
        c = ac[i1 + k];
        c;
        JVM INSTR lookupswitch 5: default 144
    //                   43: 228
    //                   45: 166
    //                   46: 275
    //                   69: 249
    //                   101: 249;
           goto _L1 _L2 _L3 _L4 _L5 _L5
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        if (c < '0' || c > '9')
        {
            if (isLiteral(c))
            {
                return 0;
            }
            break MISSING_BLOCK_LABEL_458;
        }
        break MISSING_BLOCK_LABEL_295;
_L3:
        int k2;
        if (j == 0)
        {
            i = 1;
            j = 1;
        } else
        if (j == 5)
        {
            byte byte0 = 6;
            j = i;
            i = byte0;
        } else
        {
            return 0;
        }
_L8:
        k2 = k + 1;
        k = j;
        j2 = j1;
        k1 = i1;
        j = i;
        i = k;
        k = k2;
        if (true) goto _L7; else goto _L6
_L6:
        if (j == 5)
        {
            byte byte1 = 6;
            j = i;
            i = byte1;
        } else
        {
            return 0;
        }
          goto _L8
_L5:
        if (j == 2 || j == 4)
        {
            byte byte2 = 5;
            j = i;
            i = byte2;
        } else
        {
            return 0;
        }
          goto _L8
_L4:
        if (j == 2)
        {
            byte byte3 = 3;
            j = i;
            i = byte3;
        } else
        {
            return 0;
        }
          goto _L8
        if (j == 1 || j == 0)
        {
            l2 = -(c - 48);
            byte byte4 = 2;
            j = i;
            i = byte4;
        } else
        if (j == 2)
        {
            if (l2 == 0L)
            {
                return 0;
            }
            long l3 = 10L * l2 - (long)(c - 48);
            int l1;
            boolean flag1;
            if (l2 > 0xf333333333333334L || l2 == 0xf333333333333334L && l3 < l2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            l1 = i;
            l2 = l3;
            flag = flag1 & flag;
            i = j;
            j = l1;
        } else
        if (j == 3)
        {
            byte byte5 = 4;
            j = i;
            i = byte5;
        } else
        if (j == 5 || j == 6)
        {
            byte byte6 = 7;
            j = i;
            i = byte6;
        } else
        {
            int i2 = i;
            i = j;
            j = i2;
        }
          goto _L8
        if (j == 2 && flag && (l2 != 0x8000000000000000L || i != 0))
        {
            if (i == 0)
            {
                l2 = -l2;
            }
            peekedLong = l2;
            pos = pos + k;
            peeked = 15;
            return 15;
        }
        if (j == 2 || j == 4 || j == 7)
        {
            peekedNumberLength = k;
            peeked = 16;
            return 16;
        } else
        {
            return 0;
        }
    }

    private void push(int i)
    {
        if (stackSize == stack.length)
        {
            int ai[] = new int[stackSize * 2];
            int ai2[] = new int[stackSize * 2];
            String as[] = new String[stackSize * 2];
            System.arraycopy(stack, 0, ai, 0, stackSize);
            System.arraycopy(pathIndices, 0, ai2, 0, stackSize);
            System.arraycopy(pathNames, 0, as, 0, stackSize);
            stack = ai;
            pathIndices = ai2;
            pathNames = as;
        }
        int ai1[] = stack;
        int j = stackSize;
        stackSize = j + 1;
        ai1[j] = i;
    }

    private char readEscapeCharacter()
        throws IOException
    {
        if (pos == limit && !fillBuffer(1))
        {
            throw syntaxError("Unterminated escape sequence");
        }
        char ac[] = buffer;
        int i = pos;
        pos = i + 1;
        char c = ac[i];
        switch (c)
        {
        default:
            return c;

        case 117: // 'u'
            if (pos + 4 > limit && !fillBuffer(4))
            {
                throw syntaxError("Unterminated escape sequence");
            }
            int k = pos;
            c = '\0';
            int j = k;
            while (j < k + 4) 
            {
                char c1 = buffer[j];
                char c2 = (char)(c << 4);
                if (c1 >= '0' && c1 <= '9')
                {
                    c = (char)(c2 + (c1 - 48));
                } else
                if (c1 >= 'a' && c1 <= 'f')
                {
                    c = (char)(c2 + ((c1 - 97) + 10));
                } else
                if (c1 >= 'A' && c1 <= 'F')
                {
                    c = (char)(c2 + ((c1 - 65) + 10));
                } else
                {
                    throw new NumberFormatException((new StringBuilder("\\u")).append(new String(buffer, pos, 4)).toString());
                }
                j++;
            }
            pos = pos + 4;
            return c;

        case 116: // 't'
            return '\t';

        case 98: // 'b'
            return '\b';

        case 110: // 'n'
            return '\n';

        case 114: // 'r'
            return '\r';

        case 102: // 'f'
            return '\f';

        case 10: // '\n'
            lineNumber = lineNumber + 1;
            lineStart = pos;
            return c;
        }
    }

    private void skipQuotedValue(char c)
        throws IOException
    {
        char ac[] = buffer;
label0:
        do
        {
            int i = pos;
            int j;
            for (int k = limit; i < k; i = j)
            {
                j = i + 1;
                i = ac[i];
                if (i == c)
                {
                    pos = j;
                    return;
                }
                if (i == 92)
                {
                    pos = j;
                    readEscapeCharacter();
                    continue label0;
                }
                if (i == 10)
                {
                    lineNumber = lineNumber + 1;
                    lineStart = j;
                }
            }

            pos = i;
            if (!fillBuffer(1))
            {
                throw syntaxError("Unterminated string");
            }
        } while (true);
    }

    private boolean skipTo(String s)
        throws IOException
    {
        boolean flag1 = false;
_L2:
        boolean flag;
        if (pos + s.length() > limit)
        {
            flag = flag1;
            if (!fillBuffer(s.length()))
            {
                break MISSING_BLOCK_LABEL_118;
            }
        }
        if (buffer[pos] != '\n')
        {
            break; /* Loop/switch isn't completed */
        }
        lineNumber = lineNumber + 1;
        lineStart = pos + 1;
_L4:
        pos = pos + 1;
        if (true) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (buffer[pos + i] != s.charAt(i)) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
          goto _L4
        flag = true;
        return flag;
    }

    private void skipToEndOfLine()
        throws IOException
    {
        int i;
        do
        {
            if (pos < limit || fillBuffer(1))
            {
                char ac[] = buffer;
                i = pos;
                pos = i + 1;
                i = ac[i];
                if (i != '\n')
                {
                    continue;
                }
                lineNumber = lineNumber + 1;
                lineStart = pos;
            }
            return;
        } while (i != '\r');
    }

    private void skipUnquotedValue()
        throws IOException
    {
_L2:
        int i;
label0:
        {
            i = 0;
            do
            {
                if (pos + i >= limit)
                {
                    break label0;
                }
                switch (buffer[pos + i])
                {
                default:
                    i++;
                    break;

                case 35: // '#'
                case 47: // '/'
                case 59: // ';'
                case 61: // '='
                case 92: // '\\'
                    checkLenient();
                    // fall through

                case 9: // '\t'
                case 10: // '\n'
                case 12: // '\f'
                case 13: // '\r'
                case 32: // ' '
                case 44: // ','
                case 58: // ':'
                case 91: // '['
                case 93: // ']'
                case 123: // '{'
                case 125: // '}'
label1:
                    {
                        pos = i + pos;
                        break label1;
                    }
                    break;
                }
            } while (true);
            break label0;
        }
        return;
        pos = i + pos;
        if (!fillBuffer(1))
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private IOException syntaxError(String s)
        throws IOException
    {
        throw new MalformedJsonException((new StringBuilder()).append(s).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
    }

    public void beginArray()
        throws IOException
    {
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        if (i == 3)
        {
            push(1);
            pathIndices[stackSize - 1] = 0;
            peeked = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected BEGIN_ARRAY but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
        }
    }

    public void beginObject()
        throws IOException
    {
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        if (i == 1)
        {
            push(3);
            peeked = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected BEGIN_OBJECT but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
        }
    }

    public void close()
        throws IOException
    {
        peeked = 0;
        stack[0] = 8;
        stackSize = 1;
        in.close();
    }

    public void endArray()
        throws IOException
    {
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        if (i == 4)
        {
            stackSize = stackSize - 1;
            peeked = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected END_ARRAY but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
        }
    }

    public void endObject()
        throws IOException
    {
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        if (i == 2)
        {
            stackSize = stackSize - 1;
            pathNames[stackSize] = null;
            peeked = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected END_OBJECT but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
        }
    }

    public String getPath()
    {
        StringBuilder stringbuilder;
        int i;
        int j;
        stringbuilder = new StringBuilder("$");
        i = 0;
        j = stackSize;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        switch (stack[i])
        {
        default:
            break;

        case 1: // '\001'
        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            break;
        }
        break MISSING_BLOCK_LABEL_95;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        stringbuilder.append('[').append(pathIndices[i]).append(']');
          goto _L3
        stringbuilder.append('.');
        if (pathNames[i] != null)
        {
            stringbuilder.append(pathNames[i]);
        }
          goto _L3
        return stringbuilder.toString();
    }

    public boolean hasNext()
        throws IOException
    {
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        return i != 2 && i != 4;
    }

    public final boolean isLenient()
    {
        return lenient;
    }

    public boolean nextBoolean()
        throws IOException
    {
        int k = peeked;
        int i = k;
        if (k == 0)
        {
            i = doPeek();
        }
        if (i == 5)
        {
            peeked = 0;
            int ai[] = pathIndices;
            i = stackSize - 1;
            ai[i] = ai[i] + 1;
            return true;
        }
        if (i == 6)
        {
            peeked = 0;
            int ai1[] = pathIndices;
            int j = stackSize - 1;
            ai1[j] = ai1[j] + 1;
            return false;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected a boolean but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
        }
    }

    public double nextDouble()
        throws IOException
    {
        int k = peeked;
        int i = k;
        if (k == 0)
        {
            i = doPeek();
        }
        if (i == 15)
        {
            peeked = 0;
            int ai[] = pathIndices;
            i = stackSize - 1;
            ai[i] = ai[i] + 1;
            return (double)peekedLong;
        }
        if (i == 16)
        {
            peekedString = new String(buffer, pos, peekedNumberLength);
            pos = pos + peekedNumberLength;
        } else
        if (i == 8 || i == 9)
        {
            char c;
            if (i == 8)
            {
                c = '\'';
            } else
            {
                c = '"';
            }
            peekedString = nextQuotedValue(c);
        } else
        {
            if (i != 10)
            {
                continue;
            }
            peekedString = nextUnquotedValue();
        }
        do
        {
            peeked = 11;
            double d1 = Double.parseDouble(peekedString);
            if (!lenient && (Double.isNaN(d1) || Double.isInfinite(d1)))
            {
                throw new MalformedJsonException((new StringBuilder("JSON forbids NaN and infinities: ")).append(d1).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
            } else
            {
                peekedString = null;
                peeked = 0;
                int ai1[] = pathIndices;
                int j = stackSize - 1;
                ai1[j] = ai1[j] + 1;
                return d1;
            }
        } while (i == 11);
        throw new IllegalStateException((new StringBuilder("Expected a double but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
    }

    public int nextInt()
        throws IOException
    {
        int i;
        int j = peeked;
        i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        if (i == 15)
        {
            i = (int)peekedLong;
            if (peekedLong != (long)i)
            {
                throw new NumberFormatException((new StringBuilder("Expected an int but was ")).append(peekedLong).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
            } else
            {
                peeked = 0;
                int ai[] = pathIndices;
                int k = stackSize - 1;
                ai[k] = ai[k] + 1;
                return i;
            }
        }
        if (i != 16) goto _L2; else goto _L1
_L1:
        peekedString = new String(buffer, pos, peekedNumberLength);
        pos = pos + peekedNumberLength;
_L3:
        peeked = 11;
        double d1 = Double.parseDouble(peekedString);
        i = (int)d1;
        char c;
        int ai1[];
        NumberFormatException numberformatexception;
        int l;
        if ((double)i != d1)
        {
            throw new NumberFormatException((new StringBuilder("Expected an int but was ")).append(peekedString).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
        } else
        {
            peekedString = null;
            peeked = 0;
            int ai2[] = pathIndices;
            int i1 = stackSize - 1;
            ai2[i1] = ai2[i1] + 1;
            return i;
        }
_L2:
        if (i != 8 && i != 9)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        if (i == 8)
        {
            c = '\'';
        } else
        {
            c = '"';
        }
        peekedString = nextQuotedValue(c);
        i = Integer.parseInt(peekedString);
        peeked = 0;
        ai1 = pathIndices;
        l = stackSize - 1;
        ai1[l] = ai1[l] + 1;
        return i;
        numberformatexception;
          goto _L3
        throw new IllegalStateException((new StringBuilder("Expected an int but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
    }

    public long nextLong()
        throws IOException
    {
        int i;
        int k = peeked;
        i = k;
        if (k == 0)
        {
            i = doPeek();
        }
        if (i == 15)
        {
            peeked = 0;
            int ai[] = pathIndices;
            i = stackSize - 1;
            ai[i] = ai[i] + 1;
            return peekedLong;
        }
        if (i != 16) goto _L2; else goto _L1
_L1:
        peekedString = new String(buffer, pos, peekedNumberLength);
        pos = pos + peekedNumberLength;
_L3:
        peeked = 11;
        double d1 = Double.parseDouble(peekedString);
        long l = (long)d1;
        char c;
        int ai1[];
        NumberFormatException numberformatexception;
        if ((double)l != d1)
        {
            throw new NumberFormatException((new StringBuilder("Expected a long but was ")).append(peekedString).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
        } else
        {
            peekedString = null;
            peeked = 0;
            int ai2[] = pathIndices;
            int j = stackSize - 1;
            ai2[j] = ai2[j] + 1;
            return l;
        }
_L2:
        if (i != 8 && i != 9)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        if (i == 8)
        {
            c = '\'';
        } else
        {
            c = '"';
        }
        peekedString = nextQuotedValue(c);
        l = Long.parseLong(peekedString);
        peeked = 0;
        ai1 = pathIndices;
        i = stackSize - 1;
        ai1[i] = ai1[i] + 1;
        return l;
        numberformatexception;
          goto _L3
        throw new IllegalStateException((new StringBuilder("Expected a long but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
    }

    public String nextName()
        throws IOException
    {
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        String s;
        if (i == 14)
        {
            s = nextUnquotedValue();
        } else
        if (i == 12)
        {
            s = nextQuotedValue('\'');
        } else
        if (i == 13)
        {
            s = nextQuotedValue('"');
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected a name but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
        }
        peeked = 0;
        pathNames[stackSize - 1] = s;
        return s;
    }

    public void nextNull()
        throws IOException
    {
        int k = peeked;
        int i = k;
        if (k == 0)
        {
            i = doPeek();
        }
        if (i == 7)
        {
            peeked = 0;
            int ai[] = pathIndices;
            int j = stackSize - 1;
            ai[j] = ai[j] + 1;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected null but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
        }
    }

    public String nextString()
        throws IOException
    {
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        String s;
        int ai[];
        if (i == 10)
        {
            s = nextUnquotedValue();
        } else
        if (i == 8)
        {
            s = nextQuotedValue('\'');
        } else
        if (i == 9)
        {
            s = nextQuotedValue('"');
        } else
        if (i == 11)
        {
            s = peekedString;
            peekedString = null;
        } else
        if (i == 15)
        {
            s = Long.toString(peekedLong);
        } else
        if (i == 16)
        {
            s = new String(buffer, pos, peekedNumberLength);
            pos = pos + peekedNumberLength;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected a string but was ")).append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
        }
        peeked = 0;
        ai = pathIndices;
        i = stackSize - 1;
        ai[i] = ai[i] + 1;
        return s;
    }

    public JsonToken peek()
        throws IOException
    {
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        switch (i)
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            return JsonToken.BEGIN_OBJECT;

        case 2: // '\002'
            return JsonToken.END_OBJECT;

        case 3: // '\003'
            return JsonToken.BEGIN_ARRAY;

        case 4: // '\004'
            return JsonToken.END_ARRAY;

        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            return JsonToken.NAME;

        case 5: // '\005'
        case 6: // '\006'
            return JsonToken.BOOLEAN;

        case 7: // '\007'
            return JsonToken.NULL;

        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
            return JsonToken.STRING;

        case 15: // '\017'
        case 16: // '\020'
            return JsonToken.NUMBER;

        case 17: // '\021'
            return JsonToken.END_DOCUMENT;
        }
    }

    public final void setLenient(boolean flag)
    {
        lenient = flag;
    }

    public void skipValue()
        throws IOException
    {
        int j = 0;
_L2:
        int i;
        int k;
        i = peeked;
        k = i;
        if (i == 0)
        {
            k = doPeek();
        }
        if (k != 3)
        {
            break; /* Loop/switch isn't completed */
        }
        push(1);
        i = j + 1;
_L3:
        peeked = 0;
        j = i;
        if (i == 0)
        {
            int ai[] = pathIndices;
            i = stackSize - 1;
            ai[i] = ai[i] + 1;
            pathNames[stackSize - 1] = "null";
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (k == 1)
        {
            push(3);
            i = j + 1;
        } else
        if (k == 4)
        {
            stackSize = stackSize - 1;
            i = j - 1;
        } else
        if (k == 2)
        {
            stackSize = stackSize - 1;
            i = j - 1;
        } else
        if (k == 14 || k == 10)
        {
            skipUnquotedValue();
            i = j;
        } else
        if (k == 8 || k == 12)
        {
            skipQuotedValue('\'');
            i = j;
        } else
        if (k == 9 || k == 13)
        {
            skipQuotedValue('"');
            i = j;
        } else
        {
            i = j;
            if (k == 16)
            {
                pos = pos + peekedNumberLength;
                i = j;
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString();
    }

    static 
    {
        d.INSTANCE = new d() {

            public final void promoteNameToValue(JsonReader jsonreader)
                throws IOException
            {
                if (jsonreader instanceof e)
                {
                    jsonreader = (e)jsonreader;
                    jsonreader.a(JsonToken.NAME);
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)jsonreader.a()).next();
                    ((e) (jsonreader)).a.add(entry.getValue());
                    ((e) (jsonreader)).a.add(new n((String)entry.getKey()));
                    return;
                }
                int j = jsonreader.peeked;
                int i = j;
                if (j == 0)
                {
                    i = jsonreader.doPeek();
                }
                if (i == 13)
                {
                    jsonreader.peeked = 9;
                    return;
                }
                if (i == 12)
                {
                    jsonreader.peeked = 8;
                    return;
                }
                if (i == 14)
                {
                    jsonreader.peeked = 10;
                    return;
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Expected a name but was ")).append(jsonreader.peek()).append("  at line ").append(jsonreader.getLineNumber()).append(" column ").append(jsonreader.getColumnNumber()).append(" path ").append(jsonreader.getPath()).toString());
                }
            }

        };
    }



/*
    static int access$002(JsonReader jsonreader, int i)
    {
        jsonreader.peeked = i;
        return i;
    }

*/



}
