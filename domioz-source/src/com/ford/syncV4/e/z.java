// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.m;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class z
    implements Runnable
{

    final m a;
    final j b;

    z(j j1, m m)
    {
        b = j1;
        a = m;
        super();
    }

    public final void run()
    {
        j.e(b).onDeleteInteractionChoiceSetResponse(a);
    }
}
