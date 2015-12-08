// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk:
//            ct, bA, d, bv, 
//            c

public final class cl extends ct
{

    public String a;
    private List b;
    private String c;

    public cl(bv bv, c c1, String s, String s1, String s2, String s3, List list)
    {
        super(bA.f, bv, c1, c(s, s1));
        a = s2;
        c = s3;
        b = list;
    }

    public final String b()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("code", a);
        hashmap.put("nonce", c);
        hashmap.put("scope", TextUtils.join(" ", b));
        return com.paypal.android.sdk.d.a(hashmap);
    }

    public final void c()
    {
    }

    public final void d()
    {
        b(n());
    }

    public final String e()
    {
        return "{\"code\":\"EOTHbvqh0vwM2ldM2QIXbjVw0hZNuZEJLqdWmfTBLLSvGfqgyy9GKvjGybIxyGMd7gHXCXVtymqFQHS-J-4-Ir6u2LUVVdyLKonwTtdFw9qhBaMb4NZuZHKS0bGxdZlRAB3_Fk8HX2r3z8j03xScx4M\",\"scope\":\"https://uri.paypal.com/services/payments/futurepayments\"}";
    }
}
