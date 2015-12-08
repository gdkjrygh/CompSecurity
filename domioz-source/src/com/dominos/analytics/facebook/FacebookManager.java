// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.analytics.facebook;

import android.app.Application;
import com.dominos.android.sdk.common.Manager;
import com.facebook.q;

// Referenced classes of package com.dominos.analytics.facebook:
//            FacebookActivityLifecycleCallbacks

public class FacebookManager extends Manager
{

    FacebookActivityLifecycleCallbacks mCallbacks;

    public FacebookManager()
    {
    }

    public String getName()
    {
        return "facebook_manager";
    }

    protected void onSessionSet()
    {
    }

    public void setup(Application application)
    {
        if (!q.a())
        {
            q.a(application.getApplicationContext());
        }
        application.unregisterActivityLifecycleCallbacks(mCallbacks);
        application.registerActivityLifecycleCallbacks(mCallbacks);
    }
}
