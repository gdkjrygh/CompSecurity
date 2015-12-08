// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            Constraint, MapConstraint, ForwardingMapEntry, MapConstraints, 
//            Constraints

class this._cls0
    implements Constraint
{

    final tKey this$0;

    public Object checkElement(Object obj)
    {
        constraint.checkKeyValue(tKey(), obj);
        return obj;
    }

    <init>()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/MapConstraints$2

/* anonymous class */
    static final class MapConstraints._cls2 extends ForwardingMapEntry
    {

        final MapConstraint val$constraint;
        final java.util.Map.Entry val$entry;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected java.util.Map.Entry _mthdelegate()
        {
            return entry;
        }

        public volatile Object getValue()
        {
            return getValue();
        }

        public Collection getValue()
        {
            return Constraints.constrainedTypePreservingCollection((Collection)entry.getValue(), new MapConstraints._cls2._cls1());
        }

            
            {
                entry = entry1;
                constraint = mapconstraint;
                super();
            }
    }

}
