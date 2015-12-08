// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class coi extends cpd
{

    public String a;
    public long b;
    public String c;
    public String d;

    public coi()
    {
    }

    public final void a(cpd cpd1)
    {
        cpd1 = (coi)cpd1;
        if (!TextUtils.isEmpty(a))
        {
            cpd1.a = a;
        }
        if (b != 0L)
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
