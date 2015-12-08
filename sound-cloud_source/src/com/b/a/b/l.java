// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import com.b.a.b.e.a;

// Referenced classes of package com.b.a.b:
//            i

final class l
    implements Runnable
{

    final i a;

    l(i j)
    {
        a = j;
        super();
    }

    public final void run()
    {
        a.e.onLoadingCancelled(a.b, a.c.d());
    }
}
