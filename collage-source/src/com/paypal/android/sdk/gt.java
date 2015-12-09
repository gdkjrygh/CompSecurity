// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Intent;

// Referenced classes of package com.paypal.android.sdk:
//            gs, gu, hk

public final class gt
{

    private static final gs a;

    public static String a(gu gu1)
    {
        return a.a(gu1);
    }

    public static void a(Intent intent)
    {
        a.a(intent.getStringExtra("io.card.payment.languageOrLocale"));
    }

    static 
    {
        a = new gs(com/paypal/android/sdk/gu, hk.a);
    }
}
