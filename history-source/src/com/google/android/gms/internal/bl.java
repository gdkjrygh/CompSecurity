// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jx

public class bl
{

    private final Context mContext;

    public bl(Context context)
    {
        jx.b(context, "Context can not be null");
        mContext = context;
    }

    public static boolean bs()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public boolean a(Intent intent)
    {
        boolean flag = false;
        jx.b(intent, "Intent can not be null");
        if (!mContext.getPackageManager().queryIntentActivities(intent, 0).isEmpty())
        {
            flag = true;
        }
        return flag;
    }

    public boolean bo()
    {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(intent);
    }

    public boolean bp()
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(intent);
    }

    public boolean bq()
    {
        return bs() && mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean br()
    {
        return false;
    }

    public boolean bt()
    {
        Intent intent = (new Intent("android.intent.action.INSERT")).setType("vnd.android.cursor.dir/event");
        return android.os.Build.VERSION.SDK_INT >= 14 && a(intent);
    }
}
