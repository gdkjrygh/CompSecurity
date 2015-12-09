// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.bk;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class af
    implements Runnable
{

    final bk a;
    final j b;

    af(j j1, bk bk)
    {
        b = j1;
        a = bk;
        super();
    }

    public final void run()
    {
        j.e(b).onSliderResponse(a);
    }
}
