// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.json;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.json:
//            c, b, JsonToken

public final class a
    implements Closeable
{

    private final c a = new c();
    private final Reader b;
    private boolean c;
    private final char d[] = new char[1024];
    private int e;
    private int f;
    private int g;
    private int h;
    private final List i = new ArrayList();
    private JsonToken j;
    private String k;
    private String l;
    private int m;
    private int n;
    private boolean o;

    public a(Reader reader)
    {
        c = false;
        e = 0;
        f = 0;
        g = 1;
        h = 1;
        a(b.f);
        o = false;
        if (reader == null)
        {
            throw new NullPointerException("in == null");
        } else
        {
            b = reader;
            return;
        }
    }

    private JsonToken a(boolean flag)
        throws IOException
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        b(b.b);
_L4:
        switch (m())
        {
        default:
            e = e - 1;
            return j();

        case 93: // ']'
            if (flag)
            {
                h();
                JsonToken jsontoken1 = JsonToken.END_ARRAY;
                j = jsontoken1;
                return jsontoken1;
            }
            // fall through

        case 44: // ','
        case 59: // ';'
            n();
            e = e - 1;
            l = "null";
            JsonToken jsontoken2 = JsonToken.NULL;
            j = jsontoken2;
            return jsontoken2;
        }
_L2:
        switch (m())
        {
        default:
            throw b("Unterminated array");

        case 93: // ']'
            h();
            JsonToken jsontoken = JsonToken.END_ARRAY;
            j = jsontoken;
            return jsontoken;

        case 59: // ';'
            n();
            break;

        case 44: // ','
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private JsonToken a(char ac[], int i1, int j1)
    {
        int k1 = ac[i1];
        int l1;
        int i2;
        int j2;
        if (k1 == 45)
        {
            l1 = i1 + 1;
            k1 = ac[l1];
        } else
        {
            l1 = i1;
        }
        if (k1 != 48) goto _L2; else goto _L1
_L1:
        k1 = l1 + 1;
        l1 = ac[k1];
_L4:
        j2 = l1;
        i2 = k1;
        if (l1 == 46)
        {
            l1 = k1 + 1;
            k1 = ac[l1];
            do
            {
                j2 = k1;
                i2 = l1;
                if (k1 < 48)
                {
                    break;
                }
                j2 = k1;
                i2 = l1;
                if (k1 > 57)
                {
                    break;
                }
                l1++;
                k1 = ac[l1];
            } while (true);
        }
        break MISSING_BLOCK_LABEL_189;
_L2:
        if (k1 < 49 || k1 > 57)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        j2 = l1 + 1;
        i2 = ac[j2];
_L6:
        l1 = i2;
        k1 = j2;
        if (i2 < 48) goto _L4; else goto _L3
_L3:
        l1 = i2;
        k1 = j2;
        if (i2 > 57) goto _L4; else goto _L5
_L5:
        j2++;
        i2 = ac[j2];
          goto _L6
        return JsonToken.STRING;
label0:
        {
label1:
            {
                if (j2 != 101)
                {
                    l1 = i2;
                    if (j2 != 69)
                    {
                        break label0;
                    }
                }
                i2++;
                j2 = ac[i2];
                if (j2 != '+')
                {
                    l1 = j2;
                    k1 = i2;
                    if (j2 != '-')
                    {
                        break label1;
                    }
                }
                k1 = i2 + 1;
                l1 = ac[k1];
            }
            if (l1 >= 48 && l1 <= 57)
            {
                k1++;
                i2 = ac[k1];
                do
                {
                    l1 = k1;
                    if (i2 < '0')
                    {
                        break;
                    }
                    l1 = k1;
                    if (i2 > '9')
                    {
                        break;
                    }
                    k1++;
                    i2 = ac[k1];
                } while (true);
            } else
            {
                return JsonToken.STRING;
            }
        }
        if (l1 == i1 + j1)
        {
            return JsonToken.NUMBER;
        } else
        {
            return JsonToken.STRING;
        }
    }

    private String a(char c1)
        throws IOException
    {
        StringBuilder stringbuilder = null;
        do
        {
            int i1 = e;
            do
            {
                if (e >= f)
                {
                    break;
                }
                char ac[] = d;
                int j1 = e;
                e = j1 + 1;
                j1 = ac[j1];
                if (j1 == c1)
                {
                    if (o)
                    {
                        return "skipped!";
                    }
                    if (stringbuilder == null)
                    {
                        return a.a(d, i1, e - i1 - 1);
                    } else
                    {
                        stringbuilder.append(d, i1, e - i1 - 1);
                        return stringbuilder.toString();
                    }
                }
                if (j1 == '\\')
                {
                    StringBuilder stringbuilder1 = stringbuilder;
                    if (stringbuilder == null)
                    {
                        stringbuilder1 = new StringBuilder();
                    }
                    stringbuilder1.append(d, i1, e - i1 - 1);
                    stringbuilder1.append(p());
                    i1 = e;
                    stringbuilder = stringbuilder1;
                }
            } while (true);
            StringBuilder stringbuilder2 = stringbuilder;
            if (stringbuilder == null)
            {
                stringbuilder2 = new StringBuilder();
            }
            stringbuilder2.append(d, i1, e - i1);
            stringbuilder = stringbuilder2;
        } while (a(1));
        throw b("Unterminated string");
    }

    private void a(JsonToken jsontoken)
        throws IOException
    {
        d();
        if (j != jsontoken)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(jsontoken).append(" but was ").append(d()).toString());
        } else
        {
            f();
            return;
        }
    }

    private void a(b b1)
    {
        i.add(b1);
    }

    private boolean a(int i1)
        throws IOException
    {
        boolean flag1 = false;
        int j1 = 0;
        while (j1 < e) 
        {
            if (d[j1] == '\n')
            {
                g = g + 1;
                h = 1;
            } else
            {
                h = h + 1;
            }
            j1++;
        }
        boolean flag;
        if (f != e)
        {
            f = f - e;
            System.arraycopy(d, e, d, 0, f);
        } else
        {
            f = 0;
        }
        e = 0;
        do
        {
            int k1 = b.read(d, f, d.length - f);
            flag = flag1;
            if (k1 == -1)
            {
                break;
            }
            f = k1 + f;
            if (g == 1 && h == 1 && f > 0 && d[0] == '\uFEFF')
            {
                e = e + 1;
                h = h - 1;
            }
            if (f < i1)
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        return flag;
    }

    private boolean a(String s1)
        throws IOException
    {
        boolean flag1 = false;
label0:
        do
        {
            boolean flag;
label1:
            {
                if (e + s1.length() > f)
                {
                    flag = flag1;
                    if (!a(s1.length()))
                    {
                        break label1;
                    }
                }
                int i1 = 0;
                do
                {
                    if (i1 >= s1.length())
                    {
                        break;
                    }
                    if (d[e + i1] != s1.charAt(i1))
                    {
                        e = e + 1;
                        continue label0;
                    }
                    i1++;
                } while (true);
                flag = true;
            }
            return flag;
        } while (true);
    }

    private JsonToken b(boolean flag)
        throws IOException
    {
        if (flag)
        {
            switch (m())
            {
            default:
                e = e - 1;
                do
                {
                    int i1 = m();
                    JsonToken jsontoken;
                    switch (i1)
                    {
                    default:
                        n();
                        e = e - 1;
                        k = c(false);
                        if (k.isEmpty())
                        {
                            throw b("Expected name");
                        }
                        break;

                    case 39: // '\''
                        n();
                        // fall through

                    case 34: // '"'
                        k = a((char)i1);
                        break;
                    }
                    b(b.d);
                    jsontoken = JsonToken.NAME;
                    j = jsontoken;
                    return jsontoken;
                } while (true);

            case 125: // '}'
                h();
                jsontoken = JsonToken.END_OBJECT;
                j = jsontoken;
                return jsontoken;
            }
        } else
        {
            switch (m())
            {
            default:
                throw b("Unterminated object");

            case 125: // '}'
                h();
                jsontoken = JsonToken.END_OBJECT;
                j = jsontoken;
                return jsontoken;

            case 44: // ','
            case 59: // ';'
                break;
            }
            continue;
        }
    }

    private IOException b(String s1)
        throws IOException
    {
        throw new IOException((new StringBuilder()).append(s1).append(" at line ").append(k()).append(" column ").append(l()).toString());
    }

    private void b(b b1)
    {
        i.set(i.size() - 1, b1);
    }

    private String c(boolean flag)
        throws IOException
    {
        Object obj;
        Object obj2;
        int i1;
        obj2 = null;
        m = -1;
        n = 0;
        i1 = 0;
        obj = null;
_L2:
        Object obj1;
        int j1;
        if (e + i1 < f)
        {
            obj1 = obj;
            j1 = i1;
            switch (d[e + i1])
            {
            default:
                i1++;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
            case 47: // '/'
            case 59: // ';'
            case 61: // '='
            case 92: // '\\'
                n();
                j1 = i1;
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
        if (i1 < d.length)
        {
            if (a(i1 + 1))
            {
                continue; /* Loop/switch isn't completed */
            }
            d[f] = '\0';
            obj1 = obj;
            j1 = i1;
        } else
        {
label0:
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new StringBuilder();
                }
                ((StringBuilder) (obj1)).append(d, e, i1);
                n = n + i1;
                e = i1 + e;
                if (a(1))
                {
                    break label0;
                }
                j1 = 0;
            }
        }
        if (flag && obj1 == null)
        {
            m = e;
            obj = obj2;
        } else
        if (o)
        {
            obj = "skipped!";
        } else
        if (obj1 == null)
        {
            obj = a.a(d, e, j1);
        } else
        {
            ((StringBuilder) (obj1)).append(d, e, j1);
            obj = ((StringBuilder) (obj1)).toString();
        }
        n = n + j1;
        e = e + j1;
        return ((String) (obj));
        i1 = 0;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private JsonToken f()
        throws IOException
    {
        d();
        JsonToken jsontoken = j;
        j = null;
        l = null;
        k = null;
        return jsontoken;
    }

    private b g()
    {
        return (b)i.get(i.size() - 1);
    }

    private b h()
    {
        return (b)i.remove(i.size() - 1);
    }

    private JsonToken i()
        throws IOException
    {
        switch (m())
        {
        case 59: // ';'
        case 60: // '<'
        default:
            throw b("Expected ':'");

        case 61: // '='
            n();
            if ((e < f || a(1)) && d[e] == '>')
            {
                e = e + 1;
            }
            // fall through

        case 58: // ':'
            b(b.e);
            return j();
        }
    }

    private JsonToken j()
        throws IOException
    {
        int i1 = m();
        switch (i1)
        {
        default:
            e = e - 1;
            return q();

        case 123: // '{'
            a(b.c);
            JsonToken jsontoken = JsonToken.BEGIN_OBJECT;
            j = jsontoken;
            return jsontoken;

        case 91: // '['
            a(b.a);
            JsonToken jsontoken1 = JsonToken.BEGIN_ARRAY;
            j = jsontoken1;
            return jsontoken1;

        case 39: // '\''
            n();
            // fall through

        case 34: // '"'
            l = a((char)i1);
            JsonToken jsontoken2 = JsonToken.STRING;
            j = jsontoken2;
            return jsontoken2;
        }
    }

    private int k()
    {
        int j1 = g;
        for (int i1 = 0; i1 < e;)
        {
            int k1 = j1;
            if (d[i1] == '\n')
            {
                k1 = j1 + 1;
            }
            i1++;
            j1 = k1;
        }

        return j1;
    }

    private int l()
    {
        int i1 = h;
        int j1 = 0;
        while (j1 < e) 
        {
            if (d[j1] == '\n')
            {
                i1 = 1;
            } else
            {
                i1++;
            }
            j1++;
        }
        return i1;
    }

    private int m()
        throws IOException
    {
_L9:
        if (e >= f && !a(1)) goto _L2; else goto _L1
_L1:
        int i1;
        char ac[] = d;
        i1 = e;
        e = i1 + 1;
        i1 = ac[i1];
        i1;
        JVM INSTR lookupswitch 6: default 100
    //                   9: 0
    //                   10: 0
    //                   13: 0
    //                   32: 0
    //                   35: 220
    //                   47: 102;
           goto _L3 _L4 _L4 _L4 _L4 _L5 _L6
_L4:
        continue; /* Loop/switch isn't completed */
_L3:
        return i1;
_L6:
        if (e == f && !a(1)) goto _L3; else goto _L7
_L7:
        n();
        switch (d[e])
        {
        default:
            return i1;

        case 42: // '*'
            e = e + 1;
            if (!a("*/"))
            {
                throw b("Unterminated comment");
            }
            e = e + 2;
            break;

        case 47: // '/'
            e = e + 1;
            o();
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        n();
        o();
        continue; /* Loop/switch isn't completed */
_L2:
        throw new EOFException("End of input");
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void n()
        throws IOException
    {
        if (!c)
        {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        } else
        {
            return;
        }
    }

    private void o()
        throws IOException
    {
        int i1;
        do
        {
            if (e >= f && !a(1))
            {
                break;
            }
            char ac[] = d;
            i1 = e;
            e = i1 + 1;
            i1 = ac[i1];
        } while (i1 != '\r' && i1 != '\n');
    }

    private char p()
        throws IOException
    {
        if (e == f && !a(1))
        {
            throw b("Unterminated escape sequence");
        }
        char ac[] = d;
        int i1 = e;
        e = i1 + 1;
        char c1 = ac[i1];
        switch (c1)
        {
        default:
            return c1;

        case 117: // 'u'
            if (e + 4 > f && !a(4))
            {
                throw b("Unterminated escape sequence");
            } else
            {
                String s1 = a.a(d, e, 4);
                e = e + 4;
                return (char)Integer.parseInt(s1, 16);
            }

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

    private JsonToken q()
        throws IOException
    {
        l = c(true);
        if (n == 0)
        {
            throw b("Expected literal value");
        }
        j = r();
        if (j == JsonToken.STRING)
        {
            n();
        }
        return j;
    }

    private JsonToken r()
        throws IOException
    {
        if (m == -1)
        {
            return JsonToken.STRING;
        }
        if (n == 4 && ('n' == d[m] || 'N' == d[m]) && ('u' == d[m + 1] || 'U' == d[m + 1]) && ('l' == d[m + 2] || 'L' == d[m + 2]) && ('l' == d[m + 3] || 'L' == d[m + 3]))
        {
            l = "null";
            return JsonToken.NULL;
        }
        if (n == 4 && ('t' == d[m] || 'T' == d[m]) && ('r' == d[m + 1] || 'R' == d[m + 1]) && ('u' == d[m + 2] || 'U' == d[m + 2]) && ('e' == d[m + 3] || 'E' == d[m + 3]))
        {
            l = "true";
            return JsonToken.BOOLEAN;
        }
        if (n == 5 && ('f' == d[m] || 'F' == d[m]) && ('a' == d[m + 1] || 'A' == d[m + 1]) && ('l' == d[m + 2] || 'L' == d[m + 2]) && ('s' == d[m + 3] || 'S' == d[m + 3]) && ('e' == d[m + 4] || 'E' == d[m + 4]))
        {
            l = "false";
            return JsonToken.BOOLEAN;
        } else
        {
            l = a.a(d, m, n);
            return a(d, m, n);
        }
    }

    private CharSequence s()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i1 = Math.min(e, 20);
        stringbuilder.append(d, e - i1, i1);
        i1 = Math.min(f - e, 20);
        stringbuilder.append(d, e, i1);
        return stringbuilder;
    }

    public void a()
        throws IOException
    {
        a(JsonToken.BEGIN_ARRAY);
    }

    public void b()
        throws IOException
    {
        a(JsonToken.END_ARRAY);
    }

    public boolean c()
        throws IOException
    {
        d();
        return j != JsonToken.END_OBJECT && j != JsonToken.END_ARRAY;
    }

    public void close()
        throws IOException
    {
        l = null;
        j = null;
        i.clear();
        i.add(b.h);
        b.close();
    }

    public JsonToken d()
        throws IOException
    {
        if (j == null) goto _L2; else goto _L1
_L1:
        JsonToken jsontoken = j;
_L14:
        return jsontoken;
_L2:
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.qihoo.security.json.b.values().length];
                try
                {
                    a[b.f.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[b.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[b.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[b.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[b.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.e.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[g().ordinal()];
        JVM INSTR tableswitch 1 8: default 72
    //                   1 80
    //                   2 156
    //                   3 162
    //                   4 168
    //                   5 174
    //                   6 179
    //                   7 185
    //                   8 217;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        throw new AssertionError();
_L4:
        b(b.g);
        JsonToken jsontoken2 = j();
        jsontoken = jsontoken2;
        if (!c)
        {
            jsontoken = jsontoken2;
            if (j != JsonToken.BEGIN_ARRAY)
            {
                jsontoken = jsontoken2;
                if (j != JsonToken.BEGIN_OBJECT)
                {
                    throw new IOException((new StringBuilder()).append("Expected JSON document to start with '[' or '{' but was ").append(j).toString());
                }
            }
        }
          goto _L12
_L5:
        return a(true);
_L6:
        return a(false);
_L7:
        return b(true);
_L8:
        return i();
_L9:
        return b(false);
_L12:
        if (true) goto _L14; else goto _L13
_L13:
_L10:
        try
        {
            jsontoken = j();
            if (!c)
            {
                throw b("Expected EOF");
            }
        }
        catch (EOFException eofexception)
        {
            JsonToken jsontoken1 = JsonToken.END_DOCUMENT;
            j = jsontoken1;
            return jsontoken1;
        }
          goto _L14
_L11:
        throw new IllegalStateException("JsonReader is closed");
    }

    public String e()
        throws IOException
    {
        d();
        if (j != JsonToken.STRING && j != JsonToken.NUMBER)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected a string but was ").append(d()).toString());
        } else
        {
            String s1 = l;
            f();
            return s1;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" near ").append(s()).toString();
    }
}
