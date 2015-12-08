// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

public final class kbw extends kbp
{

    private kbo a;

    public kbw(kbo kbo1)
    {
        a = kbo1;
        super(kbo1, 0, null);
    }

    protected final void a(ConnectionResult connectionresult)
    {
        kbo.a(a).a(connectionresult);
        a.a(connectionresult);
    }

    protected final boolean a()
    {
        kbo.a(a).a(ConnectionResult.a);
        return true;
    }
}
