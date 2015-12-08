// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import rx.X;

// Referenced classes of package com.soundcloud.android.presentation:
//            CollectionViewPresenter, SwipeRefreshAttacher, CollectionBinding, ItemAdapter

private final class <init> extends X
{

    final CollectionViewPresenter this$0;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        throwable.printStackTrace();
        CollectionViewPresenter.access$600(CollectionViewPresenter.this).setRefreshing(false);
        CollectionViewPresenter.access$302(CollectionViewPresenter.this, null);
    }

    public final void onNext(Iterable iterable)
    {
        CollectionViewPresenter.access$200(CollectionViewPresenter.this).adapter().clear();
        CollectionViewPresenter.access$400(CollectionViewPresenter.this, CollectionViewPresenter.access$300(CollectionViewPresenter.this));
        CollectionViewPresenter.access$302(CollectionViewPresenter.this, null);
        CollectionViewPresenter.access$500(CollectionViewPresenter.this);
        CollectionViewPresenter.access$600(CollectionViewPresenter.this).setRefreshing(false);
        unsubscribe();
    }

    public final volatile void onNext(Object obj)
    {
        onNext((Iterable)obj);
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
