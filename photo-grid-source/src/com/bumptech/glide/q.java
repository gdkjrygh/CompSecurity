// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import com.bumptech.glide.d.i;

// Referenced classes of package com.bumptech.glide:
//            p

final class q
    implements Runnable
{

    final i a;
    final p b;

    q(p p, i j)
    {
        b = p;
        a = j;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}
