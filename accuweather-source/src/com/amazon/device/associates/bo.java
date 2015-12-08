// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Referenced classes of package com.amazon.device.associates:
//            y

class bo
{

    public static final DateFormat a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static String b;
    private static String c = "AmazonMobileAssociates";
    private static boolean d = false;
    private static Context e;

    bo()
    {
    }

    protected static int a(String s, String s1)
    {
        return a().getResources().getIdentifier(s, s1, a().getPackageName());
    }

    protected static Context a()
    {
        return e;
    }

    public static void a(Context context, String s)
    {
        e = context;
        b = (new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").toString();
        if (b() != null && !b().equals(s))
        {
            y.b((new StringBuilder()).append(b).append("rut.db").toString());
        }
        context = context.getSharedPreferences(c, 0).edit();
        context.putString("amzn-ad-app-id", s);
        context.commit();
        d = true;
    }

    protected static String b()
    {
        return e.getSharedPreferences(c, 0).getString("amzn-ad-app-id", null);
    }

}
