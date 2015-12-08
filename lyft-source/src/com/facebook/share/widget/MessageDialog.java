// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.Sharer;
import com.facebook.share.internal.MessageDialogFeature;
import com.facebook.share.internal.OpenGraphMessageDialogFeature;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;

public final class MessageDialog extends FacebookDialogBase
    implements Sharer
{

    private static final int DEFAULT_REQUEST_CODE;
    private boolean shouldFailOnDataError;

    public MessageDialog(Activity activity)
    {
        super(activity, DEFAULT_REQUEST_CODE);
        shouldFailOnDataError = false;
        ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
    }

    MessageDialog(Activity activity, int i)
    {
        super(activity, i);
        shouldFailOnDataError = false;
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    public MessageDialog(Fragment fragment)
    {
        super(fragment, DEFAULT_REQUEST_CODE);
        shouldFailOnDataError = false;
        ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
    }

    MessageDialog(Fragment fragment, int i)
    {
        super(fragment, i);
        shouldFailOnDataError = false;
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    public static boolean canShow(Class class1)
    {
        class1 = getFeature(class1);
        return class1 != null && DialogPresenter.canPresentNativeDialogWithFeature(class1);
    }

    private static DialogFeature getFeature(Class class1)
    {
        if (com/facebook/share/model/ShareLinkContent.isAssignableFrom(class1))
        {
            return MessageDialogFeature.MESSAGE_DIALOG;
        }
        if (com/facebook/share/model/SharePhotoContent.isAssignableFrom(class1))
        {
            return MessageDialogFeature.PHOTOS;
        }
        if (com/facebook/share/model/ShareVideoContent.isAssignableFrom(class1))
        {
            return MessageDialogFeature.VIDEO;
        }
        if (com/facebook/share/model/ShareOpenGraphContent.isAssignableFrom(class1))
        {
            return OpenGraphMessageDialogFeature.OG_MESSAGE_DIALOG;
        } else
        {
            return null;
        }
    }

    public static void show(Activity activity, ShareContent sharecontent)
    {
        (new MessageDialog(activity)).show(sharecontent);
    }

    public static void show(Fragment fragment, ShareContent sharecontent)
    {
        (new MessageDialog(fragment)).show(sharecontent);
    }

    protected AppCall createBaseAppCall()
    {
        return new AppCall(getRequestCode());
    }

    protected List getOrderedModeHandlers()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new NativeHandler());
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

    static 
    {
        DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
    }



    private class NativeHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final MessageDialog this$0;

        public boolean canShow(ShareContent sharecontent)
        {
            return sharecontent != null && MessageDialog.canShow(sharecontent.getClass());
        }

        public volatile boolean canShow(Object obj)
        {
            return canShow((ShareContent)obj);
        }

        public AppCall createAppCall(final ShareContent content)
        {
            ShareContentValidation.validateForMessage(content);
            final AppCall appCall = createBaseAppCall();
            final boolean shouldFailOnDataError = getShouldFailOnDataError();
            getActivityContext();
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
            }, MessageDialog.getFeature(content.getClass()));
            return appCall;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((ShareContent)obj);
        }

        private NativeHandler()
        {
            this$0 = MessageDialog.this;
            super(MessageDialog.this);
        }

    }

}
