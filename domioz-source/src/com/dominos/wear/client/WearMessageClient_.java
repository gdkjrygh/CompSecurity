// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import android.content.Context;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.wear.client:
//            WearMessageClient

public final class WearMessageClient_ extends WearMessageClient
{

    private Context context_;

    private WearMessageClient_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static WearMessageClient_ getInstance_(Context context)
    {
        return new WearMessageClient_(context);
    }

    private void init_()
    {
    }

    public final void checkIsWearPaired(WearMessageClient.WearConnectionCallback wearconnectioncallback)
    {
        a.a(new _cls1(0, "", wearconnectioncallback));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }

    public final void sendToWear(String s, String s1)
    {
        a.a(new _cls2("", s, s1));
    }



    private class _cls1 extends c
    {

        final WearMessageClient_ this$0;
        final WearMessageClient.WearConnectionCallback val$wearConnectionCallback;

        public void execute()
        {
            try
            {
                checkIsWearPaired(wearConnectionCallback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(int i, String s1, WearMessageClient.WearConnectionCallback wearconnectioncallback)
        {
            this$0 = WearMessageClient_.this;
            wearConnectionCallback = wearconnectioncallback;
            super(final_s, i, s1);
        }
    }


    private class _cls2 extends c
    {

        final WearMessageClient_ this$0;
        final String val$data;
        final String val$uri;

        public void execute()
        {
            try
            {
                sendToWear(uri, data);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls2(String s1, String s2, String s3)
        {
            this$0 = WearMessageClient_.this;
            uri = s2;
            data = s3;
            super(final_s, final_i, s1);
        }
    }

}
