// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.at;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class aa
    implements Runnable
{

    final at a;
    final j b;

    aa(j j1, at at)
    {
        b = j1;
        a = at;
        super();
    }

    public final void run()
    {
        j.e(b).onPerformInteractionResponse(a);
    }
}
