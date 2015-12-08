// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Map;

final class luc extends lqd
{

    private static final String b;
    private final Context c;

    public luc(Context context)
    {
        super(b, new String[0]);
        c = context;
    }

    public final ksp a(Map map)
    {
        try
        {
            map = ltw.a(Integer.valueOf(c.getPackageManager().getPackageInfo(c.getPackageName(), 0).versionCode));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            lqh.a((new StringBuilder("Package name ")).append(c.getPackageName()).append(" not found. ").append(map.getMessage()).toString());
            return ltw.f();
        }
        return map;
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.e.toString();
    }
}
