// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.v;

import java.util.concurrent.Semaphore;

// Referenced classes of package com.facebook.common.v:
//            j, f

class h extends j
{

    final Semaphore a;
    final f b;

    h(f f, Semaphore semaphore)
    {
        b = f;
        a = semaphore;
        super();
    }

    public void a(boolean flag)
    {
        if (!flag)
        {
            a.release();
        }
    }
}
