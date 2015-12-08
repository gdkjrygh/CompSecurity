// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class ljm extends liz
{

    public String a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public ljm()
    {
    }

    public final void a(liz liz1)
    {
        liz1 = (ljm)liz1;
        if (b != 0)
        {
            liz1.b = b;
        }
        if (c != 0)
        {
            liz1.c = c;
        }
        if (d != 0)
        {
            liz1.d = d;
        }
        if (e != 0)
        {
            liz1.e = e;
        }
        if (f != 0)
        {
            liz1.f = f;
        }
        if (!TextUtils.isEmpty(a))
        {
            liz1.a = a;
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
