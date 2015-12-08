// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.ap;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class br
    implements Runnable
{

    final ap a;
    final j b;

    br(j j1, ap ap)
    {
        b = j1;
        a = ap;
        super();
    }

    public final void run()
    {
        j.e(b).onOnTouchEvent(a);
    }
}
