// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync;

import android.content.Context;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fordsync:
//            FordSyncSession

public final class FordSyncSession_ extends FordSyncSession
{

    private static FordSyncSession_ instance_;
    private Context context_;

    private FordSyncSession_(Context context)
    {
        super(context);
        context_ = context;
    }

    public static FordSyncSession_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new FordSyncSession_(context.getApplicationContext());
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
