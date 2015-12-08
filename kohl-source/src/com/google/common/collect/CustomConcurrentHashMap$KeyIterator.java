// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

final class  extends 
    implements Iterator
{

    final CustomConcurrentHashMap this$0;

    public Object next()
    {
        return nextEntry().getKey();
    }

    Entry()
    {
        this$0 = CustomConcurrentHashMap.this;
        super(CustomConcurrentHashMap.this);
    }
}
