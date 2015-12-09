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
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.ArrayList;
import java.util.List;

public class JoinAppGroupDialog extends FacebookDialogBase
{
    public static final class Result
    {

        private final Bundle data;

        public Bundle getData()
        {
            return data;
        }

        private Result(Bundle bundle)
        {
            data = bundle;
        }

    }

    private class WebHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final JoinAppGroupDialog this$0;

        public volatile boolean canShow(Object obj)
        {
            return canShow((String)obj);
        }

        public boolean canShow(String s)
        {
            return true;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((String)obj);
        }

        public AppCall createAppCall(String s)
        {
            AppCall appcall = createBaseAppCall();
            Bundle bundle = new Bundle();
            bundle.putString("id", s);
            DialogPresenter.setupAppCallForWebDialog(appcall, "game_group_join", bundle);
            return appcall;
        }

        private WebHandler()
        {
            this$0 = JoinAppGroupDialog.this;
            super(JoinAppGroupDialog.this);
        }

    }


    private static final int DEFAULT_REQUEST_CODE;
    private static final String JOIN_GAME_GROUP_DIALOG = "game_group_join";

    public JoinAppGroupDialog(Activity activity)
    {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public JoinAppGroupDialog(Fragment fragment)
    {
        super(fragment, DEFAULT_REQUEST_CODE);
    }

    public static boolean canShow()
    {
        return true;
    }

    public static void show(Activity activity, String s)
    {
        (new JoinAppGroupDialog(activity)).show(s);
    }

    public static void show(Fragment fragment, String s)
    {
        (new JoinAppGroupDialog(fragment)).show(s);
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

                final JoinAppGroupDialog this$0;
                final FacebookCallback val$callback;

                public void onSuccess(AppCall appcall, Bundle bundle)
                {
                    callback.onSuccess(new Result(bundle));
                }

            
            {
                this$0 = JoinAppGroupDialog.this;
                callback = facebookcallback1;
                super(final_facebookcallback);
            }
            };
        }
        resultProcessor = new com.facebook.internal.CallbackManagerImpl.Callback() {

            final JoinAppGroupDialog this$0;
            final ResultProcessor val$resultProcessor;

            public boolean onActivityResult(int i, Intent intent)
            {
                return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, resultProcessor);
            }

            
            {
                this$0 = JoinAppGroupDialog.this;
                resultProcessor = resultprocessor;
                super();
            }
        };
        callbackmanagerimpl.registerCallback(getRequestCode(), resultProcessor);
    }

    static 
    {
        DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.AppGroupJoin.toRequestCode();
    }
}
