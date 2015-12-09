// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            a, AppScheduler, AppRequestStationId, AppRequestTimeShiftValue, 
//            e, c, AppNative, AppConfig, 
//            h, AppCache, AppSdk

class d extends Thread
    implements Runnable
{

    public static final int a = 5000;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private static final int l = 8192;
    private long A;
    private long B;
    private long C;
    private long D;
    private long E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private AppRequestStationId J;
    private AppRequestTimeShiftValue K;
    private AppNative L;
    private AppConfig M;
    private AppCache N;
    private h O;
    private String P;
    private AppConfig.a Q;
    private String R;
    private String S;
    private String T;
    private boolean U;
    private String V;
    public AppScheduler.AppTask f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private BlockingQueue m;
    private long n;
    private long o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private long w;
    private long x;
    private long y;
    private long z;

    public d(int i1, AppConfig.a a1)
    {
        g = 0;
        h = 3;
        f = null;
        i = 0;
        j = 7;
        k = 0;
        m = null;
        n = 0L;
        o = 0L;
        p = "";
        q = "";
        r = "";
        s = "";
        t = "";
        u = "";
        v = "";
        w = 0L;
        x = 0L;
        y = 0L;
        z = 0L;
        A = 0L;
        B = 0L;
        C = 0L;
        D = 0L;
        E = 0L;
        F = 0;
        G = 0;
        H = 0;
        I = true;
        J = null;
        K = null;
        L = null;
        M = null;
        N = null;
        O = null;
        P = "id3";
        Q = null;
        R = "";
        S = "";
        T = "";
        U = false;
        V = "";
        AppScheduler appscheduler;
        L = com.nielsen.app.sdk.a.q();
        M = com.nielsen.app.sdk.a.n();
        N = com.nielsen.app.sdk.a.o();
        O = com.nielsen.app.sdk.a.m();
        appscheduler = com.nielsen.app.sdk.a.p();
        if (appscheduler == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        f = appscheduler.c("AppUpload");
        J = AppRequestStationId.getInstance();
        K = AppRequestTimeShiftValue.getInstance();
        d();
        if (M != null)
        {
            AppConfig appconfig = M;
            appconfig.getClass();
            Q = new AppConfig.a(appconfig, a1);
        }
        a1 = a1.a(i1);
        if (a1 == null) goto _L2; else goto _L1
_L1:
        if (!a1.isEmpty()) goto _L3; else goto _L2
_L2:
        throw new Exception((new StringBuilder("Processor(")).append(i1).append(") need data to start it").toString());
_L4:
        if (!flag)
        {
            try
            {
                throw new Exception((new StringBuilder("(")).append(getName()).append(") there should be parameters to start processor").toString());
            }
            // Misplaced declaration of an exception variable
            catch (AppConfig.a a1)
            {
                com.nielsen.app.sdk.c.a(a1, true, 7, 'E', "Processor id(%s) type(%s)", new Object[] {
                    Integer.valueOf(i), e.o[j]
                });
            }
        }
        return;
_L3:
        if (Q != null)
        {
            Q.a(a1);
        }
        flag = a(i1);
        Q.a(v, j);
        a1 = (String)a1.get("nol_comment");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_617;
        }
        a1 = (new StringBuilder("[")).append(a1.toString()).append("]").toString();
_L5:
        a1 = (new StringBuilder()).append(a1).append(" id(").append(i).append(") product(").append(e.o[j]).append(") session(").append(e.f[h]).append(")").toString();
        if (Q != null)
        {
            Q.g(a1);
        }
        setName(a1);
          goto _L4
        a1 = "[Processor]";
          goto _L5
    }

    private void a(AppCache.ProcessorData processordata)
    {
_L2:
        return;
        if (processordata == null || w == 0L || x == 0L) goto _L2; else goto _L1
_L1:
        char c1;
        Object obj2;
        String s1;
        String s2;
        String s3;
        Object obj3;
        long l3;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        l3 = processordata.getTimestamp();
        obj2 = processordata.getData();
        c1 = Q.a("nol_clocksrc").charAt(0);
        Object obj;
        boolean flag4;
        if (j == 3 || j == 2)
        {
            flag = L.id3TagLoad(w, ((String) (obj2)), true);
        } else
        {
            flag = L.id3TagLoad(w, ((String) (obj2)), false);
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = L.id3TagIsInfoTag(w);
        s3 = L.id3TagGetNewPcCid(w);
        s1 = L.id3TagGetNewFdCid(w);
        s2 = L.id3TagGetSessionPcCid(w);
        if (s2 != null && !s2.isEmpty())
        {
            Q.a("nol_pccid", s2);
        } else
        {
            Q.a("nol_pccid", v);
        }
        obj3 = L.id3TagGetSessionFdCid(w);
        if (obj3 != null && !((String) (obj3)).isEmpty())
        {
            Q.a("nol_fdcid", ((String) (obj3)));
        } else
        {
            Q.a("nol_fdcid", v);
        }
        flag3 = L.id3TagIsSessionFdCidChanged(w);
        flag1 = L.id3TagIsSessionPcCidChanged(w);
        flag4 = L.id3TagIsSessionCidChanged(w);
        if (flag4)
        {
            if (j == 3 || j == 2)
            {
                c(processordata);
            }
            processordata = L.id3TagGetStreamType(w);
            Q.a("nol_breakout", processordata);
        }
        flag2 = L.id3TagIsTimerCidChanged(w, S);
        if (!flag4 && (!I || j != 0))
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag3)
        {
            Q.a("nol_fdcid", s1);
        }
        if (flag1)
        {
            Q.a("nol_pccid", s3);
        }
        obj = Q.f("onSendId3");
        processordata = ((AppCache.ProcessorData) (obj));
        if (obj == null)
        {
            processordata = Q.f("onId3Detected");
        }
        if (processordata == null) goto _L4; else goto _L3
_L3:
        obj = Q.a("nol_vidtype");
        if ((obj == null || ((String) (obj)).isEmpty()) && j == 3)
        {
            Q.a("nol_vidtype", "content");
        }
        obj = Q.a("nol_ac");
        if ((obj == null || ((String) (obj)).isEmpty()) && j == 3)
        {
            Q.a("nol_ac", "content");
        }
        Q.a(processordata, null, true);
        flag4 = Q.d("nol_disabled");
        I = flag4;
        if (flag4) goto _L2; else goto _L5
_L5:
        processordata = Q.a("nol_tagPresence");
        if (processordata != null)
        {
            try
            {
                if (!processordata.isEmpty())
                {
                    g = Integer.valueOf(processordata).intValue();
                }
            }
            // Misplaced declaration of an exception variable
            catch (AppCache.ProcessorData processordata)
            {
                com.nielsen.app.sdk.c.a('I', "(%s) No tag presence from dictionary.", new Object[] {
                    getName()
                });
            }
        }
        if (I)
        {
            com.nielsen.app.sdk.c.a('I', "(%s) disabled on ID3 processing", new Object[] {
                getName()
            });
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (j == 0)
        {
            I = false;
        }
        if (true) goto _L5; else goto _L6
_L6:
        if (j != 0 && j != 3 && j != 2) goto _L2; else goto _L7
_L7:
        if (flag || s1 == null || s1.isEmpty() || s1.compareToIgnoreCase(v) == 0) goto _L9; else goto _L8
_L8:
        String s4;
        s4 = L.id3TagGetFdTimeOffset(w);
        if (!flag3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag2) goto _L11; else goto _L10
_L10:
        r = Q.a("nol_segmentPrefix");
        java.util.List list = Q.f("onId3FdCidChanged");
        processordata = list;
        if (list != null)
        {
            processordata = Q.f("nol_tagFilter");
        }
        if (processordata != null)
        {
            Q.a(processordata, null, true);
        }
        processordata = Q.f("onComplete");
        if (processordata != null)
        {
            Q.a(processordata, null, true);
        }
        flag3 = Q.d("nol_disabled");
        I = flag3;
        if (flag3) goto _L2; else goto _L12
_L12:
        A = 0L;
        if (h == 2)
        {
            r = q;
            Q.a("nol_segmentPrefix", r);
        }
        if (c1 != 'S' || !K.senRequest(Q, w, i, ((String) (obj2)), ((String) (obj3)), "sdk_tsvFdCid"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = K.getData(i);
        java.util.List list1 = Q.f("tsv");
        processordata = list1;
        if (list1 == null)
        {
            processordata = Q.f("nol_serviceFilter");
        }
        if (processordata != null)
        {
            Q.a(processordata, ((Map) (obj3)), true);
        }
        flag3 = Q.d("nol_disabled");
        I = flag3;
        if (flag3) goto _L2; else goto _L13
_L13:
        if (S.compareToIgnoreCase("nol_fdoffset") == 0)
        {
            long l2 = Long.valueOf(s4).longValue();
            long l1 = l2;
            if (h == 4)
            {
                l1 = K.getTimeCodeFd(i);
                Object obj1;
                if (l1 <= 0L)
                {
                    l1 = 0L;
                }
                l1 = l2 + l1;
            }
            l2 = Q.a(l1, 0L, 0L, S);
            L.id3TagAddOffset(w, l2, l1);
        }
_L9:
        if (flag || s3 == null || s3.isEmpty() || s3.compareToIgnoreCase(v) == 0) goto _L15; else goto _L14
_L14:
        s3 = L.id3TagGetPcTimeOffset(w);
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_1709;
        }
        r = Q.a("nol_segmentPrefix");
        obj1 = Q.f("onId3PcCidChanged");
        processordata = ((AppCache.ProcessorData) (obj1));
        if (obj1 != null)
        {
            processordata = Q.f("nol_tagFilter");
        }
        if (processordata != null)
        {
            Q.a(processordata, null, true);
        }
        processordata = Q.f("onComplete");
        if (processordata != null)
        {
            Q.a(processordata, null, true);
        }
        flag = Q.d("nol_disabled");
        I = flag;
        if (flag) goto _L2; else goto _L16
_L16:
        if (s1 != null && !s1.isEmpty() && s1.compareToIgnoreCase(v) != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        A = 0L;
        if (h == 2)
        {
            r = q;
            Q.a("nol_segmentPrefix", r);
        }
        if (c1 != 'S' || !K.senRequest(Q, w, i, ((String) (obj2)), "sdk_tsvPcCid", s2))
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = K.getData(i);
        obj1 = Q.f("tsv");
        processordata = ((AppCache.ProcessorData) (obj1));
        if (obj1 == null)
        {
            processordata = Q.f("nol_serviceFilter");
        }
        if (processordata != null)
        {
            Q.a(processordata, ((Map) (obj2)), true);
        }
        flag = Q.d("nol_disabled");
        I = flag;
        if (flag) goto _L2; else goto _L17
_L17:
        if (S.compareToIgnoreCase("nol_pcoffset") == 0)
        {
            l2 = Long.valueOf(s3).longValue();
            if (h == 4)
            {
                l1 = K.getTimeCodePc(i);
                if (l1 <= 0L)
                {
                    l1 = 0L;
                }
                l1 = l2 + l1;
            } else
            {
                l1 = l2;
            }
            l2 = Q.a(l1, 0L, 0L, S);
            L.id3TagAddOffset(w, l2, l1);
        }
_L15:
        if (j == 0)
        {
            obj2 = L.id3TagGetFull(w);
            if (s == null || s.isEmpty())
            {
                processordata = (new StringBuilder()).append(l3).append(",").append(((String) (obj2))).toString();
                n = l3;
            } else
            {
                obj1 = Q.a("nol_id3Delimiter");
                if (obj1 != null)
                {
                    processordata = ((AppCache.ProcessorData) (obj1));
                    if (!((String) (obj1)).isEmpty())
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                }
                processordata = "nol_id3Delimiter";
                processordata = (new StringBuilder()).append(s).append(processordata).append(l3).append(",").append(((String) (obj2))).toString();
            }
            if ((long)(Q.a("nol_url").length() + processordata.length() + 50) > C)
            {
                if (!j())
                {
                    com.nielsen.app.sdk.c.a(10, 'E', "Could not push RAW ID3 message into UPLOAD table", new Object[0]);
                }
                n = l3;
                s = (new StringBuilder()).append(l3).append(",").append(((String) (obj2))).toString();
                return;
            } else
            {
                s = processordata;
                return;
            }
        }
        break; /* Loop/switch isn't completed */
_L11:
        processordata = Q.a("nol_tsvFlagDefault");
        if (processordata != null && !processordata.isEmpty())
        {
            Q.a("nol_tsvFlag", processordata);
        }
          goto _L12
        processordata = Q.a("nol_tsvFlagDefault");
        if (processordata != null && !processordata.isEmpty())
        {
            Q.a("nol_tsvFlag", processordata);
        }
          goto _L16
        if (j == 0) goto _L2; else goto _L18
_L18:
        if (D == A && h != 4) goto _L2; else goto _L19
_L19:
        a(l3, c1, false);
        return;
    }

    private boolean a(int i1)
    {
        i = i1;
        s = "";
        o = 0L;
        n = 0L;
        A = 0L;
        j = 0;
        if (!M.h() && (j != 0 || !M.i()))
        {
            return false;
        }
        P = Q.a("nol_product");
        if (P == null || P.isEmpty())
        {
            P = "id3";
        }
        String s1;
        if (P.compareToIgnoreCase("id3") == 0)
        {
            j = 0;
        } else
        if (P.compareToIgnoreCase("dpr") == 0)
        {
            j = 1;
        } else
        if (P.compareToIgnoreCase("dprid3") == 0)
        {
            j = 2;
        } else
        if (P.compareToIgnoreCase("drm") == 0)
        {
            j = 6;
        } else
        if (P.compareToIgnoreCase("mtvr") == 0)
        {
            j = 3;
        } else
        if (P.compareToIgnoreCase("ocr") == 0)
        {
            j = 4;
        } else
        if (P.compareToIgnoreCase("vc") == 0)
        {
            j = 5;
        }
        u = Q.a("nol_cadence");
        if (u == null || u.isEmpty())
        {
            u = "interval";
        }
        if (u.compareToIgnoreCase("interval") == 0)
        {
            h = 2;
        } else
        if (u.compareToIgnoreCase("impression") == 0)
        {
            h = 0;
        } else
        if (u.compareToIgnoreCase("episode") == 0)
        {
            h = 1;
        } else
        if (u.compareToIgnoreCase("daypart") == 0)
        {
            h = 4;
        } else
        {
            h = 3;
        }
        S = Q.a("nol_timer");
        if (S == null || O.i(S))
        {
            if (j == 3 || j == 2)
            {
                S = "nol_fdoffset";
            } else
            {
                S = "";
            }
        }
        s1 = Q.a("nol_segmentValue");
        if (s1 == null || s1.isEmpty())
        {
            z = 60L;
        } else
        {
            z = Long.valueOf(s1).longValue();
        }
        s1 = Q.a("nol_segmentLength");
        if (s1 == null || s1.isEmpty())
        {
            B = 5L;
        } else
        {
            B = Long.valueOf(s1).longValue();
        }
        s1 = Q.a("nol_creditValue");
        if (s1 == null || s1.isEmpty())
        {
            E = 30L;
        } else
        {
            E = Long.valueOf(s1).longValue();
        }
        r = Q.a("nol_segmentPrefix");
        if (r == null || r.isEmpty())
        {
            r = "";
        }
        q = r;
        if (q.compareToIgnoreCase("D") == 0)
        {
            q = "S";
        }
        s1 = Q.a("nol_unQualSegmentValue");
        if (s1 == null || s1.isEmpty())
        {
            y = 0L;
        } else
        {
            y = Long.valueOf(s1).longValue();
        }
        t = Q.a("nol_creditFlag");
        if (t == null || t.isEmpty())
        {
            t = "0";
        }
        T = Q.a("nol_url");
        if (T == null || T.isEmpty())
        {
            com.nielsen.app.sdk.c.a('W', "URL for processor id(%d) not found. It's going to use the default one", new Object[] {
                Integer.valueOf(i)
            });
            T = "https://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/cfg?cfgv=150&longitude=|![nol_longitude]!|&latitude=|![nol_latitude]!|&apid=|!nol_appid!|&apv=|!nol_appversion!|&apn=|!nol_appname!|&sdkv=|!nol_sdkversion!|&nuid=|!nol_nuid!|&osver=|!nol_osversion!|&devtypid=|!nol_devtypeid!|&devid=|![nol_deviceId]!|&fmt=json&adf=|![nol_appdisable]!|&uoo=|![nol_useroptout]!|&sfcode=|![nol_sfcode]!|&ccode=|![nol_countrycode]!|&dma=|![nol_dma]!||![nol_appParams]!|";
        }
        s1 = Q.a("nol_maxLength");
        if (s1 == null || s1.isEmpty())
        {
            C = Long.parseLong("1800");
        } else
        {
            C = Long.valueOf(s1).longValue();
        }
        s1 = Q.a("nol_maxPingCount");
        if (s1 == null || s1.isEmpty())
        {
            D = -1L;
        } else
        {
            D = Long.valueOf(s1).longValue();
        }
        v = Q.a("nol_cidNull");
        if (v == null || v.isEmpty())
        {
            v = "X100zdCIGeIlgZnkYj6UvQ==";
        }
        s1 = Q.a("nol_sendQual");
        if (s1 == null || s1.isEmpty())
        {
            H = 0;
        } else
        {
            H = Integer.valueOf(s1).intValue();
        }
        s1 = Q.a("nol_intrvlThrshld");
        if (s1 == null || s1.isEmpty())
        {
            F = 90;
        } else
        {
            F = Integer.valueOf(s1).intValue();
        }
        s1 = Q.a("nol_id3IntrvlGp");
        if (s1 == null || s1.isEmpty())
        {
            G = 15;
        } else
        {
            G = Integer.valueOf(s1).intValue();
        }
        s1 = Q.a("nol_breakout");
        if (s1 == null || s1.isEmpty())
        {
            p = "";
        } else
        {
            p = s1;
        }
        return true;
    }

    private boolean a(long l1)
    {
        U = true;
        return a(l1, false);
    }

    private boolean a(long l1, char c1, boolean flag)
    {
        if (w != 0L && x != 0L) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        char c2;
        int ai[];
        String as[];
        String as1[];
        Object obj;
        int ai1[];
        int ai2[];
        String as2[];
        String as3[];
        String as4[];
        int i1;
        boolean flag1;
        if (t == null || t.isEmpty())
        {
            com.nielsen.app.sdk.c.a(8, 'E', "(%s) There should be a credit flag character defined", new Object[] {
                getName()
            });
            return false;
        }
        c2 = t.charAt(0);
        i1 = 0;
        ai = new int[1];
        ai[0] = 0;
        obj = new int[1];
        obj[0] = -1;
        ai1 = new int[1];
        ai1[0] = 0;
        ai2 = new int[1];
        ai2[0] = 0;
        as = new String[1];
        as[0] = "";
        as2 = new String[1];
        as2[0] = "";
        as3 = new String[1];
        as3[0] = "";
        as1 = new String[1];
        as1[0] = "";
        as4 = new String[1];
        as4[0] = "";
        flag1 = false;
        if (r.compareToIgnoreCase(q) == 0)
        {
            flag1 = true;
        }
        c1 = '\0';
_L13:
        if (c1 >= 'd' || i1 < 0) goto _L1; else goto _L3
_L3:
        i1 = L.id3TagGetTimerPing(w, S, as, as2, as4, as3, as1, ai, ((int []) (obj)), ai1, ai2, c2, flag1, flag);
        if (i1 < 0) goto _L1; else goto _L4
_L4:
        com.nielsen.app.sdk.c.a('I', "(%s) ping info crdt(%d) sgnt(%d) sgPlTme(%d) ssPlTme(%d) pc(%s) fd(%s) ptrn(%s) stn(%s) pngTme(%d) brkt(%s) prfx(%s)", new Object[] {
            getName(), Integer.valueOf(i1), Integer.valueOf(ai[0]), Integer.valueOf(ai1[0]), Integer.valueOf(ai2[0]), as[0], as2[0], as3[0], as1[0], Integer.valueOf(obj[0]), 
            as4[0], r
        });
        if (h != 2) goto _L6; else goto _L5
_L5:
        if (i1 > 0)
        {
            java.util.List list = Q.f("onViewWon");
            if (list != null)
            {
                Q.a(list, null, true);
            }
            r = Q.a("nol_segmentPrefix");
        }
_L12:
        if (D > A)
        {
            A = A + 1L;
        }
        if (S.compareToIgnoreCase("nol_fdoffset") == 0 || S.compareToIgnoreCase("nol_pcoffset") == 0)
        {
            Q.b(obj[0], 0L, 0L, S);
        } else
        {
            long l3 = 0L;
            String s2 = Q.a("baseServerTime");
            long l2 = l3;
            if (s2 != null)
            {
                l2 = l3;
                if (!s2.isEmpty())
                {
                    l2 = Long.parseLong(s2);
                }
            }
            long l4 = 0L;
            s2 = Q.a("baseDeviceTime");
            l3 = l4;
            if (s2 != null)
            {
                l3 = l4;
                if (!s2.isEmpty())
                {
                    l3 = Long.parseLong(s2);
                }
            }
            if (l2 == 0L || l3 == 0L)
            {
                l2 = 0L;
                l3 = 0L;
            }
            Q.b(obj[0], l2, l3, S);
        }
        R = Q.a("nol_xorSeed");
        if (R == null || R.isEmpty())
        {
            R = "";
        }
        obj = new HashMap();
        ((Map) (obj)).put("nol_currSeg", String.valueOf(ai[0]));
        ((Map) (obj)).put("nol_timeSpentViewing", String.valueOf(ai2[0]));
        ((Map) (obj)).put("nol_segmentTimeSpent", String.valueOf(ai1[0]));
        ((Map) (obj)).put("nol_tagPresence", String.valueOf(g));
        ((Map) (obj)).put("nol_breakout", as4[0]);
        ((Map) (obj)).put("nol_duration", as3[0]);
        ((Map) (obj)).put("nol_segmentPrefix", r);
        j;
        JVM INSTR tableswitch 0 6: default 700
    //                   0 1044
    //                   1 896
    //                   2 1044
    //                   3 1044
    //                   4 700
    //                   5 700
    //                   6 874;
           goto _L7 _L8 _L9 _L8 _L8 _L7 _L7 _L10
_L7:
        com.nielsen.app.sdk.c.a('W', "(%s) processor type (%s) should not generate pings here", new Object[] {
            getName(), e.o[j]
        });
        return false;
_L6:
        if (i1 != 0) goto _L12; else goto _L11
_L11:
        c1++;
          goto _L13
_L10:
        ((Map) (obj)).put("nol_stationId", J.getStationId(i));
_L9:
        c1 = '\004';
_L14:
        String s1;
        if (S.compareToIgnoreCase("nol_fdoffset") == 0)
        {
            s1 = as1[0];
        } else
        {
            s1 = as2[0];
        }
        ((Map) (obj)).put("nol_fdcid", s1);
        if (S.compareToIgnoreCase("nol_pcoffset") == 0)
        {
            s1 = as1[0];
        } else
        {
            s1 = as[0];
        }
        ((Map) (obj)).put("nol_pccid", s1);
        ((Map) (obj)).put("nol_xorSeed", R);
        ((Map) (obj)).put("nol_product", P);
        Q.a(((Map) (obj)));
        s1 = k();
        if (s1 != null && !s1.isEmpty())
        {
            N.a(1, i, c1, l1, s1);
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
_L8:
        c1 = '\003';
          goto _L14
    }

    private boolean a(long l1, boolean flag)
    {
        if (D != A) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (j)
        {
        default:
            if (M.h() && (h == 4 && !flag || h == 2 || h == 1))
            {
                return a(l1, 'S', true);
            }
            break;

        case 0: // '\0'
            return j();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void b(long l1)
    {
        U = false;
    }

    private void b(AppCache.ProcessorData processordata)
    {
        if (w != 0L && x != 0L && (D != A || h == 4) && !U && (j == 1 || j == 6 || j == 2) && (S == null || S.compareToIgnoreCase("nol_cmsoffset") == 0))
        {
            if (I)
            {
                com.nielsen.app.sdk.c.a('I', "(%s) product is disabled on playhead processing", new Object[] {
                    getName()
                });
                return;
            }
            long l4 = processordata.getTimestamp();
            long l5 = Long.valueOf(processordata.getData()).longValue();
            long l2 = 0L;
            processordata = Q.a("baseServerTime");
            long l1 = l2;
            if (processordata != null)
            {
                l1 = l2;
                if (!processordata.isEmpty())
                {
                    l1 = Long.parseLong(processordata);
                }
            }
            long l3 = 0L;
            processordata = Q.a("baseDeviceTime");
            l2 = l3;
            if (processordata != null)
            {
                l2 = l3;
                if (!processordata.isEmpty())
                {
                    l2 = Long.parseLong(processordata);
                }
            }
            l1 = Q.a(l5, l1, l2, S);
            if (L.id3TagAddOffset(w, l1, l5))
            {
                a(l4, 'S', false);
                return;
            }
        }
    }

    private void c(AppCache.ProcessorData processordata)
    {
        a(processordata.getTimestamp(), false);
        if (f != null)
        {
            f.execute();
        }
    }

    private void d(AppCache.ProcessorData processordata)
    {
        String s1;
        String s2;
        String s3;
        s3 = "";
        s1 = s3;
        s2 = s3;
        if (x == 0L)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        s1 = s3;
        s2 = s3;
        if (w == 0L)
        {
            return;
        }
        if (processordata == null)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        s1 = s3;
        s2 = s3;
        s3 = processordata.getData();
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        s1 = s3;
        s2 = s3;
        if (s3.isEmpty())
        {
            break MISSING_BLOCK_LABEL_378;
        }
        s1 = s3;
        s2 = s3;
        if (Q == null)
        {
            s1 = s3;
            s2 = s3;
            JSONObject jsonobject;
            String s4;
            String s5;
            try
            {
                throw new Exception((new StringBuilder("Failed to start session (")).append(s3).append("). Missing parameter object").toString());
            }
            // Misplaced declaration of an exception variable
            catch (AppCache.ProcessorData processordata) { }
            // Misplaced declaration of an exception variable
            catch (AppCache.ProcessorData processordata)
            {
                throw new Exception((new StringBuilder("Failed to start session(")).append(s2).append(")").toString(), processordata);
            }
            if (AppSdk.a())
            {
                Log.d("AppSdk", (new StringBuilder("AppConfig Nielsen AppSDK: Failed parsing play JSON - ")).append(s1).append(" - ").append(processordata.getMessage()).toString());
            }
            throw new Exception((new StringBuilder("Failed to start session(")).append(s1).append(")").toString(), processordata);
        }
        s1 = s3;
        s2 = s3;
        jsonobject = new JSONObject(s3);
        s1 = s3;
        s2 = s3;
        if (!com.nielsen.app.sdk.e.g())
        {
            break MISSING_BLOCK_LABEL_328;
        }
        s1 = s3;
        s2 = s3;
        s4 = Q.b("nol_channelName");
        s1 = s3;
        s2 = s3;
        if (!jsonobject.has(s4))
        {
            break MISSING_BLOCK_LABEL_328;
        }
        s1 = s3;
        s2 = s3;
        s4 = (String)jsonobject.get(s4);
        s1 = s3;
        s2 = s3;
        s5 = Q.a("nol_channelName");
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        s1 = s3;
        s2 = s3;
        if (s5.compareToIgnoreCase(s4) == 0)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        s1 = s3;
        s2 = s3;
        c(processordata);
        s1 = s3;
        s2 = s3;
        Q.a(jsonobject);
        return;
    }

    private void e(AppCache.ProcessorData processordata)
    {
_L2:
        return;
        if (w == 0L || x == 0L || processordata == null) goto _L2; else goto _L1
_L1:
        String s1;
        long l1;
        s1 = "";
        l1 = processordata.getTimestamp();
        Object obj = processordata.getData();
        s1 = ((String) (obj));
        if (s1 == null) goto _L2; else goto _L3
_L3:
        if (s1.isEmpty()) goto _L2; else goto _L4
_L4:
        if (Q == null)
        {
            throw new Exception((new StringBuilder("Failed to process metadata (")).append(s1).append("). Missing parameter object").toString());
        }
          goto _L5
        processordata;
_L81:
        if (AppSdk.a())
        {
            Log.d("AppSdk", (new StringBuilder("AppConfig Nielsen AppSDK: Failed parsing metadata JSON - ")).append(s1).append(" - ").append(processordata.getMessage()).toString());
        }
        throw new Exception((new StringBuilder("Failed to load metadata(")).append(s1).append(")").toString(), processordata);
_L5:
        obj = new JSONObject(s1);
        if (!com.nielsen.app.sdk.e.g()) goto _L7; else goto _L6
_L6:
        j;
        JVM INSTR lookupswitch 2: default 1747
    //                   1: 580
    //                   6: 580;
           goto _L7 _L8 _L8
_L7:
        Q.a(((JSONObject) (obj)));
        obj = Q.a("nol_contentType");
        if (obj == null) goto _L10; else goto _L9
_L9:
        processordata = ((AppCache.ProcessorData) (obj));
        if (!((String) (obj)).isEmpty()) goto _L11; else goto _L10
_L10:
        processordata = "radio,content";
        Q.a("nol_contentType", "radio,content");
_L11:
        obj = Q.a("nol_vidtype");
        if (obj == null) goto _L13; else goto _L12
_L12:
        if (!((String) (obj)).isEmpty()) goto _L14; else goto _L13
_L14:
        processordata = processordata.split(",");
        if (processordata.length <= 0) goto _L16; else goto _L15
_L15:
        int j1 = processordata.length;
        int i1 = 0;
_L83:
        if (i1 >= j1) goto _L16; else goto _L17
_L17:
        if (processordata[i1].compareToIgnoreCase(((String) (obj))) != 0) goto _L19; else goto _L18
_L18:
        processordata = "content";
_L82:
        Q.a("nol_vidtype", ((String) (obj)));
        if (processordata.compareToIgnoreCase("content") != 0) goto _L21; else goto _L20
_L20:
        Q.a("nol_ac", "content");
        Q.a("nol_c3", "st,a");
_L32:
        obj = Q.a("nol_assetid");
        if (obj == null)
        {
            obj = "";
        }
        Object obj2;
        Q.a("nol_davState", "0");
        obj2 = Q.f("onCmsDetected");
        Object obj1 = obj2;
        if (obj2 != null) goto _L23; else goto _L22
_L22:
        obj1 = Q.f("onLoadMetadata");
_L23:
        if (obj1 == null) goto _L25; else goto _L24
_L24:
        boolean flag;
        Q.a(((java.util.List) (obj1)), null, true);
        flag = Q.d("nol_disabled");
        I = flag;
        if (!flag) goto _L25; else goto _L26
_L26:
        if (j != 1 && j != 6) goto _L2; else goto _L27
_L27:
        A = 0L;
        V = ((String) (obj));
        L.id3TagSetStationId(w, ((String) (obj)));
        if (h == 2)
        {
            r = q;
            Q.a("nol_segmentPrefix", r);
            return;
        }
          goto _L28
        processordata;
_L80:
        throw new Exception((new StringBuilder("Failed to load metadata(")).append(s1).append(")").toString(), processordata);
_L8:
        obj1 = Q.b("nol_assetid");
        if (!((JSONObject) (obj)).has(((String) (obj1)))) goto _L7; else goto _L29
_L29:
        obj1 = (String)((JSONObject) (obj)).get(((String) (obj1)));
        obj2 = Q.a("nol_assetid");
        if (obj2 == null) goto _L7; else goto _L30
_L30:
        if (((String) (obj2)).compareToIgnoreCase(((String) (obj1))) == 0) goto _L7; else goto _L31
_L31:
        c(processordata);
          goto _L7
_L21:
        Q.a("nol_ac", "ad");
        Q.a("nol_c3", "");
          goto _L32
_L28:
        r = Q.a("nol_segmentPrefix");
        return;
_L25:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_893;
        }
        if (((String) (obj)).compareToIgnoreCase(V) == 0)
        {
            break MISSING_BLOCK_LABEL_893;
        }
        obj2 = Q.f("onAssetIdChanged");
        obj1 = obj2;
        if (obj2 != null) goto _L34; else goto _L33
_L33:
        obj1 = Q.f("nol_tagFilter");
_L34:
        if (obj1 == null) goto _L36; else goto _L35
_L35:
        Q.a(((java.util.List) (obj1)), null, true);
_L36:
        obj1 = Q.f("onComplete");
        if (obj1 == null) goto _L38; else goto _L37
_L37:
        Q.a(((java.util.List) (obj1)), null, true);
_L38:
        flag = Q.d("nol_disabled");
        I = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_893;
        }
        if (j != 1 && j != 6) goto _L2; else goto _L39
_L39:
        A = 0L;
        V = ((String) (obj));
        L.id3TagSetStationId(w, ((String) (obj)));
        if (h == 2)
        {
            r = q;
            Q.a("nol_segmentPrefix", r);
            return;
        }
        r = Q.a("nol_segmentPrefix");
        return;
        j;
        JVM INSTR tableswitch 0 6: default 940
    //                   0 941
    //                   1 1006
    //                   2 1006
    //                   3 941
    //                   4 1510
    //                   5 1653
    //                   6 1006;
           goto _L40 _L41 _L42 _L42 _L41 _L43 _L44 _L42
_L40:
        return;
_L41:
        if (processordata.compareToIgnoreCase("content") != 0) goto _L2; else goto _L45
_L45:
        try
        {
            processordata = Q.a("nol_tagPresence");
        }
        // Misplaced declaration of an exception variable
        catch (AppCache.ProcessorData processordata)
        {
            com.nielsen.app.sdk.c.a('I', "(%s) No tag presence from dictionary.", new Object[] {
                getName()
            });
            return;
        }
        if (processordata == null) goto _L2; else goto _L46
_L46:
        if (processordata.isEmpty()) goto _L2; else goto _L47
_L47:
        g = Integer.valueOf(processordata).intValue();
        return;
_L42:
        if (!I) goto _L49; else goto _L48
_L48:
        if (j == 2) goto _L51; else goto _L50
_L50:
        A = 0L;
        V = ((String) (obj));
        L.id3TagSetStationId(w, ((String) (obj)));
        if (h != 2) goto _L53; else goto _L52
_L52:
        r = q;
        Q.a("nol_segmentPrefix", r);
_L51:
        com.nielsen.app.sdk.c.a('I', "(%s) product is disabled on metadata processing", new Object[] {
            getName()
        });
        return;
_L53:
        try
        {
            r = Q.a("nol_segmentPrefix");
        }
        // Misplaced declaration of an exception variable
        catch (AppCache.ProcessorData processordata)
        {
            throw new Exception((new StringBuilder("Failed to apply metadata(")).append(s1.toString()).append(") to DRM/DPR product").toString(), processordata);
        }
          goto _L51
_L49:
        if (processordata.compareToIgnoreCase("content") != 0) goto _L55; else goto _L54
_L54:
        if (obj == null) goto _L57; else goto _L56
_L56:
        if (((String) (obj)).compareToIgnoreCase(V) == 0) goto _L57; else goto _L58
_L58:
        V = ((String) (obj));
        if (S.compareToIgnoreCase("nol_fdoffset") != 0 && S.compareToIgnoreCase("nol_pcoffset") != 0) goto _L60; else goto _L59
_L59:
        L.id3TagSetStationId(w, v);
_L72:
        if (j == 2) goto _L62; else goto _L61
_L61:
        A = 0L;
        if (h != 2) goto _L64; else goto _L63
_L63:
        r = q;
        Q.a("nol_segmentPrefix", r);
_L62:
        if (j != 6) goto _L57; else goto _L65
_L65:
        if (!J.sendRequest(Q, i, ((String) (obj)))) goto _L67; else goto _L66
_L66:
        obj1 = J.getData(i);
        obj = Q.f("stn");
        processordata = ((AppCache.ProcessorData) (obj));
        if (obj != null) goto _L69; else goto _L68
_L68:
        processordata = Q.f("nol_serviceFilter");
_L69:
        if (processordata == null) goto _L71; else goto _L70
_L70:
        Q.a(processordata, ((Map) (obj1)), true);
_L71:
        I = Q.d("nol_disabled");
_L57:
        processordata = Q.a("nol_tagPresence");
        if (processordata == null)
        {
            break MISSING_BLOCK_LABEL_1394;
        }
        if (!processordata.isEmpty())
        {
            g = Integer.valueOf(processordata).intValue();
        }
_L73:
        b(l1);
        return;
_L60:
        L.id3TagSetStationId(w, V);
          goto _L72
_L64:
        r = Q.a("nol_segmentPrefix");
          goto _L62
_L67:
        processordata = J.getStationId(i);
        com.nielsen.app.sdk.c.a('W', "(%s) failed to get new station id for AssetId(%s) on time. Use previous value(%s)", new Object[] {
            getName(), obj, processordata
        });
          goto _L57
        processordata;
        com.nielsen.app.sdk.c.a('I', "(%s) No tag presence from dictionary.", new Object[] {
            getName()
        });
          goto _L73
_L55:
        a(l1);
        return;
_L43:
        try
        {
            if (I)
            {
                com.nielsen.app.sdk.c.a('I', "(%s) product is disabled on metadata processing", new Object[] {
                    getName()
                });
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (AppCache.ProcessorData processordata)
        {
            throw new Exception((new StringBuilder("Failed to apply metadata(")).append(s1.toString()).append(") to OCR product").toString(), processordata);
        }
        processordata = Q.a("nol_ocrtag");
        if (processordata == null) goto _L2; else goto _L74
_L74:
        if (processordata.isEmpty()) goto _L2; else goto _L75
_L75:
        processordata = k();
        if (processordata == null) goto _L2; else goto _L76
_L76:
        if (processordata.isEmpty()) goto _L2; else goto _L77
_L77:
        N.a(1, i, 5, l1, processordata);
        Q.a("nol_ocrtag", "");
        Q.a("ocrtag", "");
        return;
_L44:
        try
        {
            processordata = k();
        }
        // Misplaced declaration of an exception variable
        catch (AppCache.ProcessorData processordata)
        {
            throw new Exception((new StringBuilder("Failed to apply metadata(")).append(s1.toString()).append(") to LEGACY product").toString(), processordata);
        }
        if (processordata == null) goto _L2; else goto _L78
_L78:
        if (processordata.isEmpty()) goto _L2; else goto _L79
_L79:
        N.a(1, i, 5, l1, processordata);
        return;
        processordata;
        s1 = "";
          goto _L80
        processordata;
          goto _L81
_L16:
        processordata = "ad";
          goto _L82
_L13:
        obj = "ad";
          goto _L14
_L19:
        i1++;
          goto _L83
    }

    private void i()
    {
        if (w == 0L)
        {
            w = L.a((int)(B * z), (int)z, (int)E, v, p, H, h, G, F, S, (int)D, (int)y);
            if (w != 0L)
            {
                Object obj = Q.e("nol_id3Map");
                if (obj != null && !((Map) (obj)).isEmpty())
                {
                    String s1 = (String)((Map) (obj)).get("nol_nWebAddress");
                    if (s1 != null && !s1.isEmpty())
                    {
                        L.id3TagSetTagIdParseParam(w, Integer.valueOf(s1).intValue());
                    }
                    s1 = (String)((Map) (obj)).get("nol_pccid");
                    if (s1 != null && !s1.isEmpty())
                    {
                        L.id3TagSetPcCidParseParam(w, Integer.valueOf(s1).intValue());
                    }
                    s1 = (String)((Map) (obj)).get("nol_fdcid");
                    if (s1 != null && !s1.isEmpty())
                    {
                        L.id3TagSetFdCidParseParam(w, Integer.valueOf(s1).intValue());
                    }
                    s1 = (String)((Map) (obj)).get("nol_watermark");
                    if (s1 != null && !s1.isEmpty())
                    {
                        L.id3TagSetPduParseParam(w, Integer.valueOf(s1).intValue());
                    }
                    s1 = (String)((Map) (obj)).get("nol_pcoffset");
                    if (s1 != null && !s1.isEmpty())
                    {
                        L.id3TagSetPcOffsetParseParam(w, Integer.valueOf(s1).intValue());
                    }
                    s1 = (String)((Map) (obj)).get("nol_fdoffset");
                    if (s1 != null && !s1.isEmpty())
                    {
                        L.id3TagSetFdOffsetParseParam(w, Integer.valueOf(s1).intValue());
                    }
                    obj = (String)((Map) (obj)).get("nol_breakout");
                    if (obj != null && !((String) (obj)).isEmpty())
                    {
                        L.id3TagSetBreakoutParseParam(w, Integer.valueOf(((String) (obj))).intValue());
                    }
                }
                byte byte0 = 10;
                obj = Q.a("nol_chnlCountThrshld");
                int i1 = byte0;
                if (obj != null)
                {
                    i1 = byte0;
                    if (!((String) (obj)).isEmpty())
                    {
                        i1 = Integer.valueOf(((String) (obj))).intValue();
                    }
                }
                L.id3TagSetMaxDaypartEntry(w, i1);
            }
        }
    }

    private boolean j()
    {
        if (x != 0L && w != 0L) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s2;
        String s3;
        if (s == null || s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        s2 = L.id3TagGetSessionFdCid(w);
        s3 = L.id3TagGetSessionPcCid(w);
        if ((s2 == null || s2.isEmpty()) && (s3 == null || s3.isEmpty())) goto _L1; else goto _L3
_L3:
        Object obj;
label0:
        {
            char c2 = Q.a("nol_clocksrc").charAt(0);
            char c1 = c2;
            if (c2 != 'D')
            {
                c1 = c2;
                if (c2 != 'S')
                {
                    c1 = 'D';
                }
            }
            String s1;
            if (c1 == 'S')
            {
                s1 = K.getTimeShiftValue();
            } else
            {
                s1 = Q.a("nol_tsvFlagDefault");
            }
            if (s1 != null)
            {
                obj = s1;
                if (!s1.isEmpty())
                {
                    break label0;
                }
            }
            obj = "99";
        }
        s1 = (new StringBuilder()).append(o).append(":").append(c1).append(":").append(((String) (obj))).append(":").append(s).toString();
        obj = new HashMap();
        ((Map) (obj)).put("nol_id3ClockSrc", String.valueOf(c1));
        ((Map) (obj)).put("nol_id3Data", s1);
        ((Map) (obj)).put("nol_product", "id3");
        ((Map) (obj)).put("nol_id3FirstTs", String.valueOf(n));
        ((Map) (obj)).put("nol_id3Seq", String.valueOf(o));
        ((Map) (obj)).put("nol_fdcid", s2);
        ((Map) (obj)).put("nol_pccid", s3);
        if (c1 == 'S')
        {
            Q.a(((Map) (obj)));
            s1 = k();
            if (s1 != null && !s1.isEmpty())
            {
                N.a(1, i, 3, n, s1);
                n = 0L;
                s = null;
                o = o + 1L;
            }
        } else
        {
            com.nielsen.app.sdk.c.a('I', "Processor loaded UNPARSED ping to UPLOAD table", new Object[0]);
            JSONObject jsonobject = new JSONObject(((Map) (obj)));
            N.a(1, 0, 7, n, jsonobject.toString());
            n = 0L;
            s = null;
            o = o + 1L;
        }
        return true;
    }

    private String k()
    {
        if (x == 0L)
        {
            return "";
        }
        Object obj;
        if (j != 5)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = Q.c();
        java.util.List list;
        boolean flag;
        if (obj != null)
        {
            try
            {
                if (!((String) (obj)).isEmpty())
                {
                    Q.a("nol_iagData", ((String) (obj)));
                }
            }
            // Misplaced declaration of an exception variable
            catch (boolean aflag[])
            {
                com.nielsen.app.sdk.c.a('W', "(%s) Could not execute IAG data processing", new Object[] {
                    getName()
                });
            }
        }
        list = Q.f("onPingSend");
        obj = list;
        if (list == null)
        {
            obj = Q.f("nol_tagFilter");
        }
        if (obj != null)
        {
            Q.a(((java.util.List) (obj)), null, true);
        }
        flag = Q.d("nol_appdisable");
        if (flag)
        {
            com.nielsen.app.sdk.c.a('I', "(%s) Upload ping disabled by App SDK disabled", new Object[] {
                getName()
            });
        }
        if (I || flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        I = flag;
        flag = Q.d("nol_useroptout");
        if (flag)
        {
            com.nielsen.app.sdk.c.a('I', "(%s) Upload ping disabled by user opt out", new Object[] {
                getName()
            });
        }
        if (I || flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        I = flag;
        flag = Q.d("nol_disabled");
        if (flag)
        {
            com.nielsen.app.sdk.c.a('I', "(%s) Upload ping disabled by onPingSend filter", new Object[] {
                getName()
            });
        }
        if (I || flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        I = flag;
        if (!I)
        {
            boolean aflag[] = new boolean[1];
            aflag[0] = false;
            String s1 = Q.a(T, aflag);
            if (aflag[0] && s1 != null && !s1.isEmpty())
            {
                aflag = (new StringBuilder()).append(s1).append("&rnd=").append(com.nielsen.app.sdk.h.s()).toString();
                com.nielsen.app.sdk.c.a('I', "(%s) PING generated", new Object[] {
                    getName()
                });
            } else
            {
                aflag = "";
            }
        } else
        {
            aflag = "";
        }
        return aflag;
    }

    public int a()
    {
        return i;
    }

    public void a(long l1, char c1)
    {
        b(l1, c1);
    }

    public int b()
    {
        return j;
    }

    public void b(long l1, char c1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = N;
        obj.getClass();
        obj = new AppCache.ProcessorData(((AppCache) (obj)), -1L, i, 0, l1, c1, null);
        m.put(obj);
        join();
        if (K != null)
        {
            K.resetTimeShiftValue(i);
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        com.nielsen.app.sdk.c.a('W', "stopping processor id(%d) was interupted while trying to add data into the queue. Stopping processor suspened.", new Object[] {
            Integer.valueOf(i)
        });
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        throw obj1;
    }

    public int c()
    {
        return k;
    }

    public BlockingQueue d()
    {
        if (m == null)
        {
            m = new ArrayBlockingQueue(8192);
        }
        return m;
    }

    public Map e()
    {
        return Q.d();
    }

    public String f()
    {
        return T;
    }

    public boolean g()
    {
        return D != A || h == 4;
    }

    public boolean h()
    {
        return I;
    }

    public void run()
    {
        k = 0;
        i();
        if (x == 0L)
        {
            x = L.a();
            Q.a(x);
        }
        k = 1;
        com.nielsen.app.sdk.c.a('I', "(%s) has started", new Object[] {
            getName()
        });
        boolean flag = false;
_L10:
        if (flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = flag;
        Object obj = (AppCache.ProcessorData)m.take();
        flag2 = flag;
        char c1 = ((AppCache.ProcessorData) (obj)).getTimeBase();
        flag2 = flag;
        Q.a("nol_clocksrc", String.valueOf(c1));
        flag2 = flag;
        int i1 = ((AppCache.ProcessorData) (obj)).getMessage();
        boolean flag1 = flag;
        i1;
        JVM INSTR tableswitch 0 5: default 679
    //                   0 689
    //                   1 256
    //                   2 209
    //                   3 328
    //                   4 352
    //                   5 340;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        flag2 = flag;
        com.nielsen.app.sdk.c.a(8, 'E', "(%s) Failed processing data (%s)", new Object[] {
            getName(), AppCache.i[i1]
        });
          goto _L10
_L6:
        flag2 = flag1;
        c(((AppCache.ProcessorData) (obj)));
        flag = flag1;
          goto _L10
        obj;
        com.nielsen.app.sdk.c.a(((Throwable) (obj)), true, 8, 'E', "(%s) Could not process message", new Object[] {
            getName()
        });
        flag = flag2;
          goto _L10
_L5:
        flag2 = flag;
        d(((AppCache.ProcessorData) (obj)));
          goto _L10
        obj;
        Exception exception;
        try
        {
            if (x != 0L)
            {
                L.b(x);
                Q.a();
            }
            x = 0L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            com.nielsen.app.sdk.c.a(((Throwable) (obj1)), true, 7, 'E', "(%s) failed releasing parser native object", new Object[] {
                getName()
            });
        }
        try
        {
            if (w != 0L)
            {
                L.a(w);
            }
            w = 0L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            com.nielsen.app.sdk.c.a(((Throwable) (obj1)), true, 7, 'E', "(%s) failed releasing ID3 tag native object", new Object[] {
                getName()
            });
        }
        throw obj;
_L7:
        flag2 = flag;
        a(((AppCache.ProcessorData) (obj)));
          goto _L10
_L9:
        flag2 = flag;
        e(((AppCache.ProcessorData) (obj)));
          goto _L10
_L8:
        flag2 = flag;
        b(((AppCache.ProcessorData) (obj)));
          goto _L10
_L2:
        k = 2;
        com.nielsen.app.sdk.c.a('I', "(%s) thread is finished", new Object[] {
            getName()
        });
          goto _L11
        exception;
        com.nielsen.app.sdk.c.a(exception, true, 7, 'E', "(%s) Thread stopped unexpectedly", new Object[] {
            getName()
        });
        try
        {
            if (x != 0L)
            {
                L.b(x);
                Q.a();
            }
            x = 0L;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception1)
        {
            com.nielsen.app.sdk.c.a(exception1, true, 7, 'E', "(%s) failed releasing parser native object", new Object[] {
                getName()
            });
        }
        if (w != 0L)
        {
            L.a(w);
        }
        w = 0L;
        return;
        exception1;
        obj1 = ((Object) (new Object[1]));
        obj1[0] = getName();
_L13:
        com.nielsen.app.sdk.c.a(exception1, true, 7, 'E', "(%s) failed releasing ID3 tag native object", ((Object []) (obj1)));
        return;
_L11:
        Exception exception1;
        Object obj1;
        try
        {
            if (x != 0L)
            {
                L.b(x);
                Q.a();
            }
            x = 0L;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception1)
        {
            com.nielsen.app.sdk.c.a(exception1, true, 7, 'E', "(%s) failed releasing parser native object", new Object[] {
                getName()
            });
        }
        try
        {
            if (w != 0L)
            {
                L.a(w);
            }
            w = 0L;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception1)
        {
            obj1 = ((Object) (new Object[1]));
        }
        obj1[0] = getName();
        if (true) goto _L13; else goto _L12
_L12:
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
          goto _L10
_L4:
        flag1 = true;
          goto _L6
    }
}
