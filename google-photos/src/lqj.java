// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class lqj extends lqd
{

    private static final String b;
    private static final String c;

    public lqj(String s)
    {
        super(s, new String[] {
            b, c
        });
    }

    public final volatile String a()
    {
        return super.a();
    }

    public final ksp a(Map map)
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            if ((ksp)iterator.next() == ltw.f())
            {
                return ltw.a(Boolean.valueOf(false));
            }
        }

        ksp ksp1 = (ksp)map.get(b);
        ksp ksp2 = (ksp)map.get(c);
        boolean flag;
        if (ksp1 == null || ksp2 == null)
        {
            flag = false;
        } else
        {
            flag = a(ksp1, ksp2, map);
        }
        return ltw.a(Boolean.valueOf(flag));
    }

    protected abstract boolean a(ksp ksp1, ksp ksp2, Map map);

    public final boolean b()
    {
        return true;
    }

    public final volatile Set c()
    {
        return super.c();
    }

    static 
    {
        b = ksf.f.toString();
        c = ksf.g.toString();
    }
}
