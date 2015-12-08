// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bk;

import android.bluetooth.BluetoothDevice;
import android.os.Process;
import p.ba.d;
import p.bb.a;
import p.bd.g;
import p.bl.b;
import p.bl.c;

// Referenced classes of package p.bk:
//            c, d, a, b

public class e
{

    static boolean a = false;
    protected static p.bk.b b = null;
    private static long c = System.currentTimeMillis();
    private static boolean d = true;

    static long a()
    {
        return System.currentTimeMillis() - b();
    }

    private static String a(long l, c c1, b b1, String s)
    {
        StringBuilder stringbuilder = new StringBuilder("<msg><dms>");
        stringbuilder.append(l);
        stringbuilder.append("</dms><pid>");
        stringbuilder.append(Process.myPid());
        stringbuilder.append("</pid><tid>");
        stringbuilder.append(Thread.currentThread().getId());
        stringbuilder.append("</tid><mod>");
        stringbuilder.append(c1.toString());
        stringbuilder.append("</mod>");
        if (b1 != b.c)
        {
            stringbuilder.append("<dir>");
            stringbuilder.append(a(b1));
            stringbuilder.append("</dir>");
        }
        stringbuilder.append(s);
        stringbuilder.append("</msg>");
        return stringbuilder.toString();
    }

    public static String a(BluetoothDevice bluetoothdevice)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<btp>");
        String s = bluetoothdevice.getName();
        stringbuilder.append("<btn>");
        stringbuilder.append(a(s));
        stringbuilder.append("</btn>");
        stringbuilder.append((new StringBuilder()).append("<bta>").append(bluetoothdevice.getAddress()).append("</bta>").toString());
        stringbuilder.append((new StringBuilder()).append("<bts>").append(bluetoothdevice.getBondState()).append("</bts>").toString());
        stringbuilder.append("</btp>");
        return stringbuilder.toString();
    }

    static String a(String s)
    {
        return p.bk.c.a(s);
    }

    private static String a(d d1, byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<hdr>");
        stringbuilder.append("<ver>");
        stringbuilder.append(d1.b());
        stringbuilder.append("</ver><cmp>");
        stringbuilder.append(d1.c());
        stringbuilder.append("</cmp><ft>");
        stringbuilder.append(a(d1.h()));
        stringbuilder.append("</ft><st>");
        stringbuilder.append(a(d1.i()));
        stringbuilder.append("</st><sid>");
        stringbuilder.append(d1.e());
        stringbuilder.append("</sid><sz>");
        stringbuilder.append(d1.f());
        stringbuilder.append("</sz>");
        byte byte0 = d1.d();
        if (d1.h() == p.bb.b.b)
        {
            stringbuilder.append("<ca>");
            if (byte0 == a.b.a())
            {
                stringbuilder.append("StartSession");
            } else
            if (byte0 == a.c.a())
            {
                stringbuilder.append("StartSessionACK");
            } else
            if (byte0 == a.d.a())
            {
                stringbuilder.append("StartSessionNACK");
            } else
            if (byte0 == a.e.a())
            {
                stringbuilder.append("EndSession");
            }
            stringbuilder.append("</ca>");
        } else
        if (d1.h() == p.bb.b.e)
        {
            stringbuilder.append("<fsn>");
            if (byte0 == 0)
            {
                stringbuilder.append("lastFrame");
            } else
            {
                stringbuilder.append(String.format("%02X", new Object[] {
                    Integer.valueOf(byte0)
                }));
            }
            stringbuilder.append("</fsn>");
        } else
        if (d1.h() == p.bb.b.d)
        {
            int i = p.bn.b.a(abyte0, 0);
            int j = p.bn.b.a(abyte0, 4);
            stringbuilder.append((new StringBuilder()).append("<total>").append(i).append("</total><numframes>").append(j).append("</numframes>").toString());
        } else
        if (d1.h() == p.bb.b.c)
        {
            stringbuilder.append("<single/>");
        }
        stringbuilder.append("</hdr>");
        return stringbuilder.toString();
    }

    private static String a(p.bb.b b1)
    {
        if (b1 == p.bb.b.b)
        {
            return "Control";
        }
        if (b1 == p.bb.b.e)
        {
            return "Consecutive";
        }
        if (b1 == p.bb.b.d)
        {
            return "First";
        }
        if (b1 == p.bb.b.c)
        {
            return "Single";
        } else
        {
            return "Unknown";
        }
    }

    private static String a(p.bb.e e1)
    {
        if (e1 == p.bb.e.c)
        {
            return "rpc";
        }
        if (e1 == p.bb.e.d)
        {
            return "bulk";
        } else
        {
            return "Unknown";
        }
    }

    private static String a(p.bl.a a1, p.bd.c c1)
    {
        boolean flag = true;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<op>");
        stringbuilder.append(c1.a());
        stringbuilder.append("</op>");
        Integer integer = Integer.valueOf(-1);
        if (c1 instanceof p.bd.e)
        {
            integer = ((p.bd.e)c1).c();
        } else
        if (c1 instanceof g)
        {
            integer = ((g)c1).c();
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder.append("<cid>");
            stringbuilder.append(integer);
            stringbuilder.append("</cid>");
        }
        stringbuilder.append("<type>");
        stringbuilder.append(c1.b());
        stringbuilder.append("</type>");
        if (a1 == p.bl.a.c)
        {
            a1 = a((new p.bk.d(c1)).c());
            stringbuilder.append("<d>");
            stringbuilder.append(a1);
            stringbuilder.append("</d>");
        }
        return stringbuilder.toString();
    }

    private static String a(b b1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.bl.b.values().length];
                try
                {
                    a[b.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.bk._cls1.a[b1.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            return "rx";

        case 2: // '\002'
            return "tx";
        }
    }

    public static void a(String s, String s1)
    {
        if (p.bk.a.a(c.f) == p.bl.a.a || !s1.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        } else
        {
            s = a(s);
            c(a(a(), c.f, b.c, (new StringBuilder()).append("<d>").append(s).append("</d>").toString()));
            return;
        }
    }

    public static void a(String s, String s1, b b1, byte abyte0[], int i, int j, String s2)
    {
        if (p.bk.a.a(c.a) == p.bl.a.a || !s2.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        }
        s2 = new StringBuilder();
        if (s1 != null && s1.length() > 0)
        {
            s2.append(s1);
        }
        if (s != null && s.length() > 0)
        {
            s2.append("<desc>");
            s2.append(s);
            s2.append("</desc>");
        }
        if (abyte0 != null)
        {
            s2.append("<sz>");
            s2.append(j);
            s2.append("</sz>");
            if (p.bk.a.a(c.a) == p.bl.a.c && abyte0 != null && j > 0)
            {
                s2.append("<d>");
                s = p.bk.c.a(abyte0, i, j);
                a(s, abyte0, i, j);
                s2.append(s);
                s2.append("</d>");
            }
        }
        c(a(a(), c.a, b1, s2.toString()));
    }

    public static void a(String s, String s1, b b1, byte abyte0[], int i, String s2)
    {
        a(s, s1, b1, abyte0, 0, i, s2);
    }

    private static void a(String s, byte abyte0[], int i, int j)
    {
        if (s.length() % 4 != 0)
        {
            p.bn.e.b("SyncTrace", (new StringBuilder()).append("b64 string length (").append(s.length()).append(") isn't multiple of 4: buf.length=").append(abyte0.length).append(", offset=").append(i).append(", len=").append(j).toString());
        }
    }

    public static void a(b b1, d d1, byte abyte0[], int i, int j, String s)
    {
        p.bl.a a1 = p.bk.a.a(c.b);
        if (a1 == p.bl.a.a || !s.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        }
        s = new StringBuffer();
        s.append("<frame>");
        s.append(a(d1, abyte0));
        if (a1 == p.bl.a.c && abyte0 != null && j > 0)
        {
            s.append("<d>");
            s.append(p.bk.c.a(abyte0, i, j));
            s.append("</d>");
        }
        s.append("</frame>");
        c(a(a(), c.b, b1, s.toString()));
    }

    public static void a(b b1, p.bd.c c1, String s)
    {
        p.bl.a a1 = p.bk.a.a(c.d);
        if (a1 == p.bl.a.a || !s.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        } else
        {
            c(a(a(), c.d, b1, a(a1, c1)));
            return;
        }
    }

    public static void a(b b1, byte abyte0[], String s)
    {
        p.bl.a a1 = p.bk.a.a(c.c);
        if (a1 == p.bl.a.a || !s.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        }
        long l = a();
        s = new StringBuilder();
        s.append("<sz>");
        s.append(abyte0.length);
        s.append("</sz>");
        if (a1 == p.bl.a.c)
        {
            s.append("<d>");
            s.append(p.bk.c.a(abyte0));
            s.append("</d>");
        }
        c(a(l, c.c, b1, s.toString()));
    }

    static long b()
    {
        return c;
    }

    public static Boolean b(String s)
    {
        return p.bm.e.b(s);
    }

    private static void c(String s)
    {
        p.bk.b b1;
        if (!b(s).booleanValue())
        {
            p.bn.e.a("SyncTrace", s);
        }
        b1 = b;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        b1.a(s, "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        s;
        try
        {
            p.bn.d.a((new StringBuilder()).append("Failure calling ISTListener: ").append(s.toString()).toString(), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.bn.e.c("SyncTrace", (new StringBuilder()).append("Failure writing XML trace message: ").append(s.toString()).toString());
        }
        return;
    }

}
