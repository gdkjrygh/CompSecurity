// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

final class jzo extends kaa
{

    private ConnectionResult a;
    private jzn b;

    jzo(jzn jzn1, kae kae, ConnectionResult connectionresult)
    {
        b = jzn1;
        a = connectionresult;
        super(kae);
    }

    public final void a()
    {
        b.a.b(a);
    }
}
