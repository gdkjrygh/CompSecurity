// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import rx.functions.Func1;

// Referenced classes of package me.lyft.android.rx:
//            ReactiveUI

final class 
    implements Func1
{

    public Boolean call(Boolean boolean1)
    {
        boolean flag;
        if (!boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((Boolean)obj);
    }

    ()
    {
    }
}
