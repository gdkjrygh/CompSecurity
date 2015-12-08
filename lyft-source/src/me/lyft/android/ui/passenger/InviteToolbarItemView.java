// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.concurrent.TimeUnit;
import me.lyft.android.logging.L;
import me.lyft.android.managers.ImageLoader;
import rx.Scheduler;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

public class InviteToolbarItemView extends ImageView
{

    private static final int ANIMATION_DELAY = 10000;
    private static final TimeInterpolator INTERPOLATOR = new OvershootInterpolator();
    ImageLoader imageLoader;
    final rx.Scheduler.Worker worker = AndroidSchedulers.mainThread().createWorker();
    Subscription workerSubscription;

    public InviteToolbarItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        workerSubscription = Subscriptions.empty();
        Scoop.a(this).b(this);
    }

    void animateInInviteMenuItem()
    {
        try
        {
            setScaleY(0.0F);
            setScaleX(0.0F);
            animate().setStartDelay(1000L).scaleX(1.0F).scaleY(1.0F).setDuration(500L).setInterpolator(INTERPOLATOR).start();
            animateShakeInviteMenuItem(1500L);
            return;
        }
        catch (Exception exception)
        {
            L.e(exception, "animateInInviteMenuItem", new Object[0]);
        }
    }

    void animateShakeInviteMenuItem(final long delay)
    {
        workerSubscription.unsubscribe();
        workerSubscription = worker.schedule(new Action0() {

            final InviteToolbarItemView this$0;
            final long val$delay;

            public void call()
            {
                clearAnimation();
                startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040002));
                animateShakeInviteMenuItem(delay + 10000L);
            }

            
            {
                this$0 = InviteToolbarItemView.this;
                delay = l;
                super();
            }
        }, delay, TimeUnit.MILLISECONDS);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        animateInInviteMenuItem();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        imageLoader.cancelRequest(this);
        workerSubscription.unsubscribe();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this, this);
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
        if (i == 0)
        {
            animateInInviteMenuItem();
            return;
        } else
        {
            workerSubscription.unsubscribe();
            return;
        }
    }

}
