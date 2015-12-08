// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multisets

class is._cls0
    implements Iterator
{

    final Iterator elements;
    final elements this$1;

    public boolean hasNext()
    {
        return elements.hasNext();
    }

    public elements next()
    {
        return Multisets.immutableEntry(elements.next(), 1);
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        elements.remove();
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
        elements = _fld0.elements.iterator();
    }
}
