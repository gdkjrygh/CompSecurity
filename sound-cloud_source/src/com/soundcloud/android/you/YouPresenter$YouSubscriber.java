// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;

// Referenced classes of package com.soundcloud.android.you:
//            YouPresenter

private class <init> extends DefaultSubscriber
{

    final YouPresenter this$0;

    public void onError(Throwable throwable)
    {
        YouPresenter.access$102(YouPresenter.this, Optional.absent());
    }

    public void onNext(PropertySet propertyset)
    {
        YouPresenter.access$102(YouPresenter.this, Optional.of(propertyset));
        YouPresenter.access$200(YouPresenter.this);
    }

    public volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }

    private ()
    {
        this$0 = YouPresenter.this;
        super();
    }

    <init>(<init> <init>1)
    {
        this();
    }
}
