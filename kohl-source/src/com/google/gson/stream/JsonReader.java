// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

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
            limit = limit + j;
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
_L2:
        int k;
        do
        {
            k = j;
            int l = i;
            if (i == j)
            {
                pos = i;
                boolean flag1;
                if (!fillBuffer(1))
                {
                    if (flag)
                    {
                        throw new EOFException((new StringBuilder()).append("End of input at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
                    } else
                    {
                        return -1;
                    }
                }
                l = pos;
                k = limit;
            }
            i = l + 1;
            j = ac[l];
            if (j == '\n')
            {
                lineNumber = lineNumber + 1;
                lineStart = i;
                j = k;
            } else
            {
label0:
                {
                    if (j == 32 || j == 13)
                    {
                        break label0;
                    }
                    if (j == 9)
                    {
                        j = k;
                    } else
                    {
                        if (j == 47)
                        {
                            pos = i;
                            if (i == k)
                            {
                                pos = pos - 1;
                                flag1 = fillBuffer(2);
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
                        continue; /* Loop/switch isn't completed */
                    }
                }
            }
        } while (true);
        j = k;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String nextQuotedValue(char c)
        throws IOException
    {
        char ac[] = buffer;
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            int i = pos;
            int l = limit;
            int k = i;
            while (i < l) 
            {
                int j1 = i + 1;
                char c1 = ac[i];
                if (c1 == c)
                {
                    pos = j1;
                    stringbuilder.append(ac, k, j1 - k - 1);
                    return stringbuilder.toString();
                }
                int j;
                int i1;
                if (c1 == '\\')
                {
                    pos = j1;
                    stringbuilder.append(ac, k, j1 - k - 1);
                    stringbuilder.append(readEscapeCharacter());
                    i = pos;
                    i1 = limit;
                    j = i;
                } else
                {
                    i1 = l;
                    i = j1;
                    j = k;
                    if (c1 == '\n')
                    {
                        lineNumber = lineNumber + 1;
                        lineStart = j1;
                        i1 = l;
                        i = j1;
                        j = k;
                    }
                }
                l = i1;
                k = j;
            }
            stringbuilder.append(ac, k, i - k);
            pos = i;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private String nextUnquotedValue()
        throws IOException
    {
        Object obj;
        int i;
        obj = null;
        i = 0;
_L6:
        if (pos + i >= limit) goto _L2; else goto _L1
_L1:
        Object obj1;
        int j;
        obj1 = obj;
        j = i;
        buffer[pos + i];
        JVM INSTR lookupswitch 16: default 172
    //                   9: 188
    //                   10: 188
    //                   12: 188
    //                   13: 188
    //                   32: 188
    //                   35: 179
    //                   44: 188
    //                   47: 179
    //                   58: 188
    //                   59: 179
    //                   61: 179
    //                   91: 188
    //                   92: 179
    //                   93: 188
    //                   123: 188
    //                   125: 188;
           goto _L3 _L4 _L4 _L4 _L4 _L4 _L5 _L4 _L5 _L4 _L5 _L5 _L4 _L5 _L4 _L4 _L4
_L3:
        i++;
        break; /* Loop/switch isn't completed */
_L5:
        checkLenient();
        j = i;
        obj1 = obj;
          goto _L4
        if (true) goto _L6; else goto _L2
_L4:
        if (obj1 == null)
        {
            obj = new String(buffer, pos, j);
        } else
        {
            ((StringBuilder) (obj1)).append(buffer, pos, j);
            obj = ((StringBuilder) (obj1)).toString();
        }
        pos = pos + j;
        return ((String) (obj));
_L2:
label0:
        {
            if (i >= buffer.length)
            {
                break label0;
            }
            obj1 = obj;
            j = i;
            if (fillBuffer(i + 1))
            {
                break; /* Loop/switch isn't completed */
            }
        }
          goto _L4
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new StringBuilder();
        }
        ((StringBuilder) (obj1)).append(buffer, pos, i);
        pos = pos + i;
        j = 0;
        i = 0;
        obj = obj1;
        if (fillBuffer(1)) goto _L6; else goto _L4
    }

    private int peekKeyword()
        throws IOException
    {
        int i = buffer[pos];
        String s;
        String s1;
        if (i == 116 || i == 84)
        {
            s = "true";
            s1 = "TRUE";
            i = 5;
        } else
        if (i == 102 || i == 70)
        {
            s = "false";
            s1 = "FALSE";
            i = 6;
        } else
        if (i == 110 || i == 78)
        {
            s = "null";
            s1 = "NULL";
            i = 7;
        } else
        {
            return 0;
        }
        do
        {
            int k = s.length();
            for (int j = 1; j < k; j++)
            {
                if (pos + j >= limit && !fillBuffer(j + 1))
                {
                    return 0;
                }
                char c = buffer[pos + j];
                if (c != s.charAt(j) && c != s1.charAt(j))
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
        boolean flag1;
        int i1;
        int j1;
        long l1;
        ac = buffer;
        i = pos;
        j1 = limit;
        l1 = 0L;
        flag = false;
        flag1 = true;
        i1 = 0;
        j = 0;
_L12:
        int k;
        int l;
        l = j1;
        k = i;
        if (i + j != j1) goto _L2; else goto _L1
_L1:
        if (j == ac.length)
        {
            return 0;
        }
        if (fillBuffer(j + 1)) goto _L4; else goto _L3
_L4:
        k = pos;
        l = limit;
_L2:
        c = ac[k + j];
        c;
        JVM INSTR lookupswitch 5: default 196
    //                   43: 293
    //                   45: 218
    //                   46: 350
    //                   69: 319
    //                   101: 319;
           goto _L5 _L6 _L7 _L8 _L9 _L9
_L5:
        if (c >= '0' && c <= '9') goto _L11; else goto _L10
_L10:
        if (isLiteral(c))
        {
            return 0;
        }
          goto _L3
_L7:
        if (i1 == 0)
        {
            flag2 = true;
            i = 1;
            l2 = l1;
            j1 = ((flag1) ? 1 : 0);
        } else
        if (i1 == 5)
        {
            i = 6;
            j1 = ((flag1) ? 1 : 0);
            flag2 = flag;
            l2 = l1;
        } else
        {
            return 0;
        }
_L13:
        j++;
        flag1 = j1;
        j1 = l;
        i1 = i;
        flag = flag2;
        i = k;
        l1 = l2;
          goto _L12
_L6:
        if (i1 == 5)
        {
            i = 6;
            j1 = ((flag1) ? 1 : 0);
            flag2 = flag;
            l2 = l1;
        } else
        {
            return 0;
        }
          goto _L13
_L9:
        if (i1 == 2 || i1 == 4)
        {
            i = 5;
            j1 = ((flag1) ? 1 : 0);
            flag2 = flag;
            l2 = l1;
        } else
        {
            return 0;
        }
          goto _L13
_L8:
        if (i1 == 2)
        {
            i = 3;
            j1 = ((flag1) ? 1 : 0);
            flag2 = flag;
            l2 = l1;
        } else
        {
            return 0;
        }
          goto _L13
_L11:
        if (i1 == 1 || i1 == 0)
        {
            l2 = -(c - 48);
            i = 2;
            j1 = ((flag1) ? 1 : 0);
            flag2 = flag;
        } else
        if (i1 == 2)
        {
            if (l1 == 0L)
            {
                return 0;
            }
            l2 = 10L * l1 - (long)(c - 48);
            if (l1 > 0xf333333333333334L || l1 == 0xf333333333333334L && l2 < l1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            j1 = flag1 & i;
            i = i1;
            flag2 = flag;
        } else
        {
label0:
            {
                if (i1 != 3)
                {
                    break label0;
                }
                i = 4;
                j1 = ((flag1) ? 1 : 0);
                flag2 = flag;
                l2 = l1;
            }
        }
          goto _L13
        if (i1 == 5) goto _L15; else goto _L14
_L14:
        j1 = ((flag1) ? 1 : 0);
        i = i1;
        flag2 = flag;
        l2 = l1;
        if (i1 != 6) goto _L13; else goto _L15
_L15:
        i = 7;
        j1 = ((flag1) ? 1 : 0);
        flag2 = flag;
        l2 = l1;
          goto _L13
_L3:
        if (i1 == 2 && flag1 && (l1 != 0x8000000000000000L || flag))
        {
            char c;
            boolean flag2;
            long l2;
            if (!flag)
            {
                l1 = -l1;
            }
            peekedLong = l1;
            pos = pos + j;
            peeked = 15;
            return 15;
        }
        if (i1 == 2 || i1 == 4 || i1 == 7)
        {
            peekedNumberLength = j;
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
            System.arraycopy(stack, 0, ai, 0, stackSize);
            stack = ai;
        }
        int ai1[] = stack;
        int j = stackSize;
        stackSize = j + 1;
        ai1[j] = i;
    }

    private char readEscapeCharacter()
        throws IOException
    {
        char c;
        if (pos == limit && !fillBuffer(1))
        {
            throw syntaxError("Unterminated escape sequence");
        }
        char ac[] = buffer;
        int i = pos;
        pos = i + 1;
        c = ac[i];
        c;
        JVM INSTR lookupswitch 7: default 116
    //                   10: 341
    //                   98: 329
    //                   102: 338
    //                   110: 332
    //                   114: 335
    //                   116: 326
    //                   117: 118;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return c;
_L8:
        if (pos + 4 > limit && !fillBuffer(4))
        {
            throw syntaxError("Unterminated escape sequence");
        }
        char c1 = '\0';
        int k = pos;
        int j = k;
        while (j < k + 4) 
        {
            char c2 = buffer[j];
            char c3 = (char)(c1 << 4);
            if (c2 >= '0' && c2 <= '9')
            {
                c1 = (char)((c2 - 48) + c3);
            } else
            if (c2 >= 'a' && c2 <= 'f')
            {
                c1 = (char)((c2 - 97) + 10 + c3);
            } else
            if (c2 >= 'A' && c2 <= 'F')
            {
                c1 = (char)((c2 - 65) + 10 + c3);
            } else
            {
                throw new NumberFormatException((new StringBuilder()).append("\\u").append(new String(buffer, pos, 4)).toString());
            }
            j++;
        }
        pos = pos + 4;
        return c1;
_L7:
        return '\t';
_L3:
        return '\b';
_L5:
        return '\n';
_L6:
        return '\r';
_L4:
        return '\f';
_L2:
        lineNumber = lineNumber + 1;
        lineStart = pos;
        if (true) goto _L1; else goto _L9
_L9:
    }

    private void skipQuotedValue(char c)
        throws IOException
    {
        char ac[] = buffer;
        do
        {
            int i = pos;
            int j = limit;
            while (i < j) 
            {
                int l = i + 1;
                char c1 = ac[i];
                if (c1 == c)
                {
                    pos = l;
                    return;
                }
                int k;
                if (c1 == '\\')
                {
                    pos = l;
                    readEscapeCharacter();
                    i = pos;
                    k = limit;
                } else
                {
                    k = j;
                    i = l;
                    if (c1 == '\n')
                    {
                        lineNumber = lineNumber + 1;
                        lineStart = l;
                        k = j;
                        i = l;
                    }
                }
                j = k;
            }
            pos = i;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(String s)
        throws IOException
    {
_L2:
        if (pos + s.length() > limit && !fillBuffer(s.length()))
        {
            break MISSING_BLOCK_LABEL_112;
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
            break MISSING_BLOCK_LABEL_110;
        }
        if (buffer[pos + i] != s.charAt(i)) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
          goto _L4
        return true;
        return false;
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
                        pos = pos + i;
                        break label1;
                    }
                    break;
                }
            } while (true);
            break label0;
        }
        return;
        pos = pos + i;
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
        throw new MalformedJsonException((new StringBuilder()).append(s).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
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
            peeked = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected BEGIN_ARRAY but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
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
            throw new IllegalStateException((new StringBuilder()).append("Expected BEGIN_OBJECT but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
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
            throw new IllegalStateException((new StringBuilder()).append("Expected END_ARRAY but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
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
            peeked = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected END_OBJECT but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        }
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
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        if (i == 5)
        {
            peeked = 0;
            return true;
        }
        if (i == 6)
        {
            peeked = 0;
            return false;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected a boolean but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        }
    }

    public double nextDouble()
        throws IOException
    {
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        if (i == 15)
        {
            peeked = 0;
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
            double d = Double.parseDouble(peekedString);
            if (!lenient && (Double.isNaN(d) || Double.isInfinite(d)))
            {
                throw new MalformedJsonException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(d).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
            } else
            {
                peekedString = null;
                peeked = 0;
                return d;
            }
        } while (i == 11);
        throw new IllegalStateException((new StringBuilder()).append("Expected a double but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
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
                throw new NumberFormatException((new StringBuilder()).append("Expected an int but was ").append(peekedLong).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
            } else
            {
                peeked = 0;
                return i;
            }
        }
        if (i != 16) goto _L2; else goto _L1
_L1:
        peekedString = new String(buffer, pos, peekedNumberLength);
        pos = pos + peekedNumberLength;
_L4:
        peeked = 11;
        double d = Double.parseDouble(peekedString);
        i = (int)d;
        char c;
        if ((double)i != d)
        {
            throw new NumberFormatException((new StringBuilder()).append("Expected an int but was ").append(peekedString).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        } else
        {
            peekedString = null;
            peeked = 0;
            return i;
        }
_L2:
        if (i != 8 && i != 9)
        {
            break MISSING_BLOCK_LABEL_291;
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
        return i;
        throw new IllegalStateException((new StringBuilder()).append("Expected an int but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        NumberFormatException numberformatexception;
        numberformatexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public long nextLong()
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
            peeked = 0;
            return peekedLong;
        }
        if (i != 16) goto _L2; else goto _L1
_L1:
        peekedString = new String(buffer, pos, peekedNumberLength);
        pos = pos + peekedNumberLength;
_L3:
        peeked = 11;
        double d = Double.parseDouble(peekedString);
        long l = (long)d;
        char c;
        NumberFormatException numberformatexception;
        if ((double)l != d)
        {
            throw new NumberFormatException((new StringBuilder()).append("Expected a long but was ").append(peekedString).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        } else
        {
            peekedString = null;
            peeked = 0;
            return l;
        }
_L2:
        if (i != 8 && i != 9)
        {
            break MISSING_BLOCK_LABEL_224;
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
        return l;
        numberformatexception;
          goto _L3
        throw new IllegalStateException((new StringBuilder()).append("Expected a long but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
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
            throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        }
        peeked = 0;
        return s;
    }

    public void nextNull()
        throws IOException
    {
        int j = peeked;
        int i = j;
        if (j == 0)
        {
            i = doPeek();
        }
        if (i == 7)
        {
            peeked = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected null but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
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
            throw new IllegalStateException((new StringBuilder()).append("Expected a string but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        }
        peeked = 0;
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
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() {

            public void promoteNameToValue(JsonReader jsonreader)
                throws IOException
            {
                if (jsonreader instanceof JsonTreeReader)
                {
                    ((JsonTreeReader)jsonreader).promoteNameToValue();
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
                    throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(jsonreader.peek()).append(" ").append(" at line ").append(jsonreader.getLineNumber()).append(" column ").append(jsonreader.getColumnNumber()).toString());
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
