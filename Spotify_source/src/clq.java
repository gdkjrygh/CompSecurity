// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class clq extends cpd
{

    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public boolean g;
    public double h;

    public clq()
    {
    }

    public final void a(cpd cpd1)
    {
        boolean flag = true;
        cpd1 = (clq)cpd1;
        if (!TextUtils.isEmpty(a))
        {
            cpd1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            cpd1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            cpd1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            cpd1.d = d;
        }
        if (e)
        {
            cpd1.e = true;
        }
        if (!TextUtils.isEmpty(f))
        {
            cpd1.f = f;
        }
        if (g)
        {
            cpd1.g = g;
        }
        if (h != 0.0D)
        {
            double d1 = h;
            if (d1 < 0.0D || d1 > 100D)
            {
                flag = false;
            }
            btl.b(flag, "Sample rate must be between 0% and 100%");
            cpd1.h = d1;
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
        return a(hashmap);
    }
}
