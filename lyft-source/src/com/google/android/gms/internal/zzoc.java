// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzoc extends zznq
{

    public String a;
    public boolean b;

    public zzoc()
    {
    }

    public String a()
    {
        return a;
    }

    public volatile void a(zznq zznq1)
    {
        a((zzoc)zznq1);
    }

    public void a(zzoc zzoc1)
    {
        if (!TextUtils.isEmpty(a))
        {
            zzoc1.a(a);
        }
        if (b)
        {
            zzoc1.a(b);
        }
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean b()
    {
        return b;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("description", a);
        hashmap.put("fatal", Boolean.valueOf(b));
        return a(hashmap);
    }
}
