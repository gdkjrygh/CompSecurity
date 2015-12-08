// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class ljo extends liz
{

    public String a;
    public String b;
    public String c;
    public long d;

    public ljo()
    {
    }

    public final void a(liz liz1)
    {
        liz1 = (ljo)liz1;
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
        if (d != 0L)
        {
            liz1.d = d;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("category", a);
        hashmap.put("action", b);
        hashmap.put("label", c);
        hashmap.put("value", Long.valueOf(d));
        return a(hashmap);
    }
}
