// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.useraccounts;

import android.content.Context;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.common.dom.useraccounts:
//            UserAuthorization

public final class UserAuthorization_ extends UserAuthorization
{

    private static UserAuthorization_ instance_;
    private Context context_;

    private UserAuthorization_(Context context)
    {
        context_ = context;
    }

    public static UserAuthorization_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new UserAuthorization_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        prefs = new DominosPrefs_(context_);
    }
}
