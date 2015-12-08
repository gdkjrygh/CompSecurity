// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.commands.Command;
import rx.b;

// Referenced classes of package com.soundcloud.android.profile:
//            UserProfileOperations, ProfileApi, WriteMixedRecordsCommand

class this._cls0 extends Command
{

    final UserProfileOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((String)obj);
    }

    public b call(String s)
    {
        return UserProfileOperations.access$700(UserProfileOperations.this).userLikes(s).doOnNext(UserProfileOperations.access$600(UserProfileOperations.this).toAction()).map(UserProfileOperations.access$500()).map(UserProfileOperations.access$400(UserProfileOperations.this)).subscribeOn(UserProfileOperations.access$100(UserProfileOperations.this));
    }

    ()
    {
        this$0 = UserProfileOperations.this;
        super();
    }
}
