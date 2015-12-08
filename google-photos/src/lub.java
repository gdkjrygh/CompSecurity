// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Map;

final class lub extends lqd
{

    private static final String b;
    private final Context c;

    public lub(Context context)
    {
        super(b, new String[0]);
        c = context;
    }

    public final ksp a(Map map)
    {
        try
        {
            map = c.getPackageManager();
            map = ltw.a(map.getApplicationLabel(map.getApplicationInfo(c.getPackageName(), 0)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            lqh.a("App name is not found.", map);
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
        b = kse.d.toString();
    }
}
