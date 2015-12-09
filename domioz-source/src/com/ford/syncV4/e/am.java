// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.g;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class am
    implements Runnable
{

    final g a;
    final j b;

    am(j j1, g g)
    {
        b = j1;
        a = g;
        super();
    }

    public final void run()
    {
        j.e(b).onChangeRegistrationResponse(a);
    }
}
