// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

public final class bsk extends bsd
{

    private bsc a;

    public bsk(bsc bsc1)
    {
        a = bsc1;
        super(bsc1, 0, null);
    }

    protected final void a(ConnectionResult connectionresult)
    {
        bsc.a(a).a(connectionresult);
        a.a(connectionresult);
    }

    protected final boolean a()
    {
        bsc.a(a).a(ConnectionResult.a);
        return true;
    }
}
