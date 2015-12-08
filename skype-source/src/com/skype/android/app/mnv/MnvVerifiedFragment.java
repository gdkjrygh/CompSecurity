// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.StallNewUserActivity;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.animator.SpriteAnimator;
import com.skype.android.widget.animator.SquareSpriteAnimator;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvBaseFragment, MnvAnalytics

public class MnvVerifiedFragment extends MnvBaseFragment
    implements android.os.Handler.Callback
{

    private static final int WHAT_SCREEN_TIMEOUT = 1;
    AccessibilityUtil accessibilityUtil;
    private boolean goToNext;
    private Handler handler;
    private boolean isNewUser;
    MnvAnalytics mnvAnalytics;
    private SpriteAnimator spriteAnimator;
    TextView textVerified;

    public MnvVerifiedFragment()
    {
        isNewUser = false;
        goToNext = false;
    }

    private void animateHighFive(View view)
    {
        if (view != null)
        {
            view = (ImageView)ViewUtil.a(view, 0x7f10045d);
            spriteAnimator = new SquareSpriteAnimator(handler, view);
            spriteAnimator.a();
        }
    }

    private void delayVerifiedScreen()
    {
        handler.sendEmptyMessageDelayed(1, 3000L);
    }

    private void handleAccessibility()
    {
        if (accessibilityUtil.a())
        {
            accessibilityUtil.a(handler, textVerified);
        }
    }

    private void launchNextScreen()
    {
        if (isResumed())
        {
            android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
            if (isNewUser)
            {
                startActivity(new Intent(fragmentactivity, com/skype/android/app/shortcircuit/StallNewUserActivity));
                fragmentactivity.finish();
                return;
            } else
            {
                navigateToHome();
                return;
            }
        } else
        {
            goToNext = true;
            return;
        }
    }

    private void logAnalyticsScreenLoad()
    {
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cf);
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            spriteAnimator.b();
            launchNextScreen();
            return true;
        } else
        {
            return false;
        }
    }

    protected void onBackPressed()
    {
        launchNextScreen();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300b6, viewgroup, false);
    }

    public void onResume()
    {
        super.onResume();
        if (goToNext)
        {
            launchNextScreen();
        }
        handleAccessibility();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        PerformanceLog.e.a("APP ACTION: mnv verified screen displayed");
        handler = new Handler(this);
        isNewUser = userPreferences.isNewUser();
        animateHighFive(view);
        delayVerifiedScreen();
        logAnalyticsScreenLoad();
    }
}
