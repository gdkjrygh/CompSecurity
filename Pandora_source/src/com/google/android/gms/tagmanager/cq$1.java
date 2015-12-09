// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cq

class b
    implements Runnable
{

    final List a;
    final long b;
    final cq c;

    public void run()
    {
        cq.a(c, a, b);
    }

    (cq cq1, List list, long l)
    {
        c = cq1;
        a = list;
        b = l;
        super();
    }
}
