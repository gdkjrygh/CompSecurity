// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Field;

// Referenced classes of package com.facebook.acra:
//            ACRA

public class SettingsCollector
{

    public SettingsCollector()
    {
    }

    public static String collectSecureSettings(Context context)
    {
        StringBuilder stringbuilder;
        Field afield[];
        int i;
        int j;
        stringbuilder = new StringBuilder();
        afield = android/provider/Settings$Secure.getFields();
        j = afield.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Field field;
        field = afield[i];
        if (field.isAnnotationPresent(java/lang/Deprecated) || field.getType() != java/lang/String || !isAuthorized(field))
        {
            continue; /* Loop/switch isn't completed */
        }
        String s = android.provider.Settings.Secure.getString(context.getContentResolver(), (String)field.get(null));
        if (s != null)
        {
            try
            {
                stringbuilder.append(field.getName()).append("=").append(s).append("\n");
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Log.w(ACRA.LOG_TAG, "Error : ", illegalargumentexception);
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                Log.w(ACRA.LOG_TAG, "Error : ", illegalaccessexception);
            }
        }
        i++;
          goto _L3
_L2:
        return stringbuilder.toString();
    }

    public static String collectSystemSettings(Context context)
    {
        StringBuilder stringbuilder;
        Field afield[];
        int i;
        int j;
        stringbuilder = new StringBuilder();
        afield = android/provider/Settings$System.getFields();
        j = afield.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Field field;
        field = afield[i];
        if (field.isAnnotationPresent(java/lang/Deprecated) || field.getType() != java/lang/String)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s = android.provider.Settings.System.getString(context.getContentResolver(), (String)field.get(null));
        if (s != null)
        {
            try
            {
                stringbuilder.append(field.getName()).append("=").append(s).append("\n");
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Log.w(ACRA.LOG_TAG, "Error : ", illegalargumentexception);
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                Log.w(ACRA.LOG_TAG, "Error : ", illegalaccessexception);
            }
        }
        i++;
          goto _L3
_L2:
        return stringbuilder.toString();
    }

    private static boolean isAuthorized(Field field)
    {
        return field != null && !field.getName().startsWith("WIFI_AP");
    }
}
