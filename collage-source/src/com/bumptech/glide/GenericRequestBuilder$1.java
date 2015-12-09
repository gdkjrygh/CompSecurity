// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import com.bumptech.glide.request.RequestFutureTarget;

// Referenced classes of package com.bumptech.glide:
//            e

class get
    implements Runnable
{

    final RequestFutureTarget a;
    final e b;

    public void run()
    {
        if (!a.isCancelled())
        {
            b.a(a);
        }
    }
}
