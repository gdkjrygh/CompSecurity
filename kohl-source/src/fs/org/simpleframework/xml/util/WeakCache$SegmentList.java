// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.util;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.util:
//            WeakCache

private class create
{

    private List list;
    private int size;
    final WeakCache this$0;

    private void create(int i)
    {
        for (; i > 0; i--)
        {
            list.add(new t>(WeakCache.this, null));
        }

    }

    private int segment(Object obj)
    {
        return Math.abs(obj.hashCode() % size);
    }

    public size get(Object obj)
    {
        int i = segment(obj);
        if (i < size)
        {
            return (size)list.get(i);
        } else
        {
            return null;
        }
    }

    public (int i)
    {
        this$0 = WeakCache.this;
        super();
        list = new ArrayList();
        size = i;
        create(i);
    }
}
