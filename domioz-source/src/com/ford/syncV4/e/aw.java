// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.p;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class aw
    implements Runnable
{

    final p a;
    final j b;

    aw(j j1, p p)
    {
        b = j1;
        a = p;
        super();
    }

    public final void run()
    {
        j.e(b).onDiagnosticMessageResponse(a);
    }
}
