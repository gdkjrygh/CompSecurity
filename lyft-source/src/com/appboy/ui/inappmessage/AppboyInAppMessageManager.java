// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.appboy.Appboy;
import com.appboy.Constants;
import com.appboy.IAppboyNavigator;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.enums.inappmessage.SlideFrom;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.models.IInAppMessage;
import com.appboy.models.IInAppMessageHtml;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.models.InAppMessageFull;
import com.appboy.models.InAppMessageHtmlFull;
import com.appboy.models.InAppMessageModal;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.models.MessageButton;
import com.appboy.support.AppboyLogger;
import com.appboy.support.BundleUtils;
import com.appboy.ui.AppboyNavigator;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageFullView;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlFullView;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageModalView;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageSlideupView;
import com.appboy.ui.support.AnimationUtils;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.appboy.ui.support.ViewUtils;
import com.appboy.ui.support.WebContentUtils;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.appboy.ui.inappmessage:
//            IInAppMessageViewFactory, IInAppMessageAnimationFactory, IInAppMessageImmersiveView, InAppMessageViewWrapper, 
//            IInAppMessageView, InAppMessageOperation, InAppMessageCloser, InAppMessageWebViewClient

public final class AppboyInAppMessageManager
{

    private static final String TAG;
    private static volatile AppboyInAppMessageManager sInstance = null;
    private Activity mActivity;
    private boolean mCanUseFresco;
    private IInAppMessage mCarryoverInAppMessageBase;
    private IHtmlInAppMessageActionListener mCustomHtmlInAppMessageActionListener;
    private IInAppMessageAnimationFactory mCustomInAppMessageAnimationFactory;
    private IInAppMessageManagerListener mCustomInAppMessageManagerListener;
    private IInAppMessageViewFactory mCustomInAppMessageViewFactory;
    private final IAppboyNavigator mDefaultAppboyNavigator = new AppboyNavigator();
    private IHtmlInAppMessageActionListener mDefaultHtmlInAppMessageActionListener;
    private IInAppMessageManagerListener mDefaultInAppMessageManagerListener;
    private AtomicBoolean mDisplayingInAppMessage;
    private IInAppMessageAnimationFactory mInAppMessageAnimationFactory;
    private final Stack mInAppMessageBaseStack = new Stack();
    private IEventSubscriber mInAppMessageEventSubscriber;
    private IInAppMessageViewFactory mInAppMessageFullViewFactory;
    private IInAppMessageViewFactory mInAppMessageHtmlFullViewFactory;
    private IInAppMessageViewFactory mInAppMessageModalViewFactory;
    private IInAppMessageViewFactory mInAppMessageSlideupViewFactory;
    private final IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener = new IInAppMessageViewLifecycleListener() {

        final AppboyInAppMessageManager this$0;

        private void performClickAction(ClickAction clickaction, IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser, Uri uri)
        {
            if (mActivity == null)
            {
                AppboyLogger.e(AppboyInAppMessageManager.TAG, "No activity is currently registered to receive in-app messages. Doing nothing.");
                return;
            }
            switch (_cls13..SwitchMap.com.appboy.enums.inappmessage.ClickAction[clickaction.ordinal()])
            {
            default:
                inappmessagecloser.close(false);
                return;

            case 1: // '\001'
                iinappmessage.setAnimateOut(false);
                inappmessagecloser.close(false);
                getAppboyNavigator().gotoNewsFeed(mActivity, BundleUtils.mapToBundle(iinappmessage.getExtras()));
                return;

            case 2: // '\002'
                iinappmessage.setAnimateOut(false);
                inappmessagecloser.close(false);
                ActionFactory.createUriAction(mActivity, uri.toString()).execute(mActivity);
                return;

            case 3: // '\003'
                inappmessagecloser.close(true);
                break;
            }
        }

        private void performInAppMessageButtonClicked(MessageButton messagebutton, IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser)
        {
            performClickAction(messagebutton.getClickAction(), iinappmessage, inappmessagecloser, messagebutton.getUri());
        }

        private void performInAppMessageClicked(IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser)
        {
            performClickAction(iinappmessage.getClickAction(), iinappmessage, inappmessagecloser, iinappmessage.getUri());
        }

        public void afterClosed(IInAppMessage iinappmessage)
        {
            mInAppMessageViewWrapper = null;
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterClosed called.");
            mDisplayingInAppMessage.set(false);
            if (iinappmessage instanceof IInAppMessageHtml)
            {
                startClearHtmlInAppMessageAssetsThread((IInAppMessageHtml)iinappmessage);
            }
        }

        public void afterOpened(View view, IInAppMessage iinappmessage)
        {
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterOpened called.");
        }

        public void beforeClosed(View view, IInAppMessage iinappmessage)
        {
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeClosed called.");
        }

        public void beforeOpened(View view, IInAppMessage iinappmessage)
        {
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeOpened called.");
            iinappmessage.logImpression();
        }

        public void onButtonClicked(InAppMessageCloser inappmessagecloser, MessageButton messagebutton, IInAppMessageImmersive iinappmessageimmersive)
        {
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onButtonClicked called.");
            if (messagebutton.getClickAction() != ClickAction.NONE)
            {
                iinappmessageimmersive.logButtonClick(messagebutton);
            }
            if (!getInAppMessageManagerListener().onInAppMessageButtonClicked(messagebutton, inappmessagecloser))
            {
                performInAppMessageButtonClicked(messagebutton, iinappmessageimmersive, inappmessagecloser);
            }
        }

        public void onClicked(InAppMessageCloser inappmessagecloser, View view, IInAppMessage iinappmessage)
        {
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onClicked called.");
            if (iinappmessage.getClickAction() != ClickAction.NONE)
            {
                iinappmessage.logClick();
            }
            if (!getInAppMessageManagerListener().onInAppMessageClicked(iinappmessage, inappmessagecloser))
            {
                performInAppMessageClicked(iinappmessage, inappmessagecloser);
            }
        }

        public void onDismissed(View view, IInAppMessage iinappmessage)
        {
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onDismissed called.");
            getInAppMessageManagerListener().onInAppMessageDismissed(iinappmessage);
        }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                super();
            }
    };
    private InAppMessageViewWrapper mInAppMessageViewWrapper;
    private final IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener = new IInAppMessageWebViewClientListener() {

        final AppboyInAppMessageManager this$0;

        private void logHtmlInAppMessageClick(IInAppMessage iinappmessage, Bundle bundle)
        {
            if (bundle != null && bundle.containsKey("abButtonId"))
            {
                ((InAppMessageHtmlFull)iinappmessage).logButtonClick(bundle.getString("abButtonId"));
                return;
            } else
            {
                iinappmessage.logClick();
                return;
            }
        }

        public void onCloseAction(IInAppMessage iinappmessage, String s, Bundle bundle)
        {
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "IInAppMessageWebViewClientListener.onCloseAction called.");
            hideCurrentInAppMessage(true, true);
            getHtmlInAppMessageActionListener().onCloseClicked(iinappmessage, s, bundle);
        }

        public void onNewsfeedAction(IInAppMessage iinappmessage, String s, Bundle bundle)
        {
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "IInAppMessageWebViewClientListener.onNewsfeedAction called.");
            logHtmlInAppMessageClick(iinappmessage, bundle);
            if (!getHtmlInAppMessageActionListener().onNewsfeedClicked(iinappmessage, s, bundle))
            {
                hideCurrentInAppMessage(false);
                iinappmessage = BundleUtils.mapToBundle(iinappmessage.getExtras());
                iinappmessage.putAll(bundle);
                getAppboyNavigator().gotoNewsFeed(mActivity, iinappmessage);
            }
        }

        public void onOtherUrlAction(IInAppMessage iinappmessage, String s, Bundle bundle)
        {
            boolean flag = false;
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "IInAppMessageWebViewClientListener.onOtherUrlAction called.");
            logHtmlInAppMessageClick(iinappmessage, bundle);
            if (!getHtmlInAppMessageActionListener().onOtherUrlAction(iinappmessage, s, bundle))
            {
                hideCurrentInAppMessage(false);
                if (bundle.containsKey("abExternalOpen"))
                {
                    flag = Boolean.parseBoolean(bundle.getString("abExternalOpen"));
                }
                if (flag)
                {
                    iinappmessage = BundleUtils.mapToBundle(iinappmessage.getExtras());
                    iinappmessage.putAll(bundle);
                    iinappmessage = ActionFactory.createViewUriAction(s, iinappmessage);
                } else
                {
                    iinappmessage = ActionFactory.createUriAction(mActivity, s);
                }
                if (iinappmessage != null)
                {
                    iinappmessage.execute(mActivity);
                }
            }
        }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                super();
            }
    };

    public AppboyInAppMessageManager()
    {
        mDisplayingInAppMessage = new AtomicBoolean(false);
        mDefaultInAppMessageManagerListener = new IInAppMessageManagerListener() {

            final AppboyInAppMessageManager this$0;

            public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iinappmessage)
            {
                return InAppMessageOperation.DISPLAY_NOW;
            }

            public boolean onInAppMessageButtonClicked(MessageButton messagebutton, InAppMessageCloser inappmessagecloser)
            {
                return false;
            }

            public boolean onInAppMessageClicked(IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser)
            {
                return false;
            }

            public void onInAppMessageDismissed(IInAppMessage iinappmessage)
            {
            }

            public boolean onInAppMessageReceived(IInAppMessage iinappmessage)
            {
                return false;
            }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                super();
            }
        };
        mDefaultHtmlInAppMessageActionListener = new IHtmlInAppMessageActionListener() {

            final AppboyInAppMessageManager this$0;

            public void onCloseClicked(IInAppMessage iinappmessage, String s, Bundle bundle)
            {
            }

            public boolean onNewsfeedClicked(IInAppMessage iinappmessage, String s, Bundle bundle)
            {
                return false;
            }

            public boolean onOtherUrlAction(IInAppMessage iinappmessage, String s, Bundle bundle)
            {
                return false;
            }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                super();
            }
        };
        mInAppMessageSlideupViewFactory = new IInAppMessageViewFactory() {

            final AppboyInAppMessageManager this$0;

            public View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
            {
                InAppMessageSlideup inappmessageslideup = (InAppMessageSlideup)iinappmessage;
                activity = (AppboyInAppMessageSlideupView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_slideup, null);
                activity.inflateStubViews();
                if (mCanUseFresco)
                {
                    activity.setMessageSimpleDrawee(iinappmessage.getImageUrl());
                } else
                {
                    activity.setMessageImageView(inappmessageslideup.getBitmap());
                }
                activity.setMessageBackgroundColor(inappmessageslideup.getBackgroundColor());
                activity.setMessage(inappmessageslideup.getMessage());
                activity.setMessageTextColor(inappmessageslideup.getMessageTextColor());
                activity.setMessageIcon(inappmessageslideup.getIcon(), inappmessageslideup.getIconColor(), inappmessageslideup.getIconBackgroundColor());
                activity.setMessageChevron(inappmessageslideup.getChevronColor(), inappmessageslideup.getClickAction());
                activity.resetMessageMargins(iinappmessage.getImageDownloadSuccessful());
                return activity;
            }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                super();
            }
        };
        mInAppMessageModalViewFactory = new IInAppMessageViewFactory() {

            final AppboyInAppMessageManager this$0;

            public View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
            {
                InAppMessageModal inappmessagemodal = (InAppMessageModal)iinappmessage;
                activity = (AppboyInAppMessageModalView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_modal, null);
                activity.inflateStubViews();
                if (mCanUseFresco)
                {
                    activity.setMessageSimpleDrawee(iinappmessage.getImageUrl());
                } else
                {
                    activity.setMessageImageView(inappmessagemodal.getBitmap());
                }
                activity.setMessageBackgroundColor(iinappmessage.getBackgroundColor());
                activity.setMessage(iinappmessage.getMessage());
                activity.setMessageTextColor(iinappmessage.getMessageTextColor());
                activity.setMessageHeaderText(inappmessagemodal.getHeader());
                activity.setMessageHeaderTextColor(inappmessagemodal.getHeaderTextColor());
                activity.setMessageIcon(iinappmessage.getIcon(), iinappmessage.getIconColor(), iinappmessage.getIconBackgroundColor());
                activity.setMessageButtons(inappmessagemodal.getMessageButtons());
                activity.setMessageCloseButtonColor(inappmessagemodal.getCloseButtonColor());
                activity.resetMessageMargins(iinappmessage.getImageDownloadSuccessful());
                return activity;
            }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                super();
            }
        };
        mInAppMessageFullViewFactory = new IInAppMessageViewFactory() {

            final AppboyInAppMessageManager this$0;

            public View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
            {
                InAppMessageFull inappmessagefull = (InAppMessageFull)iinappmessage;
                activity = (AppboyInAppMessageFullView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_full, null);
                activity.inflateStubViews();
                if (mCanUseFresco)
                {
                    activity.setMessageSimpleDrawee(iinappmessage.getImageUrl());
                } else
                {
                    activity.setMessageImageView(iinappmessage.getBitmap());
                }
                activity.setMessageBackgroundColor(inappmessagefull.getBackgroundColor());
                activity.setMessage(inappmessagefull.getMessage());
                activity.setMessageTextColor(inappmessagefull.getMessageTextColor());
                activity.setMessageHeaderText(inappmessagefull.getHeader());
                activity.setMessageHeaderTextColor(inappmessagefull.getHeaderTextColor());
                activity.setMessageButtons(inappmessagefull.getMessageButtons());
                activity.setMessageCloseButtonColor(inappmessagefull.getCloseButtonColor());
                activity.resetMessageMargins(iinappmessage.getImageDownloadSuccessful());
                return activity;
            }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                super();
            }
        };
        mInAppMessageHtmlFullViewFactory = new IInAppMessageViewFactory() {

            final AppboyInAppMessageManager this$0;

            public View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
            {
                InAppMessageHtmlFull inappmessagehtmlfull = (InAppMessageHtmlFull)iinappmessage;
                activity = (AppboyInAppMessageHtmlFullView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_html_full, null);
                activity.setWebViewContent(iinappmessage.getMessage(), inappmessagehtmlfull.getLocalAssetsDirectoryUrl());
                activity.setInAppMessageWebViewClient(new InAppMessageWebViewClient(iinappmessage, mInAppMessageWebViewClientListener));
                return activity;
            }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                super();
            }
        };
        mInAppMessageAnimationFactory = new IInAppMessageAnimationFactory() {

            private final int mShortAnimationDurationMillis = Resources.getSystem().getInteger(0x10e0000);
            private final long sSlideupAnimationDurationMillis = 400L;
            final AppboyInAppMessageManager this$0;

            public Animation getClosingAnimation(IInAppMessage iinappmessage)
            {
                if (iinappmessage instanceof InAppMessageSlideup)
                {
                    if (((InAppMessageSlideup)iinappmessage).getSlideFrom() == SlideFrom.TOP)
                    {
                        iinappmessage = AnimationUtils.createVerticalAnimation(0.0F, -1F, 400L, false);
                    } else
                    {
                        iinappmessage = AnimationUtils.createVerticalAnimation(0.0F, 1.0F, 400L, false);
                    }
                } else
                {
                    iinappmessage = new AlphaAnimation(1.0F, 0.0F);
                }
                return AnimationUtils.setAnimationParams(iinappmessage, mShortAnimationDurationMillis, false);
            }

            public Animation getOpeningAnimation(IInAppMessage iinappmessage)
            {
                if (iinappmessage instanceof InAppMessageSlideup)
                {
                    if (((InAppMessageSlideup)iinappmessage).getSlideFrom() == SlideFrom.TOP)
                    {
                        iinappmessage = AnimationUtils.createVerticalAnimation(-1F, 0.0F, 400L, false);
                    } else
                    {
                        iinappmessage = AnimationUtils.createVerticalAnimation(1.0F, 0.0F, 400L, false);
                    }
                } else
                {
                    iinappmessage = new AlphaAnimation(0.0F, 1.0F);
                }
                return AnimationUtils.setAnimationParams(iinappmessage, mShortAnimationDurationMillis, true);
            }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                super();
            }
        };
    }

    private IEventSubscriber createInAppMessageEventSubscriber()
    {
        return new IEventSubscriber() {

            final AppboyInAppMessageManager this$0;

            public void trigger(InAppMessageEvent inappmessageevent)
            {
                if (getInAppMessageManagerListener().onInAppMessageReceived(inappmessageevent.getInAppMessage()))
                {
                    return;
                } else
                {
                    addInAppMessage(inappmessageevent.getInAppMessage());
                    return;
                }
            }

            public volatile void trigger(Object obj)
            {
                trigger((InAppMessageEvent)obj);
            }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                super();
            }
        };
    }

    private boolean displayInAppMessage(IInAppMessage iinappmessage)
    {
        if (mActivity == null)
        {
            AppboyLogger.e(TAG, "No activity is currently registered to receive in-app messages. Doing nothing.");
            return false;
        }
        Object obj = getInAppMessageViewFactory(iinappmessage);
        if (obj == null)
        {
            AppboyLogger.d(TAG, "ViewFactory from getInAppMessageViewFactory was null.");
            return false;
        }
        obj = ((IInAppMessageViewFactory) (obj)).createInAppMessageView(mActivity, iinappmessage);
        if (obj == null)
        {
            AppboyLogger.e(TAG, "The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
            mDisplayingInAppMessage.set(false);
            return false;
        }
        if (((View) (obj)).getParent() != null)
        {
            AppboyLogger.e(TAG, "The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
            mDisplayingInAppMessage.set(false);
            return false;
        }
        Animation animation = getInAppMessageAnimationFactory(iinappmessage).getOpeningAnimation(iinappmessage);
        Animation animation1 = getInAppMessageAnimationFactory(iinappmessage).getClosingAnimation(iinappmessage);
        if (obj instanceof IInAppMessageImmersiveView)
        {
            AppboyLogger.d(TAG, "Creating view wrapper for immersive in-app message.");
            IInAppMessageImmersiveView iinappmessageimmersiveview = (IInAppMessageImmersiveView)obj;
            mInAppMessageViewWrapper = new InAppMessageViewWrapper(((View) (obj)), iinappmessage, mInAppMessageViewLifecycleListener, animation, animation1, iinappmessageimmersiveview.getMessageClickableView(), iinappmessageimmersiveview.getMessageButtonViews(), iinappmessageimmersiveview.getMessageCloseButtonView());
        } else
        if (obj instanceof IInAppMessageView)
        {
            AppboyLogger.d(TAG, "Creating view wrapper for base in-app message.");
            IInAppMessageView iinappmessageview = (IInAppMessageView)obj;
            mInAppMessageViewWrapper = new InAppMessageViewWrapper(((View) (obj)), iinappmessage, mInAppMessageViewLifecycleListener, animation, animation1, iinappmessageview.getMessageClickableView());
        } else
        {
            AppboyLogger.d(TAG, "Creating view wrapper for in-app message.");
            mInAppMessageViewWrapper = new InAppMessageViewWrapper(((View) (obj)), iinappmessage, mInAppMessageViewLifecycleListener, animation, animation1, ((View) (obj)));
        }
        iinappmessage = (FrameLayout)mActivity.getWindow().getDecorView().findViewById(0x1020002);
        mInAppMessageViewWrapper.open(iinappmessage);
        return true;
    }

    private IAppboyNavigator getAppboyNavigator()
    {
        IAppboyNavigator iappboynavigator = Appboy.getInstance(mActivity).getAppboyNavigator();
        if (iappboynavigator != null)
        {
            return iappboynavigator;
        } else
        {
            return mDefaultAppboyNavigator;
        }
    }

    private IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener()
    {
        if (mCustomHtmlInAppMessageActionListener != null)
        {
            return mCustomHtmlInAppMessageActionListener;
        } else
        {
            return mDefaultHtmlInAppMessageActionListener;
        }
    }

    private IInAppMessageAnimationFactory getInAppMessageAnimationFactory(IInAppMessage iinappmessage)
    {
        if (mCustomInAppMessageAnimationFactory != null)
        {
            return mCustomInAppMessageAnimationFactory;
        } else
        {
            return mInAppMessageAnimationFactory;
        }
    }

    private IInAppMessageManagerListener getInAppMessageManagerListener()
    {
        if (mCustomInAppMessageManagerListener != null)
        {
            return mCustomInAppMessageManagerListener;
        } else
        {
            return mDefaultInAppMessageManagerListener;
        }
    }

    private IInAppMessageViewFactory getInAppMessageViewFactory(IInAppMessage iinappmessage)
    {
        if (mCustomInAppMessageViewFactory != null)
        {
            return mCustomInAppMessageViewFactory;
        }
        if (iinappmessage instanceof InAppMessageSlideup)
        {
            return mInAppMessageSlideupViewFactory;
        }
        if (iinappmessage instanceof InAppMessageModal)
        {
            return mInAppMessageModalViewFactory;
        }
        if (iinappmessage instanceof InAppMessageFull)
        {
            return mInAppMessageFullViewFactory;
        }
        if (iinappmessage instanceof InAppMessageHtmlFull)
        {
            return mInAppMessageHtmlFullViewFactory;
        } else
        {
            return null;
        }
    }

    public static AppboyInAppMessageManager getInstance()
    {
        if (sInstance != null) goto _L2; else goto _L1
_L1:
        com/appboy/ui/inappmessage/AppboyInAppMessageManager;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new AppboyInAppMessageManager();
        }
        com/appboy/ui/inappmessage/AppboyInAppMessageManager;
        JVM INSTR monitorexit ;
_L2:
        return sInstance;
        Exception exception;
        exception;
        com/appboy/ui/inappmessage/AppboyInAppMessageManager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void startClearHtmlInAppMessageAssetsThread(final IInAppMessageHtml inAppMessageHtml)
    {
        (new Thread(new Runnable() {

            final AppboyInAppMessageManager this$0;
            final IInAppMessageHtml val$inAppMessageHtml;

            public void run()
            {
                if (inAppMessageHtml != null)
                {
                    WebContentUtils.clearInAppMessageLocalAssets(inAppMessageHtml);
                }
            }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                inAppMessageHtml = iinappmessagehtml;
                super();
            }
        })).start();
    }

    public void addInAppMessage(IInAppMessage iinappmessage)
    {
        mInAppMessageBaseStack.push(iinappmessage);
        requestDisplayInAppMessage();
    }

    AsyncInAppMessageDisplayer createAsyncInAppMessageDisplayer()
    {
        return new AsyncInAppMessageDisplayer();
    }

    public void hideCurrentInAppMessage(boolean flag)
    {
        InAppMessageViewWrapper inappmessageviewwrapper = mInAppMessageViewWrapper;
        if (inappmessageviewwrapper != null)
        {
            IInAppMessage iinappmessage = inappmessageviewwrapper.getInAppMessage();
            if (iinappmessage != null)
            {
                iinappmessage.setAnimateOut(flag);
            }
            inappmessageviewwrapper.close();
        }
    }

    public void hideCurrentInAppMessage(boolean flag, boolean flag1)
    {
        InAppMessageViewWrapper inappmessageviewwrapper = mInAppMessageViewWrapper;
        if (inappmessageviewwrapper != null && flag1)
        {
            inappmessageviewwrapper.callOnDismissed();
        }
        hideCurrentInAppMessage(flag);
    }

    public void registerInAppMessageManager(Activity activity)
    {
        mActivity = activity;
        mCanUseFresco = FrescoLibraryUtils.canUseFresco(activity.getApplicationContext());
        if (mCarryoverInAppMessageBase != null)
        {
            AppboyLogger.d(TAG, "Displaying carryover in-app message.");
            mCarryoverInAppMessageBase.setAnimateIn(false);
            displayInAppMessage(mCarryoverInAppMessageBase);
            mCarryoverInAppMessageBase = null;
        }
        mInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Appboy.getInstance(activity).subscribeToNewInAppMessages(mInAppMessageEventSubscriber);
    }

    public void registerSlideupManager(Activity activity)
    {
        getInstance().registerInAppMessageManager(activity);
    }

    public boolean requestDisplayInAppMessage()
    {
        if (mActivity == null)
        {
            AppboyLogger.e(TAG, "No activity is currently registered to receive in-app messages. Doing nothing.");
            return false;
        }
        if (!mDisplayingInAppMessage.compareAndSet(false, true))
        {
            AppboyLogger.d(TAG, "A in-app message is currently being displayed. Ignoring request to display in-app message.");
            return false;
        }
        if (mInAppMessageBaseStack.isEmpty())
        {
            AppboyLogger.d(TAG, "The in-app message stack is empty. No in-app message will be displayed.");
            mDisplayingInAppMessage.set(false);
            return false;
        }
        final IInAppMessage inAppMessage = (IInAppMessage)mInAppMessageBaseStack.pop();
        InAppMessageOperation inappmessageoperation = getInAppMessageManagerListener().beforeInAppMessageDisplayed(inAppMessage);
        class _cls13
        {

            static final int $SwitchMap$com$appboy$enums$inappmessage$ClickAction[];
            static final int $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[];

            static 
            {
                $SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[ClickAction.values().length];
                try
                {
                    $SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NEWS_FEED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.URI.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NONE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation = new int[InAppMessageOperation.values().length];
                try
                {
                    $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISCARD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls13..SwitchMap.com.appboy.ui.inappmessage.InAppMessageOperation[inappmessageoperation.ordinal()])
        {
        default:
            AppboyLogger.e(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned null instead of a InAppMessageOperation. Ignoring the in-app message. Please check the IInAppMessageStackBehaviour implementation.");
            mDisplayingInAppMessage.set(false);
            return false;

        case 1: // '\001'
            AppboyLogger.d(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.");
            mActivity.runOnUiThread(new Runnable() {

                final AppboyInAppMessageManager this$0;
                final IInAppMessage val$inAppMessage;

                public void run()
                {
                    (new AsyncInAppMessageDisplayer()).execute(new IInAppMessage[] {
                        inAppMessage
                    });
                }

            
            {
                this$0 = AppboyInAppMessageManager.this;
                inAppMessage = iinappmessage;
                super();
            }
            });
            return true;

        case 2: // '\002'
            AppboyLogger.d(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.");
            mInAppMessageBaseStack.push(inAppMessage);
            mDisplayingInAppMessage.set(false);
            return false;

        case 3: // '\003'
            AppboyLogger.d(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.");
            break;
        }
        mDisplayingInAppMessage.set(false);
        return false;
    }

    public void setCustomHtmlInAppMessageActionListener(IHtmlInAppMessageActionListener ihtmlinappmessageactionlistener)
    {
        mCustomHtmlInAppMessageActionListener = ihtmlinappmessageactionlistener;
    }

    public void setCustomInAppMessageAnimationFactory(IInAppMessageAnimationFactory iinappmessageanimationfactory)
    {
        mCustomInAppMessageAnimationFactory = iinappmessageanimationfactory;
    }

    public void setCustomInAppMessageManagerListener(IInAppMessageManagerListener iinappmessagemanagerlistener)
    {
        mCustomInAppMessageManagerListener = iinappmessagemanagerlistener;
    }

    public void setCustomInAppMessageViewFactory(IInAppMessageViewFactory iinappmessageviewfactory)
    {
        mCustomInAppMessageViewFactory = iinappmessageviewfactory;
    }

    public void unregisterInAppMessageManager(Activity activity)
    {
        if (mInAppMessageViewWrapper != null)
        {
            ViewUtils.removeViewFromParent(mInAppMessageViewWrapper.getInAppMessageView());
            if (mInAppMessageViewWrapper.getIsAnimatingClose())
            {
                mInAppMessageViewWrapper.callAfterClosed();
                mCarryoverInAppMessageBase = null;
            } else
            {
                mCarryoverInAppMessageBase = mInAppMessageViewWrapper.getInAppMessage();
            }
            mInAppMessageViewWrapper = null;
        } else
        {
            mCarryoverInAppMessageBase = null;
        }
        Appboy.getInstance(activity).removeSingleSubscription(mInAppMessageEventSubscriber, com/appboy/events/InAppMessageEvent);
        mActivity = null;
    }

    public void unregisterSlideupManager(Activity activity)
    {
        getInstance().unregisterInAppMessageManager(activity);
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/inappmessage/AppboyInAppMessageManager.getName()
        });
    }










/*
    static InAppMessageViewWrapper access$702(AppboyInAppMessageManager appboyinappmessagemanager, InAppMessageViewWrapper inappmessageviewwrapper)
    {
        appboyinappmessagemanager.mInAppMessageViewWrapper = inappmessageviewwrapper;
        return inappmessageviewwrapper;
    }

*/



    private class AsyncInAppMessageDisplayer extends AsyncTask
    {

        final AppboyInAppMessageManager this$0;

        private void prepareInAppMessageWithFresco(IInAppMessage iinappmessage, String s)
        {
            DataSource datasource;
            for (datasource = Fresco.getImagePipeline().prefetchToDiskCache(ImageRequest.fromUri(s), new Object()); !datasource.isFinished();) { }
            if (!datasource.hasFailed())
            {
                break MISSING_BLOCK_LABEL_120;
            }
            if (datasource.getFailureCause() != null) goto _L2; else goto _L1
_L1:
            AppboyLogger.w(AppboyInAppMessageManager.TAG, "Fresco disk prefetch failed with a null cause.");
_L3:
            datasource.close();
            return;
_L2:
            try
            {
                AppboyLogger.w(AppboyInAppMessageManager.TAG, (new StringBuilder()).append("Fresco disk prefetch failed with cause: ").append(datasource.getFailureCause().getMessage()).append(" with image url: ").append(s).toString());
            }
            // Misplaced declaration of an exception variable
            catch (IInAppMessage iinappmessage)
            {
                AppboyLogger.e(AppboyInAppMessageManager.TAG, "Fresco image pipeline could not be retrieved. Fresco most likely prematurely shutdown.", iinappmessage);
                return;
            }
              goto _L3
            iinappmessage.setImageDownloadSuccessful(true);
              goto _L3
        }

        protected transient IInAppMessage doInBackground(IInAppMessage aiinappmessage[])
        {
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "Starting asynchronous in-app message preparation.");
            aiinappmessage = aiinappmessage[0];
            if (aiinappmessage instanceof InAppMessageHtmlFull)
            {
                prepareInAppMessageWithHtml(aiinappmessage);
                return aiinappmessage;
            }
            String s = aiinappmessage.getImageUrl();
            if (StringUtils.isNullOrBlank(s))
            {
                AppboyLogger.w(AppboyInAppMessageManager.TAG, "In-app message has no image URL. Not downloading image from URL.");
                return aiinappmessage;
            }
            if (mCanUseFresco)
            {
                prepareInAppMessageWithFresco(aiinappmessage, s);
                return aiinappmessage;
            } else
            {
                prepareInAppMessageWithBitmapDownload(aiinappmessage, s);
                return aiinappmessage;
            }
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((IInAppMessage[])aobj);
        }

        protected void onPostExecute(final IInAppMessage inAppMessage)
        {
            if (mActivity == null)
            {
                AppboyLogger.e(AppboyInAppMessageManager.TAG, "No activity is currently registered to receive in-app messages. Doing nothing.");
                return;
            }
            AppboyLogger.d(AppboyInAppMessageManager.TAG, "Finished asynchronous in-app message preparation. Attempting to display in-app message.");
            if (inAppMessage != null)
            {
                mActivity.runOnUiThread(new Runnable() {

                    final AsyncInAppMessageDisplayer this$1;
                    final IInAppMessage val$inAppMessage;

                    public void run()
                    {
                        AppboyLogger.d(AppboyInAppMessageManager.TAG, "Displaying in-app message.");
                        displayInAppMessage(inAppMessage);
                    }

                
                {
                    this$1 = AsyncInAppMessageDisplayer.this;
                    inAppMessage = iinappmessage;
                    super();
                }
                });
                return;
            } else
            {
                AppboyLogger.e(AppboyInAppMessageManager.TAG, "Cannot display the in-app message because the in-app message was null.");
                mDisplayingInAppMessage.set(false);
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((IInAppMessage)obj);
        }

        void prepareInAppMessageWithBitmapDownload(IInAppMessage iinappmessage, String s)
        {
            if (iinappmessage.getBitmap() == null)
            {
                iinappmessage.setBitmap(AppboyImageUtils.downloadImageBitmap(s));
                if (iinappmessage.getBitmap() != null)
                {
                    iinappmessage.setImageDownloadSuccessful(true);
                }
                return;
            } else
            {
                AppboyLogger.i(AppboyInAppMessageManager.TAG, "In-app message already contains image bitmap. Not downloading image from URL.");
                return;
            }
        }

        void prepareInAppMessageWithHtml(IInAppMessage iinappmessage)
        {
            iinappmessage = (InAppMessageHtmlFull)iinappmessage;
            String s = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(mActivity.getCacheDir(), iinappmessage.getAssetsZipRemoteUrl());
            if (!StringUtils.isNullOrBlank(s))
            {
                AppboyLogger.d(AppboyInAppMessageManager.TAG, (new StringBuilder()).append("Local url for html in-app message is ").append(s).toString());
                iinappmessage.setLocalAssetsDirectoryUrl(s);
                return;
            } else
            {
                AppboyLogger.w(AppboyInAppMessageManager.TAG, String.format("Download of html content to local directory failed for remote url: %s . Returned local url is: %s", new Object[] {
                    iinappmessage.getAssetsZipRemoteUrl(), s
                }));
                return;
            }
        }

        AsyncInAppMessageDisplayer()
        {
            this$0 = AppboyInAppMessageManager.this;
            super();
        }
    }

}
