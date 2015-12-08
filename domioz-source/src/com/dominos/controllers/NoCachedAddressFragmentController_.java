// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import com.dominos.MobileSession_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.controllers:
//            NoCachedAddressFragmentController

public final class NoCachedAddressFragmentController_ extends NoCachedAddressFragmentController
{

    private static NoCachedAddressFragmentController_ instance_;
    private Context context_;

    private NoCachedAddressFragmentController_(Context context)
    {
        context_ = context;
    }

    public static NoCachedAddressFragmentController_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new NoCachedAddressFragmentController_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mMobileSession = MobileSession_.getInstance_(context_);
        onAfterInject();
    }
}
