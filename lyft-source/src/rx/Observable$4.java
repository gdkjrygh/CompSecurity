// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import java.util.List;
import rx.functions.Func1;

// Referenced classes of package rx:
//            Observable

final class 
    implements Func1
{

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public Observable[] call(List list)
    {
        return (Observable[])list.toArray(new Observable[list.size()]);
    }

    ()
    {
    }
}
