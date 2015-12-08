// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.app.Activity;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.profile:
//            VerifyAgePresenter

class r extends DefaultSubscriber
{

    final VerifyAgePresenter this$0;

    public void onNext(Boolean boolean1)
    {
        fireAndForget(VerifyAgePresenter.access$100(VerifyAgePresenter.this).toggleFollowing(VerifyAgePresenter.access$000(VerifyAgePresenter.this), true));
        VerifyAgePresenter.access$200(VerifyAgePresenter.this).followUserUrn(VerifyAgePresenter.access$000(VerifyAgePresenter.this), true);
        VerifyAgePresenter.access$300(VerifyAgePresenter.this).finish();
    }

    public volatile void onNext(Object obj)
    {
        onNext((Boolean)obj);
    }

    ()
    {
        this$0 = VerifyAgePresenter.this;
        super();
    }
}
