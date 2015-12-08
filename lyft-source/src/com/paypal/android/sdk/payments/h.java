// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.R;
import com.paypal.android.sdk.bk;
import com.paypal.android.sdk.co;
import com.paypal.android.sdk.cp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk.payments:
//            k, aE

abstract class h
    implements k
{

    private aE a;

    protected h(aE ae)
    {
        a = ae;
    }

    private String a(cp cp1, boolean flag)
    {
        String s = (new StringBuilder()).append(co.b).append(":").append(b()).append(":").append(cp1.a()).toString();
        cp1 = s;
        if (flag)
        {
            cp1 = (new StringBuilder()).append(s).append("|error").toString();
        }
        return cp1;
    }

    protected final aE a()
    {
        return a;
    }

    public final void a(cp cp1, boolean flag, String s, String s1, String s2)
    {
        bk.a();
        String s4 = Locale.getDefault().toString();
        HashMap hashmap = new HashMap();
        String s3;
        boolean flag1;
        if (!R.a(s))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        hashmap.put("gn", a(cp1, flag1));
        hashmap.put("v31", a(cp1, flag1));
        s3 = (new StringBuilder()).append(a(cp1, flag1)).append(":").append(cp1.a(a.d(), flag)).toString();
        if (flag1)
        {
            s3 = (new StringBuilder()).append(s3).append("|error").toString();
        }
        hashmap.put("c25", s3);
        hashmap.put("v25", "D=c25");
        hashmap.put("c37", (new StringBuilder()).append(co.a).append("::").toString());
        hashmap.put("c50", s4);
        hashmap.put("c35", "out");
        a(((Map) (hashmap)), cp1, s1, s2);
        if (s != null)
        {
            hashmap.put("c29", s);
        }
        a("2.9.0", ((Map) (hashmap)));
    }

    abstract void a(String s, Map map);

    protected void a(Map map, cp cp1, String s, String s1)
    {
    }

    protected abstract String b();
}
