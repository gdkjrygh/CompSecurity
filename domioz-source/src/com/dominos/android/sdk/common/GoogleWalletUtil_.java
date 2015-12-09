// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.content.Context;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.android.sdk.common:
//            GoogleWalletUtil

public final class GoogleWalletUtil_ extends GoogleWalletUtil
{

    private Context context_;

    private GoogleWalletUtil_(Context context)
    {
        context_ = context;
        init_();
    }

    public static GoogleWalletUtil_ getInstance_(Context context)
    {
        return new GoogleWalletUtil_(context);
    }

    private void init_()
    {
    }

    public final void checkForGooglePlayServices(Context context, GoogleWalletUtil.GooglePlayServiceCheckCallback googleplayservicecheckcallback)
    {
        a.a(new _cls1("", context, googleplayservicecheckcallback));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }


    private class _cls1 extends c
    {

        final GoogleWalletUtil_ this$0;
        final GoogleWalletUtil.GooglePlayServiceCheckCallback val$callback;
        final Context val$context;

        public void execute()
        {
            try
            {
                checkForGooglePlayServices(context, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s1, Context context1, GoogleWalletUtil.GooglePlayServiceCheckCallback googleplayservicecheckcallback)
        {
            this$0 = GoogleWalletUtil_.this;
            context = context1;
            callback = googleplayservicecheckcallback;
            super(final_s, final_i, s1);
        }
    }

}
