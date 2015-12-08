// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class kzi extends kzf
{

    private kzg a;

    protected kzi(kzg kzg1)
    {
        a = kzg1;
        super(kzg1.g);
    }

    public final void a()
    {
        kzb.a().a("onDisconnected", new Object[0]);
        kzb.a(a.g);
        a.a(new juy(Status.a));
    }

    public final void a(int i)
    {
        kzb.a().a("onError: %d", new Object[] {
            Integer.valueOf(i)
        });
        kzb.a(a.g);
        a.a(new juy(Status.c));
    }
}
