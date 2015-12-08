// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.bmwgroup.connected.car.app.ApplicationManager;
import com.bmwgroup.connected.car.app.feature.consumption.data.FuelType;
import com.bmwgroup.connected.car.internal.SdkManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public final class agl
    implements agk
{

    private static final ahn a = ahn.a("CarSdkRemoteInterface");

    public agl()
    {
    }

    private static String h(String s)
    {
        String s2 = "";
        String s1 = s2;
        if (s != null)
        {
            int i1 = s.indexOf("=");
            s1 = s2;
            if (i1 != -1)
            {
                s1 = s2;
                if (i1 + 1 < s.length())
                {
                    s1 = s.substring(i1 + 1);
                }
            }
        }
        return s1;
    }

    private static List i(String s)
    {
        return (List)((afb)ApplicationManager.a.mApplication).c.get(s);
    }

    static ahn m()
    {
        return a;
    }

    public final void a()
    {
        a.b("onPlay()", new Object[0]);
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
                adp adp = SdkManager.a.c();
                if (adp instanceof aeh)
                {
                    ((aeh)adp).b();
                }
            }

        });
        Object obj = (List)((afb)ApplicationManager.a.mApplication).c.get("instrumentcluster");
        if (obj != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.b("onPlay() - calling onRequestPlaylist of InstrumentClusterFeatureListener", new Object[0]))
            {
                ((ady)(adr)((Iterator) (obj)).next()).a();
            }

        }
    }

    public final void a(int i1)
    {
        Object obj = (List)((afb)ApplicationManager.a.mApplication).c.get("instrumentcluster");
        if (obj != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.b("onPlaylistClick(%s) - forwarding to featurelistener", new Object[] {
    Integer.valueOf(i1)
}))
            {
                ((ady)(adr)((Iterator) (obj)).next()).a(i1);
            }

        }
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
                SdkManager.a.c();
            }

        });
    }

    public final void a(int i1, byte abyte0[])
    {
        int j1 = 0;
        ahn ahn1 = a;
        if (abyte0 != null)
        {
            j1 = abyte0.length;
        }
        ahn1.b("onTransferring(%d, %d)", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        abyte0 = i("voicerecorder");
        if (abyte0 != null)
        {
            for (abyte0 = abyte0.iterator(); abyte0.hasNext(); abyte0.next()) { }
        }
    }

    public final void a(int i1, String as[])
    {
        Object obj = ApplicationManager.a.mApplication;
        ahn ahn1 = a;
        if (as != null)
        {
            obj = new StringBuilder();
            if (as != null)
            {
                for (int j1 = 0; j1 < as.length; j1++)
                {
                    ((StringBuilder) (obj)).append(as[j1]);
                    if (j1 < as.length - 1)
                    {
                        ((StringBuilder) (obj)).append(",");
                    }
                }

            }
            obj = ((StringBuilder) (obj)).toString();
        } else
        {
            obj = "No value";
        }
        ahn1.a("onCDSUpdate( %d, %s)", new Object[] {
            Integer.valueOf(i1), obj
        });
        i1;
        JVM INSTR lookupswitch 7: default 168
    //                   47: 518
    //                   61: 175
    //                   62: 213
    //                   71: 334
    //                   86: 168
    //                   92: 420
    //                   93: 469;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return;
_L3:
        if (as.length == 3)
        {
            as = h(as[1]);
            a.a("CDS: Recieved beqaring %s", new Object[] {
                as
            });
            Integer.valueOf(as).intValue();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (as.length != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s = h(as[0]);
        as = h(as[1]);
        a.a("CDS: Received CurrentPosition %s,%s", new Object[] {
            s, as
        });
        Double.valueOf(s).doubleValue();
        Double.valueOf(as).doubleValue();
        as = i("geo.currentPosition");
        if (as != null)
        {
            try
            {
                as = as.iterator();
                while (as.hasNext()) 
                {
                    as.next();
                    new adw();
                }
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                a.e("Error occurred %s", new Object[] {
                    as.toString()
                });
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        Integer.valueOf(h(as[0])).intValue();
        Integer.valueOf(h(as[1])).intValue();
        boolean flag = Boolean.valueOf(h(as[2])).booleanValue();
        as = i("consumption");
        if (as != null)
        {
            as = as.iterator();
            while (as.hasNext()) 
            {
                as.next();
                new afi(flag);
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        Integer.valueOf(h(as[0])).intValue();
        as = i("consumption");
        if (as != null)
        {
            as = as.iterator();
            while (as.hasNext()) 
            {
                as.next();
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        Integer.valueOf(h(as[0])).intValue();
        as = i("consumption");
        if (as != null)
        {
            as = as.iterator();
            while (as.hasNext()) 
            {
                as.next();
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        as = h(as[2]);
        FuelType fueltype = FuelType.a;
        if (as != null)
        {
            if (!as.startsWith("BENZINE"))
            {
                break; /* Loop/switch isn't completed */
            }
            as = FuelType.b;
        }
_L10:
        as = i("consumption");
        if (as != null)
        {
            as = as.iterator();
            while (as.hasNext()) 
            {
                as.next();
            }
        }
        if (true) goto _L1; else goto _L8
_L8:
        if (!as.startsWith("DIESEL")) goto _L10; else goto _L9
_L9:
        as = FuelType.c;
          goto _L10
    }

    public final void a(String s)
    {
        a.b("onCreate(%s)", new Object[] {
            s
        });
        SdkManager.a.mHandler.post(new Runnable(s) {

            private String a;

            public final void run()
            {
                SdkManager sdkmanager = SdkManager.a;
                String s1 = a;
                SdkManager.b.a("onScreenCreate(%s)-> %s", new Object[] {
                    s1, sdkmanager.mApplicationName
                });
                sdkmanager.mCurrentIdent = s1;
                int i1 = s1.lastIndexOf('/');
                Object obj;
                aez aez1;
                adm adm1;
                if (i1 != -1)
                {
                    obj = s1.substring(0, i1);
                } else
                {
                    obj = s1;
                }
                SdkManager.b.a("onScreenCreate(%s) parentIdent=%s, i=%d", new Object[] {
                    s1, obj, Integer.valueOf(i1)
                });
                aez1 = (aez)sdkmanager.a(s1);
                adm1 = (adm)sdkmanager.b(((String) (obj)));
                obj = aez1;
                if (aez1 != null) goto _L2; else goto _L1
_L1:
                SdkManager.b.a("addScreen(%s)-> %s", new Object[] {
                    adm1, sdkmanager.mApplicationName
                });
                obj = null;
                if (!(adm1 instanceof ahi)) goto _L4; else goto _L3
_L3:
                obj = new aga(sdkmanager.b(), adm1);
_L6:
                sdkmanager.mScreens.push(obj);
                sdkmanager.a(SdkManager.a.a(), obj);
_L2:
                SdkManager.b.a("onScreenCreate(%s) s=%s l=%s", new Object[] {
                    s1, obj, adm1
                });
                if (adm1 != null)
                {
                    sdkmanager.mHandler.post(new com.bmwgroup.connected.car.internal.SdkManager._cls1(adm1, ((aez) (obj))));
                }
                return;
_L4:
                if (adm1 instanceof agy)
                {
                    obj = new afv(sdkmanager.b(), adm1);
                } else
                if (adm1 instanceof aeo)
                {
                    obj = new afq(sdkmanager.b(), adm1);
                } else
                if (adm1 instanceof aev)
                {
                    obj = new aft(sdkmanager.b(), adm1);
                } else
                if (adm1 instanceof aey)
                {
                    obj = new aft(sdkmanager.b(), adm1);
                } else
                if (adm1 instanceof aes)
                {
                    obj = new afr(sdkmanager.b(), adm1);
                } else
                if (adm1 instanceof aem)
                {
                    obj = new afo(sdkmanager.b(), adm1);
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                a = s;
                super();
            }
        });
    }

    public final void a(String s, int i1)
    {
        a.b("onInputResult(%s, %d)", new Object[] {
            s, Integer.valueOf(i1)
        });
        SdkManager.a.b(s);
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
            }

        });
    }

    public final void a(String s, String s1)
    {
        a.b("onInputResult(%s, %s)", new Object[] {
            s, s1
        });
        SdkManager.a.b(s);
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
            }

        });
    }

    public final void a(String s, int ai[])
    {
        SdkManager.a.b(s);
    }

    public final void a(String as[], String as1[])
    {
        a.b("onInit()", new Object[0]);
        SdkManager.a.mHandler.post(new Runnable(as, as1) {

            private String a[];
            private String b[];

            public final void run()
            {
                int i1 = 0;
                adp adp1 = SdkManager.a.c();
                ado ado = ApplicationManager.a.mApplication;
                afb afb1 = (afb)ado;
                String as2[] = a;
                String as3[] = b;
                afb.a.b("Feature availability set ", new Object[0]);
                if (as2 != null && as3 != null)
                {
                    if (as2.length != as3.length)
                    {
                        throw new RuntimeException("Feature availability map containes invalid values ( feature.length != availability.length)");
                    }
                    afb1.d = new HashMap();
                    for (; i1 < as2.length; i1++)
                    {
                        afb1.d.put(as2[i1], Boolean.valueOf(as3[i1]));
                    }

                }
                adp1.a(ado);
            }

            
            {
                a = as;
                b = as1;
                super();
            }
        });
    }

    public final void b()
    {
        a.b("onPause()", new Object[0]);
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
                adp adp = SdkManager.a.c();
                if (adp instanceof aeh)
                {
                    ((aeh)adp).c();
                }
            }

        });
    }

    public final void b(String s)
    {
        a.b("onEnter(%s)", new Object[] {
            s
        });
        SdkManager.a.mHandler.post(new Runnable(s) {

            private String a;

            public final void run()
            {
                SdkManager sdkmanager = SdkManager.a;
                String s1 = a;
                SdkManager.b.a("onScreenEnter(%s)-> %s", new Object[] {
                    s1, sdkmanager.mApplicationName
                });
                sdkmanager.mCurrentIdent = s1;
                int i1 = s1.lastIndexOf('/');
                Object obj;
                if (i1 != -1)
                {
                    obj = s1.substring(0, i1);
                } else
                {
                    obj = s1;
                }
                SdkManager.b.a("onScreenEnter(%s) actualIdent=%s, i=%d", new Object[] {
                    s1, obj, Integer.valueOf(i1)
                });
                obj = (adm)sdkmanager.b(((String) (obj)));
                SdkManager.b.a("onScreenEnter(%s) l=%s", new Object[] {
                    s1, obj
                });
                if (obj != null)
                {
                    sdkmanager.mHandler.post(new com.bmwgroup.connected.car.internal.SdkManager._cls2(((adm) (obj))));
                }
            }

            
            {
                a = s;
                super();
            }
        });
    }

    public final void b(String s, String s1)
    {
        a.b("onInput(%s, %s)", new Object[] {
            s, s1
        });
        SdkManager.a.b(s);
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
            }

        });
    }

    public final void c()
    {
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
                adp adp = SdkManager.a.c();
                if (adp instanceof aeh)
                {
                    ((aeh)adp).d();
                }
            }

        });
    }

    public final void c(String s)
    {
        a.b("onExit(%s)", new Object[] {
            s
        });
        SdkManager.a.mHandler.post(new Runnable(s) {

            private String a;

            public final void run()
            {
                SdkManager sdkmanager = SdkManager.a;
                String s1 = a;
                SdkManager.b.a("onScreenExit(%s)-> %s", new Object[] {
                    s1, sdkmanager.mApplicationName
                });
                adm adm1 = (adm)sdkmanager.b(s1);
                SdkManager.b.a("onScreenExit(%s) l=%s", new Object[] {
                    s1, adm1
                });
                if (adm1 != null)
                {
                    sdkmanager.mHandler.post(new com.bmwgroup.connected.car.internal.SdkManager._cls3(adm1));
                }
            }

            
            {
                a = s;
                super();
            }
        });
    }

    public final void c(String s, String s1)
    {
        a.a("onRawCdsUpdate(%s, %s)", new Object[] {
            s, s1
        });
        s = i("rawcds");
        if (s != null)
        {
            for (s = s.iterator(); s.hasNext(); s.next()) { }
        }
    }

    public final void d()
    {
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
                adp adp = SdkManager.a.c();
                if (adp instanceof aeh)
                {
                    ((aeh)adp).e();
                }
            }

        });
    }

    public final void d(String s)
    {
        a.b("onDestroy(%s)", new Object[] {
            s
        });
        SdkManager.a.mHandler.post(new Runnable(s) {

            private String a;

            public final void run()
            {
                SdkManager sdkmanager;
                aez aez1;
                boolean flag;
                sdkmanager = SdkManager.a;
                String s1 = a;
                SdkManager.b.a("onScreenDestroy(%s)-> %s", new Object[] {
                    s1, sdkmanager.mApplicationName
                });
                adm adm1 = (adm)sdkmanager.b(s1);
                aez1 = (aez)sdkmanager.a(s1);
                SdkManager.b.a("onScreenDestroy(%s) s=%s l=%s", new Object[] {
                    s1, aez1, adm1
                });
                if (adm1 != null)
                {
                    sdkmanager.mHandler.post(new com.bmwgroup.connected.car.internal.SdkManager._cls4(adm1, aez1));
                } else
                {
                    SdkManager.b.d("onScreenDestroy(%s) - NO listener found for this id.", new Object[] {
                        s1
                    });
                }
                SdkManager.b.a("removeScreen(%s)-> %s", new Object[] {
                    aez1, sdkmanager.mApplicationName
                });
                if (aez1 == sdkmanager.b())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (aez1 == null || !flag) goto _L2; else goto _L1
_L1:
                sdkmanager.mScreens.pop();
_L4:
                if (sdkmanager.mIdentObjectMap.containsKey(s1))
                {
                    sdkmanager.mIdentObjectMap.remove(s1);
                }
                return;
_L2:
                if (!flag)
                {
                    SdkManager.b.d("removeScreen(%s) - NOT Active screen. ActiveScreen = %s", new Object[] {
                        aez1, sdkmanager.b()
                    });
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = s;
                super();
            }
        });
    }

    public final void e()
    {
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
                SdkManager.a.c();
            }

        });
    }

    public final void e(String s)
    {
        a.b("onWaitingAnimationCanceled(%s)", new Object[] {
            s
        });
        SdkManager.a.b(s);
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
            }

        });
    }

    public final void f()
    {
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
                SdkManager.a.c();
            }

        });
    }

    public final void f(String s)
    {
        a.b("onClick(%s)", new Object[] {
            s
        });
        if (s.lastIndexOf(':') != -1)
        {
            int ai[] = agp.a(s);
            Object obj = s.substring(0, ai[2]);
            String s1 = s.substring(0, ai[3]);
            obj = SdkManager.a.b(((String) (obj)));
            if (obj != null)
            {
                SdkManager.a.mHandler.post(new Runnable(s1, s, ((adk) (obj)), ai) {

                    private String a;
                    private String b;
                    private adk c;
                    private int d[];

                    public final void run()
                    {
                        Object obj2;
                        obj2 = (aez)SdkManager.a.a(a);
                        String s2 = b;
                        ((aez) (obj2)).a.b("setLastClickableIdent(%s)", new Object[] {
                            s2
                        });
                        if (!(c instanceof adn)) goto _L2; else goto _L1
_L1:
                        ((adn)c).a(d[1]);
_L4:
                        return;
_L2:
                        if (!(c instanceof aem))
                        {
                            continue; /* Loop/switch isn't completed */
                        }
                        agl.m().b((new StringBuilder("BigImageScreenListener --> ")).append(d).toString(), new Object[0]);
                        if (obj2 == null) goto _L4; else goto _L3
_L3:
                        ((aei)obj2).a(d[1]);
                        return;
                        if (!(c instanceof agy)) goto _L4; else goto _L5
_L5:
                        Object obj1 = null;
                        aht aht = obj1;
                        if (obj2 != null)
                        {
                            obj2 = (afu)((afv)obj2).a(d[0]);
                            aht = obj1;
                            if (obj2 != null)
                            {
                                aht aaht[] = ((afu) (obj2)).a;
                                aht = obj1;
                                if (aaht != null)
                                {
                                    aht = obj1;
                                    if (aaht.length > d[1])
                                    {
                                        aht = aaht[d[1]];
                                    }
                                }
                            }
                        }
                        ((agy)c).a(aht);
                        return;
                    }

            
            {
                a = s;
                b = s1;
                c = adk;
                d = ai;
                super();
            }
                });
            }
        }
    }

    public final void g()
    {
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
                SdkManager.a.c();
            }

        });
    }

    public final void g(String s)
    {
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
                SdkManager.a.c();
            }

        });
    }

    public final void h()
    {
        SdkManager.a.mHandler.post(new Runnable() {

            public final void run()
            {
                SdkManager.a.c();
            }

        });
    }

    public final void i()
    {
        Object obj = (List)((afb)ApplicationManager.a.mApplication).c.get("instrumentcluster");
        if (obj != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ady)(adr)((Iterator) (obj)).next()).a()) { }
        }
    }

    public final void j()
    {
        a.b("onRecording()", new Object[0]);
        Object obj = i("voicerecorder");
        if (obj != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Iterator) (obj)).next()) { }
        }
    }

    public final void k()
    {
        a.b("onTransferringDone()", new Object[0]);
        Object obj = i("voicerecorder");
        if (obj != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Iterator) (obj)).next()) { }
        }
    }

    public final void l()
    {
        a.b("onTransferringError()", new Object[0]);
        Object obj = i("voicerecorder");
        if (obj != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Iterator) (obj)).next()) { }
        }
    }

}
