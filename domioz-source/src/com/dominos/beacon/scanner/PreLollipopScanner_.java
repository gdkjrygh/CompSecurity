// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.scanner;

import android.content.Context;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.beacon.scanner:
//            PreLollipopScanner

public final class PreLollipopScanner_ extends PreLollipopScanner
{

    private static PreLollipopScanner_ instance_;
    private Context context_;

    private PreLollipopScanner_(Context context)
    {
        context_ = context;
    }

    public static PreLollipopScanner_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new PreLollipopScanner_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mContext = context_;
        onAfterInject();
    }
}
