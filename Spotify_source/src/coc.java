// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class coc extends cpd
{

    public String a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public coc()
    {
    }

    public final void a(cpd cpd1)
    {
        cpd1 = (coc)cpd1;
        if (b != 0)
        {
            cpd1.b = b;
        }
        if (c != 0)
        {
            cpd1.c = c;
        }
        if (d != 0)
        {
            cpd1.d = d;
        }
        if (e != 0)
        {
            cpd1.e = e;
        }
        if (f != 0)
        {
            cpd1.f = f;
        }
        if (!TextUtils.isEmpty(a))
        {
            cpd1.a = a;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("language", a);
        hashmap.put("screenColors", Integer.valueOf(b));
        hashmap.put("screenWidth", Integer.valueOf(c));
        hashmap.put("screenHeight", Integer.valueOf(d));
        hashmap.put("viewportWidth", Integer.valueOf(e));
        hashmap.put("viewportHeight", Integer.valueOf(f));
        return a(hashmap);
    }
}
