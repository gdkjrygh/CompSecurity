// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class kzk extends kzs
{

    private kzr a;
    private kzj b;

    kzk(kzj kzj1, kzr kzr1)
    {
        b = kzj1;
        a = kzr1;
        super();
    }

    public final void a(int i)
    {
        kzj.f().a("onRemoteDisplayEnded", new Object[0]);
        if (a != null)
        {
            a.a(i);
        }
        if (kzj.a(b) != null)
        {
            kzj.a(b).a(new Status(i));
        }
    }
}
