// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.common.internal.bl;
import java.util.List;

public final class cm
{

    private final Context a;

    public cm(Context context)
    {
        bl.a(context, "Context can not be null");
        a = context;
    }

    private boolean a(Intent intent)
    {
        boolean flag = false;
        bl.a(intent, "Intent can not be null");
        if (!a.getPackageManager().queryIntentActivities(intent, 0).isEmpty())
        {
            flag = true;
        }
        return flag;
    }

    public final boolean a()
    {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(intent);
    }

    public final boolean b()
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(intent);
    }

    public final boolean c()
    {
        return "mounted".equals(Environment.getExternalStorageState()) && a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean d()
    {
        Intent intent = (new Intent("android.intent.action.INSERT")).setType("vnd.android.cursor.dir/event");
        return android.os.Build.VERSION.SDK_INT >= 14 && a(intent);
    }
}
