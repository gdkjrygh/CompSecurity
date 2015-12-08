// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.aj;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class bq
    implements Runnable
{

    final aj a;
    final j b;

    bq(j j1, aj aj)
    {
        b = j1;
        a = aj;
        super();
    }

    public final void run()
    {
        j.e(b).onOnKeyboardInput(a);
    }
}
