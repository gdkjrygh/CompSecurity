// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.device.iap.internal.util.d;
import com.amazon.device.iap.internal.util.e;

public class c
{

    private static c a = new c();
    private static final String b = com/amazon/device/iap/internal/c/c.getSimpleName();
    private static final String c = (new StringBuilder()).append(com/amazon/device/iap/internal/c/c.getName()).append("_PREFS_").toString();

    public c()
    {
    }

    public static c a()
    {
        return a;
    }

    public String a(String s, String s1)
    {
        String s2;
        s2 = null;
        e.a(b, (new StringBuilder()).append("enter getReceiptIdFromSku for sku [").append(s1).append("], user [").append(s).append("]").toString());
        Object obj;
        d.a(s, "userId");
        d.a(s1, "sku");
        obj = com.amazon.device.iap.internal.d.d().b();
        d.a(obj, "context");
        obj = ((Context) (obj)).getSharedPreferences((new StringBuilder()).append(c).append(s).toString(), 0).getString(s1, null);
        s2 = ((String) (obj));
_L2:
        e.a(b, (new StringBuilder()).append("leaving saveEntitlementRecord for sku [").append(s1).append("], user [").append(s).append("]").toString());
        return s2;
        Throwable throwable;
        throwable;
        e.a(b, (new StringBuilder()).append("error in saving v1 Entitlement:").append(s1).append(":").append(throwable.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(String s, String s1, String s2)
    {
        e.a(b, (new StringBuilder()).append("enter saveEntitlementRecord for v1 Entitlement [").append(s1).append("/").append(s2).append("], user [").append(s).append("]").toString());
        try
        {
            d.a(s, "userId");
            d.a(s1, "receiptId");
            d.a(s2, "sku");
            Object obj = com.amazon.device.iap.internal.d.d().b();
            d.a(obj, "context");
            obj = ((Context) (obj)).getSharedPreferences((new StringBuilder()).append(c).append(s).toString(), 0).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString(s2, s1);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        catch (Throwable throwable)
        {
            e.a(b, (new StringBuilder()).append("error in saving v1 Entitlement:").append(s1).append("/").append(s2).append(":").append(throwable.getMessage()).toString());
        }
        e.a(b, (new StringBuilder()).append("leaving saveEntitlementRecord for v1 Entitlement [").append(s1).append("/").append(s2).append("], user [").append(s).append("]").toString());
    }

}
