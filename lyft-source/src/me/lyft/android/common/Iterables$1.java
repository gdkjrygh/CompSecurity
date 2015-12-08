// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import rx.functions.Func2;

// Referenced classes of package me.lyft.android.common:
//            Iterables, Objects

final class 
    implements Func2
{

    public Boolean call(Object obj, Object obj1)
    {
        return Boolean.valueOf(Objects.equals(obj, obj1));
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call(obj, obj1);
    }

    ()
    {
    }
}
