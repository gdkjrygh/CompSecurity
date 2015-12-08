// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.optional;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.collections.AbstractIterator;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.optional:
//            Optional

class l.optionals extends AbstractIterator
{

    private final Iterator iterator;
    final endOfData this$0;

    protected Object computeNext()
    {
        while (iterator.hasNext()) 
        {
            Optional optional = (Optional)iterator.next();
            if (optional.isPresent())
            {
                return optional.get();
            }
        }
        return endOfData();
    }

    erator()
    {
        this$0 = this._cls0.this;
        super();
        iterator = (Iterator)Preconditions.checkNotNull(optionals.iterator());
    }
}
