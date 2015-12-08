// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.skype.android.app.LayoutExperience;
import com.skype.android.util.PropertyAnimationUtil;
import java.lang.ref.WeakReference;

// Referenced classes of package com.skype.android.app.calling:
//            InCallFragment, CallControlsAnimator, VideoFacade, CallControlsView

final class a
    implements CallControlsAnimator.CallControlsAnimationListener
{

    private PropertyAnimationUtil animationUtil;
    private CallControlsView callControls;
    private CallControlsAnimator callControlsAnimator;
    private int globalViewPadding;
    private int globalViewTopPadding;
    private InCallFragment incall;
    private LayoutExperience layoutExperience;
    private WeakReference videoFacadeWeakRef;
    private int viewHeight;
    private int viewWidth;

    a(InCallFragment incallfragment, VideoFacade videofacade, LayoutExperience layoutexperience)
    {
        incall = incallfragment;
        animationUtil = incallfragment.animationUtil;
        callControls = incallfragment.callControls;
        callControlsAnimator = new CallControlsAnimator(callControls);
        callControlsAnimator.setCallControlsAnimationListener(this);
        videoFacadeWeakRef = new WeakReference(videofacade);
        layoutExperience = layoutexperience;
        globalViewPadding = getResources().getDimensionPixelSize(0x7f0c021b);
        globalViewTopPadding = globalViewPadding + incallfragment.getResources().getDimensionPixelSize(0x7f0c0002);
        incallfragment.getView().getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final a this$0;

            public final void onGlobalLayout()
            {
                View view = incall.getView();
                if (view != null)
                {
                    int i = view.getWidth();
                    int j = view.getHeight();
                    if (viewWidth != i || viewHeight != j)
                    {
                        animateOverlayWithCallControls();
                        InCallFragment.ActivityCallback activitycallback = incall.getActivityCallback();
                        boolean flag;
                        if (callControls.getVisibility() == 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        activitycallback.setCallControlsVisible(flag);
                        viewWidth = i;
                        viewHeight = j;
                    }
                }
            }

            
            {
                this$0 = a.this;
                super();
            }
        });
    }

    private void animateOverlayWithCallControls(int i, boolean flag)
    {
        VideoFacade videofacade = (VideoFacade)videoFacadeWeakRef.get();
        if (videofacade != null && incall.getView() != null)
        {
            int k = incall.getView().getWidth();
            int l = incall.getView().getHeight();
            if (l != 0 && k != 0)
            {
                Rect rect = callControls.getRect();
                int j;
                if (flag)
                {
                    i = rect.height() - i;
                } else
                {
                    i = 0;
                }
                if (isMuted())
                {
                    j = incall.mutedButton.getHeight();
                } else
                {
                    j = 0;
                }
                i = Math.max(i, j);
                videofacade.setOverlayLayoutParams(new Rect(globalViewPadding, globalViewTopPadding, k - globalViewPadding, l - globalViewPadding - i));
                return;
            }
        }
    }

    private void animateOverlayWithCallControls(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = callControls.getHeight();
        }
        animateOverlayWithCallControls(i, flag);
    }

    private boolean areCallControlsShowing()
    {
        return callControls.getVisibility() == 0;
    }

    private Resources getResources()
    {
        return callControls.getContext().getResources();
    }

    private boolean isMuted()
    {
        return incall.isMicrophoneMuted();
    }

    private boolean isPortrait()
    {
        return getResources().getConfiguration().orientation == 1;
    }

    public final void animateOverlayWithCallControls()
    {
        int i;
        if (areCallControlsShowing())
        {
            i = 0;
        } else
        {
            i = callControls.getHeight();
        }
        animateOverlayWithCallControls(i, areCallControlsShowing());
    }

    final void cancelAnimation()
    {
        callControlsAnimator.cancelAnimation();
    }

    public final void onCallControlsAnimationEnd(boolean flag)
    {
        InCallFragment.ActivityCallback activitycallback = incall.getActivityCallback();
        if (activitycallback != null)
        {
            activitycallback.setCallControlsVisible(flag);
        }
        animateOverlayWithCallControls(flag);
    }

    public final void onCallControlsAnimationStart()
    {
    }

    public final void onCallControlsAnimationUpdate(int i)
    {
        animateOverlayWithCallControls(i, true);
    }

    final void showControls(boolean flag, android.animation.Animator.AnimatorListener animatorlistener)
    {
        videoFacadeWeakRef.get();
        callControlsAnimator.animateVisibility(flag, animatorlistener);
        animateOverlayWithCallControls(flag);
        animatorlistener = animationUtil;
        ImageView imageview = incall.skypeLogo;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        animatorlistener.a(imageview, flag);
        incall.skypeLogo.bringToFront();
        callControls.bringToFront();
        if (incall.transcribedMessagesContainer.getVisibility() == 0)
        {
            incall.transcribedMessagesContainer.bringToFront();
        }
    }




/*
    static int access$102(a a1, int i)
    {
        a1.viewWidth = i;
        return i;
    }

*/



/*
    static int access$202(a a1, int i)
    {
        a1.viewHeight = i;
        return i;
    }

*/

}
