// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            t, an

class u
    implements Runnable
{

    final boolean a;
    final t b;

    u(t t1, boolean flag)
    {
        b = t1;
        a = flag;
        super();
    }

    public void run()
    {
        t.a(b).a(a);
    }
}
