// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.support;

import android.content.Context;
import com.appboy.Constants;

// Referenced classes of package com.appboy.support:
//            AppboyLogger

public class PermissionUtils
{

    private static final String a;

    public PermissionUtils()
    {
    }

    public static boolean hasPermission(Context context, String s)
    {
        int i;
        try
        {
            i = context.checkCallingOrSelfPermission(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            AppboyLogger.e(a, String.format("Failure checking permission %s", new Object[] {
                s
            }), context);
            return false;
        }
        return i == 0;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/support/PermissionUtils.getName()
        });
    }
}
