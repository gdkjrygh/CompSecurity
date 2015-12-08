// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzht;

// Referenced classes of package com.google.android.gms.tagmanager:
//            au, p, zzbg

class a
    implements zza
{

    final au a;

    public void zza(p p1)
    {
        au.a(a, p1.a());
    }

    public void zzb(p p1)
    {
        au.a(a, p1.a());
        zzbg.zzam((new StringBuilder()).append("Permanent failure dispatching hitId: ").append(p1.a()).toString());
    }

    public void zzc(p p1)
    {
        long l = p1.b();
        if (l == 0L)
        {
            au.a(a, p1.a(), au.a(a).currentTimeMillis());
        } else
        if (l + 0xdbba00L < au.a(a).currentTimeMillis())
        {
            au.a(a, p1.a());
            zzbg.zzam((new StringBuilder()).append("Giving up on failed hitId: ").append(p1.a()).toString());
            return;
        }
    }

    zza(au au1)
    {
        a = au1;
        super();
    }
}
