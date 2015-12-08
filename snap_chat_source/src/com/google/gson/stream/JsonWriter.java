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
    private boolean g;
    private boolean h;
    private String i;
    private boolean j;

    public JsonWriter(Writer writer)
    {
        d = new int[32];
        e = 0;
        a(6);
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

    private JsonWriter a(int k, int l, String s)
    {
        int i1 = a();
        if (i1 != l && i1 != k)
        {
            throw new IllegalStateException("Nesting problem.");
        }
        if (i != null)
        {
            throw new IllegalStateException((new StringBuilder("Dangling name: ")).append(i).toString());
        } else
        {
            e = e - 1;
            c.write(s);
            return this;
        }
    }

    private JsonWriter a(int k, String s)
    {
        a(true);
        a(k);
        c.write(s);
        return this;
    }

    private void a(int k)
    {
        if (e == d.length)
        {
            int ai[] = new int[e << 1];
            System.arraycopy(d, 0, ai, 0, e);
            d = ai;
        }
        int ai1[] = d;
        int l = e;
        e = l + 1;
        ai1[l] = k;
    }

    private void a(String s)
    {
        String s1;
        int k;
        int l;
        int i1;
        int j1;
        char c1;
        l = 0;
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
        j1 = s.length();
        k = 0;
        if (k >= j1)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        c1 = s.charAt(k);
        if (c1 >= '\200') goto _L2; else goto _L1
_L1:
        s2 = as[c1];
        s1 = s2;
        if (s2 != null) goto _L4; else goto _L3
_L3:
        i1 = l;
_L6:
        k++;
        l = i1;
        break MISSING_BLOCK_LABEL_32;
_L2:
        if (c1 != '\u2028')
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = "\\u2028";
_L4:
        if (l < k)
        {
            c.write(s, l, k - l);
        }
        c.write(s1);
        i1 = k + 1;
        if (true) goto _L6; else goto _L5
_L5:
        i1 = l;
        if (c1 != '\u2029') goto _L6; else goto _L7
_L7:
        s1 = "\\u2029";
          goto _L4
        if (l < j1)
        {
            c.write(s, l, j1 - l);
        }
        c.write("\"");
        return;
    }

    private void a(boolean flag)
    {
        switch (a())
        {
        case 3: // '\003'
        case 5: // '\005'
        default:
            throw new IllegalStateException("Nesting problem.");

        case 7: // '\007'
            if (!g)
            {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            // fall through

        case 6: // '\006'
            if (!g && !flag)
            {
                throw new IllegalStateException("JSON must start with an array or an object.");
            } else
            {
                b(7);
                return;
            }

        case 1: // '\001'
            b(2);
            return;

        case 2: // '\002'
            c.append(',');
            return;

        case 4: // '\004'
            c.append(f);
            b(5);
            return;
        }
    }

    private void b()
    {
        if (i != null)
        {
            int k = a();
            if (k == 5)
            {
                c.write(44);
            } else
            if (k != 3)
            {
                throw new IllegalStateException("Nesting problem.");
            }
            b(4);
            a(i);
            i = null;
        }
    }

    private void b(int k)
    {
        d[e - 1] = k;
    }

    public JsonWriter beginArray()
    {
        b();
        return a(1, "[");
    }

    public JsonWriter beginObject()
    {
        b();
        return a(3, "{");
    }

    public void close()
    {
        c.close();
        int k = e;
        if (k > 1 || k == 1 && d[k - 1] != 7)
        {
            throw new IOException("Incomplete document");
        } else
        {
            e = 0;
            return;
        }
    }

    public JsonWriter endArray()
    {
        return a(1, 2, "]");
    }

    public JsonWriter endObject()
    {
        return a(3, 5, "}");
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

    public final boolean getSerializeNulls()
    {
        return j;
    }

    public final boolean isHtmlSafe()
    {
        return h;
    }

    public boolean isLenient()
    {
        return g;
    }

    public JsonWriter name(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("name == null");
        }
        if (i != null)
        {
            throw new IllegalStateException();
        }
        if (e == 0)
        {
            throw new IllegalStateException("JsonWriter is closed.");
        } else
        {
            i = s;
            return this;
        }
    }

    public JsonWriter nullValue()
    {
label0:
        {
            if (i != null)
            {
                if (!j)
                {
                    break label0;
                }
                b();
            }
            a(false);
            c.write("null");
            return this;
        }
        i = null;
        return this;
    }

    public final void setHtmlSafe(boolean flag)
    {
        h = flag;
    }

    public final void setLenient(boolean flag)
    {
        g = flag;
    }

    public final void setSerializeNulls(boolean flag)
    {
        j = flag;
    }

    public JsonWriter value(long l)
    {
        b();
        a(false);
        c.write(Long.toString(l));
        return this;
    }

    public JsonWriter value(Number number)
    {
        if (number == null)
        {
            return nullValue();
        }
        b();
        String s = number.toString();
        if (!g && (s.equals("-Infinity") || s.equals("Infinity") || s.equals("NaN")))
        {
            throw new IllegalArgumentException((new StringBuilder("Numeric values must be finite, but was ")).append(number).toString());
        } else
        {
            a(false);
            c.append(s);
            return this;
        }
    }

    public JsonWriter value(String s)
    {
        if (s == null)
        {
            return nullValue();
        } else
        {
            b();
            a(false);
            a(s);
            return this;
        }
    }

    public JsonWriter value(boolean flag)
    {
        b();
        a(false);
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

    static 
    {
        a = new String[128];
        for (int k = 0; k <= 31; k++)
        {
            a[k] = String.format("\\u%04x", new Object[] {
                Integer.valueOf(k)
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
