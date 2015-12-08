// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.fragment;

import CF;
import Cf;
import Ch;
import Jd;
import MY;
import Mf;
import OT;
import S;
import V;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.analytics.framework.EasyMetricManager;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.StartupPath;
import com.squareup.otto.Bus;
import ll;

public abstract class SnapchatFragment extends Fragment
    implements OT
{
    public static interface a
    {

        public abstract void b(boolean flag);
    }


    public static final String ARG_KEY_HIDE_ACTION_BAR = "hide_action_bar";
    public static final String ARG_KEY_PAGE_INDEX = "page_index";
    private static final int MESSAGE_WHAT_MARK_FRAGMENT_VISIBLE = 100;
    private static final String TAG = "SnapchatFragment";
    public boolean mAreLargeUiUpdatesEnabled;
    private final Ch mDownloadManager;
    public a mFragmentInterface;
    public View mFragmentLayout;
    public boolean mIsVisible;
    private final ll mLifecycleAnalytics;
    public int mPageIndex;
    public final Handler mSetFragmentVisibleHandler;
    public final WindowConfiguration mWindowConfiguration;

    public SnapchatFragment()
    {
        this(new Handler(Looper.getMainLooper()), Ch.a(), ll.a(), new WindowConfiguration());
    }

    SnapchatFragment(Handler handler, Ch ch, ll ll1, WindowConfiguration windowconfiguration)
    {
        mPageIndex = -1;
        mAreLargeUiUpdatesEnabled = false;
        mSetFragmentVisibleHandler = handler;
        mDownloadManager = ch;
        mLifecycleAnalytics = ll1;
        mWindowConfiguration = windowconfiguration;
    }

    public SnapchatFragment(WindowConfiguration windowconfiguration)
    {
        this(new Handler(Looper.getMainLooper()), Ch.a(), ll.a(), windowconfiguration);
    }

    public FragmentActivity H_()
    {
        return getActivity();
    }

    public final void a(int i, Fragment fragment, String s)
    {
        getFragmentManager().a().b(i, fragment, s).a(s).b();
    }

    public final void a(com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode statusbardrawmode)
    {
        mWindowConfiguration.a(statusbardrawmode);
    }

    public void a_(boolean flag)
    {
    }

    public final boolean ab()
    {
        return mIsVisible;
    }

    public final Window ac()
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null)
        {
            return null;
        } else
        {
            return fragmentactivity.getWindow();
        }
    }

    public final void ad()
    {
        ac().clearFlags(512);
    }

    public final void ae()
    {
        j(true);
        ll ll1 = mLifecycleAnalytics;
        StartupPath startuppath1 = Jd.b();
        StartupPath startuppath = startuppath1;
        if (startuppath1 == StartupPath.FROM_DESTROYED_STATE)
        {
            startuppath = StartupPath.FROM_KILLED_STATE;
        }
        if (ll1.mStartupMetric != null)
        {
            ll1.mStartupMetric.a("type", startuppath);
            ll1.mStartupMetric.a(false);
            ll1.mStartupMetric = null;
        }
        if (ll1.mDeepLinkOpenMetric != null)
        {
            ll1.mDeepLinkOpenMetric.a("type", startuppath);
            ll1.mDeepLinkOpenMetric.b(false);
            ll1.mDeepLinkOpenMetric = null;
        }
        ll1.mAppSessionMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("APP_SESSION").b();
        if (mPageIndex != 2)
        {
            CameraEventAnalytics.a().mEasyMetricManager.b("CAMERA_READY", "");
        }
    }

    public com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BACKGROUND_BEHIND;
    }

    public final Object c(String s)
    {
        return getActivity().getSystemService(s);
    }

    public final View d(int i)
    {
        return mFragmentLayout.findViewById(i);
    }

    public void d()
    {
        mAreLargeUiUpdatesEnabled = true;
    }

    public final boolean d(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            S s1 = getFragmentManager();
            Fragment fragment = s1.a(s);
            if (fragment instanceof SnapchatFragment)
            {
                ((SnapchatFragment)fragment).j(true);
                if (s1.a(s, 0))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public void e()
    {
    }

    public void f(boolean flag)
    {
    }

    public boolean f()
    {
        return false;
    }

    public Cf g()
    {
        return new Cf(new String[] {
            "DEFAULT"
        });
    }

    public final void j(boolean flag)
    {
label0:
        {
            Timber.a(getClass(), (new StringBuilder("markVisibilityChanged - isVisible ")).append(flag).toString(), new Object[0]);
            if (o_())
            {
                setUserVisibleHint(flag);
            }
            if (!flag)
            {
                mSetFragmentVisibleHandler.removeCallbacksAndMessages(null);
            }
            if (mIsVisible != flag)
            {
                if (super.isResumed() || !flag)
                {
                    break label0;
                }
                Timber.f("SnapchatFragment", "Fragment is not yet resumed. Scheduling onVisible for later", new Object[0]);
            }
            return;
        }
        mIsVisible = flag;
        if (flag)
        {
            mDownloadManager.a(g());
            Timber.a(getClass(), "markVisibility -> onVisible()", new Object[0]);
            d();
            onVisible();
            return;
        } else
        {
            Timber.a(getClass(), "markVisibility -> onHidden()", new Object[0]);
            e();
            return;
        }
    }

    public void j_()
    {
        if (o_())
        {
            H_().onBackPressed();
        }
    }

    public CF k()
    {
        return null;
    }

    public boolean k_()
    {
        return false;
    }

    public void m_()
    {
        j(false);
    }

    public boolean o_()
    {
        return super.isAdded();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof a)
        {
            mFragmentInterface = (a)activity;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            mPageIndex = bundle.getInt("page_index", -1);
        }
    }

    public void onDetach()
    {
        super.onDetach();
        mFragmentInterface = null;
    }

    public void onPause()
    {
        super.onPause();
        Mf.a().b(this);
    }

    public void onResume()
    {
        super.onResume();
        Mf.a().c(this);
        Object obj = mWindowConfiguration;
        Window window = ac();
        View view = mFragmentLayout;
        if (!((WindowConfiguration) (obj)).a())
        {
            obj.a = window;
            obj.b = view;
        }
        mWindowConfiguration.a(b());
        obj = getActivity();
        boolean flag;
        if (obj instanceof LandingPageActivity)
        {
            flag = ((LandingPageActivity)obj).a(mPageIndex, this);
        } else
        {
            flag = false;
        }
        Timber.a(getClass(), (new StringBuilder("scheduleTaskForOnVisible() - shouldFragmentBecomeVisible ")).append(flag).toString(), new Object[0]);
        if (flag)
        {
            Handler handler = mSetFragmentVisibleHandler;
            Message message = Message.obtain(mSetFragmentVisibleHandler, new Runnable() {

                final SnapchatFragment this$0;

                public final void run()
                {
                    ae();
                }

            
            {
                this$0 = SnapchatFragment.this;
                super();
            }
            });
            message.what = 100;
            message.obj = this;
            handler.sendMessageAtFrontOfQueue(message);
        }
    }

    public void onVisible()
    {
        mWindowConfiguration.a(b());
        if (k() != null)
        {
            Mf.a().a(new MY());
        }
    }

    public boolean p_()
    {
        return false;
    }

    public long r()
    {
        return -1L;
    }
}
