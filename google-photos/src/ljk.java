// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class ljk extends liz
{

    public String a;
    public String b;
    public String c;
    public String d;

    public ljk()
    {
    }

    public final volatile void a(liz liz1)
    {
        a((ljk)liz1);
    }

    public final void a(ljk ljk1)
    {
        if (!TextUtils.isEmpty(a))
        {
            ljk1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            ljk1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            ljk1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            ljk1.d = d;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("appName", a);
        hashmap.put("appVersion", b);
        hashmap.put("appId", c);
        hashmap.put("appInstallerId", d);
        return a(hashmap);
    }
}
