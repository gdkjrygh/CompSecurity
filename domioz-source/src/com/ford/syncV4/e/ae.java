// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.t;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class ae
    implements Runnable
{

    final t a;
    final j b;

    ae(j j1, t t)
    {
        b = j1;
        a = t;
        super();
    }

    public final void run()
    {
        j.e(b).onGenericResponse(a);
    }
}
