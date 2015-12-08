// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.b:
//            ah

public final class au extends ah
{

    public String a;
    public String b;
    public String c;

    public au()
    {
    }

    public final void a(ah ah1)
    {
        ah1 = (au)ah1;
        if (!TextUtils.isEmpty(a))
        {
            ah1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            ah1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            ah1.c = c;
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
