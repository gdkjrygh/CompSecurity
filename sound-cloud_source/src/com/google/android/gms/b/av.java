// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.b:
//            ah

public final class av extends ah
{

    public String a;
    public long b;
    public String c;
    public String d;

    public av()
    {
    }

    public final void a(ah ah1)
    {
        ah1 = (av)ah1;
        if (!TextUtils.isEmpty(a))
        {
            ah1.a = a;
        }
        if (b != 0L)
        {
            ah1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            ah1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            ah1.d = d;
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
