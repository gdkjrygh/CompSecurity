// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class lqg extends lqd
{

    private static final String b;

    public lqg()
    {
        super(b, new String[0]);
    }

    public final volatile String a()
    {
        return super.a();
    }

    public final ksp a(Map map)
    {
        map = Locale.getDefault();
        if (map == null)
        {
            return ltw.f();
        }
        map = map.getLanguage();
        if (map == null)
        {
            return ltw.f();
        } else
        {
            return ltw.a(map.toLowerCase());
        }
    }

    public final boolean b()
    {
        return false;
    }

    public final volatile Set c()
    {
        return super.c();
    }

    static 
    {
        b = kse.l.toString();
    }
}
