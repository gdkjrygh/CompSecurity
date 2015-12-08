// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            di

final class b
    implements Runnable
{

    final List a;
    final long b;
    final di c;

    public final void run()
    {
        di.a(c, a, b);
    }

    (di di1, List list, long l)
    {
        c = di1;
        a = list;
        b = l;
        super();
    }
}
