// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class ovq
    implements Iterable
{

    final TreeMap a = new TreeMap();
    private ote b;

    public ovq(ote ote1)
    {
        b = (ote)p.a(ote1);
    }

    public final ovg a(int i)
    {
        return (ovg)a.get(Integer.valueOf(i));
    }

    public final ovg a(long l, boolean flag)
    {
        boolean flag2 = false;
        Object obj = b;
        int i;
        if (l < 0L)
        {
            i = 0;
        } else
        if (l >= ((ote) (obj)).f)
        {
            i = ((ote) (obj)).g.length - 1;
        } else
        {
            i = ((ote) (obj)).a(l);
        }
        for (obj = a.ceilingEntry(Integer.valueOf(i)); flag && obj != null && ((ovg)((java.util.Map.Entry) (obj)).getValue()).a() != ovi.b; obj = a.higherEntry(((java.util.Map.Entry) (obj)).getKey())) { }
        java.util.Map.Entry entry;
        for (entry = a.floorEntry(Integer.valueOf(i)); flag && entry != null && ((ovg)entry.getValue()).a() != ovi.b; entry = a.lowerEntry(entry.getKey())) { }
        if (obj != null && entry != null)
        {
            boolean flag1 = flag2;
            if (b.b(((Integer)((java.util.Map.Entry) (obj)).getKey()).intValue()) - l <= l - b.b(((Integer)entry.getKey()).intValue()))
            {
                flag1 = true;
            }
            if (flag1)
            {
                return (ovg)((java.util.Map.Entry) (obj)).getValue();
            } else
            {
                return (ovg)entry.getValue();
            }
        }
        if (obj != null)
        {
            return (ovg)((java.util.Map.Entry) (obj)).getValue();
        }
        if (entry != null)
        {
            return (ovg)entry.getValue();
        } else
        {
            return null;
        }
    }

    public final ovg a(ovg ovg1)
    {
        return (ovg)a.put(Integer.valueOf(ovg1.a), ovg1);
    }

    public final Iterator iterator()
    {
        return a.values().iterator();
    }
}
