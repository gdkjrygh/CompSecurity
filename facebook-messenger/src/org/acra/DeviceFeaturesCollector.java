// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package org.acra:
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
        int j;
        PackageManager packagemanager = context.getPackageManager();
        aobj = (Object[])(Object[])android/content/pm/PackageManager.getMethod("getSystemAvailableFeatures", (Class[])null).invoke(packagemanager, new Object[0]);
        j = aobj.length;
        int i = 0;
_L5:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        obj = aobj[i];
        String s = (String)obj.getClass().getField("name").get(obj);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        stringbuffer.append(s);
_L3:
        stringbuffer.append("\n");
        i++;
        continue; /* Loop/switch isn't completed */
        obj = (String)obj.getClass().getMethod("getGlEsVersion", (Class[])null).invoke(obj, new Object[0]);
        stringbuffer.append("glEsVersion = ");
        stringbuffer.append(((String) (obj)));
          goto _L3
        Throwable throwable;
        throwable;
        Log.w(ACRA.LOG_TAG, (new StringBuilder()).append("Couldn't retrieve device features for ").append(context.getPackageName()).toString(), throwable);
        stringbuffer.append("Could not retrieve data: ");
        stringbuffer.append(throwable.getMessage());
        return stringbuffer.toString();
_L2:
        return "Data available only with API Level > 5";
        if (true) goto _L5; else goto _L4
_L4:
    }
}
