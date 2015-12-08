// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Map;

final class lrg extends lqd
{

    private static final String b;
    private final lpg c;

    public lrg(Context context)
    {
        this(lpg.a(context));
    }

    private lrg(lpg lpg1)
    {
        super(b, new String[0]);
        c = lpg1;
    }

    public final ksp a(Map map)
    {
        map = c;
        map.a();
        if (((lpg) (map)).a == null)
        {
            map = null;
        } else
        {
            map = ((lpg) (map)).a.a;
        }
        if (map == null)
        {
            return ltw.f();
        } else
        {
            return ltw.a(map);
        }
    }

    public final boolean b()
    {
        return false;
    }

    static 
    {
        b = kse.a.toString();
    }
}
