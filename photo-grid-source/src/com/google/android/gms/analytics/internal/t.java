// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            s, am

final class t
    implements Runnable
{

    final boolean a;
    final s b;

    t(s s1, boolean flag)
    {
        b = s1;
        a = flag;
        super();
    }

    public final void run()
    {
        s.a(b).g();
    }
}
