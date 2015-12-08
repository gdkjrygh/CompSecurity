// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            MyProfileOperations, PostsStorage

class val.beforeTime
    implements f
{

    final MyProfileOperations this$0;
    final long val$beforeTime;

    public volatile Object call(Object obj)
    {
        return call((Boolean)obj);
    }

    public b call(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            return MyProfileOperations.access$200(MyProfileOperations.this).loadPosts(30, val$beforeTime);
        } else
        {
            return updatedPosts();
        }
    }

    ()
    {
        this$0 = final_myprofileoperations;
        val$beforeTime = J.this;
        super();
    }
}
