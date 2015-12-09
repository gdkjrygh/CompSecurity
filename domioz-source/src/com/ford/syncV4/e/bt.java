// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class bt
    implements Runnable
{

    final Exception a;
    final j b;

    bt(j j1, Exception exception)
    {
        b = j1;
        a = exception;
        super();
    }

    public final void run()
    {
        j.e(b).onError("Error handing proxy event.", a);
    }
}
