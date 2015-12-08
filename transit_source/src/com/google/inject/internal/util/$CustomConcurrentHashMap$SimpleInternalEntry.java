// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap

static class next
{

    final int hash;
    final Object key;
    final next next;
    volatile Object value;

    (Object obj, int i, Object obj1,  )
    {
        key = obj;
        hash = i;
        value = obj1;
        next = ;
    }
}
