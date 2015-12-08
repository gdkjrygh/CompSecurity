// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class jp extends jc
{

    public String a;
    public long b;
    public String c;
    public String d;

    public jp()
    {
    }

    public final void a(jc jc1)
    {
        jc1 = (jp)jc1;
        if (!TextUtils.isEmpty(a))
        {
            jc1.a = a;
        }
        if (b != 0L)
        {
            jc1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            jc1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            jc1.d = d;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("variableName", a);
        hashmap.put("timeInMillis", Long.valueOf(b));
        hashmap.put("category", c);
        hashmap.put("label", d);
        return a(hashmap);
    }
}
