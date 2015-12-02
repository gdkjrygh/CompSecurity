// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class bic
{

    public static final se a;
    public static final bib b = new ape();
    public static final biz c = new apj();
    public static final bih d = new api();
    private static final sl e;
    private static final sk f;

    static sl a()
    {
        return e;
    }

    public static void a(sq sq)
    {
        b.a(sq);
    }

    public static void a(sq sq, FullWalletRequest fullwalletrequest)
    {
        b.a(sq, fullwalletrequest);
    }

    public static void a(sq sq, MaskedWalletRequest maskedwalletrequest)
    {
        b.a(sq, maskedwalletrequest);
    }

    public static void a(sq sq, String s, String s1)
    {
        b.a(sq, s, s1);
    }

    static 
    {
        e = new sl();
        f = new _cls1();
        a = new se("Wallet.API", f, e, new Scope[0]);
    }

    /* member class not found */
    class _cls1 {}

}
