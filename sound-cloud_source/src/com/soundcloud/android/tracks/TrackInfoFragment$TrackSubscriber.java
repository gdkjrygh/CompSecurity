// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackInfoFragment, TrackInfoPresenter, TrackProperty

private class <init> extends DefaultSubscriber
{

    final TrackInfoFragment this$0;

    public void onError(Throwable throwable)
    {
        TrackInfoFragment.access$100();
        presenter.bindNoDescription(getView());
    }

    public void onNext(PropertySet propertyset)
    {
        android.view.View view = getView();
        presenter.bind(view, propertyset, new ClickListener(TrackInfoFragment.this, eventBus, propertyset));
        if (propertyset.contains(TrackProperty.DESCRIPTION))
        {
            presenter.bindDescription(view, propertyset);
            return;
        } else
        {
            presenter.showSpinner(view);
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }

    private ClickListener()
    {
        this$0 = TrackInfoFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
