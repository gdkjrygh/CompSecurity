// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

// Referenced classes of package com.google.gson:
//            k, l

public final class m extends k
{

    public final LinkedTreeMap a = new LinkedTreeMap();

    public m()
    {
    }

    public final void a(String s, k k1)
    {
        Object obj = k1;
        if (k1 == null)
        {
            obj = l.a;
        }
        a.put(s, obj);
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof m) && ((m)obj).a.equals(a);
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
