// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.upsell;

import android.content.Context;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.android.sdk.core.upsell:
//            UpsellManager, UpsellAPI_

public final class UpsellManager_ extends UpsellManager
{

    private Context context_;

    private UpsellManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static UpsellManager_ getInstance_(Context context)
    {
        return new UpsellManager_(context);
    }

    private void init_()
    {
        mUpsellAPI = UpsellAPI_.getInstance_(context_);
    }

    public final void loadUpsellBarList(String s)
    {
        a.a(new _cls1(0, "", s));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }


    private class _cls1 extends c
    {

        final UpsellManager_ this$0;
        final String val$environment;

        public void execute()
        {
            try
            {
                loadUpsellBarList(environment);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(int i, String s1, String s2)
        {
            this$0 = UpsellManager_.this;
            environment = s2;
            super(final_s, i, s1);
        }
    }

}
