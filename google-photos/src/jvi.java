// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

final class jvi
    implements jys
{

    private jva a;

    jvi(jva jva1)
    {
        a = jva1;
        super();
    }

    public final void a(ConnectionResult connectionresult)
    {
        jva.b(a, (new StringBuilder("Connection failed: ")).append(connectionresult).toString());
        jva.c(a);
    }
}
