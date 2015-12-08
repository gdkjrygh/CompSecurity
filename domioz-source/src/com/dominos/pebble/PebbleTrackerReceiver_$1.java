// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.pebble:
//            PebbleTrackerReceiver_

class val.status extends c
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
            PebbleTrackerReceiver_.access$001(PebbleTrackerReceiver_.this, val$context, val$stageName, val$stageDescription, val$status);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (String s2, String s3, 
            String s4)
    {
        this$0 = final_pebbletrackerreceiver_;
        val$context = Context.this;
        val$stageName = s2;
        val$stageDescription = s3;
        val$status = s4;
        super(final_s, final_i, final_s1);
    }
}
