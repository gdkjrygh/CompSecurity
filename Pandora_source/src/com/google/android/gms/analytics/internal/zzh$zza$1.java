// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzh, zzab

class a
    implements Runnable
{

    final zzab a;
    final a b;

    public void run()
    {
        if (!b.Ge.isConnected())
        {
            b.Ge.zzaG("Connected to service after a timeout");
            zzh.zza(b.Ge, a);
        }
    }

    _cls9(_cls9 _pcls9, zzab zzab)
    {
        b = _pcls9;
        a = zzab;
        super();
    }
}
