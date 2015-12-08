// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.model.GameRequestContent;
import java.util.ArrayList;
import java.util.List;

public class GameRequestDialog extends FacebookDialogBase
{

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
        arraylist.add(new WebHandler(null));
        return arraylist;
    }

    protected void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, final FacebookCallback resultProcessor)
    {
        if (resultProcessor == null)
        {
            resultProcessor = null;
        } else
        {
            resultProcessor = new _cls1(resultProcessor);
        }
        callbackmanagerimpl.registerCallback(getRequestCode(), new _cls2());
    }

    static 
    {
        DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.GameRequest.toRequestCode();
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

        WebHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls2
        implements com.facebook.internal.CallbackManagerImpl.Callback
    {

        final GameRequestDialog this$0;
        final ResultProcessor val$resultProcessor;

        public boolean onActivityResult(int i, Intent intent)
        {
            return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, resultProcessor);
        }

        _cls2()
        {
            this$0 = GameRequestDialog.this;
            resultProcessor = resultprocessor;
            super();
        }
    }


    private class _cls1 extends ResultProcessor
    {

        final GameRequestDialog this$0;
        final FacebookCallback val$callback;

        public void onSuccess(AppCall appcall, Bundle bundle)
        {
            if (bundle != null)
            {
                callback.onSuccess(new Result(bundle.getString("request"), null));
                return;
            } else
            {
                onCancel(appcall);
                return;
            }
        }

        _cls1(FacebookCallback facebookcallback1)
        {
            this$0 = GameRequestDialog.this;
            callback = facebookcallback1;
            super(final_facebookcallback);
        }

        private class Result
        {

            String requestId;

            public final String getRequestId()
            {
                return requestId;
            }

            private Result(String s)
            {
                requestId = s;
            }

            Result(String s, _cls1 _pcls1)
            {
                this(s);
            }
        }

    }

}
