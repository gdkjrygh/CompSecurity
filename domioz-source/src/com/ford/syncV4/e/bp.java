// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.c.ab;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class bp
    implements Runnable
{

    final ab a;
    final j b;

    bp(j j1, ab ab)
    {
        b = j1;
        a = ab;
        super();
    }

    public final void run()
    {
        j.e(b);
    }
}
