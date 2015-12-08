// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.UUID;

// Referenced classes of package com.paypal.android.sdk:
//            bQ, cA, bL, bE, 
//            bN, bS

public final class bB
{

    public bQ a;
    public cA b;
    public bL c;
    public String d;
    public bE e;
    public bN f;
    public bS g;
    public bL h;
    public boolean i;
    public String j;

    public bB()
    {
        a = new bQ();
        b = new cA();
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
