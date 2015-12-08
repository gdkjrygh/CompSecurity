// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ifb
    implements iwj
{

    ifb()
    {
    }

    public final Object a(Object obj)
    {
        Object obj1 = (List)obj;
        obj = new ArrayList(((List) (obj1)).size());
        obj1 = ((List) (obj1)).iterator();
        for (int i = 0; ((Iterator) (obj1)).hasNext(); i++)
        {
            ((List) (obj)).add(new iew((iei)((Iterator) (obj1)).next(), i));
        }

        return obj;
    }
}
