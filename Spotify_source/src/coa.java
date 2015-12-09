// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class coa extends cpd
{

    public String a;
    public String b;
    public String c;
    public String d;

    public coa()
    {
    }

    public final void a(coa coa1)
    {
        if (!TextUtils.isEmpty(a))
        {
            coa1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            coa1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            coa1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            coa1.d = d;
        }
    }

    public final volatile void a(cpd cpd1)
    {
        a((coa)cpd1);
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("appName", a);
        hashmap.put("appVersion", b);
        hashmap.put("appId", c);
        hashmap.put("appInstallerId", d);
        return a(hashmap);
    }
}
