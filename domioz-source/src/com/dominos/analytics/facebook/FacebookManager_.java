// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.analytics.facebook;

import android.content.Context;

// Referenced classes of package com.dominos.analytics.facebook:
//            FacebookManager, FacebookActivityLifecycleCallbacks_

public final class FacebookManager_ extends FacebookManager
{

    private Context context_;

    private FacebookManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static FacebookManager_ getInstance_(Context context)
    {
        return new FacebookManager_(context);
    }

    private void init_()
    {
        mCallbacks = FacebookActivityLifecycleCallbacks_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
