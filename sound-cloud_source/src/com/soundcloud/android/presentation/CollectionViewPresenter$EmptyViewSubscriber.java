// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import rx.X;

// Referenced classes of package com.soundcloud.android.presentation:
//            CollectionViewPresenter

private final class <init> extends X
{

    final CollectionViewPresenter this$0;

    public final void onCompleted()
    {
        CollectionViewPresenter.access$800(CollectionViewPresenter.this, com.soundcloud.android.view.scriber.this._fld0);
    }

    public final void onError(Throwable throwable)
    {
        throwable.printStackTrace();
        CollectionViewPresenter.access$800(CollectionViewPresenter.this, handleError(throwable));
    }

    public final void onNext(Object obj)
    {
        CollectionViewPresenter.access$800(CollectionViewPresenter.this, com.soundcloud.android.view.scriber.this._fld0);
    }

    private ()
    {
        this$0 = CollectionViewPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
