// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Intent;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.card.payment:
//            j, ao, B, k

public final class an
{

    private static final j a;

    public static String a(ao ao1)
    {
        return a.a(ao1);
    }

    public static String a(ao ao1, String s)
    {
        return a.a(ao1, a.b(s));
    }

    public static void a(Intent intent)
    {
        a.a(intent.getStringExtra("io.card.payment.languageOrLocale"));
    }

    static 
    {
        a = new j(io/card/payment/ao);
        k k1;
        for (Iterator iterator = B.a.iterator(); iterator.hasNext(); a.a(k1))
        {
            k1 = (k)iterator.next();
        }

    }
}
