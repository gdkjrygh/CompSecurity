// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.d:
//            ab

public final class aq extends ab
{

    public String a;
    public boolean b;

    public aq()
    {
    }

    public String a()
    {
        return a;
    }

    public volatile void a(ab ab1)
    {
        a((aq)ab1);
    }

    public void a(aq aq1)
    {
        if (!TextUtils.isEmpty(a))
        {
            aq1.a(a);
        }
        if (b)
        {
            aq1.a(b);
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
