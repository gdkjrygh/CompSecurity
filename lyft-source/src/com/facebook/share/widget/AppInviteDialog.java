// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.internal.AppInviteDialogFeature;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.AppInviteContent;
import java.util.ArrayList;
import java.util.List;

public class AppInviteDialog extends FacebookDialogBase
{

    private static final int DEFAULT_REQUEST_CODE;
    private static final String TAG = "AppInviteDialog";

    public AppInviteDialog(Activity activity)
    {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public AppInviteDialog(Fragment fragment)
    {
        super(fragment, DEFAULT_REQUEST_CODE);
    }

    public static boolean canShow()
    {
        return canShowNativeDialog() || canShowWebFallback();
    }

    private static boolean canShowNativeDialog()
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && DialogPresenter.canPresentNativeDialogWithFeature(getFeature());
    }

    private static boolean canShowWebFallback()
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && DialogPresenter.canPresentWebFallbackDialogWithFeature(getFeature());
    }

    private static Bundle createParameters(AppInviteContent appinvitecontent)
    {
        Bundle bundle = new Bundle();
        bundle.putString("app_link_url", appinvitecontent.getApplinkUrl());
        bundle.putString("preview_image_url", appinvitecontent.getPreviewImageUrl());
        return bundle;
    }

    private static DialogFeature getFeature()
    {
        return AppInviteDialogFeature.APP_INVITES_DIALOG;
    }

    public static void show(Activity activity, AppInviteContent appinvitecontent)
    {
        (new AppInviteDialog(activity)).show(appinvitecontent);
    }

    public static void show(Fragment fragment, AppInviteContent appinvitecontent)
    {
        (new AppInviteDialog(fragment)).show(appinvitecontent);
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

                final AppInviteDialog this$0;
                final FacebookCallback val$callback;

                public void onSuccess(AppCall appcall, Bundle bundle)
                {
                    if ("cancel".equalsIgnoreCase(ShareInternalUtility.getNativeDialogCompletionGesture(bundle)))
                    {
                        callback.onCancel();
                        return;
                    } else
                    {
                        callback.onSuccess(new Result(bundle));
                        return;
                    }
                }

            
            {
                this$0 = AppInviteDialog.this;
                callback = facebookcallback1;
                super(final_facebookcallback);
            }

                private class Result
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

            };
        }
        resultProcessor = new com.facebook.internal.CallbackManagerImpl.Callback() {

            final AppInviteDialog this$0;
            final ResultProcessor val$resultProcessor;

            public boolean onActivityResult(int i, Intent intent)
            {
                return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, resultProcessor);
            }

            
            {
                this$0 = AppInviteDialog.this;
                resultProcessor = resultprocessor;
                super();
            }
        };
        callbackmanagerimpl.registerCallback(getRequestCode(), resultProcessor);
    }

    static 
    {
        DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.AppInvite.toRequestCode();
    }





    private class NativeHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final AppInviteDialog this$0;

        public boolean canShow(AppInviteContent appinvitecontent)
        {
            return AppInviteDialog.canShowNativeDialog();
        }

        public volatile boolean canShow(Object obj)
        {
            return canShow((AppInviteContent)obj);
        }

        public AppCall createAppCall(final AppInviteContent content)
        {
            AppCall appcall = createBaseAppCall();
            DialogPresenter.setupAppCallForNativeDialog(appcall, new com.facebook.internal.DialogPresenter.ParameterProvider() {

                final NativeHandler this$1;
                final AppInviteContent val$content;

                public Bundle getLegacyParameters()
                {
                    Log.e("AppInviteDialog", "Attempting to present the AppInviteDialog with an outdated Facebook app on the device");
                    return new Bundle();
                }

                public Bundle getParameters()
                {
                    return AppInviteDialog.createParameters(content);
                }

                
                {
                    this$1 = NativeHandler.this;
                    content = appinvitecontent;
                    super();
                }
            }, AppInviteDialog.getFeature());
            return appcall;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((AppInviteContent)obj);
        }

        private NativeHandler()
        {
            this$0 = AppInviteDialog.this;
            super(AppInviteDialog.this);
        }

    }


    private class WebFallbackHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final AppInviteDialog this$0;

        public boolean canShow(AppInviteContent appinvitecontent)
        {
            return AppInviteDialog.canShowWebFallback();
        }

        public volatile boolean canShow(Object obj)
        {
            return canShow((AppInviteContent)obj);
        }

        public AppCall createAppCall(AppInviteContent appinvitecontent)
        {
            AppCall appcall = createBaseAppCall();
            DialogPresenter.setupAppCallForWebFallbackDialog(appcall, AppInviteDialog.createParameters(appinvitecontent), AppInviteDialog.getFeature());
            return appcall;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((AppInviteContent)obj);
        }

        private WebFallbackHandler()
        {
            this$0 = AppInviteDialog.this;
            super(AppInviteDialog.this);
        }

    }

}
