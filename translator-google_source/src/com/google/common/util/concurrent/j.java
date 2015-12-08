// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.util.concurrent:
//            p

final class j
    implements p
{

    j()
    {
    }

    public final Object a(List list)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            list = (Optional)iterator.next();
            if (list != null)
            {
                list = ((List) (list.orNull()));
            } else
            {
                list = null;
            }
            arraylist.add(list);
        }
        return Collections.unmodifiableList(arraylist);
    }
}
