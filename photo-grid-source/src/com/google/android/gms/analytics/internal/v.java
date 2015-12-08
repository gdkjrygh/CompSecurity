// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            s, am, d

final class v
    implements Runnable
{

    final d a;
    final s b;

    v(s s1, d d)
    {
        b = s1;
        a = d;
        super();
    }

    public final void run()
    {
        s.a(b).a(a);
    }
}
