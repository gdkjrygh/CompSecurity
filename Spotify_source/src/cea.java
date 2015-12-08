// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class cea
    implements cdi
{

    public cea()
    {
    }

    public final void a(ckw ckw1, Map map)
    {
        bkv.r();
        if (map.containsKey("abort"))
        {
            if (!cdy.a(ckw1))
            {
                bka.e("Precache abort but no preload task running.");
            }
            return;
        }
        String s = (String)map.get("src");
        if (s == null)
        {
            bka.e("Precache video action is missing the src parameter.");
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
        if (cdy.b(ckw1) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            bka.e("Precache task already running.");
            return;
        } else
        {
            bru.a(ckw1.g());
            (new cdx(ckw1, ckw1.g().a.a(ckw1), s)).e();
            return;
        }
    }
}
