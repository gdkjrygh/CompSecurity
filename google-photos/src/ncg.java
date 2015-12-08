// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

final class ncg
{

    final NavigableMap a = new ConcurrentSkipListMap(new nch(this));

    ncg()
    {
    }

    public final void a(nbw nbw1)
    {
        Integer integer = (Integer)a.get(nbw1);
        if (integer.intValue() == 1)
        {
            a.remove(nbw1);
            return;
        } else
        {
            a.put(nbw1, Integer.valueOf(integer.intValue() - 1));
            return;
        }
    }

    public final String toString()
    {
        String s = "SizeTracker(";
        if (!a.isEmpty())
        {
            Iterator iterator = a.keySet().iterator();
            Object obj;
            String s1;
            for (s = "SizeTracker("; iterator.hasNext(); s = (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length() + String.valueOf(obj).length())).append(s).append("{").append(s1).append(", ").append(((String) (obj))).append("} ").toString())
            {
                obj = (nbw)iterator.next();
                s = String.valueOf(s);
                s1 = String.valueOf(obj);
                obj = String.valueOf(a.get(obj));
            }

            s = s.substring(0, s.length() - 1);
        }
        return String.valueOf(s).concat(")");
    }
}
