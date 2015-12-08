// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class jo extends jc
{

    public String a;
    public String b;
    public String c;

    public jo()
    {
    }

    public final void a(jc jc1)
    {
        jc1 = (jo)jc1;
        if (!TextUtils.isEmpty(a))
        {
            jc1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            jc1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            jc1.c = c;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("network", a);
        hashmap.put("action", b);
        hashmap.put("target", c);
        return a(hashmap);
    }
}
