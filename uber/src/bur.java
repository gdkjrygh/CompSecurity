// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.bI;
import com.paypal.android.sdk.payments.PayPalService;
import java.util.HashMap;
import java.util.Map;

public final class bur
{

    private static final String a = com/paypal/android/sdk/payments/PayPalService.getSimpleName();
    private static Map b = new HashMap();

    public static bI a(String s)
    {
        bI bi = (bI)b.get(s);
        (new StringBuilder("getLoginAccessToken(")).append(s).append(") returns String:").append(bi);
        return bi;
    }

    public static void a(bI bi, String s)
    {
        b.put(s, bi);
        (new StringBuilder("setLoginAccessToken(")).append(bi).append(",").append(s).append(")");
    }

    public static void b(String s)
    {
        b.remove(s);
    }

}
