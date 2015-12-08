// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cvh;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, ImmutableEnumMap, ImmutableMap, Maps

class t extends ImmutableMapEntrySet
{

    final ImmutableEnumMap this$0;

    public final cvh a()
    {
        return new cvh() {

            private final Iterator a;
            private ImmutableEnumMap._cls2 b;

            public final boolean hasNext()
            {
                return a.hasNext();
            }

            public final Object next()
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
                return Maps.a(entry.getKey(), entry.getValue());
            }

            
            {
                b = ImmutableEnumMap._cls2.this;
                super();
                a = ImmutableEnumMap.a(b.this$0).entrySet().iterator();
            }
        };
    }

    final ImmutableMap d()
    {
        return ImmutableEnumMap.this;
    }

    public Iterator iterator()
    {
        return a();
    }

    this._cls0()
    {
        this$0 = ImmutableEnumMap.this;
        super();
    }
}
