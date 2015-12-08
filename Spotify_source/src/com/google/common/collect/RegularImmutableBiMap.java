// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cum;
import cvh;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, ImmutableMapEntry, ImmutableSet, ImmutableMapEntrySet, 
//            ImmutableList, RegularImmutableAsList, ImmutableMap

public class RegularImmutableBiMap extends ImmutableBiMap
{

    private final transient ImmutableMapEntry a[];
    private final transient ImmutableMapEntry b[];
    private final transient ImmutableMapEntry c[];
    private final transient int d;
    private final transient int e;
    private transient ImmutableBiMap f;

    public RegularImmutableBiMap(int i, ImmutableMapEntry.TerminalEntry aterminalentry[])
    {
        int j = cum.b(i);
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
            int j1 = cum.a(l) & d;
            int k1 = cum.a(i1) & d;
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
                a(flag, "key", terminalentry, ((java.util.Map.Entry) (obj)));
                obj = ((ImmutableMapEntry) (obj)).a();
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
                a(flag1, "value", terminalentry, ((java.util.Map.Entry) (obj)));
                obj = ((ImmutableMapEntry) (obj)).b();
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

    static ImmutableMapEntry[] a(RegularImmutableBiMap regularimmutablebimap)
    {
        return regularimmutablebimap.c;
    }

    static int b(RegularImmutableBiMap regularimmutablebimap)
    {
        return regularimmutablebimap.e;
    }

    static int c(RegularImmutableBiMap regularimmutablebimap)
    {
        return regularimmutablebimap.d;
    }

    static ImmutableMapEntry[] d(RegularImmutableBiMap regularimmutablebimap)
    {
        return regularimmutablebimap.b;
    }

    final ImmutableSet c()
    {
        return new ImmutableMapEntrySet() {

            final RegularImmutableBiMap this$0;

            public final cvh a()
            {
                return b().a();
            }

            final ImmutableMap d()
            {
                return RegularImmutableBiMap.this;
            }

            final ImmutableList f()
            {
                return new RegularImmutableAsList(this, RegularImmutableBiMap.a(RegularImmutableBiMap.this));
            }

            public int hashCode()
            {
                return RegularImmutableBiMap.b(RegularImmutableBiMap.this);
            }

            public Iterator iterator()
            {
                return b().a();
            }

            final boolean n_()
            {
                return true;
            }

            
            {
                this$0 = RegularImmutableBiMap.this;
                super();
            }
        };
    }

    final boolean e()
    {
        return false;
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int i = cum.a(obj.hashCode());
            int j = d;
            ImmutableMapEntry immutablemapentry = a[i & j];
            while (immutablemapentry != null) 
            {
                if (obj.equals(immutablemapentry.getKey()))
                {
                    return immutablemapentry.getValue();
                }
                immutablemapentry = immutablemapentry.a();
            }
        }
        return null;
    }

    public final ImmutableBiMap o_()
    {
        ImmutableBiMap immutablebimap = f;
        Object obj = immutablebimap;
        if (immutablebimap == null)
        {
            obj = new Inverse((byte)0);
            f = ((ImmutableBiMap) (obj));
        }
        return ((ImmutableBiMap) (obj));
    }

    public int size()
    {
        return c.length;
    }

    private class NonTerminalBiMapEntry extends ImmutableMapEntry
    {

        private final ImmutableMapEntry nextInKeyBucket;
        private final ImmutableMapEntry nextInValueBucket;

        final ImmutableMapEntry a()
        {
            return nextInKeyBucket;
        }

        final ImmutableMapEntry b()
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


    private class Inverse extends ImmutableBiMap
    {

        final RegularImmutableBiMap this$0;

        final ImmutableSet c()
        {
            class InverseEntrySet extends ImmutableMapEntrySet
            {

                final Inverse this$1;

                public final cvh a()
                {
                    return b().a();
                }

                final ImmutableMap d()
                {
                    return Inverse.this;
                }

                final ImmutableList f()
                {
                    return new ImmutableAsList() {

                        final InverseEntrySet this$2;

                        final ImmutableCollection c()
                        {
                            return InverseEntrySet.this;
                        }

                        public Object get(int i)
                        {
                            ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.a(_fld0)[i];
                            return Maps.a(immutablemapentry.getValue(), immutablemapentry.getKey());
                        }

                        
                        {
                            this$2 = InverseEntrySet.this;
                            super();
                        }
                    };
                }

                public final int hashCode()
                {
                    return RegularImmutableBiMap.b(_fld0);
                }

                public final Iterator iterator()
                {
                    return b().a();
                }

                final boolean n_()
                {
                    return true;
                }

                InverseEntrySet()
                {
                    this$1 = Inverse.this;
                    super();
                }
            }

            return new InverseEntrySet();
        }

        final boolean e()
        {
            return false;
        }

        public final Object get(Object obj)
        {
            if (obj != null)
            {
                int i = cum.a(obj.hashCode());
                int j = RegularImmutableBiMap.c(RegularImmutableBiMap.this);
                ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.d(RegularImmutableBiMap.this)[i & j];
                while (immutablemapentry != null) 
                {
                    if (obj.equals(immutablemapentry.getValue()))
                    {
                        return immutablemapentry.getKey();
                    }
                    immutablemapentry = immutablemapentry.b();
                }
            }
            return null;
        }

        public final ImmutableBiMap o_()
        {
            return RegularImmutableBiMap.this;
        }

        public final int size()
        {
            return ImmutableBiMap.this.size();
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

        Inverse(byte byte0)
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
                return forward.o_();
            }

            InverseSerializedForm(ImmutableBiMap immutablebimap)
            {
                forward = immutablebimap;
            }
        }

    }

}
