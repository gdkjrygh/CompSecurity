// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import android.util.SparseArray;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            PropertySet, PropertyBinding

class this._cls0
    implements Iterator
{

    private int currentIndex;
    final PropertySet this$0;

    public boolean hasNext()
    {
        return currentIndex < PropertySet.access$100(PropertySet.this).size();
    }

    public PropertyBinding next()
    {
        SparseArray sparsearray = PropertySet.access$100(PropertySet.this);
        int i = currentIndex;
        currentIndex = i + 1;
        return (PropertyBinding)sparsearray.valueAt(i);
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    g()
    {
        this$0 = PropertySet.this;
        super();
    }
}
