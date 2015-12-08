// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, AbstractMultimap

private class <init> extends AbstractMultiset
{
    private class EntrySet extends AbstractSet
    {

        final AbstractMultimap.MultisetView this$1;

        public void clear()
        {
            AbstractMultimap.this.clear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                Collection collection = (Collection)AbstractMultimap.access$000(this$0).get(((Multiset.Entry) (obj)).getElement());
                if (collection != null && collection.size() == ((Multiset.Entry) (obj)).getCount())
                {
                    return true;
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return new AbstractMultimap.MultisetEntryIterator(this$0, null);
        }

        public boolean remove(Object obj)
        {
            return contains(obj) && AbstractMultimap.access$500(this$0, ((Multiset.Entry)obj).getElement()) > 0;
        }

        public int size()
        {
            return AbstractMultimap.access$000(this$0).size();
        }

        private EntrySet()
        {
            this$1 = AbstractMultimap.MultisetView.this;
            super();
        }

        EntrySet(AbstractMultimap._cls1 _pcls1)
        {
            this();
        }
    }


    transient Set entrySet;
    final AbstractMultimap this$0;

    public void clear()
    {
        AbstractMultimap.this.clear();
    }

    public int count(Object obj)
    {
        int i;
        try
        {
            obj = (Collection)AbstractMultimap.access$000(AbstractMultimap.this).get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        if (obj == null)
        {
            return 0;
        }
        i = ((Collection) (obj)).size();
        return i;
    }

    public Set elementSet()
    {
        return keySet();
    }

    public Set entrySet()
    {
        Set set = entrySet;
        Object obj = set;
        if (set == null)
        {
            obj = new EntrySet(null);
            entrySet = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Iterator iterator()
    {
        return new erator(AbstractMultimap.this, null);
    }

    public int remove(Object obj, int i)
    {
        int j = 0;
        if (i == 0)
        {
            j = count(obj);
        } else
        {
            Collection collection;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            try
            {
                collection = (Collection)AbstractMultimap.access$000(AbstractMultimap.this).get(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return 0;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return 0;
            }
            if (collection != null)
            {
                int l = collection.size();
                if (i >= l)
                {
                    return AbstractMultimap.access$500(AbstractMultimap.this, obj);
                }
                obj = collection.iterator();
                for (int k = 0; k < i; k++)
                {
                    ((Iterator) (obj)).next();
                    ((Iterator) (obj)).remove();
                }

                AbstractMultimap.access$220(AbstractMultimap.this, i);
                return l;
            }
        }
        return j;
    }

    public int size()
    {
        return AbstractMultimap.access$200(AbstractMultimap.this);
    }

    private EntrySet()
    {
        this$0 = AbstractMultimap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
