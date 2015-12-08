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
//            StringPool, JsonScope, JsonToken, MalformedJsonException

public class JsonReader
    implements Closeable
{

    private static final String FALSE = "false";
    private static final char NON_EXECUTE_PREFIX[] = ")]}'\n".toCharArray();
    private static final String TRUE = "true";
    private final char buffer[] = new char[1024];
    private int bufferStartColumn;
    private int bufferStartLine;
    private final Reader in;
    private boolean lenient;
    private int limit;
    private String name;
    private int pos;
    private boolean skipping;
    private JsonScope stack[];
    private int stackSize;
    private final StringPool stringPool = new StringPool();
    private JsonToken token;
    private String value;
    private int valueLength;
    private int valuePos;

    public JsonReader(Reader reader)
    {
        lenient = false;
        pos = 0;
        limit = 0;
        bufferStartLine = 1;
        bufferStartColumn = 1;
        stack = new JsonScope[32];
        stackSize = 0;
        push(JsonScope.EMPTY_DOCUMENT);
        skipping = false;
        if (reader == null)
        {
            throw new NullPointerException("in == null");
        } else
        {
            in = reader;
            return;
        }
    }

    private JsonToken advance()
        throws IOException
    {
        peek();
        JsonToken jsontoken = token;
        token = null;
        value = null;
        name = null;
        return jsontoken;
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

    private JsonToken decodeLiteral()
        throws IOException
    {
        if (valuePos == -1)
        {
            return JsonToken.STRING;
        }
        if (valueLength == 4 && ('n' == buffer[valuePos] || 'N' == buffer[valuePos]) && ('u' == buffer[valuePos + 1] || 'U' == buffer[valuePos + 1]) && ('l' == buffer[valuePos + 2] || 'L' == buffer[valuePos + 2]) && ('l' == buffer[valuePos + 3] || 'L' == buffer[valuePos + 3]))
        {
            value = "null";
            return JsonToken.NULL;
        }
        if (valueLength == 4 && ('t' == buffer[valuePos] || 'T' == buffer[valuePos]) && ('r' == buffer[valuePos + 1] || 'R' == buffer[valuePos + 1]) && ('u' == buffer[valuePos + 2] || 'U' == buffer[valuePos + 2]) && ('e' == buffer[valuePos + 3] || 'E' == buffer[valuePos + 3]))
        {
            value = "true";
            return JsonToken.BOOLEAN;
        }
        if (valueLength == 5 && ('f' == buffer[valuePos] || 'F' == buffer[valuePos]) && ('a' == buffer[valuePos + 1] || 'A' == buffer[valuePos + 1]) && ('l' == buffer[valuePos + 2] || 'L' == buffer[valuePos + 2]) && ('s' == buffer[valuePos + 3] || 'S' == buffer[valuePos + 3]) && ('e' == buffer[valuePos + 4] || 'E' == buffer[valuePos + 4]))
        {
            value = "false";
            return JsonToken.BOOLEAN;
        } else
        {
            value = stringPool.get(buffer, valuePos, valueLength);
            return decodeNumber(buffer, valuePos, valueLength);
        }
    }

    private JsonToken decodeNumber(char ac[], int i, int j)
    {
        int k = ac[i];
        int l;
        int i1;
        int j1;
        if (k == 45)
        {
            l = i + 1;
            k = ac[l];
        } else
        {
            l = i;
        }
        if (k != 48) goto _L2; else goto _L1
_L1:
        k = l + 1;
        l = ac[k];
_L4:
        j1 = l;
        i1 = k;
        if (l == 46)
        {
            l = k + 1;
            k = ac[l];
            do
            {
                j1 = k;
                i1 = l;
                if (k < 48)
                {
                    break;
                }
                j1 = k;
                i1 = l;
                if (k > 57)
                {
                    break;
                }
                l++;
                k = ac[l];
            } while (true);
        }
        break MISSING_BLOCK_LABEL_189;
_L2:
        if (k < 49 || k > 57)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        j1 = l + 1;
        i1 = ac[j1];
_L6:
        l = i1;
        k = j1;
        if (i1 < 48) goto _L4; else goto _L3
_L3:
        l = i1;
        k = j1;
        if (i1 > 57) goto _L4; else goto _L5
_L5:
        j1++;
        i1 = ac[j1];
          goto _L6
        return JsonToken.STRING;
label0:
        {
label1:
            {
                if (j1 != 101)
                {
                    l = i1;
                    if (j1 != 69)
                    {
                        break label0;
                    }
                }
                i1++;
                j1 = ac[i1];
                if (j1 != '+')
                {
                    l = j1;
                    k = i1;
                    if (j1 != '-')
                    {
                        break label1;
                    }
                }
                k = i1 + 1;
                l = ac[k];
            }
            if (l >= 48 && l <= 57)
            {
                k++;
                i1 = ac[k];
                do
                {
                    l = k;
                    if (i1 < '0')
                    {
                        break;
                    }
                    l = k;
                    if (i1 > '9')
                    {
                        break;
                    }
                    k++;
                    i1 = ac[k];
                } while (true);
            } else
            {
                return JsonToken.STRING;
            }
        }
        if (l == i + j)
        {
            return JsonToken.NUMBER;
        } else
        {
            return JsonToken.STRING;
        }
    }

    private void expect(JsonToken jsontoken)
        throws IOException
    {
        peek();
        if (token != jsontoken)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(jsontoken).append(" but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        } else
        {
            advance();
            return;
        }
    }

    private boolean fillBuffer(int i)
        throws IOException
    {
        char ac[] = buffer;
        int i1 = bufferStartLine;
        int j = bufferStartColumn;
        int j1 = pos;
        int l = 0;
        while (l < j1) 
        {
            if (ac[l] == '\n')
            {
                i1++;
                j = 1;
            } else
            {
                j++;
            }
            l++;
        }
        bufferStartLine = i1;
        bufferStartColumn = j;
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
            int k = in.read(ac, limit, ac.length - limit);
            if (k != -1)
            {
                limit = k + limit;
                if (bufferStartLine == 1 && bufferStartColumn == 1 && limit > 0 && ac[0] == '\uFEFF')
                {
                    pos = pos + 1;
                    bufferStartColumn = bufferStartColumn - 1;
                }
                if (limit >= i)
                {
                    return true;
                }
            } else
            {
                return false;
            }
        } while (true);
    }

    private int getColumnNumber()
    {
        int i = bufferStartColumn;
        int j = 0;
        while (j < pos) 
        {
            if (buffer[j] == '\n')
            {
                i = 1;
            } else
            {
                i++;
            }
            j++;
        }
        return i;
    }

    private int getLineNumber()
    {
        int j = bufferStartLine;
        for (int i = 0; i < pos;)
        {
            int k = j;
            if (buffer[i] == '\n')
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    private JsonToken nextInArray(boolean flag)
        throws IOException
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        stack[stackSize - 1] = JsonScope.NONEMPTY_ARRAY;
_L4:
        switch (nextNonWhitespace(true))
        {
        default:
            pos = pos - 1;
            return nextValue();

        case 93: // ']'
            if (flag)
            {
                stackSize = stackSize - 1;
                JsonToken jsontoken1 = JsonToken.END_ARRAY;
                token = jsontoken1;
                return jsontoken1;
            }
            // fall through

        case 44: // ','
        case 59: // ';'
            checkLenient();
            pos = pos - 1;
            value = "null";
            JsonToken jsontoken2 = JsonToken.NULL;
            token = jsontoken2;
            return jsontoken2;
        }
_L2:
        switch (nextNonWhitespace(true))
        {
        default:
            throw syntaxError("Unterminated array");

        case 93: // ']'
            stackSize = stackSize - 1;
            JsonToken jsontoken = JsonToken.END_ARRAY;
            token = jsontoken;
            return jsontoken;

        case 59: // ';'
            checkLenient();
            break;

        case 44: // ','
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private JsonToken nextInObject(boolean flag)
        throws IOException
    {
        if (flag)
        {
            switch (nextNonWhitespace(true))
            {
            default:
                pos = pos - 1;
                do
                {
                    int i = nextNonWhitespace(true);
                    JsonToken jsontoken;
                    switch (i)
                    {
                    default:
                        checkLenient();
                        pos = pos - 1;
                        name = nextLiteral(false);
                        if (name.length() == 0)
                        {
                            throw syntaxError("Expected name");
                        }
                        break;

                    case 39: // '\''
                        checkLenient();
                        // fall through

                    case 34: // '"'
                        name = nextString((char)i);
                        break;
                    }
                    stack[stackSize - 1] = JsonScope.DANGLING_NAME;
                    jsontoken = JsonToken.NAME;
                    token = jsontoken;
                    return jsontoken;
                } while (true);

            case 125: // '}'
                stackSize = stackSize - 1;
                jsontoken = JsonToken.END_OBJECT;
                token = jsontoken;
                return jsontoken;
            }
        } else
        {
            switch (nextNonWhitespace(true))
            {
            default:
                throw syntaxError("Unterminated object");

            case 125: // '}'
                stackSize = stackSize - 1;
                jsontoken = JsonToken.END_OBJECT;
                token = jsontoken;
                return jsontoken;

            case 44: // ','
            case 59: // ';'
                break;
            }
            continue;
        }
    }

    private String nextLiteral(boolean flag)
        throws IOException
    {
        Object obj;
        Object obj2;
        int i;
        obj2 = null;
        valuePos = -1;
        valueLength = 0;
        i = 0;
        obj = null;
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
            if (fillBuffer(i + 1))
            {
                continue; /* Loop/switch isn't completed */
            }
            buffer[limit] = '\0';
            obj1 = obj;
            j = i;
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
                valueLength = valueLength + i;
                pos = i + pos;
                if (fillBuffer(1))
                {
                    break label0;
                }
                j = 0;
            }
        }
        if (flag && obj1 == null)
        {
            valuePos = pos;
            obj = obj2;
        } else
        if (skipping)
        {
            obj = "skipped!";
        } else
        if (obj1 == null)
        {
            obj = stringPool.get(buffer, pos, j);
        } else
        {
            ((StringBuilder) (obj1)).append(buffer, pos, j);
            obj = ((StringBuilder) (obj1)).toString();
        }
        valueLength = valueLength + j;
        pos = pos + j;
        return ((String) (obj));
        i = 0;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int nextNonWhitespace(boolean flag)
        throws IOException
    {
        char ac[] = buffer;
        int i = pos;
        int j = limit;
label0:
        do
        {
            do
            {
                int k = j;
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
                switch (j)
                {
                default:
                    pos = i;
                    return j;

                case 9: // '\t'
                case 10: // '\n'
                case 13: // '\r'
                case 32: // ' '
                    j = k;
                    break;

                case 47: // '/'
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
                    continue label0;

                case 35: // '#'
                    pos = i;
                    checkLenient();
                    skipToEndOfLine();
                    i = pos;
                    j = limit;
                    continue label0;
                }
            } while (true);
        } while (true);
    }

    private String nextString(char c)
        throws IOException
    {
        char ac[] = buffer;
        StringBuilder stringbuilder = null;
        do
        {
            int i = pos;
            int j = limit;
            for (int k = i; k < j;)
            {
                int l = k + 1;
                k = ac[k];
                if (k == c)
                {
                    pos = l;
                    if (skipping)
                    {
                        return "skipped!";
                    }
                    if (stringbuilder == null)
                    {
                        return stringPool.get(ac, i, l - i - 1);
                    } else
                    {
                        stringbuilder.append(ac, i, l - i - 1);
                        return stringbuilder.toString();
                    }
                }
                StringBuilder stringbuilder2;
                if (k == 92)
                {
                    pos = l;
                    StringBuilder stringbuilder1 = stringbuilder;
                    if (stringbuilder == null)
                    {
                        stringbuilder1 = new StringBuilder();
                    }
                    stringbuilder1.append(ac, i, l - i - 1);
                    stringbuilder1.append(readEscapeCharacter());
                    k = pos;
                    j = limit;
                    stringbuilder = stringbuilder1;
                    i = k;
                } else
                {
                    k = l;
                }
            }

            stringbuilder2 = stringbuilder;
            if (stringbuilder == null)
            {
                stringbuilder2 = new StringBuilder();
            }
            stringbuilder2.append(ac, i, k - i);
            pos = k;
            stringbuilder = stringbuilder2;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private JsonToken nextValue()
        throws IOException
    {
        int i = nextNonWhitespace(true);
        switch (i)
        {
        default:
            pos = pos - 1;
            return readLiteral();

        case 123: // '{'
            push(JsonScope.EMPTY_OBJECT);
            JsonToken jsontoken = JsonToken.BEGIN_OBJECT;
            token = jsontoken;
            return jsontoken;

        case 91: // '['
            push(JsonScope.EMPTY_ARRAY);
            JsonToken jsontoken1 = JsonToken.BEGIN_ARRAY;
            token = jsontoken1;
            return jsontoken1;

        case 39: // '\''
            checkLenient();
            // fall through

        case 34: // '"'
            value = nextString((char)i);
            JsonToken jsontoken2 = JsonToken.STRING;
            token = jsontoken2;
            return jsontoken2;
        }
    }

    private JsonToken objectValue()
        throws IOException
    {
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
            // fall through

        case 58: // ':'
            stack[stackSize - 1] = JsonScope.NONEMPTY_OBJECT;
            return nextValue();
        }
    }

    private void push(JsonScope jsonscope)
    {
        if (stackSize == stack.length)
        {
            JsonScope ajsonscope[] = new JsonScope[stackSize * 2];
            System.arraycopy(stack, 0, ajsonscope, 0, stackSize);
            stack = ajsonscope;
        }
        JsonScope ajsonscope1[] = stack;
        int i = stackSize;
        stackSize = i + 1;
        ajsonscope1[i] = jsonscope;
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
            char c1 = '\0';
            int j = k;
            while (j < k + 4) 
            {
                char c2 = buffer[j];
                char c3 = (char)(c1 << 4);
                if (c2 >= '0' && c2 <= '9')
                {
                    c1 = (char)(c3 + (c2 - 48));
                } else
                if (c2 >= 'a' && c2 <= 'f')
                {
                    c1 = (char)(c3 + ((c2 - 97) + 10));
                } else
                if (c2 >= 'A' && c2 <= 'F')
                {
                    c1 = (char)(c3 + ((c2 - 65) + 10));
                } else
                {
                    throw new NumberFormatException((new StringBuilder()).append("\\u").append(stringPool.get(buffer, pos, 4)).toString());
                }
                j++;
            }
            pos = pos + 4;
            return c1;

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
        }
    }

    private JsonToken readLiteral()
        throws IOException
    {
        value = nextLiteral(true);
        if (valueLength == 0)
        {
            throw syntaxError("Expected literal value");
        }
        token = decodeLiteral();
        if (token == JsonToken.STRING)
        {
            checkLenient();
        }
        return token;
    }

    private boolean skipTo(String s)
        throws IOException
    {
        boolean flag1 = false;
label0:
        do
        {
            boolean flag;
label1:
            {
                if (pos + s.length() > limit)
                {
                    flag = flag1;
                    if (!fillBuffer(s.length()))
                    {
                        break label1;
                    }
                }
                int i = 0;
                do
                {
                    if (i >= s.length())
                    {
                        break;
                    }
                    if (buffer[pos + i] != s.charAt(i))
                    {
                        pos = pos + 1;
                        continue label0;
                    }
                    i++;
                } while (true);
                flag = true;
            }
            return flag;
        } while (true);
    }

    private void skipToEndOfLine()
        throws IOException
    {
        int i;
        do
        {
            if (pos >= limit && !fillBuffer(1))
            {
                break;
            }
            char ac[] = buffer;
            i = pos;
            pos = i + 1;
            i = ac[i];
        } while (i != '\r' && i != '\n');
    }

    private IOException syntaxError(String s)
        throws IOException
    {
        throw new MalformedJsonException((new StringBuilder()).append(s).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
    }

    public void beginArray()
        throws IOException
    {
        expect(JsonToken.BEGIN_ARRAY);
    }

    public void beginObject()
        throws IOException
    {
        expect(JsonToken.BEGIN_OBJECT);
    }

    public void close()
        throws IOException
    {
        value = null;
        token = null;
        stack[0] = JsonScope.CLOSED;
        stackSize = 1;
        in.close();
    }

    public void endArray()
        throws IOException
    {
        expect(JsonToken.END_ARRAY);
    }

    public void endObject()
        throws IOException
    {
        expect(JsonToken.END_OBJECT);
    }

    public boolean hasNext()
        throws IOException
    {
        peek();
        return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY;
    }

    public final boolean isLenient()
    {
        return lenient;
    }

    public boolean nextBoolean()
        throws IOException
    {
        peek();
        if (token != JsonToken.BOOLEAN)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected a boolean but was ").append(token).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        }
        boolean flag;
        if (value == "true")
        {
            flag = true;
        } else
        {
            flag = false;
        }
        advance();
        return flag;
    }

    public double nextDouble()
        throws IOException
    {
        peek();
        if (token != JsonToken.STRING && token != JsonToken.NUMBER)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected a double but was ").append(token).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        }
        double d = Double.parseDouble(value);
        if (d >= 1.0D && value.startsWith("0"))
        {
            throw new MalformedJsonException((new StringBuilder()).append("JSON forbids octal prefixes: ").append(value).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        }
        if (!lenient && (Double.isNaN(d) || Double.isInfinite(d)))
        {
            throw new MalformedJsonException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(value).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        } else
        {
            advance();
            return d;
        }
    }

    public int nextInt()
        throws IOException
    {
        peek();
        if (token != JsonToken.STRING && token != JsonToken.NUMBER)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected an int but was ").append(token).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        }
        int i;
        try
        {
            i = Integer.parseInt(value);
        }
        catch (NumberFormatException numberformatexception)
        {
            double d = Double.parseDouble(value);
            int j = (int)d;
            i = j;
            if ((double)j != d)
            {
                throw new NumberFormatException((new StringBuilder()).append("Expected an int but was ").append(value).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
            }
        }
        if ((long)i >= 1L && value.startsWith("0"))
        {
            throw new MalformedJsonException((new StringBuilder()).append("JSON forbids octal prefixes: ").append(value).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        } else
        {
            advance();
            return i;
        }
    }

    public long nextLong()
        throws IOException
    {
        peek();
        if (token != JsonToken.STRING && token != JsonToken.NUMBER)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected a long but was ").append(token).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        }
        long l;
        try
        {
            l = Long.parseLong(value);
        }
        catch (NumberFormatException numberformatexception)
        {
            double d = Double.parseDouble(value);
            long l1 = (long)d;
            l = l1;
            if ((double)l1 != d)
            {
                throw new NumberFormatException((new StringBuilder()).append("Expected a long but was ").append(value).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
            }
        }
        if (l >= 1L && value.startsWith("0"))
        {
            throw new MalformedJsonException((new StringBuilder()).append("JSON forbids octal prefixes: ").append(value).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        } else
        {
            advance();
            return l;
        }
    }

    public String nextName()
        throws IOException
    {
        peek();
        if (token != JsonToken.NAME)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        } else
        {
            String s = name;
            advance();
            return s;
        }
    }

    public void nextNull()
        throws IOException
    {
        peek();
        if (token != JsonToken.NULL)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected null but was ").append(token).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        } else
        {
            advance();
            return;
        }
    }

    public String nextString()
        throws IOException
    {
        peek();
        if (token != JsonToken.STRING && token != JsonToken.NUMBER)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected a string but was ").append(peek()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
        } else
        {
            String s = value;
            advance();
            return s;
        }
    }

    public JsonToken peek()
        throws IOException
    {
        if (token == null) goto _L2; else goto _L1
_L1:
        JsonToken jsontoken = token;
_L4:
        return jsontoken;
_L2:
        static class _cls2
        {

            static final int $SwitchMap$com$google$gson$stream$JsonScope[];

            static 
            {
                $SwitchMap$com$google$gson$stream$JsonScope = new int[JsonScope.values().length];
                try
                {
                    $SwitchMap$com$google$gson$stream$JsonScope[JsonScope.EMPTY_DOCUMENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$gson$stream$JsonScope[JsonScope.EMPTY_ARRAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$gson$stream$JsonScope[JsonScope.NONEMPTY_ARRAY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$gson$stream$JsonScope[JsonScope.EMPTY_OBJECT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$gson$stream$JsonScope[JsonScope.DANGLING_NAME.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$gson$stream$JsonScope[JsonScope.NONEMPTY_OBJECT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$gson$stream$JsonScope[JsonScope.NONEMPTY_DOCUMENT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$gson$stream$JsonScope[JsonScope.CLOSED.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.google.gson.stream.JsonScope[stack[stackSize - 1].ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            if (lenient)
            {
                consumeNonExecutePrefix();
            }
            stack[stackSize - 1] = JsonScope.NONEMPTY_DOCUMENT;
            JsonToken jsontoken1 = nextValue();
            jsontoken = jsontoken1;
            if (!lenient)
            {
                jsontoken = jsontoken1;
                if (token != JsonToken.BEGIN_ARRAY)
                {
                    jsontoken = jsontoken1;
                    if (token != JsonToken.BEGIN_OBJECT)
                    {
                        throw new IOException((new StringBuilder()).append("Expected JSON document to start with '[' or '{' but was ").append(token).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
                    }
                }
            }
            break;

        case 2: // '\002'
            return nextInArray(true);

        case 3: // '\003'
            return nextInArray(false);

        case 4: // '\004'
            return nextInObject(true);

        case 5: // '\005'
            return objectValue();

        case 6: // '\006'
            return nextInObject(false);

        case 7: // '\007'
            if (nextNonWhitespace(false) == -1)
            {
                return JsonToken.END_DOCUMENT;
            }
            pos = pos - 1;
            if (!lenient)
            {
                throw syntaxError("Expected EOF");
            } else
            {
                return nextValue();
            }

        case 8: // '\b'
            throw new IllegalStateException("JsonReader is closed");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void setLenient(boolean flag)
    {
        lenient = flag;
    }

    public void skipValue()
        throws IOException
    {
        int j;
        skipping = true;
        j = 0;
_L5:
        JsonToken jsontoken = advance();
        if (jsontoken == JsonToken.BEGIN_ARRAY) goto _L2; else goto _L1
_L1:
        JsonToken jsontoken1 = JsonToken.BEGIN_OBJECT;
        if (jsontoken != jsontoken1) goto _L3; else goto _L2
_L2:
        int i = j + 1;
_L8:
        j = i;
        if (i != 0) goto _L5; else goto _L4
_L4:
        skipping = false;
        return;
_L3:
        if (jsontoken == JsonToken.END_ARRAY) goto _L7; else goto _L6
_L6:
        jsontoken1 = JsonToken.END_OBJECT;
        i = j;
        if (jsontoken != jsontoken1) goto _L8; else goto _L7
_L7:
        i = j - 1;
          goto _L8
        Exception exception;
        exception;
        skipping = false;
        throw exception;
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
                jsonreader.peek();
                if (jsonreader.token != JsonToken.NAME)
                {
                    throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(jsonreader.peek()).append(" ").append(" at line ").append(jsonreader.getLineNumber()).append(" column ").append(jsonreader.getColumnNumber()).toString());
                } else
                {
                    jsonreader.value = jsonreader.name;
                    jsonreader.name = null;
                    jsonreader.token = JsonToken.STRING;
                    return;
                }
            }

        };
    }



/*
    static JsonToken access$002(JsonReader jsonreader, JsonToken jsontoken)
    {
        jsonreader.token = jsontoken;
        return jsontoken;
    }

*/




/*
    static String access$302(JsonReader jsonreader, String s)
    {
        jsonreader.value = s;
        return s;
    }

*/



/*
    static String access$402(JsonReader jsonreader, String s)
    {
        jsonreader.name = s;
        return s;
    }

*/
}
