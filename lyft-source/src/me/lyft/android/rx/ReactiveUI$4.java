// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import rx.functions.FuncN;

// Referenced classes of package me.lyft.android.rx:
//            ReactiveUI

final class 
    implements FuncN
{

    public transient Boolean call(Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            if (((Boolean)aobj[i]).booleanValue())
            {
                return Boolean.valueOf(true);
            }
        }

        return Boolean.valueOf(false);
    }

    public volatile Object call(Object aobj[])
    {
        return call(aobj);
    }

    ()
    {
    }
}
