// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.flow;

import android.content.Context;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.AccessToken;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.ClientConfig;
import com.uservoice.uservoicesdk.model.RequestToken;
import com.uservoice.uservoicesdk.model.User;

public class InitManager
{

    private final Runnable callback;
    private boolean canceled;
    private final Context context;

    public InitManager(Context context1, Runnable runnable)
    {
        context = context1;
        callback = runnable;
    }

    private void done()
    {
        callback.run();
    }

    private void loadUser()
    {
        if (Session.getInstance().getUser() == null)
        {
            if (shouldSignIn())
            {
                RequestToken.getRequestToken(new _cls2(context));
                return;
            }
            AccessToken accesstoken = (AccessToken)BaseModel.load(Session.getInstance().getSharedPreferences(), "access_token", "access_token", com/uservoice/uservoicesdk/model/AccessToken);
            if (accesstoken != null)
            {
                Session.getInstance().setAccessToken(accesstoken);
                User.loadCurrentUser(new _cls3(context));
                return;
            } else
            {
                done();
                return;
            }
        } else
        {
            done();
            return;
        }
    }

    private boolean shouldSignIn()
    {
        return Session.getInstance().getConfig().getEmail() != null;
    }

    public void cancel()
    {
        canceled = true;
    }

    public void init()
    {
        if (Session.getInstance().getClientConfig() == null)
        {
            ClientConfig.loadClientConfig(new _cls1(context));
            return;
        } else
        {
            loadUser();
            return;
        }
    }





    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}

}
