// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.yume.android.sdk:
//            YuMeBSPException, M, YuMeSDKInterfaceImpl, YuMeDeviceInfo, 
//            YuMeBSPInterface, B, YuMeAdParams, au, 
//            q, v, r, U, 
//            t, u, aj, az, 
//            s, av, aw, ay, 
//            F, N, E, YuMeAdBlockType

final class p
{

    YuMeDeviceInfo a;
    YuMeBSPInterface b;
    q c;
    private M d;
    private B e;
    private int f;
    private HashMap g;
    private int h;
    private HashMap i;
    private int j;
    private HashMap k;
    private int l;
    private HashMap m;
    private String n;

    public p()
    {
        d = M.a();
        a = null;
        e = null;
        f = 0;
        g = null;
        h = 0;
        i = null;
        j = 0;
        k = null;
        l = 0;
        m = null;
        b = null;
        n = "application/json";
        c = null;
        b = YuMeSDKInterfaceImpl.d;
        a = new YuMeDeviceInfo();
        try
        {
            d.b("Getting Device Params from BSP...");
            a.osPlatform = b.YuMeBSP_GetOSPlatform();
            a.swVersion = b.YuMeBSP_GetSoftwareVersion();
            a.hwVersion = b.YuMeBSP_GetHardwareVersion();
            a.make = b.YuMeBSP_GetMake();
            a.model = b.YuMeBSP_GetModel();
            a.countryCode = b.YuMeBSP_GetCountryCode();
            a.state = b.YuMeBSP_GetState();
            a.city = b.YuMeBSP_GetCity();
            a.postalCode = b.YuMeBSP_GetPostalCode();
            a.serviceProvider = b.YuMeBSP_GetServiceProvider();
            a.displayHeight = b.YuMeBSP_GetDeviceDisplayHeight();
            a.displayWidth = b.YuMeBSP_GetDeviceDisplayWidth();
            a.eType = b.YuMeBSP_GetDeviceType();
            a.supportedConnectionTypes = b.YuMeBSP_GetSupportedConnectionTypes();
            j();
            i();
            e = new B();
            b.YuMeBSP_GetTotalRAMSizeMB();
            b.YuMeBSP_GetFreeRAMSizeMB();
            b.YuMeBSP_GetTotalStorageSizeMB();
            b.YuMeBSP_GetFreeRAMSizeMB();
            if (YuMeSDKInterfaceImpl.b.bEnableLocationSupport.booleanValue())
            {
                b.YuMeBSP_GetLatitude();
                b.YuMeBSP_GetLongitude();
            }
            b.YuMeBSP_GetDeviceOrientation();
            e.a = b.YuMeBSP_GetConnectionType();
            e.b = b.YuMeBSP_GetPublicIPAddress();
            e.c = b.YuMeBSP_GetLineSpeedKbps();
            return;
        }
        catch (YuMeBSPException yumebspexception)
        {
            yumebspexception.printStackTrace();
        }
    }

    private static boolean a(int i1)
    {
        return i1 >= 200 && i1 < 300;
    }

    private static boolean a(au au1)
    {
        return au1 == au.i || au1 == au.j || au1 == au.k || au1 == au.l || au1 == au.m;
    }

    private void b(au au1, av av1, av av2, boolean flag)
    {
        if (av2 != null)
        {
            if (au1 == au.i)
            {
                if (flag)
                {
                    a(au.d, av1, av2, flag);
                    a(au.f, av1, av2, flag);
                    a(au.h, av1, av2, flag);
                }
            } else
            {
                if (au1 == au.j)
                {
                    a(au.i, av1, av2, flag);
                    return;
                }
                if (au1 == au.k)
                {
                    a(au.i, av1, av2, flag);
                    a(au.j, av1, av2, flag);
                    return;
                }
                if (au1 == au.l)
                {
                    a(au.i, av1, av2, flag);
                    a(au.j, av1, av2, flag);
                    a(au.k, av1, av2, flag);
                    return;
                }
                if (au1 == au.m)
                {
                    a(au.i, av1, av2, flag);
                    a(au.j, av1, av2, flag);
                    a(au.k, av1, av2, flag);
                    a(au.l, av1, av2, flag);
                    return;
                }
            }
        }
    }

    static float h()
    {
        float f1;
        try
        {
            f1 = YuMeSDKInterfaceImpl.d.YuMeBSP_GetFreeStorageSizeMB();
        }
        catch (YuMeBSPException yumebspexception)
        {
            yumebspexception.printStackTrace();
            return 0.0F;
        }
        return f1;
    }

    private void i()
    {
        try
        {
            b().uuid = b.YuMeBSP_GetDeviceUUID();
            return;
        }
        catch (YuMeBSPException yumebspexception)
        {
            yumebspexception.printStackTrace();
        }
    }

    private void j()
    {
        if (a.supportedConnectionTypes == null)
        {
            d.c("Connection Types supported by Device: NONE.");
            return;
        }
        int j1 = a.supportedConnectionTypes.size();
        String s1 = "Connection Types supported by Device: ";
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                d.b(s1);
                return;
            }
            String s2 = (new StringBuilder(String.valueOf(s1))).append(a.supportedConnectionTypes.get(i1)).toString();
            s1 = s2;
            if (i1 < j1 - 1)
            {
                s1 = (new StringBuilder(String.valueOf(s2))).append(", ").toString();
            }
            i1++;
        } while (true);
    }

    final String a()
    {
        if (a != null)
        {
            if (!q.a(a.uuid))
            {
                i();
            }
            return a.uuid;
        } else
        {
            return null;
        }
    }

    final void a(int i1, int j1)
    {
        v v1;
        au au1;
        if (i != null)
        {
            v1 = (v)i.get(Integer.valueOf(i1));
        } else
        {
            v1 = null;
        }
        if (v1 == null)
        {
            d.c((new StringBuilder("No Send Tracker Txn exist, txnHandle: ")).append(i1).toString());
            return;
        }
        au1 = v1.c;
        if (a(j1)) goto _L2; else goto _L1
_L1:
        d.c((new StringBuilder("Hitting ")).append(au1.a()).append(" Tracker Failed, Url: ").append(v1.b).append(", txnHandle: ").append(v1.a).toString());
_L4:
        i.remove(Integer.valueOf(v1.a));
        return;
_L2:
        if (au1 == au.c || au1 == au.b || au1 == au.a || au1 == au.n)
        {
            d.b((new StringBuilder(String.valueOf(au1.a()))).append(" Tracker hit Successfully.").toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(int i1, int j1, long l1)
    {
        r r1;
        if (k != null)
        {
            r1 = (r)k.get(Integer.valueOf(i1));
        } else
        {
            r1 = null;
        }
        if (r1 == null)
        {
            d.c((new StringBuilder("No Get Asset Size Txn exist: txnHandle: ")).append(i1).toString());
            return;
        }
        if (a(j1))
        {
            d.b((new StringBuilder("Asset Size Fetched: ")).append(q.b(r1.b)).append(" (").append(l1).append(")").toString());
            YuMeSDKInterfaceImpl.i.a(r1.b, r1.c, l1);
        } else
        {
            d.c((new StringBuilder("Get Asset Size Failed: ")).append(q.b(r1.b)).toString());
            YuMeSDKInterfaceImpl.i.b(j1);
        }
        k.remove(Integer.valueOf(r1.a));
    }

    public final void a(int i1, int j1, String s1)
    {
        t t1;
        boolean flag;
        if (g != null)
        {
            t1 = (t)g.get(Integer.valueOf(i1));
        } else
        {
            t1 = null;
        }
        if (t1 == null)
        {
            d.c((new StringBuilder("No Get Playlist Txn exist: txnHandle: ")).append(i1).toString());
            return;
        }
        flag = a(j1);
        String s2 = (new StringBuilder(" (Response Code: ")).append(j1).append(", Type: ").append(t1.d).append(", txnHandle: ").append(t1.c).append(")").toString();
        if (flag)
        {
            if (s1 != null)
            {
                d.b((new StringBuilder("Playlist Fetched:")).append(s2).toString());
            } else
            {
                d.c((new StringBuilder("Playlist Fetched, but Processing Failed:")).append(s2).toString());
            }
        } else
        if (j1 == 0)
        {
            d.c((new StringBuilder("Playlist Request Timed Out:")).append(s2).toString());
        } else
        {
            d.c((new StringBuilder("Playlist Request Failed:")).append(s2).toString());
        }
        if (t1.d != u.b) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            if (s1 != null)
            {
                YuMeSDKInterfaceImpl.g.a(s1, t1.b);
            } else
            {
                YuMeSDKInterfaceImpl.g.a();
            }
        } else
        {
            YuMeSDKInterfaceImpl.g.a();
        }
_L4:
        g.remove(Integer.valueOf(t1.c));
        return;
_L2:
        if (t1.d == u.a)
        {
            if (flag)
            {
                if (s1 != null)
                {
                    YuMeSDKInterfaceImpl.i.a(s1, t1.b);
                } else
                {
                    YuMeSDKInterfaceImpl.i.a(t1.b, j1);
                }
            } else
            {
                YuMeSDKInterfaceImpl.i.a(t1.b, j1);
            }
        } else
        if ((t1.d == u.d || t1.d == u.c) && YuMeSDKInterfaceImpl.n != null)
        {
            if (flag)
            {
                if (s1 != null)
                {
                    YuMeSDKInterfaceImpl.n.a(s1, false, t1.b);
                } else
                {
                    YuMeSDKInterfaceImpl.n.a(j1);
                }
            } else
            {
                YuMeSDKInterfaceImpl.n.a(j1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(int i1, int j1, boolean flag)
    {
        s s1;
        if (m != null)
        {
            s1 = (s)m.get(Integer.valueOf(i1));
        } else
        {
            s1 = null;
        }
        if (s1 == null)
        {
            d.c((new StringBuilder("No Get Asset Txn exist: txnHandle: ")).append(i1).toString());
            return;
        }
        if (a(j1))
        {
            YuMeSDKInterfaceImpl.i.a(s1.b, s1.c, flag);
        } else
        {
            d.c((new StringBuilder("Get Asset Failed: ")).append(q.b(s1.b)).toString());
            YuMeSDKInterfaceImpl.i.a(j1);
        }
        m.remove(Integer.valueOf(s1.a));
    }

    final void a(au au1, av av1, av av2, boolean flag)
    {
        Object obj;
        if (au1 == au.d || au1 == au.f)
        {
            obj = av1;
        } else
        {
            obj = av2;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((av) (obj)).a(au1);
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((aw) (obj)).b()) goto _L2; else goto _L5
_L5:
        if (a(au1))
        {
            b(au1, av1, av2, flag);
        }
        av1 = ((aw) (obj)).a();
        if (av1 != null) goto _L7; else goto _L6
_L6:
        ((aw) (obj)).a(true);
_L2:
        return;
_L7:
        int j1 = av1.size();
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                if (au1 != au.g)
                {
                    ((aw) (obj)).a(true);
                    return;
                }
                continue; /* Loop/switch isn't completed */
            }
            a((String)av1.get(i1), au1);
            i1++;
        } while (true);
_L4:
        if (a(au1))
        {
            b(au1, av1, av2, flag);
            return;
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    final void a(ay ay1, av av1)
    {
        if (av1 != null)
        {
            a(ay1, av1.d());
            a(au.e, ((av) (null)), av1, true);
        }
    }

    final void a(ay ay1, String s1)
    {
        if (s1 != null)
        {
            if (!s1.contains("?"))
            {
                s1 = (new StringBuilder(String.valueOf(s1))).append("?reason=").toString();
            } else
            {
                s1 = (new StringBuilder(String.valueOf(s1))).append("&reason=").toString();
            }
            a((new StringBuilder(String.valueOf(s1))).append(ay1.a()).toString(), au.e);
        }
    }

    final void a(String s1, int i1, int j1, YuMeAdBlockType yumeadblocktype)
    {
        r r1 = new r();
        r1.b = s1;
        r1.c = yumeadblocktype;
        int k1 = j + 1;
        j = k1;
        r1.a = k1;
        if (k == null)
        {
            k = new HashMap();
        }
        k.put(Integer.valueOf(r1.a), r1);
        d.b((new StringBuilder("Getting Asset Size: ")).append(q.b(s1)).append(", txnHandle: ").append(r1.a).toString());
        YuMeSDKInterfaceImpl.f.a(s1, i1, j1, r1.a);
    }

    final void a(String s1, long l1, int i1, int j1, YuMeAdBlockType yumeadblocktype)
    {
        s s2 = new s();
        s2.b = s1;
        s2.c = yumeadblocktype;
        int k1 = l + 1;
        l = k1;
        s2.a = k1;
        if (m == null)
        {
            m = new HashMap();
        }
        m.put(Integer.valueOf(s2.a), s2);
        d.b((new StringBuilder("Getting Asset: ")).append(q.b(s1)).append(", txnHandle: ").append(s2.a).toString());
        YuMeSDKInterfaceImpl.f.a(s1, l1, i1, j1, s2.a);
    }

    final void a(String s1, au au1)
    {
        if (s1 == null)
        {
            return;
        }
        v v1 = new v();
        int i1;
        if (N.a)
        {
            s1 = N.a(s1);
        } else
        {
            s1 = q.d(s1);
        }
        v1.b = s1;
        v1.c = au1;
        i1 = h + 1;
        h = i1;
        v1.a = i1;
        if (i == null)
        {
            i = new HashMap();
        }
        i.put(Integer.valueOf(v1.a), v1);
        s1 = (new StringBuilder("Hitting Tracker (")).append(au1.a()).append("): ").append(v1.b).append(", txnHandle: ").append(v1.a).toString();
        if (au1 == au.e)
        {
            d.c(s1);
        } else
        {
            d.b(s1);
        }
        try
        {
            b.YuMeBSP_SendTracker(v1.b, v1.a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
    }

    public final void a(String s1, JSONObject jsonobject, YuMeAdBlockType yumeadblocktype, boolean flag, boolean flag1)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        if (g == null) goto _L4; else goto _L3
_L3:
        Iterator iterator = g.entrySet().iterator();
_L7:
        if (iterator.hasNext()) goto _L5; else goto _L4
_L4:
        t t1 = null;
_L9:
        if (t1 != null)
        {
            d.a("Stopping ongoing InitAd() Request as StartAd() Request attempted...");
            g.remove(Integer.valueOf(t1.c));
        }
_L2:
label0:
        {
            t1 = new t();
            t1.b = yumeadblocktype;
            if (flag)
            {
                E.c = false;
                t t2;
                int i1;
                if (flag1)
                {
                    t1.d = u.c;
                } else
                {
                    t1.d = u.a;
                }
            } else
            if (flag1)
            {
                t1.d = u.d;
            } else
            {
                t1.d = u.b;
            }
            if (t1.d != u.d)
            {
                yumeadblocktype = s1;
                if (t1.d != u.c)
                {
                    break label0;
                }
            }
            if (N.a)
            {
                yumeadblocktype = N.a(s1);
            } else
            {
                yumeadblocktype = q.d(s1);
            }
        }
        t1.a = yumeadblocktype;
        i1 = f + 1;
        f = i1;
        t1.c = i1;
        if (jsonobject != null)
        {
            s1 = n;
        } else
        {
            s1 = null;
        }
        if (g == null)
        {
            g = new HashMap();
        }
        g.put(Integer.valueOf(t1.c), t1);
        d.b((new StringBuilder("Getting Playlist, Type: ")).append(t1.d).append(", txnHandle: ").append(t1.c).toString());
        d.b((new StringBuilder("Playlist Url: ")).append(t1.a).toString());
        if (jsonobject != null)
        {
            d.b((new StringBuilder("Playlist Request Body: ")).append(jsonobject.toString()).toString());
        }
        try
        {
            b.YuMeBSP_GetPlaylist(t1.a, jsonobject, s1, t1.c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_446;
_L5:
        t2 = (t)((java.util.Map.Entry)iterator.next()).getValue();
        if (t2 == null) goto _L7; else goto _L6
_L6:
        t1 = t2;
        if (t2.d == u.c) goto _L9; else goto _L8
_L8:
        if (t2.d != u.a) goto _L7; else goto _L10
_L10:
        t1 = t2;
          goto _L9
          goto _L9
    }

    public final YuMeDeviceInfo b()
    {
        if (a == null)
        {
            return new YuMeDeviceInfo();
        } else
        {
            return a;
        }
    }

    public final B c()
    {
        if (e == null)
        {
            return new B();
        } else
        {
            return e;
        }
    }

    final void d()
    {
        if (c == null)
        {
            c = new q((byte)0);
        }
        try
        {
            c.a = b.YuMeBSP_GetAdConnectionTimeoutSec();
            c.b = b.YuMeBSP_GetMaxPersistentStorageMB();
            c.e = b.YuMeBSP_GetStorageMode();
            e();
        }
        catch (YuMeBSPException yumebspexception)
        {
            yumebspexception.printStackTrace();
        }
        d.b((new StringBuilder("Ad Connection Timeout(seconds): ")).append(c.a).toString());
        d.b((new StringBuilder("Total Storage Size for Asset Caching (MB): ")).append(c.b).toString());
        d.b((new StringBuilder("Storage Mode: ")).append(c.e).toString());
        YuMeSDKInterfaceImpl.i.c(c.b);
    }

    final void e()
    {
        try
        {
            c.c = b.YuMeBSP_GetTempStoragePath();
            c.d = b.YuMeBSP_GetPersistentStoragePath();
        }
        catch (YuMeBSPException yumebspexception)
        {
            yumebspexception.printStackTrace();
        }
        d.b((new StringBuilder("Temp Asset Storage Path: ")).append(c.c).toString());
        d.b((new StringBuilder("Persistent Asset Storage Path: ")).append(c.d).toString());
        YuMeSDKInterfaceImpl.i.a(c.c, c.d);
    }

    final q f()
    {
        if (c == null)
        {
            d();
        }
        return c;
    }

    final void g()
    {
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        g.clear();
        g = null;
        YuMeSDKInterfaceImpl.d.YuMeBSP_AbortDownloads();
        return;
        YuMeBSPException yumebspexception;
        yumebspexception;
        yumebspexception.printStackTrace();
        return;
    }
}
