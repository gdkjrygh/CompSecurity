// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Context;
import android.content.res.Resources;
import com.qihoo.antivirus.update.b;
import com.qihoo.security.env.a;
import java.util.HashMap;

public final class c
{

    public static int a(Context context)
    {
        return com.qihoo.antivirus.update.b.a(context, "i18n_security_lite", 0);
    }

    public static int a(Context context, int i, String s, HashMap hashmap)
    {
        if (hashmap != null)
        {
            hashmap.put("i18ncid", Integer.toString(com.qihoo.security.env.a.a(context)));
            hashmap.put("product", "i18n_security_lite");
            hashmap.put("permission", "com.qihoo.antivirus.update.permission.i18n_security_lite");
            if (hashmap.containsKey("i18ntype") && context != null)
            {
                int j = context.getResources().getInteger(0x7f0a0001);
                if (j != 0)
                {
                    hashmap.put("i18ntype", Integer.toString(Integer.parseInt((String)hashmap.get("i18ntype")) + j));
                }
            }
        }
        return com.qihoo.antivirus.update.b.a(context, i, s, hashmap);
    }

    public static String a()
    {
        return "1.0.8.3742";
    }

    public static int b(Context context)
    {
        return com.qihoo.antivirus.update.b.a(context, "i18n_security_lite", 1);
    }
}
