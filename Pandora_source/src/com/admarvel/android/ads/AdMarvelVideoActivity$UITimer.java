// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

static class oneTime
{

    private boolean enabled;
    private Handler handler;
    private int intervalMs;
    private boolean oneTime;
    private Runnable runMethod;
    private Runnable timer_tick = new Runnable() {

        final AdMarvelVideoActivity.UITimer this$1;

        public void run()
        {
            if (!enabled)
            {
                return;
            }
            handler.post(runMethod);
            if (oneTime)
            {
                enabled = false;
                return;
            } else
            {
                handler.postDelayed(timer_tick, intervalMs);
                return;
            }
        }

            
            {
                this$1 = AdMarvelVideoActivity.UITimer.this;
                super();
            }
    };

    public boolean isEnabled()
    {
        return enabled;
    }

    public void start()
    {
        while (enabled || intervalMs < 1) 
        {
            return;
        }
        enabled = true;
        handler.postDelayed(timer_tick, intervalMs);
    }

    public void stop()
    {
        if (!enabled)
        {
            return;
        } else
        {
            enabled = false;
            handler.removeCallbacks(runMethod);
            handler.removeCallbacks(timer_tick);
            return;
        }
    }








    public _cls1.this._cls1(Handler handler1, Runnable runnable, int i)
    {
        enabled = false;
        oneTime = false;
        handler = handler1;
        runMethod = runnable;
        intervalMs = i;
    }

    public intervalMs(Handler handler1, Runnable runnable, int i, boolean flag)
    {
        this(handler1, runnable, i);
        oneTime = flag;
    }
}
