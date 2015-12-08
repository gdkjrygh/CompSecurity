// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.a.b;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class ar
    implements Runnable
{

    final b a;
    final j b;

    ar(j j1, b b1)
    {
        b = j1;
        a = b1;
        super();
    }

    public final void run()
    {
        j.e(b).onError(a.b(), a.c());
    }
}
