// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps, Sets, ForwardingSet, UnmodifiableIterator, 
//            ForwardingMapEntry, Lists

static class predicate extends ap
{
    private class EntrySet extends ForwardingSet
    {

        final Maps.FilteredEntryMap this$0;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            return filteredEntrySet;
        }

        public Iterator iterator()
        {
            return filteredEntrySet.iterator(). new UnmodifiableIterator() {

                final EntrySet this$1;
                final Iterator val$iterator;

                public boolean hasNext()
                {
                    return iterator.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return ((java.util.Map.Entry)iterator.next()). new ForwardingMapEntry() {

                        final EntrySet._cls1 this$2;
                        final java.util.Map.Entry val$entry;

                        protected volatile Object _mthdelegate()
                        {
                            return _mthdelegate();
                        }

                        protected java.util.Map.Entry _mthdelegate()
                        {
                            return entry;
                        }

                        public Object setValue(Object obj)
                        {
                            Preconditions.checkArgument(apply(entry.getKey(), obj));
                            return super.setValue(obj);
                        }

            
            {
                this$2 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                    };
                }

            
            {
                this$1 = final_entryset;
                iterator = Iterator.this;
                super();
            }
            };
        }

        private EntrySet()
        {
            this$0 = Maps.FilteredEntryMap.this;
            super();
        }

        EntrySet(Maps._cls1 _pcls1)
        {
            this();
        }
    }

    private class KeySet extends AbstractSet
    {

        final Maps.FilteredEntryMap this$0;

        public void clear()
        {
            filteredEntrySet.clear();
        }

        public boolean contains(Object obj)
        {
            return containsKey(obj);
        }

        public Iterator iterator()
        {
            return filteredEntrySet.iterator(). new UnmodifiableIterator() {

                final KeySet this$1;
                final Iterator val$iterator;

                public boolean hasNext()
                {
                    return iterator.hasNext();
                }

                public Object next()
                {
                    return ((java.util.Map.Entry)iterator.next()).getKey();
                }

            
            {
                this$1 = final_keyset;
                iterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            if (containsKey(obj))
            {
                unfiltered.remove(obj);
                return true;
            } else
            {