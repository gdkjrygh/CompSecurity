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
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.internal.GameRequestValidation;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.GameRequestContent;
import java.util.ArrayList;
import java.util.List;

public class GameRequestDialog extends FacebookDialogBase
{
    public static final class Result
    {

        String requestId;
        List to;

        public String getRequestId()
        {
            return requestId;
        }

        public List getRequestRecipients()
        {
            return to;
        }

        private Result(Bundle bundle)
        {
            requestId = bundle.getString("request");
            for (to = new ArrayList(); bundle.containsKey(String.format("to[%d]", new Object[] {
        Integer.valueOf(to.size())
    })); to.add(bundle.getString(String.format("to[%d]", new Object[] {
        Integer.valueOf(to.size())
    })))) { }
        }

    }

    private class WebHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final GameRequestDialog this$0;

        public boolean canShow(GameRequestContent gamerequestcontent)
        {
            return true;
        }

        public volatile boolean canShow(Object obj)
        {
            return canShow((GameRequestContent)obj);
        }

        public AppCall createAppCall(GameRequestContent gamerequestcontent)
        {
            GameRequestValidation.validate(gamerequestcontent);
            AppCall appcall = createBaseAppCall();
            DialogPresenter.setupAppCallForWebDialog(appcall, "apprequests", WebDialogParameters.create(gamerequestcontent));
            return appcall;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((GameRequestContent)obj);
        }

        private WebHandler()
        {
            this$0 = GameRequestDialog.this;
            super(GameRequestDialog.this);
        }

    }


    private static final int DEFAULT_REQUEST_CODE;
    private static final String GAME_REQUEST_DIALOG = "apprequests";

    public GameRequestDialog(Activity activity)
    {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public GameRequestDialog(Fragment fragment)
    {
        super(fragment, DEFAULT_REQUEST_CODE);
    }

    public static boolean canShow()
    {
        return true;
    }

    public static void show(Activity activity, GameRequestContent gamerequestcontent)
    {
        (new GameRequestDialog(activity)).show(gamerequestcontent);
    }

    public static void show(Fragment fragment, GameRequestContent gamerequestcontent)
    {
        (new GameRequestDialog(fragment)).show(gamerequestcontent);
    }

    protected AppCall createBaseAppCall()
    {
        return new AppCall(getRequestCode());
    }

    protected List getOrderedModeHandlers()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new WebHandler());
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

                final GameRequestDialog this$0;
                final FacebookCallback val$callback;

                public void onSuccess(AppCall appcall, Bundle bundle)
                {
                    if (bundle != null)
                    {
                        callback.onSuccess(new Result(bundle));
                        return;
                    } else
                    {
                        onCancel(appcall);
                        return;
                    }
                }

            
            {
                this$0 = GameRequestDialog.this;
                callback = facebookcallback1;
                super(final_facebookcallback);
            }
            };
        }
        callbackmanagerimpl.registerCallback(getRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() {

            final GameRequestDialog this$0;
            final ResultProcessor val$resultProcessor;

            public boolean onActivityResult(int i, Intent intent)
            {
                return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, resultProcessor);
            }

            
            {
                this$0 = GameRequestDialog.this;
                resultProcessor = resultprocessor;
                super();
            }
        });
    }

    static 
    {
        DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.GameRequest.toRequestCode();
    }
}
