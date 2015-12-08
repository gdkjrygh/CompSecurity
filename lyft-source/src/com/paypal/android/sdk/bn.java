// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.UUID;

// Referenced classes of package com.paypal.android.sdk:
//            bC, cm, bx, bq, 
//            bz, bE

public final class bn
{

    public bC a;
    public cm b;
    public bx c;
    public String d;
    public bq e;
    public bz f;
    public bE g;
    public bx h;
    public boolean i;
    public String j;

    public bn()
    {
        a = new bC();
        b = new cm();
        UUID.randomUUID().toString();
    }

    public final boolean a()
    {
        return c != null && c.b();
    }

    public final String toString()
    {
        return (new StringBuilder("BackendState(accessTokenState:")).append(c).append(" loginAccessToken:").append(h).append(")").toString();
    }
}
