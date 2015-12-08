// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ap;
import com.nuance.b.b.a.o;

// Referenced classes of package com.nuance.b.b:
//            da

final class db
    implements Runnable
{

    final o a;
    final ap b;
    final da c;

    db(da da, o o1, ap ap)
    {
        c = da;
        a = o1;
        b = ap;
        super();
    }

    public final void run()
    {
        a.onStartOfSpeech(b);
    }
}
