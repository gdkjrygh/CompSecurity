// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            t, an, bh

class x
    implements Runnable
{

    final bh a;
    final t b;

    x(t t1, bh bh)
    {
        b = t1;
        a = bh;
        super();
    }

    public void run()
    {
        t.a(b).a(a);
    }
}
