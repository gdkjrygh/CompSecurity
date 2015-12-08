// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import rx.b.b;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsPresenter, CollectionsAdapter, MyCollections

private class <init>
    implements b
{

    final CollectionsPresenter this$0;

    public void call(MyCollections mycollections)
    {
        CollectionsPresenter.access$300(CollectionsPresenter.this).clear();
        CollectionsPresenter.access$800(CollectionsPresenter.this);
        if (mycollections.hasError())
        {
            CollectionsPresenter.access$700(CollectionsPresenter.this);
        }
    }

    public volatile void call(Object obj)
    {
        call((MyCollections)obj);
    }

    private ()
    {
        this$0 = CollectionsPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
