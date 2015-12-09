// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.bo;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class m
    implements Runnable
{

    final bo a;
    final j b;

    m(j j1, bo bo)
    {
        b = j1;
        a = bo;
        super();
    }

    public final void run()
    {
        j.e(b).onSpeakResponse(a);
    }
}
