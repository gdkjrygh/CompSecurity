// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import com.bumptech.glide.b.d;
import com.bumptech.glide.g.h;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            i

static class 
{

    private final Queue a = h.a(0);

    public d a(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        d d2 = (d)a.poll();
        d d1;
        d1 = d2;
        if (d2 != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        d1 = new d();
        abyte0 = d1.a(abyte0);
        this;
        JVM INSTR monitorexit ;
        return abyte0;
        abyte0;
        throw abyte0;
    }

    public void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        d1.a();
        a.offer(d1);
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    ()
    {
    }
}
