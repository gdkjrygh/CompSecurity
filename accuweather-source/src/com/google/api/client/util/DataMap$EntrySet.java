// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.api.client.util:
//            DataMap, ClassInfo, FieldInfo

final class this._cls0 extends AbstractSet
{

    final DataMap this$0;

    public void clear()
    {
        String s;
        for (Iterator iterator1 = classInfo.names.iterator(); iterator1.hasNext(); classInfo.getFieldInfo(s).setValue(object, null))
        {
            s = (String)iterator1.next();
        }

    }

    public boolean isEmpty()
    {
        for (Iterator iterator1 = classInfo.names.iterator(); iterator1.hasNext();)
        {
            String s = (String)iterator1.next();
            if (classInfo.getFieldInfo(s).getValue(object) != null)
            {
                return false;
            }
        }

        return true;
    }

    public ator iterator()
    {
        return new ator(DataMap.this);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        int i = 0;
        Iterator iterator1 = classInfo.names.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            String s = (String)iterator1.next();
            if (classInfo.getFieldInfo(s).getValue(object) != null)
            {
                i++;
            }
        } while (true);
        return i;
    }

    ator()
    {
        this$0 = DataMap.this;
        super();
    }
}
