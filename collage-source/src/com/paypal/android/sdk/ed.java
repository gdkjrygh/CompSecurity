// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.UUID;

// Referenced classes of package com.paypal.android.sdk:
//            bN, cz, bI, bB, 
//            bK, cy

public final class ed
{

    public bN a;
    public cz b;
    public bI c;
    public String d;
    public bB e;
    public bK f;
    public cy g;
    public bI h;
    public boolean i;
    public String j;
    private String k;

    public ed()
    {
        a = new bN();
        b = new cz();
        a();
    }

    public final void a()
    {
        k = UUID.randomUUID().toString();
    }

    public final String b()
    {
        return k;
    }

    public final boolean c()
    {
        return c != null && c.c();
    }

    public final String toString()
    {
        return (new StringBuilder("BackendState(accessTokenState:")).append(c).append(" loginAccessToken:").append(h).append(")").toString();
    }
}
