// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Scope;

public final class baf
{

    public static final sl a;
    static final sk b;
    public static final se c;
    public static final Scope d = new Scope("https://www.googleapis.com/auth/plus.login");
    public static final Scope e = new Scope("https://www.googleapis.com/auth/plus.me");
    public static final bad f = new anb();
    public static final bae g = new anc();
    public static final bac h = new amy();
    public static final bbr i = new ana();
    public static final bbq j = new amz();

    public static bbj a(sq sq1)
    {
        boolean flag;
        if (sq1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.b(flag, "GoogleApiClient parameter is required.");
        wn.a(sq1.d(), "GoogleApiClient must be connected.");
        wn.a(sq1.a(c), "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        flag = sq1.b(c);
        if (!flag)
        {
            throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
        }
        if (flag)
        {
            return (bbj)sq1.a(a);
        } else
        {
            return null;
        }
    }

    static 
    {
        a = new sl();
        b = new _cls1();
        c = new se("Plus.API", b, a, new Scope[0]);
    }

    /* member class not found */
    class _cls1 {}

}
