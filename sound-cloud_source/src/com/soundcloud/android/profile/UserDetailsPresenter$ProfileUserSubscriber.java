// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;

// Referenced classes of package com.soundcloud.android.profile:
//            UserDetailsPresenter, ProfileUser

private class <init> extends DefaultSubscriber
{

    final UserDetailsPresenter this$0;

    public void onCompleted()
    {
        UserDetailsPresenter.access$102(UserDetailsPresenter.this, com.soundcloud.android.view.er.this._fld0);
        UserDetailsPresenter.access$200(UserDetailsPresenter.this);
        if (UserDetailsPresenter.access$300(UserDetailsPresenter.this) != null)
        {
            UserDetailsPresenter.access$300(UserDetailsPresenter.this).setRefreshing(false);
        }
    }

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
        UserDetailsPresenter.access$102(UserDetailsPresenter.this, ErrorUtils.emptyViewStatusFromError(throwable));
        UserDetailsPresenter.access$200(UserDetailsPresenter.this);
        if (UserDetailsPresenter.access$300(UserDetailsPresenter.this) != null)
        {
            UserDetailsPresenter.access$300(UserDetailsPresenter.this).setRefreshing(false);
        }
    }

    public void onNext(ProfileUser profileuser)
    {
        UserDetailsPresenter.access$402(UserDetailsPresenter.this, profileuser);
        UserDetailsPresenter.access$500(UserDetailsPresenter.this, profileuser);
        UserDetailsPresenter.access$200(UserDetailsPresenter.this);
    }

    public volatile void onNext(Object obj)
    {
        onNext((ProfileUser)obj);
    }

    private ()
    {
        this$0 = UserDetailsPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
