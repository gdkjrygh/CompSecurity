// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, Hashing, ImmutableMapEntry, ImmutableSet, 
//            ImmutableMapEntrySet, ImmutableList, UnmodifiableIterator, ImmutableMap, 
//            ImmutableAsList, Maps, ImmutableCollection, RegularImmutableAsList

final class RegularImmutableBiMap extends ImmutableBiMap
{
    final class Inverse extends ImmutableBiMap
    {

        final RegularImmutableBiMap this$0;

        final ImmutableSet createEntrySet()
        {
            return new InverseEntrySet();
        }

        public final Object get(Object obj)
        {
            if (obj != null)
            {
                int i = Hashing.smear(obj.hashCode());
                int j = mask;
                ImmutableMapEntry immutablemapentry = valueTable[i & j];
                while (immutablemapentry != null) 
                {
                    if (obj.equals(immutablemapentry.getValue()))
                    {
                        return immutablemapentry.getKey();
                    }
                    immutablemapentry = immutablemapentry.getNextInValueBucket();
                }
            }
            return null;
        }

        public final ImmutableBiMap inverse()
        {
            return RegularImmutableBiMap.this;
        }

        final boolean isPartialView()
        {
            return false;
        }

        public final int size()
        {
            return inverse().size();
        }

        private Inverse()
        {
            this$0 = RegularImmutableBiMap.this;
            super();
        }

    }

    final class Inverse.InverseEntrySet extends ImmutableMapEntrySet
    {

        final Inverse this$1;

        final ImmutableList createAsList()
        {
            return new ImmutableAsList() {

                final Inverse.InverseEntrySet this$2;

                private java.util.Map.Entry get(int i)
                {
                    ImmutableMapEntry immutablemapentry = entries[i];
                    return Maps.immutableEntry(immutablemapentry.getValue(), immutablemapentry.getKey());
                }

                final ImmutableCollection delegateCollection()
                {
                    return Inverse.InverseEntrySet.this;
                }

                public final volatile Object get(int i)
                {
                    return get(i);
                }

            
            {
                this$2 = Inverse.InverseEntrySet.this;
                super();
            }
            };
        }

        public final int hashCode()
        {
            return _fld0.hashCode;
        }

        final boolean isHashCodeFast()
        {
            return true;
        }

        public final UnmodifiableIterator iterator()
        {
            return asList().iterator();
        }

        public final volatile Iterator iterator()
        {
            return iterator();
        }

        final ImmutableMap map()
        {
            return Inverse.this;
        }

        Inverse.InverseEntrySet()
        {
            this$1 = Inverse.this;
            super();
        }
    }

    static final class NonTerminalBiMapEntry extends ImmutableMapEntry
    {

        private final ImmutableMapEntry nextInKeyBucket;
        private final ImmutableMapEntry nextInValueBucket;

        final ImmutableMapEntry getNextInKeyBucket()
        {
            return nextInKeyBucket;
        }

        final ImmutableMapEntry getNextInValueBucket()
        {
            return nextInValueBucket;
        }

        NonTerminalBiMapEntry(ImmutableMapEntry immutablemapentry, ImmutableMapEntry immutablemapentry1, ImmutableMapEntry immutablemapentry2)
        {
            super(immutablemapentry);
            nextInKeyBucket = immutablemapentry1;
            nextInValueBucket = immutablemapentry2;
        }
    }


    private final transient ImmutableMapEntry entries[];
    private final transient int hashCode;
    private transient ImmutableBiMap inverse;
    private final transient ImmutableMapEntry keyTable[];
    private final transient int mask;
    private final transient ImmutableMapEntry valueTable[];

    RegularImmutableBiMap(int i, ImmutableMapEntry.TerminalEntry aterminalentry[])
    {
        int j = Hashing.closedTableSize(i, 1.2D);
        mask = j - 1;
        ImmutableMapEntry aimmutablemapentry[] = createEntryArray(j);
        ImmutableMapEntry aimmutablemapentry1[] = createEntryArray(j);
        ImmutableMapEntry aimmutablemapentry2[] = createEntryArray(i);
        int k = 0;
        j = 0;
        while (j < i) 
        {
            ImmutableMapEntry.TerminalEntry terminalentry = aterminalentry[j];
            Object obj1 = terminalentry.getKey();
            Object obj2 = terminalentry.getValue();
            int l = obj1.hashCode();
            int i1 = obj2.hashCode();
            int j1 = Hashing.smear(l) & mask;
            int k1 = Hashing.smear(i1) & mask;
            ImmutableMapEntry immutablemapentry = aimmutablemapentry[j1];
            Object obj = immutablemapentry;
            while (obj != null) 
            {
                boolean flag;
                if (!obj1.equals(((ImmutableMapEntry) (obj)).getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                checkNoConflict(flag, "key", terminalentry, ((java.util.Map.Entry) (obj)));
                obj = ((ImmutableMapEntry) (obj)).getNextInKeyBucket();
            }
            obj1 = aimmutablemapentry1[k1];
            obj = obj1;
            while (obj != null) 
            {
                boolean flag1;
                if (!obj2.equals(((ImmutableMapEntry) (obj)).getValue()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                checkNoConflict(flag1, "value", terminalentry, ((java.util.Map.Entry) (obj)));
                obj = ((ImmutableMapEntry) (obj)).getNextInValueBucket();
            }
            if (immutablemapentry == null && obj1 == null)
            {
                obj = terminalentry;
            } else
            {
                obj = new NonTerminalBiMapEntry(terminalentry, immutablemapentry, ((ImmutableMapEntry) (obj1)));
            }
            aimmutablemapentry[j1] = ((ImmutableMapEntry) (obj));
            aimmutablemapentry1[k1] = ((ImmutableMapEntry) (obj));
            aimmutablemapentry2[j] = ((ImmutableMapEntry) (obj));
            k += l ^ i1;
            j++;
        }
        keyTable = aimmutablemapentry;
        valueTable = aimmutablemapentry1;
        entries = aimmutablemapentry2;
        hashCode = k;
    }

    private static ImmutableMapEntry[] createEntryArray(int i)
    {
        return new ImmutableMapEntry[i];
    }

    final ImmutableSet createEntrySet()
    {
        return new ImmutableMapEntrySet() {

            final RegularImmutableBiMap this$0;

            final ImmutableList createAsList()
            {
                return new RegularImmutableAsList(this, entries);
            }

            public final int hashCode()
            {
                return RegularImmutableBiMap.this.hashCode;
            }

            final boolean isHashCodeFast()
            {
                return true;
            }

            public final UnmodifiableIterator iterator()
            {
                return asList().iterator();
            }

            public final volatile Iterator iterator()
            {
                return iterator();
            }

            final ImmutableMap map()
            {
                return RegularImmutableBiMap.this;
            }

            
            {
                this$0 = RegularImmutableBiMap.this;
                super();
            }
        };
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = Hashing.smear(obj.hashCode());
            int j = mask;
            ImmutableMapEntry immutablemapentry = keyTable[i & j];
            while (immutablemapentry != null) 
            {
                if (obj.equals(immutablemapentry.getKey()))
                {
                    return immutablemapentry.getValue();
                }
                immutablemapentry = immutablemapentry.getNextInKeyBucket();
            }
        }
        return null;
    }

    public final ImmutableBiMap inverse()
    {
        ImmutableBiMap immutablebimap = inverse;
        Object obj = immutablebimap;
        if (immutablebimap == null)
        {
            obj = new Inverse();
            inverse = ((ImmutableBiMap) (obj));
        }
        return ((ImmutableBiMap) (obj));
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final int size()
    {
        return entries.length;
    }




}
