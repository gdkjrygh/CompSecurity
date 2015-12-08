// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.Locale;

final class mrz
    implements android.os.Handler.Callback, mrv
{

    private final List a;
    private final HandlerThread b = new HandlerThread("AnalyticsLogger", 10);
    private Handler c;

    public mrz(Context context)
    {
        a = olm.c(context, msc);
        b.start();
        c = new Handler(b.getLooper(), this);
    }

    public final void a(Context context, mru mru1)
    {
        long l1 = 0L;
        Bundle bundle;
        long l;
        if (android.os.Build.VERSION.SDK_INT > 16)
        {
            l = SystemClock.elapsedRealtimeNanos();
        } else
        {
            l = 0L;
        }
        mru1.a(context);
        if (Log.isLoggable("AnalyticsLogger", 3))
        {
            mru1.toString();
        }
        bundle = new Bundle();
        for (int i = 0; i < a.size(); i++)
        {
            ((msc)a.get(i)).a(context, mru1, bundle);
        }

        context = Message.obtain(c, 1);
        context.obj = mru1;
        context.setData(bundle);
        c.sendMessage(context);
        if (android.os.Build.VERSION.SDK_INT > 16)
        {
            l1 = SystemClock.elapsedRealtimeNanos() - l;
        }
        if (Log.isLoggable("AnalyticsLatency", 3))
        {
            String.format(Locale.US, "Latency: %dns", new Object[] {
                Long.valueOf(l1)
            });
        }
    }

    public final boolean handleMessage(Message message)
    {
        boolean flag2 = true;
        message.what;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 30;
           goto _L1 _L2
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        mru mru1 = (mru)message.obj;
        message = message.getData();
        int i = 0;
        boolean flag = false;
        for (; i < a.size(); i++)
        {
            if (((msc)a.get(i)).a(mru1, message))
            {
                flag = true;
            }
        }

        flag1 = flag2;
        if (!flag)
        {
            flag1 = flag2;
            if (Log.isLoggable("AnalyticsLogger", 3))
            {
                String.format(Locale.US, "Event not handled: %s", new Object[] {
                    mru1.toString()
                });
                return true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
