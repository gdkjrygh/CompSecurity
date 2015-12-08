// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class ieu
    implements iwj
{

    private final igy a;
    private final iel b;

    ieu(Context context, igy igy1)
    {
        a = igy1;
        b = (iel)olm.a(context, iel);
    }

    public final Object a(Object obj)
    {
        obj = (List)obj;
        Iterator iterator = ((List) (obj)).iterator();
        while (iterator.hasNext()) 
        {
            iei iei1 = (iei)iterator.next();
            int i;
            if (iei1.c.c())
            {
                i = 1000;
            } else
            {
                String s = iei1.a;
                igx igx1 = a.b;
                p.b(igx1.d, "RecentAppLookup must be loaded before use");
                if (igx1.b.containsKey(s))
                {
                    i = ((Integer)igx1.b.get(s)).intValue();
                } else
                {
                    i = -1;
                }
                if (i >= 0)
                {
                    i = 1000 - i;
                } else
                {
                    iel iel1 = b;
                    if (iel1.a.containsKey(s))
                    {
                        i = ((Integer)iel1.a.get(s)).intValue();
                    } else
                    {
                        i = 4;
                    }
                    i = 100 - i;
                }
            }
            iei1.d = i;
        }
        return obj;
    }
}
