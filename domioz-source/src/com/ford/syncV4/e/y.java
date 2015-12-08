// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.j;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class y
    implements Runnable
{

    final j a;
    final com.ford.syncV4.e.j b;

    y(com.ford.syncV4.e.j j1, j j2)
    {
        b = j1;
        a = j2;
        super();
    }

    public final void run()
    {
        j.e(b).onCreateInteractionChoiceSetResponse(a);
    }
}
