// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, an, ImmutableMapEntry, af, 
//            ImmutableSet, ae

class RegularImmutableBiMap extends ImmutableBiMap
{

    static final double MAX_LOAD_FACTOR = 1.2D;
    private final transient ImmutableMapEntry a[];
    private final transient ImmutableMapEntry b[];
    private final transient ImmutableMapEntry c[];
    private final transient int d;
    private final transient int e;
    private transient ImmutableBiMap f;

    RegularImmutableBiMap(int i, ImmutableMapEntry.TerminalEntry aterminalentry[])
    {
        int j = an.b(i);
        d = j - 1;
        ImmutableMapEntry aimmutablemapentry[] = new ImmutableMapEntry[j];
        ImmutableMapEntry aimmutablemapentry1[] = new ImmutableMapEntry[j];
        ImmutableMapEntry aimmutablemapentry2[] = new ImmutableMapEntry[i];
        int k = 0;
        j = 0;
        while (k < i) 
        {
            ImmutableMapEntry.TerminalEntry terminalentry = aterminalentry[k];
            Object obj1 = terminalentry.getKey();
            Object obj2 = terminalentry.getValue();
            int l = obj1.hashCode();
            int i1 = obj2.hashCode();
            int j1 = an.a(l) & d;
            int k1 = an.a(i1) & d;
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
            aimmutablemapentry2[k] = ((ImmutableMapEntry) (obj));
            k++;
            j += l ^ i1;
        }
        a = aimmutablemapentry;
        b = aimmutablemapentry1;
        c = aimmutablemapentry2;
        e = j;
    }

    transient RegularImmutableBiMap(ImmutableMapEntry.TerminalEntry aterminalentry[])
    {
        this(aterminalentry.length, aterminalentry);
    }

    RegularImmutableBiMap(java.util.Map.Entry aentry[])
    {
        int k = aentry.length;
        int i = an.b(k);
        d = i - 1;
        ImmutableMapEntry aimmutablemapentry[] = new ImmutableMapEntry[i];
        ImmutableMapEntry aimmutablemapentry1[] = new ImmutableMapEntry[i];
        ImmutableMapEntry aimmutablemapentry2[] = new ImmutableMapEntry[k];
        int j = 0;
        i = 0;
        while (j < k) 
        {
            java.util.Map.Entry entry = aentry[j];
            Object obj1 = entry.getKey();
            Object obj2 = entry.getValue();
            af.a(obj1, obj2);
            int l = obj1.hashCode();
            int i1 = obj2.hashCode();
            int j1 = an.a(l) & d;
            int k1 = an.a(i1) & d;
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
                checkNoConflict(flag, "key", entry, ((java.util.Map.Entry) (obj)));
                obj = ((ImmutableMapEntry) (obj)).getNextInKeyBucket();
            }
            ImmutableMapEntry immutablemapentry1 = aimmutablemapentry1[k1];
            obj = immutablemapentry1;
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
                checkNoConflict(flag1, "value", entry, ((java.util.Map.Entry) (obj)));
                obj = ((ImmutableMapEntry) (obj)).getNextInValueBucket();
            }
            if (immutablemapentry == null && immutablemapentry1 == null)
            {
                obj = new ImmutableMapEntry.TerminalEntry(obj1, obj2);
            } else
            {
                obj = new NonTerminalBiMapEntry(obj1, obj2, immutablemapentry, immutablemapentry1);
            }
            aimmutablemapentry[j1] = ((ImmutableMapEntry) (obj));
            aimmutablemapentry1[k1] = ((ImmutableMapEntry) (obj));
            aimmutablemapentry2[j] = ((ImmutableMapEntry) (obj));
            j++;
            i += l ^ i1;
        }
        a = aimmutablemapentry;
        b = aimmutablemapentry1;
        c = aimmutablemapentry2;
        e = i;
    }

    ImmutableSet createEntrySet()
    {
        return new _cls1();
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int i = an.a(obj.hashCode());
            int j = d;
            ImmutableMapEntry immutablemapentry = a[i & j];
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

    public ImmutableBiMap inverse()
    {
        ImmutableBiMap immutablebimap = f;
        Object obj = immutablebimap;
        if (immutablebimap == null)
        {
            obj = new Inverse(null);
            f = ((ImmutableBiMap) (obj));
        }
        return ((ImmutableBiMap) (obj));
    }

    public volatile ae inverse()
    {
        return inverse();
    }

    boolean isPartialView()
    {
        return false;
    }

    public int size()
    {
        return c.length;
    }





    private class NonTerminalBiMapEntry extends ImmutableMapEntry
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

        NonTerminalBiMapEntry(Object obj, Object obj1, ImmutableMapEntry immutablemapentry, ImmutableMapEntry immutablemapentry1)
        {
            super(obj, obj1);
            nextInKeyBucket = immutablemapentry;
            nextInValueBucket = immutablemapentry1;
        }
    }


    private class _cls1 extends ImmutableMapEntrySet
    {

        final RegularImmutableBiMap this$0;

        ImmutableList createAsList()
        {
            return new RegularImmutableAsList(this, c);
        }

        public int hashCode()
        {
            return e;
        }

        boolean isHashCodeFast()
        {
            return true;
        }

        public ej iterator()
        {
            return asList().iterator();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        ImmutableMap map()
        {
            return RegularImmutableBiMap.this;
        }

        _cls1()
        {
            this$0 = RegularImmutableBiMap.this;
            super();
        }
    }


    private class Inverse extends ImmutableBiMap
    {

        final RegularImmutableBiMap this$0;

        final ImmutableSet createEntrySet()
        {
            class InverseEntrySet extends ImmutableMapEntrySet
            {

                final Inverse this$1;

                final ImmutableList createAsList()
                {
                    class _cls1 extends ImmutableAsList
                    {

                        final InverseEntrySet this$2;

                        ImmutableCollection delegateCollection()
                        {
                            return InverseEntrySet.this;
                        }

                        public volatile Object get(int i)
                        {
                            return get(i);
                        }

                        public java.util.Map.Entry get(int i)
                        {
                            ImmutableMapEntry immutablemapentry = c[i];
                            return Maps.a(immutablemapentry.getValue(), immutablemapentry.getKey());
                        }

                            _cls1()
                            {
                                this$2 = InverseEntrySet.this;
                                super();
                            }
                    }

                    return new _cls1();
                }

                public final int hashCode()
                {
                    return e;
                }

                final boolean isHashCodeFast()
                {
                    return true;
                }

                public final ej iterator()
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

                InverseEntrySet()
                {
                    this$1 = Inverse.this;
                    super();
                }
            }

            return new InverseEntrySet();
        }

        public final Object get(Object obj)
        {
            if (obj != null)
            {
                int i = an.a(obj.hashCode());
                int j = d;
                ImmutableMapEntry immutablemapentry = b[i & j];
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

        public final volatile ae inverse()
        {
            return inverse();
        }

        final boolean isPartialView()
        {
            return false;
        }

        public final int size()
        {
            return inverse().size();
        }

        final Object writeReplace()
        {
            return new InverseSerializedForm(RegularImmutableBiMap.this);
        }

        private Inverse()
        {
            this$0 = RegularImmutableBiMap.this;
            super();
        }

        Inverse(_cls1 _pcls1)
        {
            this();
        }

        private class InverseSerializedForm
            implements Serializable
        {

            private static final long serialVersionUID = 1L;
            private final ImmutableBiMap forward;

            Object readResolve()
            {
                return forward.inverse();
            }

            InverseSerializedForm(ImmutableBiMap immutablebimap)
            {
                forward = immutablebimap;
            }
        }

    }

}
