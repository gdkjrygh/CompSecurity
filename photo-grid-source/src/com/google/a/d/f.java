// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.a.d:
//            d, g

public class f
    implements Closeable, Flushable
{

    private static final String a[];
    private static final String b[];
    private final Writer c;
    private final List d = new ArrayList();
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private String i;
    private boolean j;

    public f(Writer writer)
    {
        d.add(d.f);
        f = ":";
        j = true;
        if (writer == null)
        {
            throw new NullPointerException("out == null");
        } else
        {
            c = writer;
            return;
        }
    }

    private d a()
    {
        int l = d.size();
        if (l == 0)
        {
            throw new IllegalStateException("JsonWriter is closed.");
        } else
        {
            return (d)d.get(l - 1);
        }
    }

    private f a(d d1, d d2, String s)
    {
        d d3 = a();
        if (d3 != d2 && d3 != d1)
        {
            throw new IllegalStateException((new StringBuilder("Nesting problem: ")).append(d).toString());
        }
        if (i != null)
        {
            throw new IllegalStateException((new StringBuilder("Dangling name: ")).append(i).toString());
        }
        d.remove(d.size() - 1);
        if (d3 == d2)
        {
            k();
        }
        c.write(s);
        return this;
    }

    private f a(d d1, String s)
    {
        e(true);
        d.add(d1);
        c.write(s);
        return this;
    }

    private void a(d d1)
    {
        d.set(d.size() - 1, d1);
    }

    private void d(String s)
    {
        String s1;
        int l;
        int i1;
        int j1;
        int k1;
        char c1;
        i1 = 0;
        String as[];
        String s2;
        if (h)
        {
            as = b;
        } else
        {
            as = a;
        }
        c.write("\"");
        k1 = s.length();
        l = 0;
        if (l >= k1)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        c1 = s.charAt(l);
        if (c1 >= '\200') goto _L2; else goto _L1
_L1:
        s2 = as[c1];
        s1 = s2;
        if (s2 != null) goto _L4; else goto _L3
_L3:
        j1 = i1;
_L6:
        l++;
        i1 = j1;
        break MISSING_BLOCK_LABEL_32;
_L2:
        if (c1 != '\u2028')
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = "\\u2028";
_L4:
        if (i1 < l)
        {
            c.write(s, i1, l - i1);
        }
        c.write(s1);
        j1 = l + 1;
        if (true) goto _L6; else goto _L5
_L5:
        j1 = i1;
        if (c1 != '\u2029') goto _L6; else goto _L7
_L7:
        s1 = "\\u2029";
          goto _L4
        if (i1 < k1)
        {
            c.write(s, i1, k1 - i1);
        }
        c.write("\"");
        return;
    }

    private void e(boolean flag)
    {
        switch (g.a[a().ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder("Nesting problem: ")).append(d).toString());

        case 1: // '\001'
            if (!g)
            {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            // fall through

        case 2: // '\002'
            if (!g && !flag)
            {
                throw new IllegalStateException("JSON must start with an array or an object.");
            } else
            {
                a(d.g);
                return;
            }

        case 3: // '\003'
            a(d.b);
            k();
            return;

        case 4: // '\004'
            c.append(',');
            k();
            return;

        case 5: // '\005'
            c.append(f);
            a(d.e);
            return;
        }
    }

    private void j()
    {
        if (i != null)
        {
            d d1 = a();
            if (d1 == d.e)
            {
                c.write(44);
            } else
            if (d1 != d.c)
            {
                throw new IllegalStateException((new StringBuilder("Nesting problem: ")).append(d).toString());
            }
            k();
            a(d.d);
            d(i);
            i = null;
        }
    }

    private void k()
    {
        if (e != null)
        {
            c.write("\n");
            int l = 1;
            while (l < d.size()) 
            {
                c.write(e);
                l++;
            }
        }
    }

    public f a(long l)
    {
        j();
        e(false);
        c.write(Long.toString(l));
        return this;
    }

    public f a(Number number)
    {
        if (number == null)
        {
            return f();
        }
        j();
        String s = number.toString();
        if (!g && (s.equals("-Infinity") || s.equals("Infinity") || s.equals("NaN")))
        {
            throw new IllegalArgumentException((new StringBuilder("Numeric values must be finite, but was ")).append(number).toString());
        } else
        {
            e(false);
            c.append(s);
            return this;
        }
    }

    public f a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("name == null");
        }
        if (i != null)
        {
            throw new IllegalStateException();
        }
        if (d.isEmpty())
        {
            throw new IllegalStateException("JsonWriter is closed.");
        } else
        {
            i = s;
            return this;
        }
    }

    public f a(boolean flag)
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

    public f b()
    {
        j();
        return a(d.a, "[");
    }

    public f b(String s)
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
        g = flag;
    }

    public f c()
    {
        return a(d.a, d.b, "]");
    }

    public final void c(String s)
    {
        if (s.length() == 0)
        {
            e = null;
            f = ":";
            return;
        } else
        {
            e = s;
            f = ": ";
            return;
        }
    }

    public final void c(boolean flag)
    {
        h = flag;
    }

    public void close()
    {
        c.close();
        int l = d.size();
        if (l > 1 || l == 1 && d.get(l - 1) != d.g)
        {
            throw new IOException("Incomplete document");
        } else
        {
            d.clear();
            return;
        }
    }

    public f d()
    {
        j();
        return a(d.c, "{");
    }

    public final void d(boolean flag)
    {
        j = flag;
    }

    public f e()
    {
        return a(d.c, d.e, "}");
    }

    public f f()
    {
label0:
        {
            if (i != null)
            {
                if (!j)
                {
                    break label0;
                }
                j();
            }
            e(false);
            c.write("null");
            return this;
        }
        i = null;
        return this;
    }

    public void flush()
    {
        if (d.isEmpty())
        {
            throw new IllegalStateException("JsonWriter is closed.");
        } else
        {
            c.flush();
            return;
        }
    }

    public final boolean g()
    {
        return g;
    }

    public final boolean h()
    {
        return h;
    }

    public final boolean i()
    {
        return j;
    }

    static 
    {
        a = new String[128];
        for (int l = 0; l <= 31; l++)
        {
            a[l] = String.format("\\u%04x", new Object[] {
                Integer.valueOf(l)
            });
        }

        a[34] = "\\\"";
        a[92] = "\\\\";
        a[9] = "\\t";
        a[8] = "\\b";
        a[10] = "\\n";
        a[13] = "\\r";
        a[12] = "\\f";
        String as[] = (String[])a.clone();
        b = as;
        as[60] = "\\u003c";
        b[62] = "\\u003e";
        b[38] = "\\u0026";
        b[61] = "\\u003d";
        b[39] = "\\u0027";
    }
}
