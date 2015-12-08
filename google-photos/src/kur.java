// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class kur
    implements kuf
{

    public kur()
    {
    }

    public final void a(kxu kxu1, Map map)
    {
        kun kun1 = jqc.k();
        if (map.containsKey("abort"))
        {
            if (!kun1.a(kxu1))
            {
                b.m("Precache abort but no preload task running.");
            }
            return;
        }
        if ((String)map.get("src") == null)
        {
            b.m("Precache video action is missing the src parameter.");
            return;
        }
        boolean flag;
        try
        {
            Integer.parseInt((String)map.get("player"));
        }
        catch (NumberFormatException numberformatexception) { }
        if (map.containsKey("mimetype"))
        {
            map.get("mimetype");
        }
        if (kun.b(kxu1) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b.m("Precache task already running.");
            return;
        } else
        {
            b.c(kxu1.f());
            throw new NullPointerException();
        }
    }
}
