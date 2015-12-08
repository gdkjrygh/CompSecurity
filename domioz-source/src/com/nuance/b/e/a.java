// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.b.bx;
import com.nuance.b.b.dv;
import com.nuance.b.b.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.nuance.b.e:
//            b

public final class a
{

    private v a;
    private boolean b;

    public a(v v1)
    {
        b = true;
        a = v1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        Log.i("AudioPlayer", "Cancelling audio");
        a.k();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i, CountDownLatch countdownlatch)
    {
        this;
        JVM INSTR monitorenter ;
        CountDownLatch countdownlatch1;
        countdownlatch1 = countdownlatch;
        if (countdownlatch != null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        countdownlatch1 = new CountDownLatch(1);
        if (b) goto _L2; else goto _L1
_L1:
        countdownlatch1.countDown();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        long l = a.a(i);
        if (l < 0L)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        countdownlatch = new ArrayList(1);
        countdownlatch.add(Long.valueOf(l));
        bx bx1 = a.u();
        bx1.a(new b(bx1, countdownlatch, countdownlatch1));
          goto _L3
        countdownlatch;
        throw countdownlatch;
        countdownlatch1.countDown();
          goto _L3
    }

    public final void a(List list, CountDownLatch countdownlatch)
    {
        this;
        JVM INSTR monitorenter ;
        CountDownLatch countdownlatch1;
        countdownlatch1 = countdownlatch;
        if (countdownlatch != null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        countdownlatch1 = new CountDownLatch(1);
        if (b) goto _L2; else goto _L1
_L1:
        countdownlatch1.countDown();
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        countdownlatch = new ArrayList();
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        list = list.iterator();
_L4:
        String s;
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_138;
            }
            s = (String)list.next();
        } while (s == null);
        if (s.trim().length() == 0) goto _L4; else goto _L3
_L3:
        long l = a.a(s, dv.b);
        if (l < 0L)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        countdownlatch.add(Long.valueOf(l));
          goto _L4
        list;
        throw list;
        Log.e("AudioPlayer", "Failed to play prompt");
          goto _L4
label0:
        {
            if (countdownlatch.size() != 0)
            {
                break label0;
            }
            countdownlatch1.countDown();
        }
          goto _L5
        Log.d("AudioPlayer", (new StringBuilder("playSsmlPromptsAsync lastPromptInGroup: ")).append(countdownlatch.get(countdownlatch.size() - 1)).toString());
        list = a.u();
        list.a(new b(list, countdownlatch, countdownlatch1));
          goto _L5
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        b = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
