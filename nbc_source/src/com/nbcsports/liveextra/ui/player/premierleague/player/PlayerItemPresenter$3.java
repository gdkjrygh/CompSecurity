// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import java.util.List;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerItemPresenter

class this._cls0
    implements Func1
{

    final PlayerItemPresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public Observable call(List list)
    {
        return Observable.from(list);
    }

    ()
    {
        this$0 = PlayerItemPresenter.this;
        super();
    }
}
