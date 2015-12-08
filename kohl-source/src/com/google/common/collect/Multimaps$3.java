// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.collect:
//            Multimaps

static final class val.function
    implements ansformer
{

    final Function val$function;

    public Object transformEntry(Object obj, Object obj1)
    {
        return val$function.apply(obj1);
    }

    ansformer(Function function1)
    {
        val$function = function1;
        super();
    }
}
