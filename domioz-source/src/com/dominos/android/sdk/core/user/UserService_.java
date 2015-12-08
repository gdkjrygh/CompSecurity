// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import android.content.Context;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserService

public final class UserService_ extends UserService
{

    private static UserService_ instance_;
    private Context context_;

    private UserService_(Context context)
    {
        context_ = context;
    }

    public static UserService_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new UserService_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
    }
}
