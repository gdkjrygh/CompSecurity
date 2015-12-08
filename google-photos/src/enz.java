// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class enz
    implements iwj
{

    private final Set a;

    public enz(Collection collection)
    {
        a = Collections.unmodifiableSet(new HashSet(collection));
    }

    public final Object a(Object obj)
    {
        Object obj1 = (List)obj;
        obj = new ArrayList();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            ekq ekq1 = (ekq)((Iterator) (obj1)).next();
            hkf hkf1 = (hkf)ekq1.a(hkf);
            if (a.contains(hkf1.a))
            {
                ((List) (obj)).add(ekq1);
            }
        } while (true);
        return obj;
    }
}
