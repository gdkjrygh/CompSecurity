// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Map;

final class lru extends lqd
{

    private static final String b;
    private static final String c;
    private final Context d;

    public lru(Context context)
    {
        super(b, new String[0]);
        d = context;
    }

    public final ksp a(Map map)
    {
        if ((ksp)map.get(c) != null)
        {
            map = ltw.a((ksp)map.get(c));
        } else
        {
            map = null;
        }
        map = lqf.a(d, map);
        if (map != null)
        {
            return ltw.a(map);
        } else
        {
            return ltw.f();
        }
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.y.toString();
        c = ksf.i.toString();
    }
}
