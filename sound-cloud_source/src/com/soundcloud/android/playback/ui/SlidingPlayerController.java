// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ViewUtils;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerFragment

public class SlidingPlayerController extends DefaultActivityLightCycle
    implements com.sothree.slidinguppanel.SlidingUpPanelLayout.b
{
    private class PlayerCommandSubscriber extends DefaultSubscriber
    {

        final SlidingPlayerController this$0;

        public void onNext(PlayerUICommand playeruicommand)
        {
            if (playeruicommand.isExpand())
            {
                expand();
            } else
            {
                if (playeruicommand.isCollapse())
                {
                    collapse();
                    return;
                }
                if (playeruicommand.isShow())
                {
                    show();
                    return;
                }
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((PlayerUICommand)obj);
        }

        private PlayerCommandSubscriber()
        {
            this$0 = SlidingPlayerController.this;
            super();
        }

        PlayerCommandSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class TrackingDragListener
        implements android.view.View.OnTouchListener
    {

        final SlidingPlayerController this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0)
            {
                wasDragged = false;
            } else
            if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
            {
                wasDragged = true;
                return false;
            }
            return false;
        }

        private TrackingDragListener()
        {
            this$0 = SlidingPlayerController.this;
            super();
        }

        TrackingDragListener(_cls1 _pcls1)
        {
            this();
        }
    }


    public static final String EXTRA_EXPAND_PLAYER = "expand_player";
    private int collapsedStatusColor;
    private final EventBus eventBus;
    private boolean expandOnResume;
    private int expandedStatusColor;
    private final PlayQueueManager playQueueManager;
    private PlayerFragment playerFragment;
    private final Resources resources;
    private SlidingUpPanelLayout slidingPanel;
    private Y subscription;
    private boolean wasDragged;

    public SlidingPlayerController(PlayQueueManager playqueuemanager, Resources resources1, EventBus eventbus)
    {
        subscription = RxUtils.invalidSubscription();
        playQueueManager = playqueuemanager;
        resources = resources1;
        eventBus = eventbus;
    }

    private void collapse()
    {
        slidingPanel.c();
    }

    private void expand()
    {
        SlidingUpPanelLayout slidinguppanellayout = slidingPanel;
        if (slidinguppanellayout.g)
        {
            slidinguppanellayout.d = com.sothree.slidinguppanel.SlidingUpPanelLayout.c.a;
            return;
        } else
        {
            slidinguppanellayout.b(1.0F);
            return;
        }
    }

    private Bundle getCurrentBundle(Activity activity, Bundle bundle)
    {
        if (bundle != null)
        {
            return bundle;
        }
        activity = activity.getIntent();
        if (activity != null)
        {
            return activity.getExtras();
        } else
        {
            return null;
        }
    }

    private PlayerFragment getPlayerFragmentFromActivity(AppCompatActivity appcompatactivity)
    {
        return (PlayerFragment)appcompatactivity.getSupportFragmentManager().findFragmentById(0x7f0f00b6);
    }

    private void hide()
    {
        SlidingUpPanelLayout slidinguppanellayout = slidingPanel;
        if (slidinguppanellayout.g)
        {
            slidinguppanellayout.d = com.sothree.slidinguppanel.SlidingUpPanelLayout.c.d;
        } else
        if (slidinguppanellayout.d != com.sothree.slidinguppanel.SlidingUpPanelLayout.c.e && slidinguppanellayout.d != com.sothree.slidinguppanel.SlidingUpPanelLayout.c.d)
        {
            int j = slidinguppanellayout.a(0.0F);
            int i;
            if (slidinguppanellayout.b)
            {
                i = slidinguppanellayout.a;
            } else
            {
                i = -slidinguppanellayout.a;
            }
            slidinguppanellayout.c(slidinguppanellayout.a(i + j));
            return;
        }
    }

    private void notifyCollapsedState()
    {
        eventBus.publish(EventQueue.PLAYER_UI, PlayerUIEvent.fromPlayerCollapsed());
    }

    private void notifyCurrentState()
    {
        if (slidingPanel.d())
        {
            notifyExpandedState();
            return;
        } else
        {
            notifyCollapsedState();
            return;
        }
    }

    private void notifyExpandedState()
    {
        eventBus.publish(EventQueue.PLAYER_UI, PlayerUIEvent.fromPlayerExpanded());
    }

    private void restoreExpanded()
    {
        setStatusBarColor(expandedStatusColor);
        expand();
        notifyExpandedState();
    }

    private void restorePlayerState()
    {
        showPanelIfNeeded();
        if (expandOnResume)
        {
            restoreExpanded();
            return;
        } else
        {
            notifyCurrentState();
            return;
        }
    }

    private void setStatusBarColor(int i)
    {
        if (shouldColorStatusBar() && playerFragment.isAdded())
        {
            Window window = playerFragment.getActivity().getWindow();
            window.addFlags(0x80000000);
            window.setStatusBarColor(i);
        }
    }

    private boolean shouldColorStatusBar()
    {
        return android.os.Build.VERSION.SDK_INT >= 21 && android.os.Build.VERSION.SDK_INT < 23;
    }

    private boolean shouldExpand(Bundle bundle)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (bundle != null)
        {
            flag = flag1;
            if (bundle.getBoolean("expand_player", false))
            {
                flag = true;
            }
        }
        return flag;
    }

    private void show()
    {
        SlidingUpPanelLayout slidinguppanellayout = slidingPanel;
        if (slidinguppanellayout.g)
        {
            slidinguppanellayout.d = com.sothree.slidinguppanel.SlidingUpPanelLayout.c.b;
        } else
        if (slidinguppanellayout.c != null && slidinguppanellayout.d == com.sothree.slidinguppanel.SlidingUpPanelLayout.c.d)
        {
            slidinguppanellayout.c.setVisibility(0);
            slidinguppanellayout.requestLayout();
            slidinguppanellayout.c(0.0F);
            return;
        }
    }

    private void showPanelIfNeeded()
    {
        boolean flag;
        if (slidingPanel.d == com.sothree.slidinguppanel.SlidingUpPanelLayout.c.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            show();
        }
    }

    private void trackPlayerSlide(UIEvent uievent)
    {
        if (wasDragged)
        {
            wasDragged = false;
            eventBus.publish(EventQueue.TRACKING, uievent);
        }
    }

    public boolean handleBackPressed()
    {
        if (slidingPanel.d())
        {
            collapse();
            eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerClose("back_button"));
            return true;
        } else
        {
            return false;
        }
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        slidingPanel = (SlidingUpPanelLayout)appcompatactivity.findViewById(0x7f0f00b3);
        slidingPanel.f = this;
        slidingPanel.e = true;
        slidingPanel.setOnTouchListener(new TrackingDragListener(null));
        expandOnResume = shouldExpand(getCurrentBundle(appcompatactivity, bundle));
        expandedStatusColor = resources.getColor(0x7f0e00b4);
        collapsedStatusColor = resources.getColor(0x7f0e0002);
        playerFragment = getPlayerFragmentFromActivity(appcompatactivity);
        if (playerFragment == null)
        {
            throw new IllegalArgumentException("Player fragment not found. Make sure it is present with the expected id.");
        } else
        {
            return;
        }
    }

    public volatile void onNewIntent(Activity activity, Intent intent)
    {
        onNewIntent((AppCompatActivity)activity, intent);
    }

    public void onNewIntent(AppCompatActivity appcompatactivity, Intent intent)
    {
        expandOnResume = shouldExpand(intent.getExtras());
    }

    public void onPanelAnchored(View view)
    {
    }

    public void onPanelCollapsed(View view)
    {
        setStatusBarColor(collapsedStatusColor);
        eventBus.publish(EventQueue.PLAYER_UI, PlayerUIEvent.fromPlayerCollapsed());
        trackPlayerSlide(UIEvent.fromPlayerClose("slide"));
    }

    public void onPanelExpanded(View view)
    {
        setStatusBarColor(expandedStatusColor);
        notifyExpandedState();
        trackPlayerSlide(UIEvent.fromPlayerOpen("slide_footer"));
    }

    public void onPanelHidden(View view)
    {
    }

    public void onPanelSlide(View view, float f)
    {
        playerFragment.onPlayerSlide(f);
        setStatusBarColor(ViewUtils.blendColors(collapsedStatusColor, expandedStatusColor, f));
    }

    public volatile void onPause(Activity activity)
    {
        onPause((AppCompatActivity)activity);
    }

    public void onPause(AppCompatActivity appcompatactivity)
    {
        subscription.unsubscribe();
    }

    public volatile void onResume(Activity activity)
    {
        onResume((AppCompatActivity)activity);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        if (playQueueManager.isQueueEmpty())
        {
            hide();
            notifyCurrentState();
        } else
        {
            restorePlayerState();
        }
        expandOnResume = false;
        subscription = eventBus.subscribe(EventQueue.PLAYER_COMMAND, new PlayerCommandSubscriber(null));
    }

    public volatile void onSaveInstanceState(Activity activity, Bundle bundle)
    {
        onSaveInstanceState((AppCompatActivity)activity, bundle);
    }

    public void onSaveInstanceState(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        bundle.putBoolean("expand_player", slidingPanel.d());
    }





/*
    static boolean access$502(SlidingPlayerController slidingplayercontroller, boolean flag)
    {
        slidingplayercontroller.wasDragged = flag;
        return flag;
    }

*/
}
