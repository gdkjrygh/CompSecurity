// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzi, zzac

class a
    implements Runnable
{

    final zzac a;
    final a b;

    public void run()
    {
        if (!b.b.b())
        {
            b.b.c("Connected to service after a timeout");
            zzi.a(b.b, a);
        }
    }

    _cls9(_cls9 _pcls9, zzac zzac)
    {
        b = _pcls9;
        a = zzac;
        super();
    }
}
