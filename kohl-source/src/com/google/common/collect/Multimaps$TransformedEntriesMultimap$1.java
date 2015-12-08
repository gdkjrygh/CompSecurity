// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.collect:
//            Multimaps

class val.key
    implements Function
{

    final val.key this$0;
    final Object val$key;

    public Object apply(Object obj)
    {
        return ansformer.ansformer(val$key, obj);
    }

    ()
    {
        this$0 = final_;
        val$key = Object.this;
        super();
    }
}
