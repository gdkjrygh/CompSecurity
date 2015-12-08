// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap

private static final class value
{

    final Object key;
    value next;
    value nextSibling;
    value previous;
    value previousSibling;
    Object value;

    public String toString()
    {
        return (new StringBuilder()).append(key).append("=").append(value).toString();
    }

    (Object obj, Object obj1)
    {
        key = obj;
        value = obj1;
    }
}
