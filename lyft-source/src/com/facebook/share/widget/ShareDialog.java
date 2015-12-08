// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.Sharer;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;

public final class ShareDialog extends FacebookDialogBase
    implements Sharer
{

    private static final int DEFAULT_REQUEST_CODE;
    private static final String FEED_DIALOG = "feed";
    private static final String WEB_OG_SHARE_DIALOG = "share_open_graph";
    private static final String WEB_SHARE_DIALOG = "share";
    private boolean isAutomaticMode;
    private boolean shouldFailOnDataError;

    public ShareDialog(Activity activity)
    {
        super(activity, DEFAULT_REQUEST_CODE);
        shouldFailOnDataError = false;
        isAutomaticMode = true;
        ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
    }

    ShareDialog(Activity activity, int i)
    {
        super(activity, i);
        shouldFailOnDataError = false;
        isAutomaticMode = true;
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    public ShareDialog(Fragment fragment)
    {
        super(fragment, DEFAULT_REQUEST_CODE);
        shouldFailOnDataError = false;
        isAutomaticMode = true;
        ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
    }

    ShareDialog(Fragment fragment, int i)
    {
        super(fragment, i);
        shouldFailOnDataError = false;
        isAutomaticMode = true;
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    public static boolean canShow(Class class1)
    {
        return canShowWebTypeCheck(class1) || canShowNative(class1);
    }

    private static boolean canShowNative(Class class1)
    {
        class1 = getFeature(class1);
        return class1 != null && DialogPresenter.canPresentNativeDialogWithFeature(class1);
    }

    private static boolean canShowWebTypeCheck(Class class1)
    {
        return com/facebook/share/model/ShareLinkContent.isAssignableFrom(class1) || com/facebook/share/model/ShareOpenGraphContent.isAssignableFrom(class1);
    }

    private static DialogFeature getFeature(Class class1)
    {
        if (com/facebook/share/model/ShareLinkContent.isAssignableFrom(class1))
        {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (com/facebook/share/model/SharePhotoContent.isAssignableFrom(class1))
        {
            return ShareDialogFeature.PHOTOS;
        }
        if (com/facebook/share/model/ShareVideoContent.isAssignableFrom(class1))
        {
            return ShareDialogFeature.VIDEO;
        }
        if (com/facebook/share/model/ShareOpenGraphContent.isAssignableFrom(class1))
        {
            return OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
        } else
        {
            return null;
        }
    }

    private void logDialogShare(Context context, ShareContent sharecontent, Mode mode)
    {
        if (isAutomaticMode)
        {
            mode = Mode.AUTOMATIC;
        }
        class _cls1
        {

            static final int $SwitchMap$com$facebook$share$widget$ShareDialog$Mode[];

            static 
            {
                $SwitchMap$com$facebook$share$widget$ShareDialog$Mode = new int[Mode.values().length];
                try
                {
                    $SwitchMap$com$facebook$share$widget$ShareDialog$Mode[Mode.AUTOMATIC.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$facebook$share$widget$ShareDialog$Mode[Mode.WEB.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$facebook$share$widget$ShareDialog$Mode[Mode.NATIVE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.facebook.share.widget.ShareDialog.Mode[mode.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 105
    //                   2 111
    //                   3 117;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_117;
_L1:
        mode = "unknown";
_L5:
        sharecontent = getFeature(sharecontent.getClass());
        Bundle bundle;
        if (sharecontent == ShareDialogFeature.SHARE_DIALOG)
        {
            sharecontent = "status";
        } else
        if (sharecontent == ShareDialogFeature.PHOTOS)
        {
            sharecontent = "photo";
        } else
        if (sharecontent == ShareDialogFeature.VIDEO)
        {
            sharecontent = "video";
        } else
        if (sharecontent == OpenGraphActionDialogFeature.OG_ACTION_DIALOG)
        {
            sharecontent = "open_graph";
        } else
        {
            sharecontent = "unknown";
        }
        context = AppEventsLogger.newLogger(context);
        bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", mode);
        bundle.putString("fb_share_dialog_content_type", sharecontent);
        context.logSdkEvent("fb_share_dialog_show", null, bundle);
        return;
_L2:
        mode = "automatic";
          goto _L5
_L3:
        mode = "web";
          goto _L5
        mode = "native";
          goto _L5
    }

    public static void show(Activity activity, ShareContent sharecontent)
    {
        (new ShareDialog(activity)).show(sharecontent);
    }

    public static void show(Fragment fragment, ShareContent sharecontent)
    {
        (new ShareDialog(fragment)).show(sharecontent);
    }

    public boolean canShow(ShareContent sharecontent, Mode mode)
    {
        Object obj = mode;
        if (mode == Mode.AUTOMATIC)
        {
            obj = BASE_AUTOMATIC_MODE;
        }
        return canShowImpl(sharecontent, obj);
    }

    protected AppCall createBaseAppCall()
    {
        return new AppCall(getRequestCode());
    }

    protected List getOrderedModeHandlers()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new NativeHandler(null));
        arraylist.add(new FeedHandler(null));
        arraylist.add(new WebShareHandler(null));
        return arraylist;
    }

    public boolean getShouldFailOnDataError()
    {
        return shouldFailOnDataError;
    }

    protected void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, FacebookCallback facebookcallback)
    {
        ShareInternalUtility.registerSharerCallback(getRequestCode(), callbackmanagerimpl, facebookcallback);
    }

    public void setShouldFailOnDataError(boolean flag)
    {
        shouldFailOnDataError = flag;
    }

    public void show(ShareContent sharecontent, Mode mode)
    {
        boolean flag;
        if (mode == Mode.AUTOMATIC)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isAutomaticMode = flag;
        if (isAutomaticMode)
        {
            mode = ((Mode) (BASE_AUTOMATIC_MODE));
        }
        showImpl(sharecontent, mode);
    }

    static 
    {
        DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
    }








    private class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode AUTOMATIC;
        public static final Mode FEED;
        public static final Mode NATIVE;
        public static final Mode WEB;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/facebook/share/widget/ShareDialog$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            AUTOMATIC = new Mode("AUTOMATIC", 0);
            NATIVE = new Mode("NATIVE", 1);
            WEB = new Mode("WEB", 2);
            FEED = new Mode("FEED", 3);
            $VALUES = (new Mode[] {
                AUTOMATIC, NATIVE, WEB, FEED
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }


    private class NativeHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final ShareDialog this$0;

        public boolean canShow(ShareContent sharecontent)
        {
            return sharecontent != null && ShareDialog.canShowNative(sharecontent.getClass());
        }

        public volatile boolean canShow(Object obj)
        {
            return canShow((ShareContent)obj);
        }

        public AppCall createAppCall(final ShareContent content)
        {
            logDialogShare(getActivityContext(), content, Mode.NATIVE);
            ShareContentValidation.validateForNativeShare(content);
            final AppCall appCall = createBaseAppCall();
            DialogPresenter.setupAppCallForNativeDialog(appCall, new com.facebook.internal.DialogPresenter.ParameterProvider() {

                final NativeHandler this$1;
                final AppCall val$appCall;
                final ShareContent val$content;
                final boolean val$shouldFailOnDataError;

                public Bundle getLegacyParameters()
                {
                    return LegacyNativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
                }

                public Bundle getParameters()
                {
                    return NativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
                }

                
                {
                    this$1 = NativeHandler.this;
                    appCall = appcall;
                    content = sharecontent;
                    shouldFailOnDataError = flag;
                    super();
                }
            }, ShareDialog.getFeature(content.getClass()));
            return appCall;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((ShareContent)obj);
        }

        public Object getMode()
        {
            return Mode.NATIVE;
        }

        private NativeHandler()
        {
            this$0 = ShareDialog.this;
            super(ShareDialog.this);
        }

        NativeHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private class FeedHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final ShareDialog this$0;

        public boolean canShow(ShareContent sharecontent)
        {
            return (sharecontent instanceof ShareLinkContent) || (sharecontent instanceof ShareFeedContent);
        }

        public volatile boolean canShow(Object obj)
        {
            return canShow((ShareContent)obj);
        }

        public AppCall createAppCall(ShareContent sharecontent)
        {
            logDialogShare(getActivityContext(), sharecontent, Mode.FEED);
            AppCall appcall = createBaseAppCall();
            if (sharecontent instanceof ShareLinkContent)
            {
                sharecontent = (ShareLinkContent)sharecontent;
                ShareContentValidation.validateForWebShare(sharecontent);
                sharecontent = WebDialogParameters.createForFeed(sharecontent);
            } else
            {
                sharecontent = WebDialogParameters.createForFeed((ShareFeedContent)sharecontent);
            }
            DialogPresenter.setupAppCallForWebDialog(appcall, "feed", sharecontent);
            return appcall;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((ShareContent)obj);
        }

        public Object getMode()
        {
            return Mode.FEED;
        }

        private FeedHandler()
        {
            this$0 = ShareDialog.this;
            super(ShareDialog.this);
        }

        FeedHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private class WebShareHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final ShareDialog this$0;

        private String getActionName(ShareContent sharecontent)
        {
            if (sharecontent instanceof ShareLinkContent)
            {
                return "share";
            }
            if (sharecontent instanceof ShareOpenGraphContent)
            {
                return "share_open_graph";
            } else
            {
                return null;
            }
        }

        public boolean canShow(ShareContent sharecontent)
        {
            return sharecontent != null && ShareDialog.canShowWebTypeCheck(sharecontent.getClass());
        }

        public volatile boolean canShow(Object obj)
        {
            return canShow((ShareContent)obj);
        }

        public AppCall createAppCall(ShareContent sharecontent)
        {
            logDialogShare(getActivityContext(), sharecontent, Mode.WEB);
            AppCall appcall = createBaseAppCall();
            ShareContentValidation.validateForWebShare(sharecontent);
            Bundle bundle;
            if (sharecontent instanceof ShareLinkContent)
            {
                bundle = WebDialogParameters.create((ShareLinkContent)sharecontent);
            } else
            {
                bundle = WebDialogParameters.create((ShareOpenGraphContent)sharecontent);
            }
            DialogPresenter.setupAppCallForWebDialog(appcall, getActionName(sharecontent), bundle);
            return appcall;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((ShareContent)obj);
        }

        public Object getMode()
        {
            return Mode.WEB;
        }

        private WebShareHandler()
        {
            this$0 = ShareDialog.this;
            super(ShareDialog.this);
        }

        WebShareHandler(_cls1 _pcls1)
        {
            this();
        }
    }

}
