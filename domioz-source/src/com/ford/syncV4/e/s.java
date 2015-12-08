// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.n;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class s
    implements Runnable
{

    final n a;
    final j b;

    s(j j1, n n)
    {
        b = j1;
        a = n;
        super();
    }

    public final void run()
    {
        j.e(b).onDeleteSubMenuResponse(a);
    }
}
