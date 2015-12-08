// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.AppLaunchAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            SplashView

public class AppLoadingView extends FrameLayout
{

    DialogFlow dialogFlow;
    SplashView splashView;

    public AppLoadingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        splashView.startFadeAnimation();
        splashView.setOnAnimationEndAction(new Action1() {

            final AppLoadingView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                AppLaunchAnalytics.onLoadingAnimationComplete();
                dialogFlow.dismiss(me/lyft/android/ui/landing/LandingDialogs$AppLoadingDialog);
            }

            
            {
                this$0 = AppLoadingView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }
}
