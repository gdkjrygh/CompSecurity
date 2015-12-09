// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.squareup.picasso:
//            Stats, Picasso

private static class stats extends Handler
{

    private final Stats stats;

    public void handleMessage(final Message msg)
    {
        switch (msg.what)
        {
        default:
            Picasso.HANDLER.post(new Runnable() {

                final Stats.StatsHandler this$0;
                final Message val$msg;

                public void run()
                {
                    throw new AssertionError((new StringBuilder()).append("Unhandled stats message.").append(msg.what).toString());
                }

            
            {
                this$0 = Stats.StatsHandler.this;
                msg = message;
                super();
            }
            });
            return;

        case 0: // '\0'
            stats.performCacheHit();
            return;

        case 1: // '\001'
            stats.performCacheMiss();
            return;

        case 2: // '\002'
            stats.performBitmapDecoded(msg.arg1);
            return;

        case 3: // '\003'
            stats.performBitmapTransformed(msg.arg1);
            return;

        case 4: // '\004'
            stats.performDownloadFinished((Long)msg.obj);
            break;
        }
    }

    public _cls1.val.msg(Looper looper, Stats stats1)
    {
        super(looper);
        stats = stats1;
    }
}
