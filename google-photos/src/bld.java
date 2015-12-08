// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public final class bld
{

    private String a;

    private bld(String s)
    {
        a = (String)b.a(s, "versionName", null);
    }

    public static bld a(Context context)
    {
        Object obj = context.getPackageManager();
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw c.a("cannot find own package", context);
        }
        context = ((Context) (obj));
        if (obj == null)
        {
            context = "";
        }
        return new bld(context);
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            a
        });
    }
}
