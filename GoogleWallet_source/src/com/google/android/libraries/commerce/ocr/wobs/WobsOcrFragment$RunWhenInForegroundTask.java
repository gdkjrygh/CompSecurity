// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs;

import android.os.Handler;
import java.util.List;
import java.util.TimerTask;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs:
//            WobsOcrFragment

final class task extends TimerTask
{

    private TimerTask task;
    final WobsOcrFragment this$0;

    public final void run()
    {
        WobsOcrFragment.access$700(WobsOcrFragment.this).post(new Runnable() {

            final WobsOcrFragment.RunWhenInForegroundTask this$1;

            public final void run()
            {
                if (WobsOcrFragment.access$400(this$0))
                {
                    WobsOcrFragment.access$600(this$0).add(task);
                    return;
                } else
                {
                    task.run();
                    return;
                }
            }

            
            {
                this$1 = WobsOcrFragment.RunWhenInForegroundTask.this;
                super();
            }
        });
    }


    public _cls1.this._cls1(TimerTask timertask)
    {
        this$0 = WobsOcrFragment.this;
        super();
        task = timertask;
    }
}
