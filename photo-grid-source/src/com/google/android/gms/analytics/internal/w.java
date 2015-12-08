// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            s, am, bf

final class w
    implements Runnable
{

    final bf a;
    final s b;

    w(s s1, bf bf)
    {
        b = s1;
        a = bf;
        super();
    }

    public final void run()
    {
        s.a(b).a(a);
    }
}
