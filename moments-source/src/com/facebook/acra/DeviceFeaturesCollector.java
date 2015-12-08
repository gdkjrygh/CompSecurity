// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package com.facebook.acra:
//            Compatibility, ACRA

public class DeviceFeaturesCollector
{

    public DeviceFeaturesCollector()
    {
    }

    public static String getFeatures(Context context)
    {
        if (Compatibility.getAPILevel() < 5) goto _L2; else goto _L1
_L1:
        StringBuffer stringbuffer = new StringBuffer();
        Object aobj[];
        PackageManager packagemanager = context.getPackageManager();
        aobj = (Object[])(Object[])android/content/pm/PackageManager.getMethod("getSystemAvailableFeatures", null).invoke(packagemanager, new Object[0]);
        if (aobj == null) goto _L4; else goto _L3
_L3:
        int j = aobj.length;
        int i = 0;
_L8:
        if (i >= j) goto _L4; else goto _L5
_L5:
        Object obj = aobj[i];
        String s1 = (String)obj.getClass().getField("name").get(obj);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        stringbuffer.append(s1);
_L6:
        stringbuffer.append("\n");
        i++;
        continue; /* Loop/switch isn't completed */
        obj = (String)obj.getClass().getMethod("getGlEsVersion", null).invoke(obj, new Object[0]);
        stringbuffer.append("glEsVersion = ");
        stringbuffer.append(((String) (obj)));
          goto _L6
        Throwable throwable;
        throwable;
        String s = ACRA.LOG_TAG;
        (new StringBuilder("Couldn't retrieve device features for ")).append(context.getPackageName());
        stringbuffer.append("Could not retrieve data: ");
        stringbuffer.append(throwable.getMessage());
_L4:
        return stringbuffer.toString();
_L2:
        return "Data available only with API Level > 5";
        if (true) goto _L8; else goto _L7
_L7:
    }
}
