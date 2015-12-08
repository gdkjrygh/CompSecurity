// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public abstract class AbstractEntityMapper
    implements EntityMapper
{

    public AbstractEntityMapper()
    {
    }

    public List fromDbEntities(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(fromDbEntity(list.next()))) { }
        return arraylist;
    }

    public List toDbEntitites(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(toDbEntity(list.next()))) { }
        return arraylist;
    }
}
