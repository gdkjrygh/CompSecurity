// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.b.a.ae;
import com.nuance.b.b.a.ag;
import com.nuance.b.b.a.ah;
import com.nuance.b.b.a.ai;
import com.nuance.b.b.a.aj;
import com.nuance.b.b.bx;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class b
    implements ag
{

    bx a;
    List b;
    CountDownLatch c;

    public b(bx bx1, List list, CountDownLatch countdownlatch)
    {
        a = bx1;
        b = list;
        c = countdownlatch;
    }

    private boolean a(long l)
    {
        return b.contains(Long.valueOf(l));
    }

    private void b(long l)
    {
        long l1 = ((Long)b.get(b.size() - 1)).longValue();
        Log.d("AudioPlayer", (new StringBuilder("In finishIfLastPrompt(")).append(l).append(")...   last prompt is: ").append(l1).toString());
        if (l1 == l)
        {
            a.b(this);
            c.countDown();
        }
    }

    public final void a(ae ae1)
    {
        long l = ae1.a;
        if (a(l))
        {
            Log.e("AudioPlayer", (new StringBuilder("Prompt error for id ")).append(l).append(" is: ").append(ae1.c).toString());
            b(l);
        }
    }

    public final void a(ah ah)
    {
    }

    public final void a(ai ai1)
    {
        long l = ai1.a;
        if (a(l))
        {
            Log.d("AudioPlayer", (new StringBuilder("onPlaybackStarted: ")).append(l).toString());
        }
    }

    public final void a(aj aj1)
    {
        long l = aj1.a;
        if (a(l))
        {
            Log.d("AudioPlayer", (new StringBuilder("onPlaybackStarted: ")).append(l).toString());
            b(l);
        }
    }
}
