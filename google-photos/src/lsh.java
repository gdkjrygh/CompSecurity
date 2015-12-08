// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Map;

final class lsh extends lqd
{

    private static final String b;
    private final lpg c;

    public lsh(Context context)
    {
        this(lpg.a(context));
    }

    private lsh(lpg lpg1)
    {
        super(b, new String[0]);
        c = lpg1;
    }

    public final ksp a(Map map)
    {
        boolean flag1 = true;
        map = c;
        map.a();
        boolean flag;
        if (((lpg) (map)).a == null)
        {
            flag = true;
        } else
        {
            flag = ((lpg) (map)).a.b;
        }
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return ltw.a(Boolean.valueOf(flag));
    }

    public final boolean b()
    {
        return false;
    }

    static 
    {
        b = kse.b.toString();
    }
}
