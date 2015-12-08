// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.a.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import dbt;

// Referenced classes of package com.sony.snei.np.android.a.a:
//            c

class f
    implements c
{

    private static final Uri a = Uri.parse("content://com.sony.snei.np.android.account.provider/duid");
    private static String b = null;

    public f(Context context)
    {
    }

    static String a(Context context)
    {
        return b(context);
    }

    static String a(String s)
    {
        b = s;
        return s;
    }

    static String b()
    {
        return b;
    }

    private static String b(Context context)
    {
        ProviderInfo providerinfo = context.getPackageManager().resolveContentProvider(a.getAuthority(), 0);
        if (providerinfo != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        int i;
        if ((providerinfo.applicationInfo.flags & 1) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L1; else goto _L3
_L3:
        context = context.getContentResolver();
        Cursor cursor;
        try
        {
            cursor = context.query(a, null, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            dbt.a("retrieveDuidString", "SecurityException: %s", new Object[] {
                context.getMessage()
            });
            return null;
        }
        if (cursor == null) goto _L1; else goto _L4
_L4:
        if (!cursor.moveToFirst()) goto _L6; else goto _L5
_L5:
        i = cursor.getColumnIndex("data");
        if (i < 0) goto _L6; else goto _L7
_L7:
        context = cursor.getString(i);
_L9:
        cursor.close();
        return context;
_L6:
        context = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public String a()
    {
        return b;
    }

}
