// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class fir
    implements iwj
{

    public fir()
    {
    }

    public final Object a(Object obj)
    {
        obj = (ekq)obj;
        Object obj1 = (hjz)((ekq) (obj)).a(hjz);
        obj = (hjv)((ekq) (obj)).a(hjv);
        ArrayList arraylist = new ArrayList(Collections.unmodifiableList(((hjz) (obj1)).a).size() + 1);
        arraylist.add(new fis());
        diy diy1;
        for (obj1 = Collections.unmodifiableList(((hjz) (obj1)).a).iterator(); ((Iterator) (obj1)).hasNext(); arraylist.add(new fip(diy1, ((hjv) (obj)).a.equals(diy1))))
        {
            diy1 = (diy)((Iterator) (obj1)).next();
        }

        return arraylist;
    }
}
