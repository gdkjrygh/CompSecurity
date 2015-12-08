// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.share.internal:
//            LikeContent, LikeDialogFeature, ResultProcessor, ShareInternalUtility

public class LikeDialog extends FacebookDialogBase
{
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

        public AppCall createAppCall(LikeContent likecontent)
        {
            AppCall appcall = createBaseAppCall();
            DialogPresenter.setupAppCallForNativeDialog(appcall, likecontent. new com.facebook.internal.DialogPresenter.ParameterProvider() {

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

            
            {
                this$1 = final_nativehandler;
                content = LikeContent.this;
                super();
            }
            }, LikeDialog.getFeature());
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

    }

    public static final class Result
    {

        private final Bundle bundle;

        public Bundle getData()
        {
            return bundle;
        }

        public Result(Bundle bundle1)
        {
            bundle = bundle1;
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

    }


    private static final int DEFAULT_REQUEST_CODE;
    private static final String TAG = "LikeDialog";

    public LikeDialog(Activity activity)
    {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public LikeDialog(Fragment fragment)
    {
        super(fragment, DEFAULT_REQUEST_CODE);
    }

    public static boolean canShowNativeDialog()
    {
        return DialogPresenter.canPresentNativeDialogWithFeature(getFeature());
    }

    public static boolean canShowWebFallback()
    {
        return DialogPresenter.canPresentWebFallbackDialogWithFeature(getFeature());
    }

    private static Bundle createParameters(LikeContent likecontent)
    {
        Bundle bundle = new Bundle();
        bundle.putString("object_id", likecontent.getObjectId());
        bundle.putString("object_type", likecontent.getObjectType());
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
        arraylist.add(new NativeHandler());
        arraylist.add(new WebFallbackHandler());
        return arraylist;
    }

    protected void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, final FacebookCallback resultProcessor)
    {
        if (resultProcessor == null)
        {
            resultProcessor = null;
        } else
        {
            resultProcessor = new ResultProcessor(resultProcessor) {

                final LikeDialog this$0;
                final FacebookCallback val$callback;

                public void onSuccess(AppCall appcall, Bundle bundle)
                {
                    callback.onSuccess(new Result(bundle));
                }

            
            {
                this$0 = LikeDialog.this;
                callback = facebookcallback1;
                super(final_facebookcallback);
            }
            };
        }
        resultProcessor = new com.facebook.internal.CallbackManagerImpl.Callback() {

            final LikeDialog this$0;
            final ResultProcessor val$resultProcessor;

            public boolean onActivityResult(int i, Intent intent)
            {
                return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, resultProcessor);
            }

            
            {
                this$0 = LikeDialog.this;
                resultProcessor = resultprocessor;
                super();
            }
        };
        callbackmanagerimpl.registerCallback(getRequestCode(), resultProcessor);
    }

    static 
    {
        DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode();
    }


}
