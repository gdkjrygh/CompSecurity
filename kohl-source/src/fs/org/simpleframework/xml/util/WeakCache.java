// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.util;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

// Referenced classes of package fs.org.simpleframework.xml.util:
//            Cache

public class WeakCache
    implements Cache
{
    private class Segment extends WeakHashMap
    {

        final WeakCache this$0;

        public void cache(Object obj, Object obj1)
        {
            this;
            JVM INSTR monitorenter ;
            put(obj, obj1);
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            throw obj;
        }

        public boolean contains(Object obj)
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = containsKey(obj);
            this;
            JVM INSTR monitorexit ;
            return flag;
            obj;
            throw obj;
        }

        public Object fetch(Object obj)
        {
            this;
            JVM INSTR monitorenter ;
            obj = get(obj);
            this;
            JVM INSTR monitorexit ;
            return obj;
            obj;
            throw obj;
        }

        private Segment()
        {
            this$0 = WeakCache.this;
            super();
        }

    }

    private class SegmentList
    {

        private List list;
        private int size;
        final WeakCache this$0;

        private void create(int i)
        {
            for (; i > 0; i--)
            {
                list.add(new Segment());
            }

        }

        private int segment(Object obj)
        {
            return Math.abs(obj.hashCode() % size);
        }

        public Segment get(Object obj)
        {
            int i = segment(obj);
            if (i < size)
            {
                return (Segment)list.get(i);
            } else
            {
                return null;
            }
        }

        public SegmentList(int i)
        {
            this$0 = WeakCache.this;
            super();
            list = new ArrayList();
            size = i;
            create(i);
        }
    }


    private SegmentList list;

    public WeakCache()
    {
        this(10);
    }

    public WeakCache(int i)
    {
        list = new SegmentList(i);
    }

    private Segment map(Object obj)
    {
        return list.get(obj);
    }

    public void cache(Object obj, Object obj1)
    {
        map(obj).cache(obj, obj1);
    }

    public boolean contains(Object obj)
    {
        return map(obj).contains(obj);
    }

    public Object fetch(Object obj)
    {
        return map(obj).fetch(obj);
    }
}
