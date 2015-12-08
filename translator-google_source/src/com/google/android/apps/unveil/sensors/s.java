// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;

public final class s
{

    private static final Uri a = Uri.parse("content://com.google.settings/partner");

    public static boolean a(Context context)
    {
        return context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.action.SET_USE_LOCATION_FOR_SERVICES"), 0x10000) != null;
    }

    public static int b(Context context)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj = null;
        obj1 = null;
        context = context.getContentResolver();
        context = context.query(a, new String[] {
            "value"
        }, "name=?", new String[] {
            "use_location_for_services"
        }, null);
        obj = obj1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        obj = obj1;
        if (context.moveToNext())
        {
            obj = context.getString(0);
        }
        obj1 = obj;
        if (context != null)
        {
            context.close();
            obj1 = obj;
        }
_L2:
        if (obj1 == null)
        {
            return 2;
        }
        break; /* Loop/switch isn't completed */
        context;
        context = null;
_L5:
        obj1 = obj2;
        if (context != null)
        {
            context.close();
            obj1 = obj2;
        }
        if (true) goto _L2; else goto _L1
        obj1;
        context = ((Context) (obj));
        obj = obj1;
_L4:
        if (context != null)
        {
            context.close();
        }
        throw obj;
_L1:
        int i;
        try
        {
            i = Integer.parseInt(((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            i = 2;
        }
        return i;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        RuntimeException runtimeexception;
        runtimeexception;
          goto _L5
    }

}
