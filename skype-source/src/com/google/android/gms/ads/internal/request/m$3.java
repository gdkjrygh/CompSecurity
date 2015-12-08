// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;


// Referenced classes of package com.google.android.gms.ads.internal.request:
//            m

final class a
    implements Runnable
{

    final m a;

    public final void run()
    {
        if (m.b(a) != null)
        {
            m.b(a).a();
            m.a(a, null);
        }
    }

    (m m1)
    {
        a = m1;
        super();
    }
}
