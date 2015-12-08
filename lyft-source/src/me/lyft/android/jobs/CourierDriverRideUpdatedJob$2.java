// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.HashSet;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.jobs:
//            CourierDriverRideUpdatedJob

class this._cls0
    implements Func2
{

    final CourierDriverRideUpdatedJob this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((HashSet)obj, (String)obj1);
    }

    public HashSet call(HashSet hashset, String s)
    {
        hashset.add(s);
        return hashset;
    }

    ()
    {
        this$0 = CourierDriverRideUpdatedJob.this;
        super();
    }
}
