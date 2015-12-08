// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class ebl
    implements elb
{

    ebg a;
    elg b;
    final ebk c;

    private ebl(ebk ebk1)
    {
        c = ebk1;
        super();
    }

    ebl(ebk ebk1, byte byte0)
    {
        this(ebk1);
    }

    public final void a(List list, Map map, int i, boolean flag, RequestType requesttype)
    {
        b.b();
        c.g.remove(b);
        if (!c.f)
        {
            map = new ArrayList();
            if (list != null)
            {
                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    requesttype = ((RequestType) (list.next()));
                    requesttype = c.a(requesttype);
                    if (requesttype != null)
                    {
                        map.add(requesttype);
                    }
                } while (true);
            }
            c.a(map);
            if (a != null)
            {
                a.a(map);
                return;
            }
        }
    }
}
