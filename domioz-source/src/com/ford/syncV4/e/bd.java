// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.c.an;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class bd extends Thread
{

    final an a;
    final j b;

    bd(j j1, an an)
    {
        b = j1;
        a = an;
        super();
    }

    public final void run()
    {
        j.a(b, a);
    }
}
