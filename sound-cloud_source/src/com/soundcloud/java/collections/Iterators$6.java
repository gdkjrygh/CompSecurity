// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.functions.Function;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            TransformedIterator

final class terator extends TransformedIterator
{

    final Function val$function;

    final Object transform(Object obj)
    {
        return val$function.apply(obj);
    }

    terator(Function function1)
    {
        val$function = function1;
        super(final_iterator);
    }
}
