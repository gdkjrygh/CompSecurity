// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class ljs extends liz
{

    public String a;
    public long b;
    public String c;
    public String d;

    public ljs()
    {
    }

    public final void a(liz liz1)
    {
        liz1 = (ljs)liz1;
        if (!TextUtils.isEmpty(a))
        {
            liz1.a = a;
        }
        if (b != 0L)
        {
            liz1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            liz1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            liz1.d = d;
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
