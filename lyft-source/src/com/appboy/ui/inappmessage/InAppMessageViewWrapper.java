// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.appboy.Constants;
import com.appboy.enums.inappmessage.DismissType;
import com.appboy.enums.inappmessage.SlideFrom;
import com.appboy.models.IInAppMessage;
import com.appboy.models.IInAppMessageHtml;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.models.MessageButton;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.ui.inappmessage.listeners.SimpleSwipeDismissTouchListener;
import com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.appboy.ui.support.AnimationUtils;
import com.appboy.ui.support.ViewUtils;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            InAppMessageCloser

public class InAppMessageViewWrapper
{

    private static final String TAG;
    private List mButtons;
    private View mClickableInAppMessageView;
    private View mCloseButton;
    private final Animation mClosingAnimation;
    private Runnable mDismissRunnable;
    private final IInAppMessage mInAppMessage;
    private final View mInAppMessageView;
    private final IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener;
    private boolean mIsAnimatingClose;
    private final Animation mOpeningAnimation;

    public InAppMessageViewWrapper(View view, IInAppMessage iinappmessage, IInAppMessageViewLifecycleListener iinappmessageviewlifecyclelistener, Animation animation, Animation animation1, View view1)
    {
        mInAppMessageView = view;
        mInAppMessage = iinappmessage;
        mInAppMessageViewLifecycleListener = iinappmessageviewlifecyclelistener;
        mIsAnimatingClose = false;
        if (view1 != null)
        {
            mClickableInAppMessageView = view1;
        } else
        {
            mClickableInAppMessageView = mInAppMessageView;
        }
        if (android.os.Build.VERSION.SDK_INT < 12 || !(mInAppMessage instanceof InAppMessageSlideup)) goto _L2; else goto _L1
_L1:
        view = new TouchAwareSwipeDismissTouchListener(view, null, createDismissCallbacks());
        view.setTouchListener(createTouchAwareListener());
        mClickableInAppMessageView.setOnTouchListener(view);
_L4:
        mOpeningAnimation = animation;
        mClosingAnimation = animation1;
        mClickableInAppMessageView.setOnClickListener(createClickListener());
        return;
_L2:
        if (mInAppMessage instanceof InAppMessageSlideup)
        {
            mClickableInAppMessageView.setOnTouchListener(getSimpleSwipeListener());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public InAppMessageViewWrapper(View view, IInAppMessage iinappmessage, IInAppMessageViewLifecycleListener iinappmessageviewlifecyclelistener, Animation animation, Animation animation1, View view1, List list, 
            View view2)
    {
        this(view, iinappmessage, iinappmessageviewlifecyclelistener, animation, animation1, view1);
        if (view2 != null)
        {
            mCloseButton = view2;
            mCloseButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        if (list != null)
        {
            mButtons = list;
            for (view = mButtons.iterator(); view.hasNext(); ((View)view.next()).setOnClickListener(createButtonClickListener())) { }
        }
    }

    private void addDismissRunnable()
    {
        if (mDismissRunnable == null)
        {
            mDismissRunnable = new Runnable() {

                final InAppMessageViewWrapper this$0;

                public void run()
                {
                    mInAppMessageViewLifecycleListener.onDismissed(mInAppMessageView, mInAppMessage);
                    close();
                }

            
            {
                this$0 = InAppMessageViewWrapper.this;
                super();
            }
            };
            mInAppMessageView.postDelayed(mDismissRunnable, mInAppMessage.getDurationInMilliseconds());
        }
    }

    private void addViewToLayout(FrameLayout framelayout)
    {
        AppboyLogger.d(TAG, "Adding In-app message view to root FrameLayout.");
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        if (mInAppMessage instanceof InAppMessageSlideup)
        {
            int i;
            if (((InAppMessageSlideup)mInAppMessage).getSlideFrom() == SlideFrom.TOP)
            {
                i = 48;
            } else
            {
                i = 80;
            }
            layoutparams.gravity = i;
        }
        if ((mInAppMessage instanceof IInAppMessageImmersive) || (mInAppMessage instanceof IInAppMessageHtml))
        {
            mInAppMessageView.setFocusableInTouchMode(true);
            mInAppMessageView.requestFocus();
        }
        framelayout.addView(mInAppMessageView, layoutparams);
    }

    private android.view.animation.Animation.AnimationListener createAnimationListener(boolean flag)
    {
        if (flag)
        {
            return new android.view.animation.Animation.AnimationListener() {

                final InAppMessageViewWrapper this$0;

                public void onAnimationEnd(Animation animation)
                {
                    mInAppMessageView.setVisibility(0);
                    mInAppMessageView.setClickable(true);
                    if (mInAppMessage.getDismissType() == DismissType.AUTO_DISMISS)
                    {
                        addDismissRunnable();
                    }
                    AppboyLogger.d(InAppMessageViewWrapper.TAG, "In-app message animated into view.");
                    mInAppMessageViewLifecycleListener.afterOpened(mInAppMessageView, mInAppMessage);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                    mInAppMessageView.setClickable(false);
                }

            
            {
                this$0 = InAppMessageViewWrapper.this;
                super();
            }
            };
        } else
        {
            return new android.view.animation.Animation.AnimationListener() {

                final InAppMessageViewWrapper this$0;

                public void onAnimationEnd(Animation animation)
                {
                    mInAppMessageView.clearAnimation();
                    mInAppMessageView.setVisibility(8);
                    mInAppMessageView.setClickable(true);
                    ViewUtils.removeViewFromParent(mInAppMessageView);
                    mInAppMessageViewLifecycleListener.afterClosed(mInAppMessage);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                    mInAppMessageView.setClickable(false);
                }

            
            {
                this$0 = InAppMessageViewWrapper.this;
                super();
            }
            };
        }
    }

    private android.view.View.OnClickListener createButtonClickListener()
    {
        return new android.view.View.OnClickListener() {

            final InAppMessageViewWrapper this$0;

            public void onClick(View view)
            {
                IInAppMessageImmersive iinappmessageimmersive = (IInAppMessageImmersive)mInAppMessage;
                int i = 0;
                do
                {
label0:
                    {
                        if (i < mButtons.size())
                        {
                            if (view.getId() != ((View)mButtons.get(i)).getId())
                            {
                                break label0;
                            }
                            view = (MessageButton)iinappmessageimmersive.getMessageButtons().get(i);
                            mInAppMessageViewLifecycleListener.onButtonClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), view, iinappmessageimmersive);
                        }
                        return;
                    }
                    i++;
                } while (true);
            }

            
            {
                this$0 = InAppMessageViewWrapper.this;
                super();
            }
        };
    }

    private android.view.View.OnClickListener createClickListener()
    {
        return new android.view.View.OnClickListener() {

            final InAppMessageViewWrapper this$0;

            public void onClick(View view)
            {
                if (mInAppMessage instanceof IInAppMessageImmersive)
                {
                    view = (IInAppMessageImmersive)mInAppMessage;
                    if (view.getMessageButtons() == null || view.getMessageButtons().size() == 0)
                    {
                        mInAppMessageViewLifecycleListener.onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), mInAppMessageView, mInAppMessage);
                    }
                    return;
                } else
                {
                    mInAppMessageViewLifecycleListener.onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), mInAppMessageView, mInAppMessage);
                    return;
                }
            }

            
            {
                this$0 = InAppMessageViewWrapper.this;
                super();
            }
        };
    }

    private android.view.View.OnClickListener createCloseInAppMessageClickListener()
    {
        return new android.view.View.OnClickListener() {

            final InAppMessageViewWrapper this$0;

            public void onClick(View view)
            {
                mInAppMessageViewLifecycleListener.onDismissed(mInAppMessageView, mInAppMessage);
                close();
            }

            
            {
                this$0 = InAppMessageViewWrapper.this;
                super();
            }
        };
    }

    private com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks()
    {
        return new com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks() {

            final InAppMessageViewWrapper this$0;

            public boolean canDismiss(Object obj)
            {
                return true;
            }

            public void onDismiss(View view, Object obj)
            {
                mInAppMessageViewLifecycleListener.onDismissed(mInAppMessageView, mInAppMessage);
                mInAppMessage.setAnimateOut(false);
                close();
            }

            
            {
                this$0 = InAppMessageViewWrapper.this;
                super();
            }
        };
    }

    private com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener()
    {
        return new com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener() {

            final InAppMessageViewWrapper this$0;

            public void onTouchEnded()
            {
                if (mInAppMessage.getDismissType() == DismissType.AUTO_DISMISS)
                {
                    addDismissRunnable();
                }
            }

            public void onTouchStartedOrContinued()
            {
                mInAppMessageView.removeCallbacks(mDismissRunnable);
            }

            
            {
                this$0 = InAppMessageViewWrapper.this;
                super();
            }
        };
    }

    private void display()
    {
        if (mInAppMessage.getAnimateIn())
        {
            AppboyLogger.d(TAG, "In-app message view will animate into the visible area.");
            setAndStartAnimation(true);
            return;
        }
        AppboyLogger.d(TAG, "In-app message view will be placed instantly into the visible area.");
        if (mInAppMessage.getDismissType() == DismissType.AUTO_DISMISS)
        {
            addDismissRunnable();
        }
        mInAppMessageViewLifecycleListener.afterOpened(mInAppMessageView, mInAppMessage);
    }

    private SimpleSwipeDismissTouchListener getSimpleSwipeListener()
    {
        return new SimpleSwipeDismissTouchListener(mInAppMessageView.getContext()) {

            private final long sSwipeAnimationDurationMillis = 400L;
            final InAppMessageViewWrapper this$0;

            private void animateAndClose(Animation animation)
            {
                mInAppMessageViewLifecycleListener.onDismissed(mInAppMessageView, mInAppMessage);
                preClose();
                mInAppMessageView.clearAnimation();
                mInAppMessageView.setAnimation(animation);
                animation.startNow();
                mInAppMessageView.invalidate();
                mInAppMessage.setAnimateOut(false);
                performClose();
            }

            public void onSwipeLeft()
            {
                animateAndClose(AnimationUtils.createHorizontalAnimation(0.0F, -1F, 400L, false));
            }

            public void onSwipeRight()
            {
                animateAndClose(AnimationUtils.createHorizontalAnimation(0.0F, 1.0F, 400L, false));
            }

            
            {
                this$0 = InAppMessageViewWrapper.this;
                super(context);
            }
        };
    }

    private void performClose()
    {
        if (mInAppMessage.getAnimateOut())
        {
            mIsAnimatingClose = true;
            setAndStartAnimation(false);
            return;
        } else
        {
            ViewUtils.removeViewFromParent(mInAppMessageView);
            mInAppMessageViewLifecycleListener.afterClosed(mInAppMessage);
            return;
        }
    }

    private void preClose()
    {
        mInAppMessageView.removeCallbacks(mDismissRunnable);
        mInAppMessageViewLifecycleListener.beforeClosed(mInAppMessageView, mInAppMessage);
    }

    private void setAndStartAnimation(boolean flag)
    {
        Animation animation;
        if (flag)
        {
            animation = mOpeningAnimation;
        } else
        {
            animation = mClosingAnimation;
        }
        animation.setAnimationListener(createAnimationListener(flag));
        mInAppMessageView.clearAnimation();
        mInAppMessageView.setAnimation(animation);
        animation.startNow();
        mInAppMessageView.invalidate();
    }

    public void callAfterClosed()
    {
        mInAppMessageViewLifecycleListener.afterClosed(mInAppMessage);
    }

    public void callOnDismissed()
    {
        mInAppMessageViewLifecycleListener.onDismissed(mInAppMessageView, mInAppMessage);
    }

    public void close()
    {
        preClose();
        performClose();
    }

    public IInAppMessage getInAppMessage()
    {
        return mInAppMessage;
    }

    public View getInAppMessageView()
    {
        return mInAppMessageView;
    }

    public boolean getIsAnimatingClose()
    {
        return mIsAnimatingClose;
    }

    public void open(FrameLayout framelayout)
    {
        mInAppMessageViewLifecycleListener.beforeOpened(mInAppMessageView, mInAppMessage);
        addViewToLayout(framelayout);
        display();
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/inappmessage/InAppMessageViewWrapper.getName()
        });
    }









}
