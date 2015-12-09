// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.util.Log;
import com.aviary.android.feather.common.a.a;

public class h
{
    static class a extends Handler
    {

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 101 101: default 24
        //                       101 25;
               goto _L1 _L2
_L1:
            return;
_L2:
            if (h.c() != null)
            {
                try
                {
                    h.c().vibrate(message.arg1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                if (com.aviary.android.feather.common.a.a.a)
                {
                    message.printStackTrace();
                    return;
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        a()
        {
        }
    }


    private static Vibrator b;
    private boolean a;
    private a c;

    public h(Context context, boolean flag)
    {
        c = new a();
        a(context);
        a(flag);
        if (!a())
        {
            a(false);
        }
    }

    private void a(Context context)
    {
        com/aviary/android/feather/sdk/widget/h;
        JVM INSTR monitorenter ;
        Vibrator vibrator = b;
        if (vibrator != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        b = (Vibrator)context.getSystemService("vibrator");
_L1:
        com/aviary/android/feather/sdk/widget/h;
        JVM INSTR monitorexit ;
        return;
        context;
        Log.e("VibrationHelper", context.toString());
          goto _L1
        context;
        com/aviary/android/feather/sdk/widget/h;
        JVM INSTR monitorexit ;
        throw context;
    }

    static Vibrator c()
    {
        return b;
    }

    public void a(int i)
    {
        if (a && c != null)
        {
            c.removeMessages(101);
            Message message = c.obtainMessage(101);
            message.arg1 = i;
            c.sendMessage(message);
        }
    }

    public void a(boolean flag)
    {
        if (com.aviary.android.feather.common.a.a.a)
        {
            Log.i("VibrationHelper", (new StringBuilder()).append("setEnabled: ").append(flag).toString());
        }
        if (flag && b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    public boolean a()
    {
        if (b != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                return b.hasVibrator();
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    public boolean b()
    {
        return a;
    }
}
