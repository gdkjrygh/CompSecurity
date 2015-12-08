// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.org.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

// Referenced classes of package twitter4j.internal.org.json:
//            JSONException, JSONObject, JSONArray

public class JSONTokener
{

    private int character;
    private boolean eof;
    private int index;
    private int line;
    private char previous;
    private Reader reader;
    private boolean usePrevious;

    public JSONTokener(InputStream inputstream)
    {
        this(((Reader) (new InputStreamReader(inputstream))));
    }

    public JSONTokener(Reader reader1)
    {
        if (!reader1.markSupported())
        {
            reader1 = new BufferedReader(reader1);
        }
        reader = reader1;
        eof = false;
        usePrevious = false;
        previous = '\0';
        index = 0;
        character = 1;
        line = 1;
    }

    public JSONTokener(String s)
    {
        this(((Reader) (new StringReader(s))));
    }

    public void back()
    {
        if (usePrevious || index <= 0)
        {
            throw new JSONException("Stepping back two steps is not supported");
        } else
        {
            index = index - 1;
            character = character - 1;
            usePrevious = true;
            eof = false;
            return;
        }
    }

    public boolean end()
    {
        return eof && !usePrevious;
    }

    public boolean more()
    {
        next();
        if (end())
        {
            return false;
        } else
        {
            back();
            return true;
        }
    }

    public char next()
    {
        boolean flag = false;
        int i;
        if (usePrevious)
        {
            usePrevious = false;
            i = previous;
        } else
        {
            try
            {
                j = reader.read();
            }
            catch (IOException ioexception)
            {
                throw new JSONException(ioexception);
            }
            i = j;
            if (j <= 0)
            {
                eof = true;
                i = 0;
            }
        }
        index = index + 1;
        if (previous == '\r')
        {
            line = line + 1;
            int j;
            if (i == 10)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            character = j;
        } else
        if (i == 10)
        {
            line = line + 1;
            character = 0;
        } else
        {
            character = character + 1;
        }
        previous = (char)i;
        return previous;
    }

    public char next(char c)
    {
        char c1 = next();
        if (c1 != c)
        {
            throw syntaxError((new StringBuilder("Expected '")).append(c).append("' and instead saw '").append(c1).append("'").toString());
        } else
        {
            return c1;
        }
    }

    public String next(int i)
    {
        if (i == 0)
        {
            return "";
        }
        char ac[] = new char[i];
        for (int j = 0; j < i; j++)
        {
            ac[j] = next();
            if (end())
            {
                throw syntaxError("Substring bounds error");
            }
        }

        return new String(ac);
    }

    public char nextClean()
    {
        char c;
        do
        {
            c = next();
        } while (c != 0 && c <= ' ');
        return c;
    }

    public String nextString(char c)
    {
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            char c1 = next();
            switch (c1)
            {
            default:
                if (c1 == c)
                {
                    return stringbuilder.toString();
                }
                break;

            case 0: // '\0'
            case 10: // '\n'
            case 13: // '\r'
                throw syntaxError("Unterminated string");

            case 92: // '\\'
                c1 = next();
                switch (c1)
                {
                default:
                    throw syntaxError("Illegal escape.");

                case 98: // 'b'
                    stringbuilder.append('\b');
                    break;

                case 116: // 't'
                    stringbuilder.append('\t');
                    break;

                case 110: // 'n'
                    stringbuilder.append('\n');
                    break;

                case 102: // 'f'
                    stringbuilder.append('\f');
                    break;

                case 114: // 'r'
                    stringbuilder.append('\r');
                    break;

                case 117: // 'u'
                    stringbuilder.append((char)Integer.parseInt(next(4), 16));
                    break;

                case 34: // '"'
                case 39: // '\''
                case 47: // '/'
                case 92: // '\\'
                    stringbuilder.append(c1);
                    break;
                }
                continue;
            }
            stringbuilder.append(c1);
        } while (true);
    }

    public Object nextValue()
    {
        char c = nextClean();
        Object obj;
        switch (c)
        {
        default:
            obj = new StringBuilder();
            for (; c >= ' ' && ",:]}/\\\"[{;=#".indexOf(c) < 0; c = next())
            {
                ((StringBuilder) (obj)).append(c);
            }

            break;

        case 34: // '"'
        case 39: // '\''
            return nextString(c);

        case 123: // '{'
            back();
            return new JSONObject(this);

        case 91: // '['
            back();
            return new JSONArray(this);
        }
        back();
        obj = ((StringBuilder) (obj)).toString().trim();
        if (((String) (obj)).equals(""))
        {
            throw syntaxError("Missing value");
        } else
        {
            return JSONObject.stringToValue(((String) (obj)));
        }
    }

    public JSONException syntaxError(String s)
    {
        return new JSONException((new StringBuilder()).append(s).append(toString()).toString());
    }

    public String toString()
    {
        return (new StringBuilder(" at ")).append(index).append(" [character ").append(character).append(" line ").append(line).append("]").toString();
    }
}
