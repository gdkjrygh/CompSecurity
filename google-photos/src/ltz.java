// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Map;

final class ltz extends lqd
{

    private static final String b;
    private static final String c;
    private static final String d;
    private final Context e;

    public ltz(Context context)
    {
        super(b, new String[] {
            d
        });
        e = context;
    }

    public final ksp a(Map map)
    {
        Object obj = (ksp)map.get(d);
        if (obj == null)
        {
            return ltw.f();
        }
        obj = ltw.a(((ksp) (obj)));
        map = (ksp)map.get(c);
        if (map != null)
        {
            map = ltw.a(map);
        } else
        {
            map = null;
        }
        map = lqf.a(e, ((String) (obj)), map);
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
        b = kse.t.toString();
        c = ksf.i.toString();
        d = ksf.j.toString();
    }
}
