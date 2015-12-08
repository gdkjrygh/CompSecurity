// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.ad;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class bh
    implements Runnable
{

    final ad a;
    final j b;

    bh(j j1, ad ad)
    {
        b = j1;
        a = ad;
        super();
    }

    public final void run()
    {
        j.e(b).onOnButtonEvent(a);
    }
}
