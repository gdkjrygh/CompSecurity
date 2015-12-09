// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.api;

import android.content.Context;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.wear.api:
//            WearAPI

public final class WearAPI_ extends WearAPI
{

    private static WearAPI_ instance_;
    private Context context_;

    private WearAPI_(Context context)
    {
        context_ = context;
    }

    public static WearAPI_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new WearAPI_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mPrefs = new DominosPrefs_(context_);
    }
}
