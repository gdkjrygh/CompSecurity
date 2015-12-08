// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.by;
import com.paypal.android.sdk.cC;
import com.paypal.android.sdk.cE;
import com.paypal.android.sdk.d;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk.payments:
//            k, aK

abstract class h
    implements k
{

    private aK a;

    protected h(aK ak)
    {
        a = ak;
    }

    private String a(cE ce, boolean flag)
    {
        String s = (new StringBuilder()).append(cC.b).append(":").append(b()).append(":").append(ce.a()).toString();
        ce = s;
        if (flag)
        {
            ce = (new StringBuilder()).append(s).append("|error").toString();
        }
        return ce;
    }

    protected final aK a()
    {
        return a;
    }

    public final void a(cE ce, boolean flag, String s, String s1, String s2)
    {
        by.a();
        String s4 = Locale.getDefault().toString();
        HashMap hashmap = new HashMap();
        String s3;
        boolean flag1;
        if (!d.a(s))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        hashmap.put("gn", a(ce, flag1));
        hashmap.put("v31", a(ce, flag1));
        s3 = (new StringBuilder()).append(a(ce, flag1)).append(":").append(ce.a(a.d(), flag)).toString();
        if (flag1)
        {
            s3 = (new StringBuilder()).append(s3).append("|error").toString();
        }
        hashmap.put("c25", s3);
        hashmap.put("v25", "D=c25");
        hashmap.put("c37", (new StringBuilder()).append(cC.a).append("::").toString());
        hashmap.put("c50", s4);
        hashmap.put("c35", "out");
        a(((Map) (hashmap)), ce, s1, s2);
        if (s != null)
        {
            hashmap.put("c29", s);
        }
        a("2.10.0", ((Map) (hashmap)));
    }

    abstract void a(String s, Map map);

    protected void a(Map map, cE ce, String s, String s1)
    {
    }

    protected abstract String b();
}
