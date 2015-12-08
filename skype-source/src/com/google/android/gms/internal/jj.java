// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class jj extends jc
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private String f;

    public jj()
    {
    }

    public final String a()
    {
        return f;
    }

    public final void a(jc jc1)
    {
        jc1 = (jj)jc1;
        if (a != 0)
        {
            jc1.a = a;
        }
        if (b != 0)
        {
            jc1.b = b;
        }
        if (c != 0)
        {
            jc1.c = c;
        }
        if (d != 0)
        {
            jc1.d = d;
        }
        if (e != 0)
        {
            jc1.e = e;
        }
        if (!TextUtils.isEmpty(f))
        {
            jc1.f = f;
        }
    }

    public final void a(String s)
    {
        f = s;
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("language", f);
        hashmap.put("screenColors", Integer.valueOf(a));
        hashmap.put("screenWidth", Integer.valueOf(b));
        hashmap.put("screenHeight", Integer.valueOf(c));
        hashmap.put("viewportWidth", Integer.valueOf(d));
        hashmap.put("viewportHeight", Integer.valueOf(e));
        return a(hashmap);
    }
}
