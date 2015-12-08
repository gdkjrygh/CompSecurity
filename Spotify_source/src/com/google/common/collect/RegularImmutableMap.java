// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cuj;
import cum;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, ImmutableMapEntry, ImmutableSet

public final class RegularImmutableMap extends ImmutableMap
{

    private static final long serialVersionUID = 0L;
    private final transient ImmutableMapEntry a[];
    private final transient ImmutableMapEntry b[];
    private final transient int c;

    public RegularImmutableMap(int i, ImmutableMapEntry.TerminalEntry aterminalentry[])
    {
        a = new ImmutableMapEntry[i];
        int j = cum.b(i);
        b = new ImmutableMapEntry[j];
        c = j - 1;
        j = 0;
        while (j < i) 
        {
            Object obj = aterminalentry[j];
            Object obj1 = ((ImmutableMapEntry.TerminalEntry) (obj)).getKey();
            int k = cum.a(obj1.hashCode());
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
        int i = cum.b(j);
        b = new ImmutableMapEntry[i];
        c = i - 1;
        i = 0;
        while (i < j) 
        {
            Object obj = aentry[i];
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            cuj.a(obj1, obj);
            int k = cum.a(obj1.hashCode());
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
            a(flag, "key", ((java.util.Map.Entry) (immutablemapentry)), ((java.util.Map.Entry) (immutablemapentry1)));
            immutablemapentry1 = immutablemapentry1.a();
        }
    }

    static ImmutableMapEntry[] a(RegularImmutableMap regularimmutablemap)
    {
        return regularimmutablemap.a;
    }

    final ImmutableSet c()
    {
        return new EntrySet((byte)0);
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
            int j = c;
            ImmutableMapEntry immutablemapentry = b[i & j];
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

    public final int size()
    {
        return a.length;
    }

    private class NonTerminalMapEntry extends ImmutableMapEntry
    {

        private final ImmutableMapEntry nextInKeyBucket;

        final ImmutableMapEntry a()
        {
            return nextInKeyBucket;
        }

        final ImmutableMapEntry b()
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

        public final cvh a()
        {
            return b().a();
        }

        final ImmutableMap d()
        {
            return RegularImmutableMap.this;
        }

        final ImmutableList f()
        {
            return new RegularImmutableAsList(this, RegularImmutableMap.a(RegularImmutableMap.this));
        }

        public Iterator iterator()
        {
            return b().a();
        }

        private EntrySet()
        {
            this$0 = RegularImmutableMap.this;
            super();
        }

        EntrySet(byte byte0)
        {
            this();
        }
    }

}
