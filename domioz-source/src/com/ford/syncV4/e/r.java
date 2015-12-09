// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.c;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class r
    implements Runnable
{

    final c a;
    final j b;

    r(j j1, c c)
    {
        b = j1;
        a = c;
        super();
    }

    public final void run()
    {
        j.e(b).onAddSubMenuResponse(a);
    }
}
