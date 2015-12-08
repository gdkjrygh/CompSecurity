// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.view.View;
import android.widget.ToggleButton;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import rx.b;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileHeaderPresenter

class val.engagementsTracking
    implements android.view.HeaderPresenter._cls1
{

    final ProfileHeaderPresenter this$0;
    final EngagementsTracking val$engagementsTracking;
    final NextFollowingOperations val$followingOperations;
    final Urn val$user;

    public void onClick(View view)
    {
        val$followingOperations.toggleFollowing(val$user, followButton.isChecked()).subscribe(new DefaultSubscriber());
        val$engagementsTracking.followUserUrn(val$user, followButton.isChecked());
    }

    ons()
    {
        this$0 = final_profileheaderpresenter;
        val$followingOperations = nextfollowingoperations;
        val$user = urn;
        val$engagementsTracking = EngagementsTracking.this;
        super();
    }
}
