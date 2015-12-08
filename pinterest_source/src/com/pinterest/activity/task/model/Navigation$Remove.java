// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.model;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.activity.task.model:
//            Navigation

public class add
{

    List toRemove;

    public void add(Navigation navigation)
    {
        if (toRemove == null)
        {
            toRemove = new ArrayList();
        }
        toRemove.add(navigation);
    }

    public List getNavigationItems()
    {
        return toRemove;
    }

    public void setTasks(List list)
    {
        toRemove = list;
    }

    public _cls9()
    {
    }

    public _cls9(Navigation navigation)
    {
        this();
        add(navigation);
    }
}
