// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, Hashing, Collections2, ImmutableSet, 
//            ImmutableCollection, ImmutableEntry, UnmodifiableIterator, AbstractIndexedListIterator

final class RegularImmutableMap extends ImmutableMap
{
    private static class EntrySet extends ImmutableSet.ArrayImmutableSet
    {

        final transient RegularImmutableMap map;

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = map.get(((java.util.Map.Entry) (obj)).getKey());
                flag = flag1;
                if (obj1 != null)
                {
                    flag = flag1;
                    if (obj1.equals(((java.util.Map.Entry) (obj)).getValue()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        EntrySet(RegularImmutableMap regularimmutablemap)
        {
            super(regularimmutablemap.entries);
            map = regularimmutablemap;
        }
    }

    private static class KeySet extends ImmutableSet.TransformedImmutableSet
    {

        final RegularImmutableMap map;

        public boolean contains(Object obj)
        {
            return map.containsKey(obj);
        }

        boolean isPartialView()
        {
            return true;
        }

        volatile Object transform(Object obj)
        {
            return transform((java.util.Map.Entry)obj);
        }

        Object transform(java.util.Map.Entry entry)
        {
            return entry.getKey();
        }

        KeySet(RegularImmutableMap regularimmutablemap)
        {
            super(regularimmutablemap.entries, regularimmutablemap.keySetHashCode);
            map = regularimmutablemap;
        }
    }

    private static interface LinkedEntry
        extends java.util.Map.Entry
    {

        public abstract LinkedEntry next();
    }

    private static final class NonTerminalEntry extends ImmutableEntry
        implements LinkedEntry
    {

        final LinkedEntry next;

        public LinkedEntry next()
        {
            return next;
        }

        NonTerminalEntry(Object obj, Object obj1, LinkedEntry linkedentry)
        {
            super(obj, obj1);
            next = linkedentry;
        }
    }

    private static final class TerminalEntry extends ImmutableEntry
        implements LinkedEntry
    {

        public LinkedEntry next()
        {
            return null;
        }

        TerminalEntry(Object obj, Object obj1)
        {
            super(obj, obj1);
        }
    }

    private static class Values extends ImmutableCollection
    {

        final RegularImmutableMap map;

        public boolean contains(Object obj)
        {
            return map.containsValue(obj);
        }

        boolean isPartialView()
        {
            return true;
        }

        public UnmodifiableIterator iterator()
        {
            return new AbstractIndexedListIterator(map.entries.length) {

                final Values this$0;

                protected Object get(int i)
                {
                    return map.entries[i].getValue();
                }

            
            {
                this$0 = Values.this;
                super(i);
            }
            };
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return map.entries.length;
        }

        Values(RegularImmutableMap regularimmutablemap)
        {
            map = regularimmutablemap;
        }
    }


    private static final long serialVersionUID = 0L;
    private final transient LinkedEntry entries[];
    private transient ImmutableSet entrySet;
    private transient ImmutableSet keySet;
    private final transient int keySetHashCode;
    private final transient int mask;
    private final transient LinkedEntry table[];
    private transient ImmutableCollection values;

    transient RegularImmutableMap(java.util.Map.Entry aentry[])
    {
        int l = aentry.length;
        entries = createEntryArray(l);
        int i = chooseTableSize(l);
        table = createEntryArray(i);
        mask = i - 1;
        int k = 0;
        for (int j = 0; j < l; j++)
        {
            Object obj1 = aentry[j];
            Object obj = ((java.util.Map.Entry) (obj1)).getKey();
            int i1 = obj.hashCode();
            k += i1;
            i1 = Hashing.smear(i1) & mask;
            LinkedEntry linkedentry = table[i1];
            obj1 = newLinkedEntry(obj, ((java.util.Map.Entry) (obj1)).getValue(), linkedentry);
            table[i1] = ((LinkedEntry) (obj1));
            entries[j] = ((LinkedEntry) (obj1));
            while (linkedentry != null) 
            {
                boolean flag;
                if (!obj.equals(linkedentry.getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "duplicate key: %s", new Object[] {
                    obj
                });
                linkedentry = linkedentry.next();
            }
        }

        keySetHashCode = k;
    }

    private static int chooseTableSize(int i)
    {
        int j = Integer.highestOneBit(i) << 1;
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "table too large: %s", new Object[] {
            Integer.valueOf(i)
        });
        return j;
    }

    private LinkedEntry[] createEntryArray(int i)
    {
        return new LinkedEntry[i];
    }

    private static LinkedEntry newLinkedEntry(Object obj, Object obj1, LinkedEntry linkedentry)
    {
        if (linkedentry == null)
        {
            return new TerminalEntry(obj, obj1);
        } else
        {
            return new NonTerminalEntry(obj, obj1, linkedentry);
        }
    }

    public boolean containsValue(Object obj)
    {
        if (obj != null)
        {
            LinkedEntry alinkedentry[] = entries;
            int j = alinkedentry.length;
            int i = 0;
            while (i < j) 
            {
                if (alinkedentry[i].getValue().equals(obj))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public ImmutableSet entrySet()
    {
        ImmutableSet immutableset = entrySet;
        Object obj = immutableset;
        if (immutableset == null)
        {
            obj = new EntrySet(this);
            entrySet = ((ImmutableSet) (obj));
        }
        return ((ImmutableSet) (obj));
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int i = Hashing.smear(obj.hashCode());
            int j = mask;
            LinkedEntry linkedentry = table[i & j];
            while (linkedentry != null) 
            {
                if (obj.equals(linkedentry.getKey()))
                {
                    return linkedentry.getValue();
                }
                linkedentry = linkedentry.next();
            }
        }
        return null;
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isPartialView()
    {
        return false;
    }

    public ImmutableSet keySet()
    {
        ImmutableSet immutableset = keySet;
        Object obj = immutableset;
        if (immutableset == null)
        {
            obj = new KeySet(this);
            keySet = ((ImmutableSet) (obj));
        }
        return ((ImmutableSet) (obj));
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public int size()
    {
        return entries.length;
    }

    public String toString()
    {
        StringBuilder stringbuilder = Collections2.newStringBuilderForCollection(size()).append('{');
        Collections2.STANDARD_JOINER.appendTo(stringbuilder, entries);
        return stringbuilder.append('}').toString();
    }

    public ImmutableCollection values()
    {
        ImmutableCollection immutablecollection = values;
        Object obj = immutablecollection;
        if (immutablecollection == null)
        {
            obj = new Values(this);
            values = ((ImmutableCollection) (obj));
        }
        return ((ImmutableCollection) (obj));
    }

    public volatile Collection values()
    {
        return values();
    }


}
