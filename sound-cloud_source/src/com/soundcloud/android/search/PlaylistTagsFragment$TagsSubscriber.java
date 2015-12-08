// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.util.List;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistTagsFragment, PlaylistTagsPresenter

private final class <init> extends DefaultSubscriber
{

    final PlaylistTagsFragment this$0;

    public final volatile void onNext(Object obj)
    {
        onNext((List)obj);
    }

    public final void onNext(List list)
    {
        presenter.displayPopularTags(getView(), list);
    }

    private ()
    {
        this$0 = PlaylistTagsFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
