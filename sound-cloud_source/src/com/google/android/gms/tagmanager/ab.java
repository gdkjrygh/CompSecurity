// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aa

final class ab
    implements Runnable
{

    final List a;
    final long b;
    final aa c;

    ab(aa aa1, List list, long l)
    {
        c = aa1;
        a = list;
        b = l;
        super();
    }

    public final void run()
    {
        aa.a(c, a, b);
    }
}
