// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Func2;

// Referenced classes of package rx:
//            Observable

static final class 
    implements Func2
{

    public final Integer call(Integer integer, Object obj)
    {
        return Integer.valueOf(integer.intValue() + 1);
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((Integer)obj, obj1);
    }

    ()
    {
    }
}
