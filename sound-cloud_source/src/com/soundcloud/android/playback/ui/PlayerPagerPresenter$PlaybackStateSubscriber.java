// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter, PlayerPageData

private final class <init> extends DefaultSubscriber
{

    final PlayerPagerPresenter this$0;

    public final void onNext(com.soundcloud.android.playback.er er)
    {
        PlayerPagerPresenter.access$1502(PlayerPagerPresenter.this, er);
        Object obj;
        Object obj1;
        for (Iterator iterator = PlayerPagerPresenter.access$1200(PlayerPagerPresenter.this).entrySet().iterator(); iterator.hasNext(); PlayerPagerPresenter.access$1600(PlayerPagerPresenter.this, er, ((PlayerPagePresenter) (obj1)), ((View) (obj))))
        {
            obj = (java.util.)iterator.next();
            obj1 = (PlayerPageData)((java.util.) (obj)).();
            obj1 = PlayerPagerPresenter.access$1300(PlayerPagerPresenter.this, ((PlayerPageData) (obj1)));
            obj = (View)((java.util.) (obj)).();
        }

    }

    public final volatile void onNext(Object obj)
    {
        onNext((com.soundcloud.android.playback.er.onNext)obj);
    }

    private ()
    {
        this$0 = PlayerPagerPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
