// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

final class ang.Object
    implements cdi
{

    private bzw a;

    public final void a(ckw ckw, Map map)
    {
        if (a.a(map) && map.containsKey("isVisible"))
        {
            boolean flag;
            if ("1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible")))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ckw = a;
            flag = Boolean.valueOf(flag).booleanValue();
            map = ((bzw) (ckw)).e.iterator();
            while (map.hasNext()) 
            {
                ((bzt)map.next()).a(ckw, flag);
            }
        }
    }

    (bzw bzw1)
    {
        a = bzw1;
        super();
    }
}
