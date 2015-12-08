// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public final class ahw
{

    aiw a;
    Set b;
    ahx c;
    private Map d;

    ahw(aiw aiw1, int i)
    {
        b = new HashSet();
        d = new HashMap();
        a = aiw1;
        c = new ahy();
    }

    public static ahw a()
    {
        aiw aiw1 = aiw.a();
        if (aiw1 != null)
        {
            return aiw1.i;
        } else
        {
            return null;
        }
    }

    public final ahs a(ahs ahs1)
    {
        if (!ahs1.b)
        {
            ahs1 = String.valueOf(ahs1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ahs1).length() + 61)).append("Frame ").append(ahs1).append(" must be read-only to import into another FrameManager!").toString());
        }
        ahs ahs2 = new ahs(ahs1.a(), ahs1.l(), this);
        agu agu1 = ahs2.a;
        ahs1 = ahs1.a;
        if (((agu) (ahs1)).d.size() > 0)
        {
            agw agw1 = (agw)((agu) (ahs1)).d.firstElement();
            agw agw2;
            int i;
            if (agw1.c())
            {
                i = 1;
            } else
            {
                i = agw1.a();
            }
            agw2 = agu1.c(1, i);
            agw2.a(agw1);
            agu1.d.add(agw2);
            agu1.f = agw2;
        }
        agu1.c = ((agu) (ahs1)).c;
        return ahs2;
    }

    public final im a(String s)
    {
        im im1 = (im)d.get(s);
        if (im1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 22)).append("Unknown frame slot '").append(s).append("'!").toString());
        } else
        {
            return im1;
        }
    }

    final void b()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((agw)iterator.next()).g()) { }
        b.clear();
        c.a();
    }

    public void c()
    {
        if (!a.d() || aiw.a() != a)
        {
            throw new IllegalStateException("Attempting to access FrameManager Frame data outside of graph run-loop!");
        } else
        {
            return;
        }
    }
}
