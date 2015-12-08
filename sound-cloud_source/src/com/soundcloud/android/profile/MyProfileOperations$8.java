// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.sync.SyncResult;
import com.soundcloud.android.users.UserAssociationStorage;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            MyProfileOperations

class val.fromPosition
    implements f
{

    final MyProfileOperations this$0;
    final long val$fromPosition;
    final int val$pageSize;

    public volatile Object call(Object obj)
    {
        return call((SyncResult)obj);
    }

    public b call(SyncResult syncresult)
    {
        return MyProfileOperations.access$800(MyProfileOperations.this).loadFollowings(val$pageSize, val$fromPosition).subscribeOn(MyProfileOperations.access$000(MyProfileOperations.this));
    }

    ()
    {
        this$0 = final_myprofileoperations;
        val$pageSize = i;
        val$fromPosition = J.this;
        super();
    }
}
