// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            Ordering

static class value extends ClassCastException
{

    private static final long serialVersionUID = 0L;
    final Object value;

    (Object obj)
    {
        super((new StringBuilder()).append("Cannot compare value: ").append(obj).toString());
        value = obj;
    }
}
