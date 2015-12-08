// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.leanplum;

import android.os.SystemClock;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.leanplum:
//            LeanplumService

class this._cls0 extends Subscriber
{

    final LeanplumService this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
    }

    public volatile void onNext(Object obj)
    {
        onNext((AppInfo)obj);
    }

    public void onNext(AppInfo appinfo)
    {
        LeanplumService.access$002(LeanplumService.this, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    ()
    {
        this$0 = LeanplumService.this;
        super();
    }
}
