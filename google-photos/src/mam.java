// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

final class mam
    implements jys
{

    private lzu a;
    private mak b;

    mam(mak mak1, lzu lzu1)
    {
        b = mak1;
        a = lzu1;
        super();
    }

    public final void a(ConnectionResult connectionresult)
    {
        a.a(b.a(connectionresult));
    }
}
