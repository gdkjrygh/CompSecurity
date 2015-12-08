// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.pm.PackageManager;
import com.crittercism.app.CrittercismConfig;

public final class af
{

    public boolean a;
    public boolean b;
    public boolean c;

    public af(Context context, CrittercismConfig crittercismconfig)
    {
        a = crittercismconfig.g();
        c = a("android.permission.ACCESS_NETWORK_STATE", context);
        b = a("android.permission.GET_TASKS", context);
    }

    private static boolean a(String s, Context context)
    {
        return context.getPackageManager().checkPermission(s, context.getPackageName()) == 0;
    }
}
