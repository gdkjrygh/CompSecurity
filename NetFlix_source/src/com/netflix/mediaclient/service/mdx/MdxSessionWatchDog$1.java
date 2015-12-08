// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.os.Handler;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MdxSessionWatchDog

class this._cls0
    implements Runnable
{

    final MdxSessionWatchDog this$0;

    public void run()
    {
        long l = MdxSessionWatchDog.access$000(MdxSessionWatchDog.this).onGetTimeOfMostRecentIncomingMessage();
        if (System.currentTimeMillis() - Long.valueOf(l).longValue() > 0x493e0L)
        {
            Log.d("nf_mdxSessionWatchDog", "MdxSessionWatchDog:  expired");
            MdxSessionWatchDog.access$000(MdxSessionWatchDog.this).onSessionWatchDogExpired();
            return;
        } else
        {
            Log.d("nf_mdxSessionWatchDog", "MdxSessionWatchDog: check if session still alive");
            MdxSessionWatchDog.access$200(MdxSessionWatchDog.this).postDelayed(MdxSessionWatchDog.access$100(MdxSessionWatchDog.this), 0x493e0L);
            return;
        }
    }

    ssionWatchDogInterface()
    {
        this$0 = MdxSessionWatchDog.this;
        super();
    }
}
