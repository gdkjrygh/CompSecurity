// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class ED
{

    public Hb a;
    public List b;
    public boolean c;

    public ED()
    {
        c = false;
    }

    public final Cf a()
    {
        if (a == null)
        {
            throw new IllegalArgumentException("SnapViewPlayableItem cannot be null");
        }
        Cf cf = new Cf(new String[] {
            "STORIES"
        });
        Object obj = EO.a(a);
        String s = (new StringBuilder("STORIES-")).append(((String) (obj))).toString();
        obj = cf.a(s);
        if (b == null || b.isEmpty())
        {
            Cf cf1 = ((Cf) (obj));
            if (c)
            {
                cf1 = ((Cf) (obj)).a((new StringBuilder()).append(s).append("-watching").toString());
            }
            obj = cf1;
        } else
        {
            Iterator iterator = b.iterator();
            Cf cf2;
            for (cf2 = ((Cf) (obj)); iterator.hasNext(); cf2 = cf2.a((new StringBuilder("STORIES-")).append(((String) (obj))).toString()))
            {
                obj = (String)iterator.next();
            }

            obj = cf2;
            if (c)
            {
                return cf2.a((new StringBuilder("STORIES-")).append((String)b.get(b.size() - 1)).append("-watching").toString());
            }
        }
        return ((Cf) (obj));
    }
}
