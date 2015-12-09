// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            t, an, d

class w
    implements Runnable
{

    final d a;
    final t b;

    w(t t1, d d)
    {
        b = t1;
        a = d;
        super();
    }

    public void run()
    {
        t.a(b).a(a);
    }
}
