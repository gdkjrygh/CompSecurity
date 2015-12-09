// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class p
    implements Runnable
{

    final com.ford.syncV4.e.c.b a;
    final j b;

    p(j j1, com.ford.syncV4.e.c.b b1)
    {
        b = j1;
        a = b1;
        super();
    }

    public final void run()
    {
        j.e(b).onAddCommandResponse(a);
    }
}
