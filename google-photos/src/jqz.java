// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class jqz extends liz
{

    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public boolean g;
    public double h;

    public jqz()
    {
    }

    public final void a(liz liz1)
    {
        boolean flag = true;
        liz1 = (jqz)liz1;
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
        if (!TextUtils.isEmpty(d))
        {
            liz1.d = d;
        }
        if (e)
        {
            liz1.e = true;
        }
        if (!TextUtils.isEmpty(f))
        {
            liz1.f = f;
        }
        if (g)
        {
            liz1.g = g;
        }
        if (h != 0.0D)
        {
            double d1 = h;
            if (d1 < 0.0D || d1 > 100D)
            {
                flag = false;
            }
            b.b(flag, "Sample rate must be between 0% and 100%");
            liz1.h = d1;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("hitType", a);
        hashmap.put("clientId", b);
        hashmap.put("userId", c);
        hashmap.put("androidAdId", d);
        hashmap.put("AdTargetingEnabled", Boolean.valueOf(e));
        hashmap.put("sessionControl", f);
        hashmap.put("nonInteraction", Boolean.valueOf(g));
        hashmap.put("sampleRate", Double.valueOf(h));
        return liz.a(hashmap, 0);
    }
}
