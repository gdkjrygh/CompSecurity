// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfilePresenter

private final class <init> extends DefaultSubscriber
{

    final ProfilePresenter this$0;

    public final void onNext(EntityStateChangedEvent entitystatechangedevent)
    {
        refreshUser();
    }

    public final volatile void onNext(Object obj)
    {
        onNext((EntityStateChangedEvent)obj);
    }

    private ()
    {
        this$0 = ProfilePresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
