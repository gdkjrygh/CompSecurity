// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserRepository;
import rx.b;

// Referenced classes of package com.soundcloud.android.profile:
//            UserProfileOperations, ProfileApi, WriteMixedRecordsCommand

class val.user extends Command
{

    final UserProfileOperations this$0;
    final Urn val$user;

    public volatile Object call(Object obj)
    {
        return call((String)obj);
    }

    public b call(String s)
    {
        return UserProfileOperations.access$700(UserProfileOperations.this).userPosts(s).doOnNext(UserProfileOperations.access$600(UserProfileOperations.this).toAction()).map(UserProfileOperations.access$500()).map(UserProfileOperations.access$400(UserProfileOperations.this)).zipWith(UserProfileOperations.access$200(UserProfileOperations.this).userInfo(val$user), UserProfileOperations.access$300()).subscribeOn(UserProfileOperations.access$100(UserProfileOperations.this));
    }

    ()
    {
        this$0 = final_userprofileoperations;
        val$user = Urn.this;
        super();
    }
}
