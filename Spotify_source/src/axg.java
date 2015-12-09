// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothDevice;
import android.os.Process;
import com.ford.syncV4.trace.enums.DetailLevel;
import com.ford.syncV4.trace.enums.InterfaceActivityDirection;
import com.ford.syncV4.trace.enums.Mod;
import com.ford.syncV4.transport.SiphonServer;
import com.ford.syncV4.util.NativeLogTool;

public final class axg
{

    private static long a = System.currentTimeMillis();

    private static String a(long l, Mod mod, InterfaceActivityDirection interfaceactivitydirection, String s)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder("<msg><dms>");
        stringbuilder.append(l);
        stringbuilder.append("</dms><pid>");
        stringbuilder.append(Process.myPid());
        stringbuilder.append("</pid><tid>");
        stringbuilder.append(Thread.currentThread().getId());
        stringbuilder.append("</tid><mod>");
        stringbuilder.append(mod.toString());
        stringbuilder.append("</mod>");
        if (interfaceactivitydirection == InterfaceActivityDirection.c) goto _L2; else goto _L1
_L1:
        stringbuilder.append("<dir>");
        mod = "";
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[InterfaceActivityDirection.values().length];
                try
                {
                    a[InterfaceActivityDirection.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[InterfaceActivityDirection.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[interfaceactivitydirection.ordinal()];
        JVM INSTR tableswitch 1 2: default 128
    //                   1 165
    //                   2 171;
           goto _L3 _L4 _L5
_L3:
        stringbuilder.append(mod);
        stringbuilder.append("</dir>");
_L2:
        stringbuilder.append(s);
        stringbuilder.append("</msg>");
        return stringbuilder.toString();
_L4:
        mod = "rx";
        continue; /* Loop/switch isn't completed */
_L5:
        mod = "tx";
        if (true) goto _L3; else goto _L6
_L6:
    }

    public static String a(BluetoothDevice bluetoothdevice)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<btp>");
        String s = bluetoothdevice.getName();
        stringbuilder.append("<btn>");
        stringbuilder.append(axe.a(s));
        stringbuilder.append("</btn>");
        stringbuilder.append((new StringBuilder("<bta>")).append(bluetoothdevice.getAddress()).append("</bta>").toString());
        stringbuilder.append((new StringBuilder("<bts>")).append(bluetoothdevice.getBondState()).append("</bts>").toString());
        stringbuilder.append("</btp>");
        return stringbuilder.toString();
    }

    public static void a(InterfaceActivityDirection interfaceactivitydirection, asv asv1, byte abyte0[], int i, int j, String s)
    {
        DetailLevel detaillevel = axd.a(Mod.b);
        if (detaillevel == DetailLevel.a || !s.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        }
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("<frame>");
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<hdr>");
        stringbuilder.append("<ver>");
        stringbuilder.append(asv1.a);
        stringbuilder.append("</ver><cmp>");
        stringbuilder.append(asv1.b);
        stringbuilder.append("</cmp><ft>");
        s = asv1.c;
        byte byte0;
        if (s == ata.a)
        {
            s = "Control";
        } else
        if (s == ata.d)
        {
            s = "Consecutive";
        } else
        if (s == ata.c)
        {
            s = "First";
        } else
        if (s == ata.b)
        {
            s = "Single";
        } else
        {
            s = "Unknown";
        }
        stringbuilder.append(s);
        stringbuilder.append("</ft><st>");
        s = asv1.d;
        if (s == atc.b)
        {
            s = "rpc";
        } else
        if (s == atc.c)
        {
            s = "bulk";
        } else
        {
            s = "Unknown";
        }
        stringbuilder.append(s);
        stringbuilder.append("</st><sid>");
        stringbuilder.append(asv1.f);
        stringbuilder.append("</sid><sz>");
        stringbuilder.append(asv1.g);
        stringbuilder.append("</sz>");
        byte0 = asv1.e;
        if (asv1.c == ata.a)
        {
            stringbuilder.append("<ca>");
            if (byte0 == ((axs) (asz.b)).h)
            {
                stringbuilder.append("StartSession");
            } else
            if (byte0 == ((axs) (asz.c)).h)
            {
                stringbuilder.append("StartSessionACK");
            } else
            if (byte0 == ((axs) (asz.d)).h)
            {
                stringbuilder.append("StartSessionNACK");
            } else
            if (byte0 == ((axs) (asz.e)).h)
            {
                stringbuilder.append("EndSession");
            }
            stringbuilder.append("</ca>");
        } else
        if (asv1.c == ata.d)
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
        if (asv1.c == ata.c)
        {
            int k = axr.a(abyte0, 0);
            int l = axr.a(abyte0, 4);
            stringbuilder.append((new StringBuilder("<total>")).append(k).append("</total><numframes>").append(l).append("</numframes>").toString());
        } else
        if (asv1.c == ata.b)
        {
            stringbuilder.append("<single/>");
        }
        stringbuilder.append("</hdr>");
        stringbuffer.append(stringbuilder.toString());
        if (detaillevel == DetailLevel.b && abyte0 != null && j > 0)
        {
            stringbuffer.append("<d>");
            stringbuffer.append(axe.a(abyte0, i, j));
            stringbuffer.append("</d>");
        }
        stringbuffer.append("</frame>");
        a(a(System.currentTimeMillis() - a, Mod.b, interfaceactivitydirection, stringbuffer.toString()));
    }

    public static void a(InterfaceActivityDirection interfaceactivitydirection, ati ati1, String s)
    {
        boolean flag = true;
        DetailLevel detaillevel = axd.a(Mod.d);
        if (detaillevel == DetailLevel.a || !s.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        }
        long l = System.currentTimeMillis();
        long l1 = a;
        Mod mod = Mod.d;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<op>");
        stringbuilder.append(ati1.a());
        stringbuilder.append("</op>");
        s = null;
        if (ati1 instanceof atk)
        {
            s = ((atk)ati1).c();
        } else
        if (ati1 instanceof atm)
        {
            s = ((atm)ati1).c();
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
        stringbuilder.append(ati1.b());
        stringbuilder.append("</type>");
        if (detaillevel == DetailLevel.b)
        {
            ati1 = new axf(ati1);
            s = new StringBuilder();
            s.append((new StringBuilder()).append(ati1.a()).append(" ").append(ati1.b()).toString());
            ati1.a(s);
            ati1 = axe.a(s.toString());
            stringbuilder.append("<d>");
            stringbuilder.append(ati1);
            stringbuilder.append("</d>");
        }
        a(a(l - l1, mod, interfaceactivitydirection, stringbuilder.toString()));
    }

    public static void a(InterfaceActivityDirection interfaceactivitydirection, byte abyte0[], String s)
    {
        DetailLevel detaillevel = axd.a(Mod.c);
        if (detaillevel == DetailLevel.a || !s.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        }
        long l = System.currentTimeMillis();
        long l1 = a;
        s = new StringBuilder();
        s.append("<sz>");
        s.append(abyte0.length);
        s.append("</sz>");
        if (detaillevel == DetailLevel.b)
        {
            s.append("<d>");
            s.append(axe.a(abyte0));
            s.append("</d>");
        }
        a(a(l - l1, Mod.c, interfaceactivitydirection, s.toString()));
    }

    private static void a(String s)
    {
        try
        {
            if (!SiphonServer.b(s).booleanValue())
            {
                NativeLogTool.a("SyncTrace", s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            NativeLogTool.c("SyncTrace", (new StringBuilder("Failure writing XML trace message: ")).append(s.toString()).toString());
        }
    }

    public static void a(String s, String s1)
    {
        if (axd.a(Mod.e) == DetailLevel.a || !s1.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
        {
            return;
        } else
        {
            s = axe.a(s);
            a(a(System.currentTimeMillis() - a, Mod.e, InterfaceActivityDirection.c, (new StringBuilder("<d>")).append(s).append("</d>").toString()));
            return;
        }
    }

    public static void a(String s, String s1, InterfaceActivityDirection interfaceactivitydirection, byte abyte0[], int i, int j, String s2)
    {
        if (axd.a(Mod.a) == DetailLevel.a || !s2.equals("42baba60-eb57-11df-98cf-0800200c9a66"))
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
            if (axd.a(Mod.a) == DetailLevel.b && abyte0 != null && j > 0)
            {
                s2.append("<d>");
                s = axe.a(abyte0, i, j);
                if (s.length() % 4 != 0)
                {
                    NativeLogTool.b("SyncTrace", (new StringBuilder("b64 string length (")).append(s.length()).append(") isn't multiple of 4: buf.length=").append(abyte0.length).append(", offset=").append(i).append(", len=").append(j).toString());
                }
                s2.append(s);
                s2.append("</d>");
            }
        }
        a(a(System.currentTimeMillis() - a, Mod.a, interfaceactivitydirection, s2.toString()));
    }

    public static void a(String s, String s1, InterfaceActivityDirection interfaceactivitydirection, byte abyte0[], int i, String s2)
    {
        a(s, s1, interfaceactivitydirection, abyte0, 0, i, s2);
    }

}
