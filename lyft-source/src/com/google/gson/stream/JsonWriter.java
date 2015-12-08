// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class JsonWriter
    implements Closeable, Flushable
{

    private static final String a[];
    private static final String b[];
    private final Writer c;
    private int d[];
    private int e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;

    public JsonWriter(Writer writer)
    {
        d = new int[32];
        e = 0;
        a(6);
        g = ":";
        k = true;
        if (writer == null)
        {
            throw new NullPointerException("out == null");
        } else
        {
            c = writer;
            return;
        }
    }

    private int a()
    {
        if (e == 0)
        {
            throw new IllegalStateException("JsonWriter is closed.");
        } else
        {
            return d[e - 1];
        }
    }

    private JsonWriter a(int i1, int j1, String s)
    {
        int k1 = a();
        if (k1 != j1 && k1 != i1)
        {
            throw new IllegalStateException("Nesting problem.");
        }
        if (j != null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Dangling name: ").append(j).toString());
        }
        e = e - 1;
        if (k1 == j1)
        {
            k();
        }
        c.write(s);
        return this;
    }

    private JsonWriter a(int i1, String s)
    {
        e(true);
        a(i1);
        c.write(s);
        return this;
    }

    private void a(int i1)
    {
        if (e == d.length)
        {
            int ai[] = new int[e * 2];
            System.arraycopy(d, 0, ai, 0, e);
            d = ai;
        }
        int ai1[] = d;
        int j1 = e;
        e = j1 + 1;
        ai1[j1] = i1;
    }

    private void b(int i1)
    {
        d[e - 1] = i1;
    }

    private void d(String s)
    {
        String s1;
        int i1;
        int j1;
        int k1;
        int l1;
        char c1;
        j1 = 0;
        String as[];
        String s2;
        if (i)
        {
            as = b;
        } else
        {
            as = a;
        }
        c.write("\"");
        l1 = s.length();
        i1 = 0;
        if (i1 >= l1)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        c1 = s.charAt(i1);
        if (c1 >= '\200') goto _L2; else goto _L1
_L1:
        s2 = as[c1];
        s1 = s2;
        if (s2 != null) goto _L4; else goto _L3
_L3:
        k1 = j1;
_L6:
        i1++;
        j1 = k1;
        break MISSING_BLOCK_LABEL_32;
_L2:
        if (c1 != '\u2028')
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = "\\u2028";
_L4:
        if (j1 < i1)
        {
            c.write(s, j1, i1 - j1);
        }
        c.write(s1);
        k1 = i1 + 1;
        if (true) goto _L6; else goto _L5
_L5:
        k1 = j1;
        if (c1 != '\u2029') goto _L6; else goto _L7
_L7:
        s1 = "\\u2029";
          goto _L4
        if (j1 < l1)
        {
            c.write(s, j1, l1 - j1);
        }
        c.write("\"");
        return;
    }

    private void e(boolean flag)
    {
        switch (a())
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            throw new IllegalStateException("Nesting problem.");

        case 7: // '\007'
            if (!h)
            {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            // fall through

        case 6: // '\006'
            if (!h && !flag)
            {
                throw new IllegalStateException("JSON must start with an array or an object.");
            } else
            {
                b(7);
                return;
            }

        case 1: // '\001'
            b(2);
            k();
            return;

        case 2: // '\002'
            c.append(',');
            k();
            return;

        case 4: // '\004'
            c.append(g);
            b(5);
            return;
        }
    }

    private void j()
    {
        if (j != null)
        {
            l();
            d(j);
            j = null;
        }
    }

    private void k()
    {
        if (f != null)
        {
            c.write("\n");
            int i1 = 1;
            int j1 = e;
            while (i1 < j1) 
            {
                c.write(f);
                i1++;
            }
        }
    }

    private void l()
    {
        int i1 = a();
        if (i1 == 5)
        {
            c.write(44);
        } else
        if (i1 != 3)
        {
            throw new IllegalStateException("Nesting problem.");
        }
        k();
        b(4);
    }

    public JsonWriter a(long l1)
    {
        j();
        e(false);
        c.write(Long.toString(l1));
        return this;
    }

    public JsonWriter a(Number number)
    {
        if (number == null)
        {
            return f();
        }
        j();
        String s = number.toString();
        if (!h && (s.equals("-Infinity") || s.equals("Infinity") || s.equals("NaN")))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Numeric values must be finite, but was ").append(number).toString());
        } else
        {
            e(false);
            c.append(s);
            return this;
        }
    }

    public JsonWriter a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("name == null");
        }
        if (j != null)
        {
            throw new IllegalStateException();
        }
        if (e == 0)
        {
            throw new IllegalStateException("JsonWriter is closed.");
        } else
        {
            j = s;
            return this;
        }
    }

    public JsonWriter a(boolean flag)
    {
        j();
        e(false);
        Writer writer = c;
        String s;
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        writer.write(s);
        return this;
    }

    public JsonWriter b()
    {
        j();
        return a(1, "[");
    }

    public JsonWriter b(String s)
    {
        if (s == null)
        {
            return f();
        } else
        {
            j();
            e(false);
            d(s);
            return this;
        }
    }

    public final void b(boolean flag)
    {
        h = flag;
    }

    public JsonWriter c()
    {
        return a(1, 2, "]");
    }

    public final void c(String s)
    {
        if (s.length() == 0)
        {
            f = null;
            g = ":";
            return;
        } else
        {
            f = s;
            g = ": ";
            return;
        }
    }

    public final void c(boolean flag)
    {
        i = flag;
    }

    public void close()
    {
        c.close();
        int i1 = e;
        if (i1 > 1 || i1 == 1 && d[i1 - 1] != 7)
        {
            throw new IOException("Incomplete document");
        } else
        {
            e = 0;
            return;
        }
    }

    public JsonWriter d()
    {
        j();
        return a(3, "{");
    }

    public final void d(boolean flag)
    {
        k = flag;
    }

    public JsonWriter e()
    {
        return a(3, 5, "}");
    }

    public JsonWriter f()
    {
label0:
        {
            if (j != null)
            {
                if (!k)
                {
                    break label0;
                }
                j();
            }
            e(false);
            c.write("null");
            return this;
        }
        j = null;
        return this;
    }

    public void flush()
    {
        if (e == 0)
        {
            throw new IllegalStateException("JsonWriter is closed.");
        } else
        {
            c.flush();
            return;
        }
    }

    public boolean g()
    {
        return h;
    }

    public final boolean h()
    {
        return i;
    }

    public final boolean i()
    {
        return k;
    }

    static 
    {
        a = new String[128];
        for (int i1 = 0; i1 <= 31; i1++)
        {
            a[i1] = String.format("\\u%04x", new Object[] {
                Integer.valueOf(i1)
            });
        }

        a[34] = "\\\"";
        a[92] = "\\\\";
        a[9] = "\\t";
        a[8] = "\\b";
        a[10] = "\\n";
        a[13] = "\\r";
        a[12] = "\\f";
        b = (String[])a.clone();
        b[60] = "\\u003c";
        b[62] = "\\u003e";
        b[38] = "\\u0026";
        b[61] = "\\u003d";
        b[39] = "\\u0027";
    }
}
