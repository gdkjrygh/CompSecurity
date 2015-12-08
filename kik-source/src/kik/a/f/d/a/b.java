// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.d.a;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.d.a.c;

public class b
    implements c
{

    private Writer a;
    private boolean b;
    private int c;
    private int d;
    private String e[];
    private int f[];
    private String g[];
    private boolean h[];
    private boolean i;
    private String j;

    public b()
    {
        e = new String[12];
        f = new int[4];
        g = new String[8];
        h = new boolean[4];
    }

    private int a()
    {
        if (b)
        {
            return d + 1;
        } else
        {
            return d;
        }
    }

    private final String a(String s, boolean flag, boolean flag1)
    {
label0:
        for (int k = f[d + 1] * 2 - 2; k >= 0; k -= 2)
        {
            if (!g[k + 1].equals(s) || !flag && g[k].equals(""))
            {
                continue;
            }
            String s1 = g[k];
            int i1 = k + 2;
            do
            {
label1:
                {
                    if (i1 < f[d + 1] * 2)
                    {
                        if (!g[i1].equals(s1))
                        {
                            break label1;
                        }
                        s1 = null;
                    }
                    if (s1 != null)
                    {
                        return s1;
                    }
                    continue label0;
                }
                i1++;
            } while (true);
        }

        if (!flag1)
        {
            return null;
        }
        if (!"".equals(s)) goto _L2; else goto _L1
_L1:
        Object obj = "";
_L5:
        flag = b;
        b = false;
        e(((String) (obj)), s);
        b = flag;
        return ((String) (obj));
_L2:
        String s2;
        int l;
        obj = new StringBuilder("n");
        l = c;
        c = l + 1;
        s2 = ((StringBuilder) (obj)).append(l).toString();
        l = f[d + 1] * 2 - 2;
_L6:
        obj = s2;
        if (l < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!s2.equals(g[l])) goto _L4; else goto _L3
_L3:
        obj = null;
        if (obj == null) goto _L2; else goto _L5
_L4:
        l -= 2;
          goto _L6
    }

    private final void a(String s, int k)
    {
        char ac[];
        int l;
        ac = new char[2];
        ac;
        ac[0] = '\0';
        ac[1] = '\0';
        l = 0;
_L7:
        if (l >= s.length()) goto _L2; else goto _L1
_L1:
        char c1 = s.charAt(l);
        if (ac[0] == 0) goto _L4; else goto _L3
_L3:
        if (!Character.isSurrogatePair(ac[0], c1)) goto _L6; else goto _L5
_L5:
        ac[1] = c1;
        a.write(ac);
        ac[0] = '\0';
        ac[1] = '\0';
_L18:
        l++;
          goto _L7
_L6:
        ac[0] = '\0';
        ac[1] = '\0';
        a.write(63);
_L4:
        c1;
        JVM INSTR lookupswitch 8: default 184
    //                   9: 218
    //                   10: 218
    //                   13: 218
    //                   34: 301
    //                   38: 265
    //                   39: 301
    //                   60: 289
    //                   62: 277;
           goto _L8 _L9 _L9 _L9 _L10 _L11 _L10 _L12 _L13
_L8:
        if (c1 < ' ' || c1 >= '\177' && !i) goto _L15; else goto _L14
_L14:
        if (!Character.isHighSurrogate(c1)) goto _L17; else goto _L16
_L16:
        ac[0] = c1;
          goto _L18
_L9:
        if (k == -1)
        {
            a.write(c1);
        } else
        {
            a.write((new StringBuilder("&#")).append(c1).append(';').toString());
        }
          goto _L18
_L11:
        a.write("&amp;");
          goto _L18
_L13:
        a.write("&gt;");
          goto _L18
_L12:
        a.write("&lt;");
          goto _L18
_L10:
        if (c1 != k) goto _L8; else goto _L19
_L19:
        Writer writer = a;
        String s1;
        if (c1 == '"')
        {
            s1 = "&quot;";
        } else
        {
            s1 = "&apos;";
        }
        writer.write(s1);
          goto _L18
_L17:
        if (Character.isLowSurrogate(c1)) goto _L15; else goto _L20
_L20:
        a.write(c1);
          goto _L18
_L15:
        a.write(63);
          goto _L18
_L2:
    }

    private final void a(boolean flag)
    {
        int k;
        if (!b)
        {
            return;
        }
        d = d + 1;
        b = false;
        if (h.length <= d)
        {
            boolean aflag[] = new boolean[d + 4];
            System.arraycopy(h, 0, aflag, 0, d);
            h = aflag;
        }
        h[d] = h[d - 1];
        k = f[d - 1];
_L2:
        if (k >= f[d])
        {
            break MISSING_BLOCK_LABEL_278;
        }
        a.write(32);
        a.write("xmlns");
        if ("".equals(g[k * 2]))
        {
            break; /* Loop/switch isn't completed */
        }
        a.write(58);
        a.write(g[k * 2]);
_L4:
        a.write("=\"");
        a(g[k * 2 + 1], 34);
        a.write(34);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        String s;
        if (a() == 0)
        {
            s = null;
        } else
        {
            s = e[a() * 3 - 3];
        }
        if (!"".equals(s) || "".equals(g[k * 2 + 1])) goto _L4; else goto _L3
_L3:
        throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
        if (f.length <= d + 1)
        {
            int ai[] = new int[d + 8];
            System.arraycopy(f, 0, ai, 0, d + 1);
            f = ai;
        }
        f[d + 1] = f[d];
        Writer writer = a;
        String s1;
        if (flag)
        {
            s1 = " />";
        } else
        {
            s1 = ">";
        }
        writer.write(s1);
        return;
    }

    public c a(String s, String s1, String s2)
    {
        if (!b)
        {
            throw new IllegalStateException("illegal position for attribute");
        }
        String s3 = s;
        if (s == null)
        {
            s3 = "";
        }
        if ("".equals(s3))
        {
            s = "";
        } else
        {
            s = a(s3, false, true);
        }
        a.write(32);
        if (!"".equals(s))
        {
            a.write(s);
            a.write(58);
        }
        a.write(s1);
        a.write(61);
        a.write(34);
        a(s2, 34);
        a.write(34);
        return this;
    }

    public final void a(OutputStream outputstream, String s)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException();
        }
        a(((Writer) (new OutputStreamWriter(outputstream, s))));
        j = s;
        if (s.toLowerCase().startsWith("utf"))
        {
            i = true;
        }
    }

    public final void a(Writer writer)
    {
        a = writer;
        f[0] = 2;
        f[1] = 2;
        g[0] = "";
        g[1] = "";
        g[2] = "xml";
        g[3] = "http://www.w3.org/XML/1998/namespace";
        b = false;
        c = 0;
        d = 0;
        i = true;
    }

    public c c(String s)
    {
        a(false);
        h[d] = false;
        a(s, -1);
        return this;
    }

    public c c(String s, String s1)
    {
        a(false);
        if (h[d])
        {
            a.write("\r\n");
            for (int k = 0; k < d; k++)
            {
                a.write("  ");
            }

        }
        int j1 = d * 3;
        if (e.length < j1 + 3)
        {
            String as[] = new String[e.length + 12];
            System.arraycopy(e, 0, as, 0, j1);
            e = as;
        }
        String s2;
        if (s == null)
        {
            s2 = "";
        } else
        {
            s2 = a(s, true, true);
        }
        if ("".equals(s))
        {
            for (int l = f[d]; l < f[d + 1]; l++)
            {
                if ("".equals(g[l * 2]) && !"".equals(g[l * 2 + 1]))
                {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }

        }
        String as1[] = e;
        int i1 = j1 + 1;
        as1[j1] = s;
        e[i1] = s2;
        e[i1 + 1] = s1;
        a.write(60);
        if (!"".equals(s2))
        {
            a.write(s2);
            a.write(58);
        }
        a.write(s1);
        b = true;
        return this;
    }

    public final void c()
    {
        a(false);
        a.flush();
    }

    public c d(String s, String s1)
    {
        if (!b)
        {
            d = d - 1;
        }
        if (s == null && e[d * 3] != null || s != null && !s.equals(e[d * 3]) || !e[d * 3 + 2].equals(s1))
        {
            throw new IllegalArgumentException((new StringBuilder("</{")).append(s).append("}").append(s1).append("> does not match start").toString());
        }
        if (b)
        {
            a(true);
            d = d - 1;
        } else
        {
            if (h[d + 1])
            {
                a.write("\r\n");
                for (int k = 0; k < d; k++)
                {
                    a.write("  ");
                }

            }
            a.write("</");
            s = e[d * 3 + 1];
            if (!"".equals(s))
            {
                a.write(s);
                a.write(58);
            }
            a.write(s1);
            a.write(62);
        }
        f[d + 1] = f[d];
        return this;
    }

    public final void e(String s, String s1)
    {
        a(false);
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        if (s2.equals(a(s, true, false)))
        {
            return;
        }
        s1 = f;
        int k = d + 1;
        int l = s1[k];
        s1[k] = l + 1;
        k = l << 1;
        if (g.length < k + 1)
        {
            s1 = new String[g.length + 16];
            System.arraycopy(g, 0, s1, 0, k);
            g = s1;
        }
        g[k] = s2;
        g[k + 1] = s;
    }
}
