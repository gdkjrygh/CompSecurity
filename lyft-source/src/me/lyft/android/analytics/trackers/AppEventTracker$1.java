// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import me.lyft.android.common.Unit;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AppEventTracker

class this._cls0
    implements Func2
{

    final AppEventTracker this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((Unit)obj, (Unit)obj1);
    }

    public Unit call(Unit unit, Unit unit1)
    {
        return Unit.create();
    }

    ()
    {
        this$0 = AppEventTracker.this;
        super();
    }
}
