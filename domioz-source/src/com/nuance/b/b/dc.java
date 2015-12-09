// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.n;
import com.nuance.b.b.a.o;

// Referenced classes of package com.nuance.b.b:
//            da

final class dc
    implements Runnable
{

    final o a;
    final n b;
    final da c;

    dc(da da, o o1, n n)
    {
        c = da;
        a = o1;
        b = n;
        super();
    }

    public final void run()
    {
        a.onEndOfSpeech(b);
    }
}
