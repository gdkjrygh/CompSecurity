// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class ngz
{

    private Context a;

    public ngz(Context context)
    {
        a = context;
    }

    final String a()
    {
        String s;
        try
        {
            s = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new AssertionError();
        }
        return s;
    }
}
