// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra;

import android.content.Context;
import java.lang.reflect.Field;

public class Compatibility
{

    public Compatibility()
    {
    }

    static int getAPILevel()
    {
        int i;
        try
        {
            i = android/os/Build$VERSION.getField("SDK_INT").getInt(null);
        }
        catch (SecurityException securityexception)
        {
            return Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            return Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            return Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        return i;
    }

    static String getDropBoxServiceName()
    {
        String s = null;
        Field field = android/content/Context.getField("DROPBOX_SERVICE");
        if (field != null)
        {
            s = (String)field.get(null);
        }
        return s;
    }
}
