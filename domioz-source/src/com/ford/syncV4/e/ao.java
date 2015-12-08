// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.ar;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class ao
    implements Runnable
{

    final ar a;
    final j b;

    ao(j j1, ar ar)
    {
        b = j1;
        a = ar;
        super();
    }

    public final void run()
    {
        j.e(b).onPerformAudioPassThruResponse(a);
    }
}
