// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class iin
    implements iwj
{

    private final boolean a;

    public iin(boolean flag)
    {
        a = flag;
    }

    public final Object a(Object obj)
    {
        obj = (List)obj;
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        Iterator iterator = ((List) (obj)).iterator();
        while (iterator.hasNext()) 
        {
            obj = (ekq)iterator.next();
            if (a)
            {
                obj = new iib(((ekq) (obj)));
            } else
            {
                obj = new iig(((ekq) (obj)));
            }
            arraylist.add(obj);
        }
        return arraylist;
    }
}
