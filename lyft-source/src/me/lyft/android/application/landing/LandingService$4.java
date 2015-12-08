// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.landing;

import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.landing:
//            LandingService

class this._cls0
    implements Func1
{

    final LandingService this$0;

    public volatile Object call(Object obj)
    {
        return call((Throwable)obj);
    }

    public Observable call(Throwable throwable)
    {
        return LandingService.access$000(LandingService.this, throwable);
    }

    ()
    {
        this$0 = LandingService.this;
        super();
    }
}
