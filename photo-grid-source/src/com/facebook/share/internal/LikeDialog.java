// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.share.internal:
//            LikeContent, LikeDialogFeature

public class LikeDialog extends FacebookDialogBase
{

    private static final int DEFAULT_REQUEST_CODE;
    private static final String TAG = "LikeDialog";

    LikeDialog(Activity activity)
    {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    LikeDialog(Fragment fragment)
    {
        super(fragment, DEFAULT_REQUEST_CODE);
    }

    public static boolean canShowNativeDialog()
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && DialogPresenter.canPresentNativeDialogWithFeature(getFeature());
    }

    public static boolean canShowWebFallback()
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && DialogPresenter.canPresentWebFallbackDialogWithFeature(getFeature());
    }

    private static Bundle createParameters(LikeContent likecontent)
    {
        Bundle bundle = new Bundle();
        bundle.putString("object_id", likecontent.getObjectId());
        bundle.putString("object_type", likecontent.getObjectType().toString());
        return bundle;
    }

    private static DialogFeature getFeature()
    {
        return LikeDialogFeature.LIKE_DIALOG;
    }

    protected AppCall createBaseAppCall()
    {
        return new AppCall(getRequestCode());
    }

    protected List getOrderedModeHandlers()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new NativeHandler(null));
        arraylist.add(new WebFallbackHandler(null));
        return arraylist;
    }

    protected void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, FacebookCallback facebookcallback)
    {
        throw new UnsupportedOperationException("registerCallback is not supported for LikeDialog");
    }

    static 
    {
        DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode();
    }



    private class NativeHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final LikeDialog this$0;

        public boolean canShow(LikeContent likecontent)
        {
            return likecontent != null && LikeDialog.canShowNativeDialog();
        }

        public volatile boolean canShow(Object obj)
        {
            return canShow((LikeContent)obj);
        }

        public AppCall createAppCall(final LikeContent content)
        {
            AppCall appcall = createBaseAppCall();
            class _cls1
                implements com.facebook.internal.DialogPresenter.ParameterProvider
            {

                final NativeHandler this$1;
                final LikeContent val$content;

                public Bundle getLegacyParameters()
                {
                    Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
                    return new Bundle();
                }

                public Bundle getParameters()
                {
                    return LikeDialog.createParameters(content);
                }

                _cls1()
                {
                    this$1 = NativeHandler.this;
                    content = likecontent;
                    super();
                }
            }

            DialogPresenter.setupAppCallForNativeDialog(appcall, new _cls1(), LikeDialog.getFeature());
            return appcall;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((LikeContent)obj);
        }

        private NativeHandler()
        {
            this$0 = LikeDialog.this;
            super(LikeDialog.this);
        }

        NativeHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private class WebFallbackHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final LikeDialog this$0;

        public boolean canShow(LikeContent likecontent)
        {
            return likecontent != null && LikeDialog.canShowWebFallback();
        }

        public volatile boolean canShow(Object obj)
        {
            return canShow((LikeContent)obj);
        }

        public AppCall createAppCall(LikeContent likecontent)
        {
            AppCall appcall = createBaseAppCall();
            DialogPresenter.setupAppCallForWebFallbackDialog(appcall, LikeDialog.createParameters(likecontent), LikeDialog.getFeature());
            return appcall;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((LikeContent)obj);
        }

        private WebFallbackHandler()
        {
            this$0 = LikeDialog.this;
            super(LikeDialog.this);
        }

        WebFallbackHandler(_cls1 _pcls1)
        {
            this();
        }
    }

}
