// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.h;

import android.bluetooth.BluetoothDevice;
import android.os.Process;
import com.ford.syncV4.d.a.f;
import com.ford.syncV4.d.d;
import com.ford.syncV4.e.g;
import com.ford.syncV4.h.a.a;
import com.ford.syncV4.h.a.b;
import com.ford.syncV4.h.a.c;
import com.ford.syncV4.i.h;

// Referenced classes of package com.ford.syncV4.h:
//            f, c, a, d, 
//            b

public final class e
{

    static boolean a = false;
    protected static com.ford.syncV4.h.b b = null;
    private static long c = System.currentTimeMillis();
    private static boolean d = true;

    private static String a(long l, c c1, int i, String s)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder("<msg><dms>");
        stringbuilder.append(l);
        stringbuilder.append("</dms><pid>");
        stringbuilder.append(Process.myPid());
        stringbuilder.append("</pid><tid>");
        stringbuilder.append(Thread.currentThread().getId());
        stringbuilder.append("</tid><mod>");
        stringbuilder.append(c1.toString());
        stringbuilder.append("</mod>");
        if (i == b.c) goto _L2; else goto _L1
_L1:
        stringbuilder.append("<dir>");
        c1 = "";
        com.ford.syncV4.h.f.a[i - 1];
        JVM INSTR tableswitch 1 2: default 128
    //                   1 165
    //                   2 171;
           goto _L3 _L4 _L5
_L3:
        stringbuilder.append(c1);
        stringbuilder.append("</dir>");
_L2:
        stringbuilder.append(s);
        stringbuilder.append("</msg>");
        return stringbuilder.toString();
_L4:
        c1 = "rx";
        continue; /* Loop/switch isn't completed */
_L5:
        c1 = "tx";
        if (true) goto _L3; else goto _L6
_L6:
    }

    public static String a(BluetoothDevice bluetoothdevice)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<btp>");
        String s = bluetoothdevice.getName();
        stringbuilder.append("<btn>");
        stringbuilder.append(com.ford.syncV4.h.c.a(s));
        stringbuilder.append("</btn>");
        stringbuilder.append((new StringBuilder("<bta>")).append(bluetoothdevice.getAddress()).append("</bta>").toString());
        stringbuilder.append((new StringBuilder("<bts>")).append(bluetoothdevice.getBondState()).append("</bts>").toString());
        stringbuilder.append("</btp>");
        return stringbuilder.toString();
    }

    public static void a(int i)
    {
        if (i != 0 && d)
        {
            a(c.e, i);
        }
    }

    public static void a(int i, d d1, byte abyte0[], int j, int k, String s)
    {
        int l = a(c.b);
        if (l == a.a || !s.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        }
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("<frame>");
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<hdr>");
        stringbuilder.append("<ver>");
        stringbuilder.append(d1.b());
        stringbuilder.append("</ver><cmp>");
        stringbuilder.append(d1.c());
        stringbuilder.append("</cmp><ft>");
        s = d1.h();
        byte byte0;
        if (s == com.ford.syncV4.d.a.b.b)
        {
            s = "Control";
        } else
        if (s == com.ford.syncV4.d.a.b.e)
        {
            s = "Consecutive";
        } else
        if (s == com.ford.syncV4.d.a.b.d)
        {
            s = "First";
        } else
        if (s == com.ford.syncV4.d.a.b.c)
        {
            s = "Single";
        } else
        {
            s = "Unknown";
        }
        stringbuilder.append(s);
        stringbuilder.append("</ft><st>");
        s = d1.i();
        if (s == f.c)
        {
            s = "rpc";
        } else
        if (s == f.d)
        {
            s = "bulk";
        } else
        {
            s = "Unknown";
        }
        stringbuilder.append(s);
        stringbuilder.append("</st><sid>");
        stringbuilder.append(d1.e());
        stringbuilder.append("</sid><sz>");
        stringbuilder.append(d1.f());
        stringbuilder.append("</sz>");
        byte0 = d1.d();
        if (d1.h() == com.ford.syncV4.d.a.b.b)
        {
            stringbuilder.append("<ca>");
            if (byte0 == com.ford.syncV4.d.a.a.b.a())
            {
                stringbuilder.append("StartSession");
            } else
            if (byte0 == com.ford.syncV4.d.a.a.c.a())
            {
                stringbuilder.append("StartSessionACK");
            } else
            if (byte0 == com.ford.syncV4.d.a.a.d.a())
            {
                stringbuilder.append("StartSessionNACK");
            } else
            if (byte0 == com.ford.syncV4.d.a.a.e.a())
            {
                stringbuilder.append("EndSession");
            }
            stringbuilder.append("</ca>");
        } else
        if (d1.h() == com.ford.syncV4.d.a.b.e)
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
        if (d1.h() == com.ford.syncV4.d.a.b.d)
        {
            int i1 = com.ford.syncV4.util.a.a(abyte0, 0);
            int j1 = com.ford.syncV4.util.a.a(abyte0, 4);
            stringbuilder.append((new StringBuilder("<total>")).append(i1).append("</total><numframes>").append(j1).append("</numframes>").toString());
        } else
        if (d1.h() == com.ford.syncV4.d.a.b.c)
        {
            stringbuilder.append("<single/>");
        }
        stringbuilder.append("</hdr>");
        stringbuffer.append(stringbuilder.toString());
        if (l == a.c && abyte0 != null && k > 0)
        {
            stringbuffer.append("<d>");
            stringbuffer.append(com.ford.syncV4.h.c.a(abyte0, j, k));
            stringbuffer.append("</d>");
        }
        stringbuffer.append("</frame>");
        a(a(System.currentTimeMillis() - c, c.b, i, stringbuffer.toString()));
    }

    public static void a(int i, com.ford.syncV4.e.c c1, String s)
    {
        boolean flag = true;
        int j = a(c.d);
        if (j == a.a || !s.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        }
        long l = System.currentTimeMillis();
        long l1 = c;
        c c2 = c.d;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<op>");
        stringbuilder.append(c1.a());
        stringbuilder.append("</op>");
        s = null;
        if (c1 instanceof com.ford.syncV4.e.e)
        {
            s = ((com.ford.syncV4.e.e)c1).c();
        } else
        if (c1 instanceof g)
        {
            s = ((g)c1).c();
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder.append("<cid>");
            stringbuilder.append(s);
            stringbuilder.append("</cid>");
        }
        stringbuilder.append("<type>");
        stringbuilder.append(c1.b());
        stringbuilder.append("</type>");
        if (j == a.c)
        {
            c1 = com.ford.syncV4.h.c.a((new com.ford.syncV4.h.d(c1)).c());
            stringbuilder.append("<d>");
            stringbuilder.append(c1);
            stringbuilder.append("</d>");
        }
        a(a(l - l1, c2, i, stringbuilder.toString()));
    }

    public static void a(int i, byte abyte0[], String s)
    {
        int j = a(c.c);
        if (j == a.a || !s.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        }
        long l = System.currentTimeMillis();
        long l1 = c;
        s = new StringBuilder();
        s.append("<sz>");
        s.append(abyte0.length);
        s.append("</sz>");
        if (j == a.c)
        {
            s.append("<d>");
            s.append(com.ford.syncV4.h.c.a(abyte0));
            s.append("</d>");
        }
        a(a(l - l1, c.c, i, s.toString()));
    }

    public static void a(com.ford.syncV4.h.b b1)
    {
        b = b1;
    }

    public static void a(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            a = boolean1.booleanValue();
        }
    }

    private static void a(String s)
    {
        com.ford.syncV4.h.b b1;
        if (!h.b(s).booleanValue())
        {
            com.ford.syncV4.util.d.a("SyncTrace", s);
        }
        b1 = b;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        b1.logXmlMsg(s, "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        s;
        try
        {
            com.ford.syncV4.util.c.a((new StringBuilder("Failure calling ISTListener: ")).append(s.toString()).toString(), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.ford.syncV4.util.d.c("SyncTrace", (new StringBuilder("Failure writing XML trace message: ")).append(s.toString()).toString());
        }
        return;
    }

    public static void a(String s, String s1)
    {
        if (a(c.f) == a.a || !s1.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        } else
        {
            s = com.ford.syncV4.h.c.a(s);
            a(a(System.currentTimeMillis() - c, c.f, b.c, (new StringBuilder("<d>")).append(s).append("</d>").toString()));
            return;
        }
    }

    public static void a(String s, String s1, int i, byte abyte0[], int j, int k, String s2)
    {
        if (a(c.a) == a.a || !s2.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
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
            s2.append(k);
            s2.append("</sz>");
            if (a(c.a) == a.c && abyte0 != null && k > 0)
            {
                s2.append("<d>");
                s = com.ford.syncV4.h.c.a(abyte0, j, k);
                if (s.length() % 4 != 0)
                {
                    com.ford.syncV4.util.d.b("SyncTrace", (new StringBuilder("b64 string length (")).append(s.length()).append(") isn't multiple of 4: buf.length=").append(abyte0.length).append(", offset=").append(j).append(", len=").append(k).toString());
                }
                s2.append(s);
                s2.append("</d>");
            }
        }
        a(a(System.currentTimeMillis() - c, c.a, i, s2.toString()));
    }

    public static void a(String s, String s1, int i, byte abyte0[], int j, String s2)
    {
        a(s, s1, i, abyte0, 0, j, s2);
    }

    public static void b(int i)
    {
        if (i != 0 && d)
        {
            a(c.f, i);
        }
    }

    public static void c(int i)
    {
        if (i != 0 && d)
        {
            a(c.d, i);
        }
    }

    public static void d(int i)
    {
        if (i != 0 && d)
        {
            a(c.c, i);
        }
    }

    public static void e(int i)
    {
        if (i != 0 && d)
        {
            a(c.b, i);
        }
    }

    public static void f(int i)
    {
        if (i != 0 && d)
        {
            a(c.a, i);
        }
    }

}
