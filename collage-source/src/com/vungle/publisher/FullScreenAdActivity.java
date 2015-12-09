// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.vungle.log.Logger;
import com.vungle.publisher.ad.AdManager;
import com.vungle.publisher.db.model.Ad;
import com.vungle.publisher.db.model.LocalAd;
import com.vungle.publisher.db.model.LocalArchive;
import com.vungle.publisher.db.model.Video;
import com.vungle.publisher.display.view.AdFragment;
import com.vungle.publisher.display.view.PostRollFragment;
import com.vungle.publisher.display.view.VideoFragment;
import com.vungle.publisher.env.SdkState;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.inject.Injector;
import com.vungle.publisher.reporting.AdReportEventListener;
import com.vungle.publisher.util.IntentFactory;
import dagger.ObjectGraph;
import java.io.File;
import java.net.URI;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher:
//            z, br, bt, a, 
//            be, bd, d, az, 
//            ag, cc, Orientation, by, 
//            g, h, ac, al, 
//            am, ar, x, y

public class FullScreenAdActivity extends FragmentActivity
{
    public static class AdEventListener extends by
    {

        private FullScreenAdActivity a;

        static FullScreenAdActivity a(AdEventListener adeventlistener, FullScreenAdActivity fullscreenadactivity)
        {
            adeventlistener.a = fullscreenadactivity;
            return fullscreenadactivity;
        }

        public void onEvent(ac ac)
        {
            ac = a;
            try
            {
                Intent intent = IntentFactory.a("android.intent.action.VIEW", Uri.parse("https://www.vungle.com/privacy/"));
                intent.addFlags(0x10000000);
                ac.startActivity(intent);
                return;
            }
            catch (Exception exception)
            {
                ((FullScreenAdActivity) (ac)).l.a("VungleAd", "error loading privacy URL", exception);
            }
        }

        public void onEvent(al al)
        {
            Logger.v("VungleEvent", "video.onCancel()");
            a.a();
        }

        public void onEvent(am am)
        {
            Logger.v("VungleEvent", "video.onNext()");
            a.a();
        }

        public void onEvent(ar ar)
        {
            a.a(false, false);
        }

        public void onEvent(g g1)
        {
            FullScreenAdActivity fullscreenadactivity;
            com.vungle.publisher.db.model.EventTracking.a a1;
            boolean flag;
            a1 = g1.a;
            Logger.v("VungleEvent", (new StringBuilder("cta click event: ")).append(a1).toString());
            fullscreenadactivity = a;
            g1 = null;
            flag = false;
            String s = fullscreenadactivity.a.f();
            g1 = s;
            Logger.v("VungleAd", (new StringBuilder("call to action destination ")).append(s).toString());
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_126;
            }
            g1 = s;
            Intent intent = IntentFactory.a("android.intent.action.VIEW", Uri.parse(s));
            g1 = s;
            intent.addFlags(0x10000000);
            g1 = s;
            fullscreenadactivity.startActivity(intent);
            g1 = s;
            fullscreenadactivity.g.a(new h(fullscreenadactivity.a, a1));
            flag = true;
_L2:
            fullscreenadactivity.a(flag, true);
            return;
            Exception exception;
            exception;
            fullscreenadactivity.l.a("VungleAd", (new StringBuilder("error loading call-to-action URL ")).append(g1).toString(), exception);
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onEvent(x x)
        {
            Logger.v("VungleEvent", "postRoll.onCancel()");
            a.a(true, false);
        }

        public void onEvent(y y)
        {
            Logger.v("VungleEvent", "postRoll.onRepeat()");
            a.b();
        }

        AdEventListener()
        {
        }
    }

    public static class AdEventListener.Factory
    {

        AdEventListener a;

        public AdEventListener getInstance(FullScreenAdActivity fullscreenadactivity)
        {
            AdEventListener.a(a, fullscreenadactivity);
            return a;
        }

        public AdEventListener.Factory()
        {
        }
    }


    public static final String AD_CONFIG_EXTRA_KEY = "adConfig";
    public static final String AD_ID_EXTRA_KEY = "adId";
    Ad a;
    AdReportEventListener b;
    AdEventListener.Factory c;
    AdManager d;
    com.vungle.publisher.reporting.AdReportEventListener.Factory e;
    bt f;
    EventBus g;
    com.vungle.publisher.display.view.VideoFragment.Factory h;
    com.vungle.publisher.display.view.PostRollFragment.Factory i;
    SdkState j;
    IntentFactory k;
    com.vungle.publisher.db.model.LoggedException.Factory l;
    private AdFragment m;
    private PostRollFragment n;
    private View o;
    private VideoFragment p;
    private AdEventListener q;

    public FullScreenAdActivity()
    {
    }

    private void a(AdFragment adfragment)
    {
        if (adfragment != m)
        {
            FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
            fragmenttransaction.setCustomAnimations(0x10a0000, 0x10a0001);
            m = adfragment;
            fragmenttransaction.replace(0x1020002, adfragment, adfragment.b());
            fragmenttransaction.commit();
        }
    }

    final void a()
    {
        if (n == null)
        {
            a(true, false);
            return;
        } else
        {
            g.a(new z());
            a(((AdFragment) (n)));
            return;
        }
    }

    final void a(a a1)
    {
        if (f.a(br.b) && a1.isImmersiveMode())
        {
            o.setSystemUiVisibility(5894);
            o.setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener(a1) {

                final a a;
                final FullScreenAdActivity b;

                public final void onSystemUiVisibilityChange(int i1)
                {
                    if ((i1 & 4) == 0)
                    {
                        b.a(a);
                    }
                }

            
            {
                b = FullScreenAdActivity.this;
                a = a1;
                super();
            }
            });
        }
    }

    final void a(boolean flag, boolean flag1)
    {
        EventBus eventbus = g;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        Object obj = new be(a, flag1);
_L1:
        eventbus.a(obj);
        finish();
        return;
        obj = new bd(a, flag1);
          goto _L1
        Object obj1;
        obj1;
        Logger.e("VungleAd", "error exiting ad", ((Throwable) (obj1)));
        finish();
        return;
        obj1;
        finish();
        throw obj1;
    }

    final void b()
    {
        if (p == null)
        {
            a();
            return;
        } else
        {
            a(p);
            return;
        }
    }

    public void onBackPressed()
    {
        try
        {
            Logger.v("VungleAd", "back button pressed");
            g.a(new d());
            m.a();
            return;
        }
        catch (Exception exception)
        {
            l.a("VungleAd", "error in onBackPressed", exception);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        LocalAd localad;
        String s;
        a a1;
        Object obj3;
        Logger.d("VungleAd", "interstital ad");
        super.onCreate(bundle);
        Injector.getInstance().a.inject(this);
        Intent intent = getIntent();
        a1 = (a)intent.getParcelableExtra("adConfig");
        s = intent.getStringExtra("adId");
        obj3 = d;
        localad = ((AdManager) (obj3)).g.a(s);
        Object obj;
        obj = localad;
        if (localad != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        obj = ((AdManager) (obj3)).n.a(s);
        a = ((Ad) (obj));
        byte byte0;
        if (obj == null)
        {
            static final class _cls2
            {

                static final int a[];

                static 
                {
                    a = new int[Orientation.values().length];
                    try
                    {
                        a[Orientation.autoRotate.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[Orientation.matchVideo.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            Object obj1;
            Object obj2;
            Object obj4;
            try
            {
                Logger.w("VungleAd", "no ad in activity");
                g.a(new az());
                finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Logger.e("VungleAd", "error playing ad", bundle);
            }
            a(false, false);
            return;
        }
        o = getWindow().getDecorView();
        obj3 = ((Ad) (obj)).k();
        q = c.getInstance(this);
        obj1 = e;
        ((com.vungle.publisher.reporting.AdReportEventListener.Factory) (obj1)).a.a(((Ad) (obj)));
        b = ((com.vungle.publisher.reporting.AdReportEventListener.Factory) (obj1)).a;
        q.registerOnce();
        b.registerOnce();
        boolean flag;
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        g.a(new ag(((Ad) (obj)), a1));
        obj4 = h;
        obj2 = com.vungle.publisher.display.view.VideoFragment.Factory.a(this);
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        obj1 = (VideoFragment)((com.vungle.publisher.display.view.VideoFragment.Factory) (obj4)).a.get();
        p = com.vungle.publisher.display.view.VideoFragment.Factory.a(((VideoFragment) (obj1)), ((Ad) (obj)), a1);
        if (!(obj instanceof LocalAd))
        {
            break MISSING_BLOCK_LABEL_349;
        }
        obj = ((LocalAd)obj).u();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        obj2 = (new File(cc.a(new Object[] {
            ((LocalArchive) (obj)).j(), "index.html"
        }))).toURI().toString();
        obj4 = i;
        obj1 = com.vungle.publisher.display.view.PostRollFragment.Factory.a(this);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        obj = (PostRollFragment)((com.vungle.publisher.display.view.PostRollFragment.Factory) (obj4)).a.get();
        n = com.vungle.publisher.display.view.PostRollFragment.Factory.a(((PostRollFragment) (obj)), ((String) (obj2)));
        a(a1);
        obj = a1.getOrientation();
        _cls2.a[((Orientation) (obj)).ordinal()];
        JVM INSTR tableswitch 1 1: default 667
    //                   1 520;
           goto _L1 _L2
_L1:
        if (((Video) (obj3)).g != null && ((Video) (obj3)).n != null && ((Video) (obj3)).n.intValue() > ((Video) (obj3)).g.intValue())
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 == 0) goto _L4; else goto _L3
_L3:
        Logger.d("VungleAd", (new StringBuilder("ad orientation ")).append(obj).append(" (landscape)").toString());
        byte0 = 6;
_L8:
        setRequestedOrientation(byte0);
        if (!flag) goto _L6; else goto _L5
_L5:
        bundle = bundle.getString("currentFragment");
_L11:
        if ("postRollFragment".equals(bundle))
        {
            a();
            return;
        }
          goto _L7
_L2:
        Logger.d("VungleAd", (new StringBuilder("ad orientation ")).append(obj).toString());
        byte0 = 10;
          goto _L8
_L4:
        if (((Video) (obj3)).g != null && ((Video) (obj3)).n != null && ((Video) (obj3)).g.intValue() > ((Video) (obj3)).n.intValue())
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 == 0) goto _L10; else goto _L9
_L9:
        Logger.d("VungleAd", (new StringBuilder("ad orientation ")).append(obj).append(" (portrait)").toString());
        byte0 = 7;
          goto _L8
_L10:
        Logger.d("VungleAd", (new StringBuilder("ad orientation ")).append(obj).append(" (unknown) --> auto-rotate").toString());
        byte0 = 10;
          goto _L8
_L7:
        b();
        return;
_L6:
        bundle = null;
          goto _L11
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        m.a(i1);
        return super.onKeyDown(i1, keyevent);
    }

    protected void onPause()
    {
        try
        {
            super.onPause();
            SdkState sdkstate = j;
            Logger.d("VungleAd", "onAdActivityPause()");
            sdkstate.m = sdkstate.f();
            return;
        }
        catch (Exception exception)
        {
            l.a("VungleAd", "error in onPause()", exception);
        }
    }

    protected void onResume()
    {
        try
        {
            super.onResume();
            SdkState sdkstate = j;
            Logger.d("VungleAd", "onAdActivityResume()");
            sdkstate.a(false);
            sdkstate.m = 0L;
            return;
        }
        catch (Exception exception)
        {
            l.a("VungleAd", "error in onResume()", exception);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            super.onSaveInstanceState(bundle);
            bundle.putString("currentFragment", m.b());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            l.a("VungleAd", "error in onSaveInstanceState", bundle);
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        try
        {
            super.onWindowFocusChanged(flag);
            m.a(flag);
            return;
        }
        catch (Exception exception)
        {
            l.a("VungleAd", "error in onWindowFocusChanged", exception);
        }
    }
}
