// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import com.android.slyce.i.b;

// Referenced classes of package com.android.slyce:
//            k, p

class q
    implements Runnable
{

    final k a;
    final p b;

    q(p p, k k1)
    {
        b = p;
        a = k1;
        super();
    }

    public void run()
    {
        k.f(a).e();
    }
}
