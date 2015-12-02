// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class adu extends acq
{

    public adu()
    {
    }

    public final void b(akk akk, Map map)
    {
        ot.p();
        if (map.containsKey("abort"))
        {
            if (!ads.a(akk))
            {
                of.e("Precache abort but no preload task running.");
            }
            return;
        }
        map = (String)map.get("src");
        if (map == null)
        {
            of.e("Precache video action is missing the src parameter.");
            return;
        }
        if (ads.b(akk))
        {
            of.e("Precache task already running.");
            return;
        } else
        {
            (new adr(akk, map)).e();
            return;
        }
    }
}
