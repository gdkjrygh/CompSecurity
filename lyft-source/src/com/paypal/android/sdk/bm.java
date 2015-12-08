// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            aD

public final class bm extends Enum
{

    public static final bm a;
    public static final bm b;
    public static final bm c;
    public static final bm d;
    public static final bm e;
    public static final bm f;
    public static final bm g;
    public static final bm h;
    public static final bm i;
    private static bm j;
    private static bm k;
    private static bm l;
    private static bm m;
    private static final bm p[];
    private aD n;
    private String o;

    private bm(String s, int i1, aD ad, String s1)
    {
        super(s, i1);
        n = ad;
        o = s1;
    }

    public static bm valueOf(String s)
    {
        return (bm)Enum.valueOf(com/paypal/android/sdk/bm, s);
    }

    public static bm[] values()
    {
        return (bm[])p.clone();
    }

    final aD a()
    {
        return n;
    }

    final String b()
    {
        return o;
    }

    static 
    {
        a = new bm("SiteCatalystRequest", 0, aD.a, null);
        b = new bm("FptiRequest", 1, aD.b, null);
        c = new bm("PreAuthRequest", 2, aD.b, "oauth2/token");
        d = new bm("LoginRequest", 3, aD.b, "oauth2/login");
        e = new bm("LoginChallengeRequest", 4, aD.b, "oauth2/login/challenge");
        f = new bm("ConsentRequest", 5, aD.b, "oauth2/consent");
        j = new bm("CreditCardPaymentRequest", 6, aD.b, "payments/payment");
        k = new bm("PayPalPaymentRequest", 7, aD.b, "payments/payment");
        l = new bm("CreateSfoPaymentRequest", 8, aD.b, "orchestration/msdk-create-sfo-payment");
        m = new bm("ApproveAndExecuteSfoPaymentRequest", 9, aD.b, "orchestration/msdk-approve-and-execute-sfo-payment");
        g = new bm("TokenizeCreditCardRequest", 10, aD.b, "vault/credit-card");
        h = new bm("DeleteCreditCardRequest", 11, aD.c, "vault/credit-card");
        i = new bm("GetAppInfoRequest", 12, aD.a, "apis/applications");
        p = (new bm[] {
            a, b, c, d, e, f, j, k, l, m, 
            g, h, i
        });
    }
}
