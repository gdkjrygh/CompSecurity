// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class deg
{

    public final Set a = new HashSet();
    public final Set b = new HashSet();
    public Set c;
    public boolean d;
    private final deh e;

    public deg(deh deh1)
    {
        e = deh1;
        c = a;
    }

    public void a(Set set, Set set1)
    {
        Iterator iterator = set.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = iterator.next();
            if (!set1.contains(obj))
            {
                e.a(obj);
            }
        } while (true);
        for (set1 = set1.iterator(); set1.hasNext(); set.contains(set1.next())) { }
    }

    public final String toString()
    {
        String s = String.valueOf("SetSnapshot[mIsEditing=");
        boolean flag = d;
        String s1 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 21 + String.valueOf(s1).length())).append(s).append(flag).append(", LastSnapshot=").append(s1).append("]").toString();
    }
}
