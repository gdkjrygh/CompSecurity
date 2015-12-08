// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, Multimaps

class val.key extends AbstractMapEntry
{

    final val.key this$2;
    final Object val$key;

    public Object getKey()
    {
        return val$key;
    }

    public volatile Object getValue()
    {
        return getValue();
    }

    public Collection getValue()
    {
        return getValue.this.getValue(val$key);
    }

    ys()
    {
        this$2 = final_ys;
        val$key = Object.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/Multimaps$MapMultimap$AsMapEntries$1

/* anonymous class */
    class Multimaps.MapMultimap.AsMapEntries._cls1
        implements Iterator
    {

        final Iterator keys;
        final Multimaps.MapMultimap.AsMapEntries this$1;

        public boolean hasNext()
        {
            return keys.hasNext();
        }

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            return ((Multimaps.MapMultimap.AsMapEntries._cls1._cls1) (keys.next())). new Multimaps.MapMultimap.AsMapEntries._cls1._cls1();
        }

        public void remove()
        {
            keys.remove();
        }

            
            {
                this$1 = Multimaps.MapMultimap.AsMapEntries.this;
                super();
                keys = map.keySet().iterator();
            }
    }

}
