// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;
import java.util.Map;

final class luz extends lqd
{

    private static final String b;

    public luz()
    {
        super(b, new String[0]);
    }

    public final ksp a(Map map)
    {
        String s1 = Build.MANUFACTURER;
        String s = Build.MODEL;
        map = s;
        if (!s.startsWith(s1))
        {
            map = s;
            if (!s1.equals("unknown"))
            {
                map = (new StringBuilder()).append(s1).append(" ").append(s).toString();
            }
        }
        return ltw.a(map);
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.i.toString();
    }
}
