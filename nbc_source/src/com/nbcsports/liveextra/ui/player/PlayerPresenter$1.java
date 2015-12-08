// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.functions.Func0;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerPresenter

class this._cls0
    implements Func0
{

    final PlayerPresenter this$0;

    public volatile Object call()
    {
        return call();
    }

    public Observable call()
    {
        return Observable.timer(0L, 1L, TimeUnit.SECONDS);
    }

    _cls9()
    {
        this$0 = PlayerPresenter.this;
        super();
    }
}
