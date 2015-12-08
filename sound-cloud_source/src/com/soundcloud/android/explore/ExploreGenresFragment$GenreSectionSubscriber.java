// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import rx.X;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreGenresFragment, ExploreGenresAdapter, GenreSection

private final class <init> extends X
{

    final ExploreGenresFragment this$0;

    public final void onCompleted()
    {
        adapter.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        adapter.onError(throwable);
    }

    public final void onNext(GenreSection genresection)
    {
        adapter.onNext(genresection.getItems());
        adapter.demarcateSection(genresection);
    }

    public final volatile void onNext(Object obj)
    {
        onNext((GenreSection)obj);
    }

    private Q()
    {
        this$0 = ExploreGenresFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
