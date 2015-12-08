// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileUser, UserDetailsPresenter

class this._cls0
    implements f
{

    final UserDetailsPresenter this$0;

    public Boolean call(ProfileUser profileuser)
    {
        return Boolean.valueOf(profileuser.hasDescription());
    }

    public volatile Object call(Object obj)
    {
        return call((ProfileUser)obj);
    }

    ()
    {
        this$0 = UserDetailsPresenter.this;
        super();
    }
}
