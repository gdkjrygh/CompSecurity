// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class ljp extends liz
{

    public String a;
    public boolean b;

    public ljp()
    {
    }

    public final void a(liz liz1)
    {
        liz1 = (ljp)liz1;
        if (!TextUtils.isEmpty(a))
        {
            liz1.a = a;
        }
        if (b)
        {
            liz1.b = b;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("description", a);
        hashmap.put("fatal", Boolean.valueOf(b));
        return a(hashmap);
    }
}
