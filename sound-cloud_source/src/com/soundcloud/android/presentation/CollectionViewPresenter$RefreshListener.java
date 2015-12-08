// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import rx.b;

// Referenced classes of package com.soundcloud.android.presentation:
//            CollectionViewPresenter, CollectionBinding

private class <init>
    implements android.support.v4.widget.hListener
{

    final CollectionViewPresenter this$0;

    public void onRefresh()
    {
        CollectionViewPresenter.access$302(CollectionViewPresenter.this, onRefreshBinding());
        CollectionViewPresenter.access$300(CollectionViewPresenter.this).items().subscribe(new r(CollectionViewPresenter.this, null));
        CollectionViewPresenter.access$300(CollectionViewPresenter.this).connect();
    }

    private r()
    {
        this$0 = CollectionViewPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
