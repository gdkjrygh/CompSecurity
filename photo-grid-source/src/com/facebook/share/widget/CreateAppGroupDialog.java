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
import com.facebook.share.model.AppGroupCreationContent;
import java.util.ArrayList;
import java.util.List;

public class CreateAppGroupDialog extends FacebookDialogBase
{

    private static final int DEFAULT_REQUEST_CODE;
    private static final String GAME_GROUP_CREATION_DIALOG = "game_group_create";

    public CreateAppGroupDialog(Activity activity)
    {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public CreateAppGroupDialog(Fragment fragment)
    {
        super(fragment, DEFAULT_REQUEST_CODE);
    }

    public static boolean canShow()
    {
        return true;
    }

    public static void show(Activity activity, AppGroupCreationContent appgroupcreationcontent)
    {
        (new CreateAppGroupDialog(activity)).show(appgroupcreationcontent);
    }

    public static void show(Fragment fragment, AppGroupCreationContent appgroupcreationcontent)
    {
        (new CreateAppGroupDialog(fragment)).show(appgroupcreationcontent);
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
        resultProcessor = new _cls2();
        callbackmanagerimpl.registerCallback(getRequestCode(), resultProcessor);
    }

    static 
    {
        DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.AppGroupCreate.toRequestCode();
    }

    private class WebHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
    {

        final CreateAppGroupDialog this$0;

        public boolean canShow(AppGroupCreationContent appgroupcreationcontent)
        {
            return true;
        }

        public volatile boolean canShow(Object obj)
        {
            return canShow((AppGroupCreationContent)obj);
        }

        public AppCall createAppCall(AppGroupCreationContent appgroupcreationcontent)
        {
            AppCall appcall = createBaseAppCall();
            DialogPresenter.setupAppCallForWebDialog(appcall, "game_group_create", WebDialogParameters.create(appgroupcreationcontent));
            return appcall;
        }

        public volatile AppCall createAppCall(Object obj)
        {
            return createAppCall((AppGroupCreationContent)obj);
        }

        private WebHandler()
        {
            this$0 = CreateAppGroupDialog.this;
            super(CreateAppGroupDialog.this);
        }

        WebHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls2
        implements com.facebook.internal.CallbackManagerImpl.Callback
    {

        final CreateAppGroupDialog this$0;
        final ResultProcessor val$resultProcessor;

        public boolean onActivityResult(int i, Intent intent)
        {
            return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, resultProcessor);
        }

        _cls2()
        {
            this$0 = CreateAppGroupDialog.this;
            resultProcessor = resultprocessor;
            super();
        }
    }


    private class _cls1 extends ResultProcessor
    {

        final CreateAppGroupDialog this$0;
        final FacebookCallback val$callback;

        public void onSuccess(AppCall appcall, Bundle bundle)
        {
            callback.onSuccess(new Result(bundle.getString("id"), null));
        }

        _cls1(FacebookCallback facebookcallback1)
        {
            this$0 = CreateAppGroupDialog.this;
            callback = facebookcallback1;
            super(final_facebookcallback);
        }

        private class Result
        {

            private final String id;

            public final String getId()
            {
                return id;
            }

            private Result(String s)
            {
                id = s;
            }

            Result(String s, _cls1 _pcls1)
            {
                this(s);
            }
        }

    }

}
