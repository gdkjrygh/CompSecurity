// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.l;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class ai
    implements Runnable
{

    final l a;
    final j b;

    ai(j j1, l l)
    {
        b = j1;
        a = l;
        super();
    }

    public final void run()
    {
        j.e(b).onDeleteFileResponse(a);
    }
}
