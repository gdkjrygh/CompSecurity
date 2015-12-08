// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableMap, ImmutableMapEntry, an, af, 
//            ImmutableSet

final class RegularImmutableMap extends ImmutableMap
{

    private static final long serialVersionUID = 0L;
    private final transient ImmutableMapEntry a[];
    private final transient ImmutableMapEntry b[];
    private final transient int c;

    RegularImmutableMap(int i, ImmutableMapEntry.TerminalEntry aterminalentry[])
    {
        a = new ImmutableMapEntry[i];
        int j = an.b(i);
        b = new ImmutableMapEntry[j];
        c = j - 1;
        j = 0;
        while (j < i) 
        {
            Object obj = aterminalentry[j];
            Object obj1 = ((ImmutableMapEntry.TerminalEntry) (obj)).getKey();
            int k = an.a(obj1.hashCode());
            k = c & k;
            ImmutableMapEntry immutablemapentry = b[k];
            if (immutablemapentry != null)
            {
                obj = new NonTerminalMapEntry(((ImmutableMapEntry) (obj)), immutablemapentry);
            }
            b[k] = ((ImmutableMapEntry) (obj));
            a[j] = ((ImmutableMapEntry) (obj));
            a(obj1, ((ImmutableMapEntry) (obj)), immutablemapentry);
            j++;
        }
    }

    transient RegularImmutableMap(ImmutableMapEntry.TerminalEntry aterminalentry[])
    {
        this(aterminalentry.length, aterminalentry);
    }

    RegularImmutableMap(java.util.Map.Entry aentry[])
    {
        int j = aentry.length;
        a = new ImmutableMapEntry[j];
        int i = an.b(j);
        b = new ImmutableMapEntry[i];
        c = i - 1;
        i = 0;
        while (i < j) 
        {
            Object obj = aentry[i];
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            af.a(obj1, obj);
            int k = an.a(obj1.hashCode());
            k = c & k;
            ImmutableMapEntry immutablemapentry = b[k];
            if (immutablemapentry == null)
            {
                obj = new ImmutableMapEntry.TerminalEntry(obj1, obj);
            } else
            {
                obj = new NonTerminalMapEntry(obj1, obj, immutablemapentry);
            }
            b[k] = ((ImmutableMapEntry) (obj));
            a[i] = ((ImmutableMapEntry) (obj));
            a(obj1, ((ImmutableMapEntry) (obj)), immutablemapentry);
            i++;
        }
    }

    private static void a(Object obj, ImmutableMapEntry immutablemapentry, ImmutableMapEntry immutablemapentry1)
    {
        while (immutablemapentry1 != null) 
        {
            boolean flag;
            if (!obj.equals(immutablemapentry1.getKey()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkNoConflict(flag, "key", immutablemapentry, immutablemapentry1);
            immutablemapentry1 = immutablemapentry1.getNextInKeyBucket();
        }
    }

    final ImmutableSet createEntrySet()
    {
        return new EntrySet(null);
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = an.a(obj.hashCode());
            int j = c;
            ImmutableMapEntry immutablemapentry = b[i & j];
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

    final boolean isPartialView()
    {
        return false;
    }

    public final int size()
    {
        return a.length;
    }


    private class NonTerminalMapEntry extends ImmutableMapEntry
    {

        private final ImmutableMapEntry nextInKeyBucket;

        final ImmutableMapEntry getNextInKeyBucket()
        {
            return nextInKeyBucket;
        }

        final ImmutableMapEntry getNextInValueBucket()
        {
            return null;
        }

        NonTerminalMapEntry(ImmutableMapEntry immutablemapentry, ImmutableMapEntry immutablemapentry1)
        {
            super(immutablemapentry);
            nextInKeyBucket = immutablemapentry1;
        }

        NonTerminalMapEntry(Object obj, Object obj1, ImmutableMapEntry immutablemapentry)
        {
            super(obj, obj1);
            nextInKeyBucket = immutablemapentry;
        }
    }


    private class EntrySet extends ImmutableMapEntrySet
    {

        final RegularImmutableMap this$0;

        ImmutableList createAsList()
        {
            return new RegularImmutableAsList(this, a);
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
            return RegularImmutableMap.this;
        }

        private EntrySet()
        {
            this$0 = RegularImmutableMap.this;
            super();
        }

        EntrySet(dy dy)
        {
            this();
        }
    }

}
