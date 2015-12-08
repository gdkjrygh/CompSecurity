// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import com.google.a.a.af;
import com.google.a.b.bl;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.common.core:
//            NodeAdapter

public class ListNode extends NodeAdapter
    implements Iterable
{

    private List list;

    public ListNode(Object obj)
    {
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        if (obj instanceof List)
        {
            obj = (List)obj;
        } else
        {
            obj = Collections.singletonList(obj);
        }
        list = ((List) (obj));
    }

    public ListNode add(Object obj)
    {
        list.add(obj);
        return this;
    }

    public List asList()
    {
        return list;
    }

    public boolean contains(Integer integer)
    {
        return integer.intValue() >= 0 && integer.intValue() < size();
    }

    public volatile boolean contains(Object obj)
    {
        return contains((Integer)obj);
    }

    public Object find(Integer integer)
    {
        if (contains(integer))
        {
            return list.get(integer.intValue());
        } else
        {
            return null;
        }
    }

    public volatile Object find(Object obj)
    {
        return find((Integer)obj);
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public Iterator iterator()
    {
        return bl.a(bl.a(list.iterator(), new _cls1()), af.a());
    }

    public ListNode remove(Integer integer)
    {
        list.remove(integer.intValue());
        return this;
    }

    public ListNode set(Integer integer, Object obj)
    {
        list.set(integer.intValue(), obj);
        return this;
    }

    public int size()
    {
        return list.size();
    }

    private class _cls1
        implements t
    {

        final ListNode this$0;

        public MapNode apply(Object obj)
        {
            if (obj instanceof Map)
            {
                return new MapNode((Map)obj);
            } else
            {
                return null;
            }
        }

        public volatile Object apply(Object obj)
        {
            return apply(obj);
        }

        _cls1()
        {
            this$0 = ListNode.this;
            super();
        }
    }

}
