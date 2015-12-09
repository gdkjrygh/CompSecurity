// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import com.pandora.radio.util.i;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p.dl.a;
import p.dm.g;
import p.dm.m;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class p.dn.b extends p.dn.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dn/b$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("Fixed", 0);
            b = new a("Variable", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b f[];
        private final String e;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(p/dn/b$b, s);
        }

        public static b[] values()
        {
            return (b[])f.clone();
        }

        public String toString()
        {
            return e;
        }

        static 
        {
            a = new b("KEY_VIN", 0, "vehicleConfig");
            b = new b("KEY_MAKE", 1, "vehicleMake");
            c = new b("KEY_MODEL", 2, "vehicleModel");
            d = new b("KEY_YEAR", 3, "vehicleYear");
            f = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int i1, String s1)
        {
            super(s, i1);
            e = s1;
        }
    }


    public static final d g;
    public static int h;
    private final int bg = 17;

    public p.dn.b(byte abyte0[])
    {
        super(h, "PNDR_SESSION_START", 0, abyte0);
    }

    private int[] a(byte abyte0[], int i1, int j1)
    {
        boolean flag = true;
        int l1 = -1;
        int k1 = i1;
        for (i1 = ((flag) ? 1 : 0); i1 <= j1; i1++)
        {
            l1 = p.dn.a.a(abyte0, k1);
            if (l1 < 0)
            {
                return null;
            }
            if (i1 != j1)
            {
                k1 = l1 + 1;
            }
        }

        return (new int[] {
            k1, l1
        });
    }

    public String a()
    {
        if (c() != 3)
        {
            return "PNDR_CONNECT";
        } else
        {
            return d;
        }
    }

    public String a(int i1, int j1, int k1, a a1, Class class1)
    {
        int ai[];
        ai = a(c, i1, j1);
        if (ai == null)
        {
            p.dm.m.l((new StringBuilder()).append("unable to find null terminator, payload:").append(p.dn.a.a(c)).toString());
            return null;
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[p.dn.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.dn._cls1.a[a1.ordinal()])
        {
        default:
            return null;

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_134;

        case 1: // '\001'
            i1 = ai[1] + 1;
            a1 = new byte[k1];
            break;
        }
_L1:
        System.arraycopy(c, i1, a1, 0, a1.length);
        if (class1 == java/lang/Integer)
        {
            a1 = Integer.valueOf(ByteBuffer.wrap(a1).getInt()).toString();
        } else
        if (class1 == java/lang/String)
        {
            a1 = (new String(a1)).trim();
        } else
        {
            a1 = null;
        }
        return a1;
        i1 = ai[0];
        a1 = new byte[Math.min(ai[1] - i1, k1)];
          goto _L1
    }

    public String a(g g1)
    {
        if (g1 != g.c) goto _L2; else goto _L1
_L1:
        g1 = new StringBuffer(a());
        g1.append(" {");
        g1.append("version=");
        g1.append(c());
        g1.append(",");
        g1.append("accessoryId=");
        g1.append(d());
        g1.append(",");
        g1.append("albumArtDimension=");
        g1.append(e());
        g1.append(",");
        g1.append("imageType=");
        f();
        JVM INSTR tableswitch 0 3: default 136
    //                   0 368
    //                   1 378
    //                   2 388
    //                   3 398;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        if (g())
        {
            g1.append(",");
            g1.append("simulateBadConnection=");
            g1.append(g());
        }
        if (h())
        {
            g1.append(",");
            g1.append("pauseOnStart=");
            g1.append(h());
        }
        if (i())
        {
            g1.append(",");
            g1.append("simulateRandomErrors=");
            g1.append(i());
        }
        if (c() == 3 && p.dm.m.h(3))
        {
            g1.append(",");
            g1.append("stationArtDimension=");
            g1.append(j());
            g1.append(",");
            g1.append("vin=");
            g1.append(k());
            g1.append(",");
            g1.append("make=");
            g1.append(l());
            g1.append(",");
            g1.append("model=");
            g1.append(m());
            g1.append(",");
            g1.append("year=");
            g1.append(n());
        }
        g1.append("}");
        return g1.toString();
_L4:
        g1.append("PNDR_IMAGE_NONE");
        continue; /* Loop/switch isn't completed */
_L5:
        g1.append("PNDR_IMAGE_JPEG");
        continue; /* Loop/switch isn't completed */
_L6:
        g1.append("PNDR_IMAGE_PNG");
        continue; /* Loop/switch isn't completed */
_L7:
        g1.append("PNDR_IMAGE_RGB565");
        if (true) goto _L3; else goto _L2
_L2:
        return super.a(g1);
    }

    public int c()
    {
        byte abyte0[] = new byte[2];
        System.arraycopy(c, 1, abyte0, 0, abyte0.length);
        return (new p.ds.b(abyte0)).c();
    }

    public String d()
    {
        byte abyte0[] = new byte[8];
        System.arraycopy(c, 3, abyte0, 0, abyte0.length);
        return (new String(abyte0)).trim();
    }

    public int e()
    {
        byte abyte0[] = new byte[2];
        System.arraycopy(c, 11, abyte0, 0, abyte0.length);
        return (new p.ds.b(abyte0)).c();
    }

    public int f()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 13, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c();
    }

    public boolean g()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 14, abyte0, 0, abyte0.length);
        return (abyte0[0] & 1) != 0;
    }

    public boolean h()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 14, abyte0, 0, abyte0.length);
        return (abyte0[0] & 2) != 0;
    }

    public boolean i()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 14, abyte0, 0, abyte0.length);
        return (abyte0[0] & 4) != 0;
    }

    public int j()
    {
        if (c() != 3 || !p.dm.m.h(3))
        {
            return 0;
        } else
        {
            byte abyte0[] = new byte[2];
            System.arraycopy(c, 15, abyte0, 0, abyte0.length);
            return (new p.ds.b(abyte0)).c();
        }
    }

    public String k()
    {
        if (c() != 3 || !p.dm.m.h(3))
        {
            return null;
        } else
        {
            return a(17, 1, 32, a.b, java/lang/String);
        }
    }

    public String l()
    {
        if (c() != 3 || !p.dm.m.h(3))
        {
            return null;
        } else
        {
            return a(17, 2, 16, a.b, java/lang/String);
        }
    }

    public String m()
    {
        if (c() != 3 || !p.dm.m.h(3))
        {
            return null;
        } else
        {
            return a(17, 3, 32, a.b, java/lang/String);
        }
    }

    public String n()
    {
        String s;
        if (c() != 3 || !p.dm.m.h(3))
        {
            s = null;
        } else
        {
            String s1 = a(17, 3, 4, p.dn.a.a, java/lang/Integer);
            s = s1;
            if (s1 != null)
            {
                s = s1;
                if (!p.dm.m.v(Integer.parseInt(s1)))
                {
                    p.dm.m.l(String.format("year: %s is out of acceptable range", new Object[] {
                        s1
                    }));
                    return s1;
                }
            }
        }
        return s;
    }

    public Map o()
    {
        HashMap hashmap1 = new HashMap(b.values().length);
        if (!com.pandora.radio.util.i.a(k()))
        {
            hashmap1.put(p.dn.b.a.toString(), k());
        }
        if (!com.pandora.radio.util.i.a(l()))
        {
            hashmap1.put(b.b.toString(), l());
        }
        if (!com.pandora.radio.util.i.a(m()))
        {
            hashmap1.put(b.c.toString(), m());
        }
        if (n() != null && Integer.parseInt(n()) != 0)
        {
            hashmap1.put(p.dn.b.d.toString(), n());
        }
        HashMap hashmap = hashmap1;
        if (hashmap1.isEmpty())
        {
            hashmap = null;
        }
        return hashmap;
    }

    static 
    {
        g = p.dl.a.u;
        h = g.c();
    }
}
