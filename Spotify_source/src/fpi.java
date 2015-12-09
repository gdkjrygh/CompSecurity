// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class fpi
{

    public static boolean a(Context context, Intent intent)
    {
        boolean flag;
        try
        {
            flag = ((Boolean)Class.forName("com.spotify.mobile.android.ui.activity.UninstallReleaseVersionActivity").getMethod("showIfNeeded", new Class[] {
                android/content/Context, android/content/Intent
            }).invoke(null, new Object[] {
                context, intent
            })).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("Found class but not method??", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("Could not invoke method", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("Could not invoke method", context);
        }
        return flag;
    }
}
