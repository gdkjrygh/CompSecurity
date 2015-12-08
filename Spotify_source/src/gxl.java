// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class gxl extends gxk
{

    private Object b[];
    private int c;

    gxl(Map map, int i)
    {
        super(map);
        c = -1;
        c = i;
        b = new Object[i + 1];
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            Integer integer = (Integer)entry.getKey();
            if (integer.intValue() <= 0)
            {
                throw new IllegalArgumentException("Input map key is negative or zero");
            }
            b[integer.intValue()] = entry.getValue();
        }

    }

    public final Object a(int i)
    {
        if (i > c)
        {
            return null;
        } else
        {
            return b[i];
        }
    }

    public final boolean b(int i)
    {
        while (i > c || b[i] == null) 
        {
            return false;
        }
        return true;
    }
}
