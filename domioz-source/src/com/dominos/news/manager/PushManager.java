// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.manager;

import android.app.Application;
import android.content.Context;
import com.appboy.a;
import com.dominos.android.sdk.common.Manager;
import com.dominos.news.listener.PushActivityLifecycleCallbacks;

// Referenced classes of package com.dominos.news.manager:
//            PushAPI

public class PushManager extends Manager
{

    private Context mContext;
    PushAPI mPushAPI;
    PushActivityLifecycleCallbacks mPushActivityCallbacks;

    public PushManager(Context context)
    {
        mContext = context;
    }

    public String getName()
    {
        return "push_manager";
    }

    public boolean isPushEnabled()
    {
        return mPushAPI.isPushEnabled();
    }

    protected void onSessionSet()
    {
    }

    public void setPushUserId(String s)
    {
        a.a(mContext).c(s);
    }

    public void setup(Application application)
    {
        application.unregisterActivityLifecycleCallbacks(mPushActivityCallbacks);
        application.registerActivityLifecycleCallbacks(mPushActivityCallbacks);
    }
}
