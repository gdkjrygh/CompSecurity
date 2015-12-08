// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.Session;
import com.facebook.internal.Validate;

// Referenced classes of package com.facebook.widget:
//            WebDialog

private static class finishInit
{

    private String action;
    private String applicationId;
    private Context context;
    private stener listener;
    private Bundle parameters;
    private Session session;
    private int theme;

    private void finishInit(Context context1, String s, Bundle bundle)
    {
        context = context1;
        action = s;
        if (bundle != null)
        {
            parameters = bundle;
            return;
        } else
        {
            parameters = new Bundle();
            return;
        }
    }

    public WebDialog build()
    {
        if (session != null && session.isOpened())
        {
            parameters.putString("app_id", session.getApplicationId());
            parameters.putString("access_token", session.getAccessToken());
        } else
        {
            parameters.putString("app_id", applicationId);
        }
        if (!parameters.containsKey("redirect_uri"))
        {
            parameters.putString("redirect_uri", "fbconnect://success");
        }
        return new WebDialog(context, action, parameters, theme, listener);
    }

    protected String getApplicationId()
    {
        return applicationId;
    }

    protected Context getContext()
    {
        return context;
    }

    protected stener getListener()
    {
        return listener;
    }

    protected Bundle getParameters()
    {
        return parameters;
    }

    protected int getTheme()
    {
        return theme;
    }

    public stener setOnCompleteListener(stener stener)
    {
        listener = stener;
        return this;
    }

    public listener setTheme(int i)
    {
        theme = i;
        return this;
    }

    protected stener(Context context1, Session session1, String s, Bundle bundle)
    {
        theme = 0x1030010;
        Validate.notNull(session1, "session");
        if (!session1.isOpened())
        {
            throw new FacebookException("Attempted to use a Session that was not open.");
        } else
        {
            session = session1;
            finishInit(context1, s, bundle);
            return;
        }
    }

    protected finishInit(Context context1, String s, String s1, Bundle bundle)
    {
        theme = 0x1030010;
        Validate.notNullOrEmpty(s, "applicationId");
        applicationId = s;
        finishInit(context1, s1, bundle);
    }
}
