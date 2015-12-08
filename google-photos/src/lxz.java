// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class lxz
    implements jyx
{

    private lxi a;

    lxz(lxu lxu, lxi lxi1)
    {
        a = lxi1;
        super();
    }

    public final void a(jyw jyw)
    {
        jyw = (Status)jyw;
        a.a(Boolean.valueOf(jyw.b()));
    }
}
