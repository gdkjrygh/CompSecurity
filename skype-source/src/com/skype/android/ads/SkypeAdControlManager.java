// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.microsoft.advertising.android.AdControl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.ads:
//            SkypeAdManager, ConfigManager, SkypeAdPlacer

public class SkypeAdControlManager
{
    private final class a
    {

        Context a;
        int b;
        int c;
        int d;
        String e;
        final SkypeAdControlManager f;

        a(Context context, int i, int j, int k, String s)
        {
            f = SkypeAdControlManager.this;
            super();
            a = context;
            b = i;
            c = j;
            d = k;
            e = s;
        }
    }


    private static final SkypeAdControlManager a = new SkypeAdControlManager();
    private boolean b;
    private final Handler c = new Handler(Looper.getMainLooper());
    private HashMap d;
    private HashMap e;
    private boolean f;

    private SkypeAdControlManager()
    {
        b = true;
        d = new HashMap();
        e = new HashMap();
        f = false;
    }

    private AdControl a(Context context, int i, int j, int k, String s)
    {
        if (!SkypeAdManager.d().i() && !SkypeAdManager.d().j()) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((AdControl) (obj));
_L2:
        AdControl adcontrol;
        if (ConfigManager.b(context) == null)
        {
            context = new a(context, i, j, k, s);
            d.put(s, context);
            return null;
        }
        obj = ConfigManager.a(ConfigManager.h(), s);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        adcontrol = (AdControl)e.get(obj);
        if (adcontrol == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = adcontrol;
        if (adcontrol.getContext() == context) goto _L4; else goto _L3
_L3:
label0:
        {
            Object obj1 = null;
            if (ConfigManager.a(s))
            {
                ConfigManager.a();
                if (1 != i)
                {
                    break label0;
                }
                obj1 = ConfigManager.h();
                String s1 = ConfigManager.i();
                Object obj2 = ConfigManager.a(((String) (obj1)), s);
                if (s1 == null || obj2 == null)
                {
                    return null;
                }
                (new StringBuilder("Create ad control for Country ")).append(((String) (obj1))).append(": AdUnitId - ").append(((String) (obj2))).append(" AppId - ").append(s1);
                AdControl.a(new Object[] {
                    "enableConfig", "webContainerEvents"
                });
                obj1 = new AdControl(context, Integer.valueOf(j), Integer.valueOf(k), s1, ((String) (obj2)));
                Log.i("SkypeAdControlManager", (new StringBuilder("ad sdk version ")).append(AdControl.x()).toString());
                ((AdControl) (obj1)).a("wpx", Integer.toString(j));
                ((AdControl) (obj1)).a("hpx", Integer.toString(k));
                ((AdControl) (obj1)).a("*detach*", null);
                (new StringBuilder("create ad control ")).append(obj1);
                obj2 = (AdControl)e.put(obj2, obj1);
                if (obj2 != null)
                {
                    ((AdControl) (obj2)).l();
                    android.view.ViewParent viewparent = ((AdControl) (obj2)).getParent();
                    if (viewparent instanceof ViewGroup)
                    {
                        ((ViewGroup)viewparent).removeView(((android.view.View) (obj2)));
                        c.postDelayed(new Runnable(((AdControl) (obj2))) {

                            final AdControl a;
                            final SkypeAdControlManager b;

                            public final void run()
                            {
                                (new StringBuilder("cleanup ad control ")).append(a);
                                a.q();
                            }

            
            {
                b = SkypeAdControlManager.this;
                a = adcontrol;
                super();
            }
                        }, 250L);
                    }
                }
                obj2 = new DisplayMetrics();
                ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(((DisplayMetrics) (obj2)));
                i = ((DisplayMetrics) (obj2)).widthPixels - (int)(((DisplayMetrics) (obj2)).density * 10F) - (int)(((DisplayMetrics) (obj2)).density * 10F);
                ((AdControl) (obj1)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(i, (i * 50) / 320));
                ((AdControl) (obj1)).setBackgroundColor(0);
                a(((AdControl) (obj1)), s, ((AdControl) (obj1)).b());
                (new StringBuilder("current number of ad controls is ")).append(e.size());
            }
            return ((AdControl) (obj1));
        }
        return null;
    }

    static AdControl a(SkypeAdControlManager skypeadcontrolmanager, Context context, int i, int j, int k, String s)
    {
        return skypeadcontrolmanager.a(context, i, j, k, s);
    }

    public static SkypeAdControlManager a()
    {
        return a;
    }

    static HashMap a(SkypeAdControlManager skypeadcontrolmanager)
    {
        return skypeadcontrolmanager.d;
    }

    private void a(AdControl adcontrol, String s, String s1)
    {
        if (adcontrol == null)
        {
            return;
        }
        adcontrol.setAutoRefreshInterval(ConfigManager.j() / 1000);
        String s2 = s1;
        if (s1 == null)
        {
            s2 = ConfigManager.a(ConfigManager.h(), s);
        }
        if (s2 != null && !s2.equals(adcontrol.b()))
        {
            if (e.get(adcontrol.b()) == adcontrol)
            {
                e.remove(adcontrol.b());
            }
            adcontrol.setAdUnitId(s2);
            e.put(s2, adcontrol);
        }
        ConfigManager.a(adcontrol);
    }

    static void a(SkypeAdControlManager skypeadcontrolmanager, AdControl adcontrol, String s, String s1)
    {
        skypeadcontrolmanager.a(adcontrol, s, s1);
    }

    static HashMap b(SkypeAdControlManager skypeadcontrolmanager)
    {
        return skypeadcontrolmanager.e;
    }

    public final AdControl a(Context context, String s)
    {
        s = ConfigManager.a(ConfigManager.h(), s);
        if (s != null)
        {
            s = (AdControl)e.get(s);
            if (s != null && s.getContext() == context)
            {
                return s;
            }
        }
        return null;
    }

    public final void a(String s)
    {
        if (!SkypeAdManager.d().i() && !SkypeAdManager.d().j())
        {
            s = ConfigManager.a(ConfigManager.h(), s);
            s = (AdControl)e.get(s);
            if (s != null)
            {
                s.m();
                return;
            }
        }
    }

    public final void a(JSONObject jsonobject)
    {
        String s1 = ConfigManager.h();
        String s = ConfigManager.a(s1, "recents");
        s1 = ConfigManager.a(s1, "contacts");
        if (s != null && s1 != null)
        {
            f = s1.equals(s);
        }
        if (SkypeAdPlacer.a() == null)
        {
            return;
        } else
        {
            c.post(new Runnable(jsonobject) {

                final boolean a = true;
                final JSONObject b;
                final SkypeAdControlManager c;

                public final void run()
                {
                    if (SkypeAdControlManager.a(c).isEmpty())
                    {
                        break MISSING_BLOCK_LABEL_135;
                    }
                    if (ConfigManager.g())
                    {
                        Iterator iterator = SkypeAdControlManager.a(c).keySet().iterator();
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                break;
                            }
                            String s2 = (String)iterator.next();
                            if (ConfigManager.b(s2) && SkypeAdPlacer.a().b(s2))
                            {
                                Object obj = (a)SkypeAdControlManager.a(c).get(s2);
                                obj = SkypeAdControlManager.a(c, ((a) (obj)).a, ((a) (obj)).b, ((a) (obj)).c, ((a) (obj)).d, ((a) (obj)).e);
                                SkypeAdPlacer.a().a(s2, ((AdControl) (obj)));
                            }
                        } while (true);
                    }
                    SkypeAdControlManager.a(c).clear();
                    if (!a) goto _L2; else goto _L1
_L1:
                    String as[];
                    String s3;
                    int j;
                    Set set = SkypeAdControlManager.b(c).keySet();
                    as = (String[])set.toArray(new String[set.size()]);
                    s3 = ConfigManager.h();
                    j = as.length;
                    int i = 0;
_L4:
                    Object obj1;
                    if (i >= j)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    obj1 = as[i];
                    obj1 = (AdControl)SkypeAdControlManager.b(c).get(obj1);
                    SkypeAdPlacer.a();
                    String s4 = SkypeAdPlacer.a(((AdControl) (obj1)));
                    String s5 = ConfigManager.a(s3, s4);
                    SkypeAdControlManager.a(c, ((AdControl) (obj1)), s4, s5);
                    i++;
                    if (true) goto _L4; else goto _L3
_L3:
                    if (!ConfigManager.g()) goto _L6; else goto _L5
_L5:
                    SkypeAdPlacer.a().d();
                    SkypeAdPlacer.a();
                    as = SkypeAdPlacer.b();
                    i = 0;
_L10:
                    if (i >= 4) goto _L2; else goto _L7
_L7:
                    s3 = as[i];
                    if (!ConfigManager.b(s3))
                    {
                        SkypeAdPlacer.a().a(s3);
                    }
                      goto _L8
_L6:
                    try
                    {
                        SkypeAdPlacer.a().c();
                        return;
                    }
                    catch (Exception exception) { }
_L2:
                    return;
_L8:
                    i++;
                    if (true) goto _L10; else goto _L9
_L9:
                }

            
            {
                c = SkypeAdControlManager.this;
                b = jsonobject;
                super();
            }
            });
            return;
        }
    }

    public final AdControl b(Context context, String s)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        return a(context, 1, (int)(displaymetrics.density * 320F), (int)(displaymetrics.density * 50F), s);
    }

    public final void b(String s)
    {
        if (!SkypeAdManager.d().i() && ConfigManager.g())
        {
            s = ConfigManager.a(ConfigManager.h(), s);
            s = (AdControl)e.get(s);
            if (s != null)
            {
                s.l();
                return;
            }
        }
    }

    public final boolean b()
    {
        return f;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
        c.post(new Runnable() {

            final SkypeAdControlManager a;

            public final void run()
            {
                try
                {
                    SkypeAdPlacer.a().c();
                    SkypeAdControlManager.a(a).clear();
                    return;
                }
                catch (Exception exception1)
                {
                    return;
                }
            }

            
            {
                a = SkypeAdControlManager.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        b = false;
        c.post(new Runnable() {

            final SkypeAdControlManager a;

            public final void run()
            {
                try
                {
                    SkypeAdPlacer.a().d();
                    return;
                }
                catch (Exception exception1)
                {
                    return;
                }
            }

            
            {
                a = SkypeAdControlManager.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        c.post(new Runnable() {

            final SkypeAdControlManager a;

            public final void run()
            {
                String s;
                for (Iterator iterator = SkypeAdControlManager.b(a).keySet().iterator(); iterator.hasNext(); ConfigManager.a((AdControl)SkypeAdControlManager.b(a).get(s)))
                {
                    s = (String)iterator.next();
                }

            }

            
            {
                a = SkypeAdControlManager.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean f()
    {
        return b;
    }

    public final void g()
    {
        this;
        JVM INSTR monitorenter ;
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void h()
    {
        this;
        JVM INSTR monitorenter ;
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
