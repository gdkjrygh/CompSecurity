// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.b:
//            ah

public final class an extends ah
{

    public String a;
    public String b;
    public String c;
    public String d;

    public an()
    {
    }

    public final volatile void a(ah ah1)
    {
        a((an)ah1);
    }

    public final void a(an an1)
    {
        if (!TextUtils.isEmpty(a))
        {
            an1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            an1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            an1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            an1.d = d;
        }
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
