// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.device.iap.internal.d;

// Referenced classes of package com.amazon.device.iap.internal.util:
//            d

public class b
{

    private static final String a = (new StringBuilder()).append(com/amazon/device/iap/internal/util/b.getName()).append("_PREFS").toString();

    public b()
    {
    }

    public static String a(String s)
    {
        d.a(s, "userId");
        Context context = d.d().b();
        d.a(context, "context");
        return context.getSharedPreferences(a, 0).getString(s, null);
    }

    public static void a(String s, String s1)
    {
        d.a(s, "userId");
        Object obj = d.d().b();
        d.a(obj, "context");
        obj = ((Context) (obj)).getSharedPreferences(a, 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString(s, s1);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
    }

}
