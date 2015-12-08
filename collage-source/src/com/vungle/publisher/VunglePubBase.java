// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import android.content.Context;
import com.vungle.log.Logger;
import com.vungle.publisher.ad.AdManager;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.db.DatabaseHelper;
import com.vungle.publisher.env.SdkConfig;
import com.vungle.publisher.env.SdkState;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.file.CacheManager;
import com.vungle.publisher.inject.Injector;
import dagger.Lazy;
import dagger.ObjectGraph;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher:
//            dd, au, ay, ax, 
//            InitializationEventListener, bt, AdConfig, SafeBundleAdConfigFactory, 
//            aw, ca, Demographic, EventListener

public abstract class VunglePubBase
{

    public static final String VERSION = "VungleDroid/3.3.3";
    AdManager a;
    InitializationEventListener b;
    CacheManager c;
    DatabaseHelper d;
    Demographic e;
    protected bt f;
    EventBus g;
    AdConfig h;
    SafeBundleAdConfigFactory i;
    SdkConfig j;
    SdkState k;
    Context l;
    private boolean m;
    private boolean n;

    protected VunglePubBase()
    {
    }

    private boolean a(boolean flag, String s)
    {
        boolean flag1 = n;
        if (flag1)
        {
            Logger.v("Vungle", "VunglePub was initialized");
        } else
        if (flag)
        {
            Logger.w("Vungle", (new StringBuilder("Please call VunglePub.init() before ")).append(s).toString());
            return flag1;
        }
        return flag1;
    }

    private boolean c()
    {
        boolean flag = m;
        if (!flag)
        {
            Logger.d("Vungle", "VunglePub not injected");
        }
        return flag;
    }

    protected boolean a()
    {
        return dd.b(l, f).length == 0;
    }

    public transient void addEventListeners(EventListener aeventlistener[])
    {
        try
        {
            if (c())
            {
                j.a(aeventlistener);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EventListener aeventlistener[])
        {
            Logger.e("Vungle", "error adding event listeners", aeventlistener);
        }
    }

    protected boolean b()
    {
        boolean flag = true;
        boolean flag1 = false;
        if (a(true, "playAd()"))
        {
            SdkState sdkstate = k;
            if (sdkstate.b())
            {
                if (!sdkstate.l.compareAndSet(false, true))
                {
                    Logger.d("VungleAd", "ad already playing");
                    sdkstate.d.a(new au());
                    flag = false;
                }
            } else
            {
                sdkstate.d.a(new ay((int)((SdkState.d() - sdkstate.c()) / 1000L), sdkstate.e()));
                flag = false;
            }
            if (flag)
            {
                ((com.vungle.publisher.env.SdkState.EndAdEventListener)sdkstate.k.get()).register();
            }
        } else
        {
            flag = flag1;
            if (m)
            {
                g.a(new ax());
                return false;
            }
        }
        return flag;
    }

    public void clearEventListeners()
    {
        try
        {
            if (c())
            {
                j.a();
            }
            return;
        }
        catch (Exception exception)
        {
            Logger.e("Vungle", "error clearing event listeners", exception);
        }
    }

    public Demographic getDemographic()
    {
        try
        {
            c();
        }
        catch (Exception exception)
        {
            Logger.e("Vungle", "error getting demographic info", exception);
        }
        return e;
    }

    public AdConfig getGlobalAdConfig()
    {
        try
        {
            c();
        }
        catch (Exception exception)
        {
            Logger.e("Vungle", "error getting globalAdConfig", exception);
        }
        return h;
    }

    public String[] getMissingPermissions()
    {
        String as[] = null;
        try
        {
            if (c())
            {
                as = dd.b(l, f);
            }
        }
        catch (Exception exception)
        {
            Logger.e("Vungle", "error getting missing permissions", exception);
            return null;
        }
        return as;
    }

    public boolean init(Context context, String s)
    {
        boolean flag;
        boolean flag1;
        flag1 = n;
        if (flag1)
        {
            int i1;
            try
            {
                Logger.d("Vungle", "already initialized");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Logger.e("Vungle", "VunglePub initialization failed", context);
                return flag1;
            }
            return flag1;
        }
        i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        Logger.d("VungleDevice", (new StringBuilder("Device Android API level ")).append(i1).toString());
_L11:
        if (!flag) goto _L4; else goto _L3
_L3:
        if (!m) goto _L6; else goto _L5
_L5:
        Logger.d("Vungle", "already injected");
_L9:
        if (!a()) goto _L8; else goto _L7
_L7:
        Logger.i("Vungle", (new StringBuilder("VungleDroid/3.3.3 init(")).append(s).append(")").toString());
        context = c;
        Logger.d("VungleFile", "deleting old ad temp directory");
        CacheManager.a((String)((CacheManager) (context)).b.get());
        b.register();
        context = d;
        ((DatabaseHelper) (context)).d.a(new com.vungle.publisher.db.DatabaseHelper._cls1(context), com.vungle.publisher.async.ScheduledPriorityExecutor.b.b);
        f.r();
        Logger.v("Vungle", "initialization successful");
        n = true;
        return true;
_L2:
        Logger.w("VungleDevice", (new StringBuilder("Device Android API level ")).append(i1).append(" does not meet required minimum 9").toString());
        continue; /* Loop/switch isn't completed */
_L6:
        Injector injector = Injector.getInstance();
        injector.a(context, s);
        injector.a.inject(this);
        Logger.d("Vungle", "injection successful");
        m = true;
          goto _L9
_L8:
        Logger.w("Vungle", "initialization failed");
_L4:
        return flag1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public boolean isAdPlayable()
    {
        boolean flag = false;
        try
        {
            if (a(true, "isAdPlayable()"))
            {
                flag = a.a();
            }
        }
        catch (Exception exception)
        {
            Logger.e("Vungle", "error returning ad playable", exception);
            return false;
        }
        return flag;
    }

    public void onPause()
    {
        try
        {
            if (a(false, "onPause()"))
            {
                SdkState sdkstate = k;
                Logger.d("VungleAd", "onDeveloperActivityPause()");
                sdkstate.f();
            }
            return;
        }
        catch (Exception exception)
        {
            Logger.e("Vungle", "error onPause()", exception);
        }
    }

    public void onResume()
    {
        try
        {
            if (a(false, "onResume()"))
            {
                SdkState sdkstate = k;
                Logger.d("VungleAd", "onDeveloperActivityResume()");
                sdkstate.a(true);
                sdkstate.b(false);
            }
            return;
        }
        catch (Exception exception)
        {
            Logger.e("Vungle", "error onResume()", exception);
        }
    }

    public void playAd()
    {
        playAd(null);
    }

    public void playAd(AdConfig adconfig)
    {
        Logger.d("VungleAd", "VunglePub.playAd()");
        if (b())
        {
            AdManager admanager = a;
            adconfig = i.merge(new AdConfig[] {
                h, adconfig
            });
            admanager.f.a(new com.vungle.publisher.ad.AdManager._cls1(admanager, adconfig), com.vungle.publisher.async.ScheduledPriorityExecutor.b.p);
        }
_L1:
        return;
        adconfig;
        Logger.e("VungleAd", "error playing ad", adconfig);
        if (m)
        {
            g.a(new aw());
            return;
        }
          goto _L1
    }

    public transient void removeEventListeners(EventListener aeventlistener[])
    {
        if (!c()) goto _L2; else goto _L1
_L1:
        SdkConfig sdkconfig = j;
        if (aeventlistener == null) goto _L2; else goto _L3
_L3:
        int j1 = aeventlistener.length;
        int i1 = 0;
_L9:
        if (i1 >= j1) goto _L2; else goto _L4
_L4:
        EventListener eventlistener = aeventlistener[i1];
        ca ca1 = (ca)sdkconfig.a.remove(eventlistener);
        boolean flag;
        if (ca1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        Logger.d("VungleConfig", (new StringBuilder("removing event listener ")).append(eventlistener).toString());
        ca1.unregister();
          goto _L7
_L6:
        Logger.d("VungleConfig", (new StringBuilder("event listener not found for remove ")).append(eventlistener).toString());
          goto _L7
        aeventlistener;
        Logger.e("Vungle", "error removing event listeners", aeventlistener);
_L2:
        return;
_L7:
        i1++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public transient void setEventListeners(EventListener aeventlistener[])
    {
        try
        {
            if (c())
            {
                SdkConfig sdkconfig = j;
                sdkconfig.a();
                sdkconfig.a(aeventlistener);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EventListener aeventlistener[])
        {
            Logger.e("Vungle", "error setting event listeners", aeventlistener);
        }
    }
}
