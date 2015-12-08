// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.Map;

final class acq
{

    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    String m;
    String n;
    String o;
    String p;
    String q;
    String r;
    String s;
    Map t;

    acq(Context context)
    {
        Object obj;
        String s1;
        Object obj1 = null;
        super();
        obj = context.getResources();
        DisplayMetrics displaymetrics = ((Resources) (obj)).getDisplayMetrics();
        obj = ((Resources) (obj)).getConfiguration();
        Locale locale = ((Configuration) (obj)).locale;
        int i1 = ((Configuration) (obj)).screenLayout;
        boolean flag;
        if (ada.a(context) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if (!adf.a(context, "android.permission.ACCESS_WIFI_STATE"))
            {
                acl.a().d("Missing permission: ACCESS_WIFI_STATE", new Object[0]);
            }
            s1 = ada.c(context);
        } else
        {
            s1 = null;
        }
        f = context.getPackageName();
        g = a(context);
        i1 & 0xf;
        JVM INSTR tableswitch 1 4: default 128
    //                   1 397
    //                   2 397
    //                   3 403
    //                   4 403;
           goto _L1 _L2 _L2 _L3 _L3
_L1:
        obj = null;
_L12:
        h = ((String) (obj));
        i = Build.MODEL;
        j = Build.MANUFACTURER;
        k = "android";
        obj = (new StringBuilder()).append(android.os.Build.VERSION.SDK_INT).toString();
        l = ((String) (obj));
        l = ((String) (obj));
        m = locale.getLanguage();
        n = locale.getCountry();
        i1 & 0xf;
        JVM INSTR tableswitch 1 4: default 236
    //                   1 409
    //                   2 415
    //                   3 421
    //                   4 427;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        obj = null;
_L13:
        o = ((String) (obj));
        i1 & 0x30;
        JVM INSTR lookupswitch 2: default 276
    //                   16: 439
    //                   32: 433;
           goto _L9 _L10 _L11
_L10:
        break MISSING_BLOCK_LABEL_439;
_L9:
        obj = null;
_L14:
        p = ((String) (obj));
        int j1 = displaymetrics.densityDpi;
        if (j1 == 0)
        {
            obj = null;
        } else
        if (j1 < 140)
        {
            obj = "low";
        } else
        if (j1 > 200)
        {
            obj = "high";
        } else
        {
            obj = "medium";
        }
        q = ((String) (obj));
        r = String.valueOf(displaymetrics.widthPixels);
        s = String.valueOf(displaymetrics.heightPixels);
        e = "android4.1.3";
        if (!flag)
        {
            obj = ada.d(context);
        } else
        {
            obj = null;
        }
        c = ((String) (obj));
        d = b(context);
        t = ada.a();
        if (s1 == null)
        {
            context = null;
        } else
        {
            context = adf.a(s1, "SHA-1");
        }
        a = context;
        if (s1 == null)
        {
            context = obj1;
        } else
        {
            context = adf.a(s1.replaceAll(":", ""), "MD5");
        }
        b = context;
        return;
_L2:
        obj = "phone";
          goto _L12
_L3:
        obj = "tablet";
          goto _L12
_L5:
        obj = "small";
          goto _L13
_L6:
        obj = "normal";
          goto _L13
_L7:
        obj = "large";
          goto _L13
_L8:
        obj = "xlarge";
          goto _L13
_L11:
        obj = "long";
          goto _L14
        obj = "normal";
          goto _L14
    }

    private static String a(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    private static String b(Context context)
    {
        String s1;
        try
        {
            context = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[] {
                "aid"
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (context == null)
        {
            return null;
        }
        if (context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        context.close();
        return null;
        s1 = context.getString(context.getColumnIndex("aid"));
        context.close();
        return s1;
    }
}
