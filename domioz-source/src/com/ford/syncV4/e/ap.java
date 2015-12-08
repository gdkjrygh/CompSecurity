// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.r;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class ap
    implements Runnable
{

    final r a;
    final j b;

    ap(j j1, r r)
    {
        b = j1;
        a = r;
        super();
    }

    public final void run()
    {
        j.e(b).onEndAudioPassThruResponse(a);
    }
}
