// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import IG;
import Jn;
import LQ;
import Mx;
import S;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.analytics.battery.BatteryUsageTimer;
import com.snapchat.android.analytics.framework.EasyMetricManager;
import com.snapchat.android.camera.CameraFragment;
import com.snapchat.android.util.ScrollState;
import com.snapchat.android.util.SnapchatViewPager;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kB;
import kp;
import ly;
import qj;

// Referenced classes of package com.snapchat.android:
//            LandingPageActivity, Timber

final class d extends android.support.v4.view.sageTimer
{

    private int a;
    private int b;
    private int c;
    private boolean d;
    private LandingPageActivity e;

    private void c(int i)
    {
        Object obj1 = ((FragmentActivity) (e)).mFragments;
        boolean flag;
        if (((S) (obj1)).e() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return;
        }
        if (i == b && (b == 1 || b == 3))
        {
            LandingPageActivity.b(e).mEasyMetricManager.b("CAMERA_DELAY", "");
        }
        Object obj = e.a.a(b);
        if (obj != null)
        {
            Fragment fragment;
            boolean flag1;
            if (i != b)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((SnapchatFragment) (obj)).a_(flag1);
        }
        obj = e.a.a(i);
        if (obj != null)
        {
            ((SnapchatFragment) (obj)).j(true);
            obj1 = ((S) (obj1)).f().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                fragment = (Fragment)((Iterator) (obj1)).next();
                if ((fragment instanceof SnapchatFragment) && !((SnapchatFragment) (obj)).equals(fragment))
                {
                    ((SnapchatFragment)fragment).j(false);
                }
            } while (true);
        }
        Timber.f("LandingPageActivity", (new StringBuilder("markFragmentVisibilityChanged to: ")).append(i).append(" from: ").append(b).toString(), new Object[0]);
        b = i;
        if (b == 4)
        {
            LandingPageActivity.h(e);
        }
        obj = e.a;
        ((SnapchatViewPager) (obj)).a(((ViewPager) (obj)).mCurItem, ((SnapchatViewPager) (obj)).getChildCount());
    }

    public final void a(int i)
    {
        a = i;
        if (i != 2)
        {
            e.g.a(new Mx());
        }
        if (c == 0)
        {
            if (b == 2)
            {
                LandingPageActivity.b(e).a(b, a);
            }
            c(a);
        }
        LandingPageActivity.c(e).c = SnapchatViewPager.a(Integer.valueOf(i));
    }

    public final void a(int i, float f, int j)
    {
        if (j == 0)
        {
            if (a == b && d)
            {
                SnapchatFragment snapchatfragment = e.a.a(a);
                if (!e.m())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (snapchatfragment != null && i == 0)
                {
                    snapchatfragment.j(true);
                    if (b == 2)
                    {
                        ((CameraFragment)snapchatfragment).F();
                    }
                }
            }
            d = false;
        } else
        if (!d)
        {
            if (b != 2 && (i == 1 || i == 2))
            {
                LandingPageActivity.b(e).a(com.snapchat.android.analytics.meraContext.SWIPE);
            }
            SnapchatFragment snapchatfragment1;
            boolean flag;
            if (j < e.a.getWidth() / 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = true;
            snapchatfragment1 = e.a.a(a);
            Timber.f("LandingPageActivity", (new StringBuilder("onScrollStart from: ")).append(a).toString(), new Object[0]);
            if (snapchatfragment1 != null)
            {
                snapchatfragment1.f(flag);
                LandingPageActivity.a(e, snapchatfragment1, flag);
                return;
            }
        }
    }

    public final void b(int i)
    {
        Object obj;
        Object obj1;
        long l;
        obj = LandingPageActivity.d(e);
        obj1 = ScrollState.fromViewPagerState(i);
        l = SystemClock.elapsedRealtime();
        pchat.android.util.ScrollState[((ScrollState) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 259
    //                   2 295
    //                   3 295;
           goto _L1 _L2 _L3 _L3
_L1:
        obj.mLastScrollState = ((ScrollState) (obj1));
        if (i != 0) goto _L5; else goto _L4
_L4:
        int j;
        d = false;
        if (LandingPageActivity.e(e).mDeferPause)
        {
            LandingPageActivity.e(e).b(new String[] {
                SnapchatViewPager.a(Integer.valueOf(a)), "HORIZONTAL"
            });
        }
        e.l();
        j = b;
        c(a);
        if (a != 0) goto _L7; else goto _L6
_L6:
        LandingPageActivity.f(e).g = "chat";
_L9:
        AnalyticsEvents.a(j, a);
        LandingPageActivity.b(e).a(j, a);
        obj = LandingPageActivity.g(e);
        j = a;
        obj = ((kp) (obj)).c;
        obj1 = com.snapchat.android.analytics.battery.Type.fromPagerId(j);
        Iterator iterator = ((ly) (obj)).c.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BatteryUsageTimer batteryusagetimer = (BatteryUsageTimer)iterator.next();
            if (batteryusagetimer.b.isPage())
            {
                batteryusagetimer.c();
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        if (((Jn) (obj)).mLastScrollPeriod.a())
        {
            ((Jn) (obj)).mLastScrollPeriod.mEnd = l;
        } else
        {
            ((Jn) (obj)).mLastScrollPeriod.a(l, l);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (((Jn) (obj)).mLastScrollState == ScrollState.IDLE || ((Jn) (obj)).mLastScrollState == ScrollState.UNKNOWN)
        {
            ((Jn) (obj)).mLastScrollPeriod.a(l, 0x7fffffffffffffffL);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (a == 1)
        {
            LandingPageActivity.f(e).g = "feed";
        }
        if (true) goto _L9; else goto _L8
_L8:
        if (obj1 != null)
        {
            ((BatteryUsageTimer)((ly) (obj)).c.get(obj1)).b();
        }
_L5:
        c = i;
        return;
        if (true) goto _L1; else goto _L10
_L10:
    }

    ryUsageTimer(LandingPageActivity landingpageactivity)
    {
        e = landingpageactivity;
        super();
        a = ((ViewPager) (e.a)).mCurItem;
        b = ((ViewPager) (e.a)).mCurItem;
        c = 0;
        d = false;
    }
}
