// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import android.content.Intent;
import com.dominos.pebble.order.PebbleOrderHandler_;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.pebble:
//            PebbleTrackerReceiver, PebbleManager_

public final class PebbleTrackerReceiver_ extends PebbleTrackerReceiver
{

    public PebbleTrackerReceiver_()
    {
    }

    private void init_(Context context)
    {
        mPebbleManager = PebbleManager_.getInstance_(context);
        mPebbleOrderHandler = PebbleOrderHandler_.getInstance_(context);
    }

    public final void onReceive(Context context, Intent intent)
    {
        init_(context);
        super.onReceive(context, intent);
    }

    public final void sendTrackerDataToPebble(Context context, String s, String s1, String s2)
    {
        a.a(new _cls1(s, s1, s2));
    }


    private class _cls1 extends c
    {

        final PebbleTrackerReceiver_ this$0;
        final Context val$context;
        final String val$stageDescription;
        final String val$stageName;
        final String val$status;

        public void execute()
        {
            try
            {
                sendTrackerDataToPebble(context, stageName, stageDescription, status);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s2, String s3, 
                String s4)
        {
            this$0 = PebbleTrackerReceiver_.this;
            context = context1;
            stageName = s2;
            stageDescription = s3;
            status = s4;
            super(final_s, final_i, final_s1);
        }
    }

}
