// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            Striped64

static final class  extends ThreadLocal
{

    private static  initialValue()
    {
        return new ();
    }

    public final volatile Object initialValue()
    {
        return initialValue();
    }

    ()
    {
    }
}
