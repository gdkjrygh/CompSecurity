// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class ljr extends liz
{

    public String a;
    public String b;
    public String c;

    public ljr()
    {
    }

    public final void a(liz liz1)
    {
        liz1 = (ljr)liz1;
        if (!TextUtils.isEmpty(a))
        {
            liz1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            liz1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            liz1.c = c;
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
