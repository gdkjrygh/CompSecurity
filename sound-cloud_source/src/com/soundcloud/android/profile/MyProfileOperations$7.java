// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.sync.SyncInitiator;
import java.util.Collections;
import java.util.List;
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
        return call((List)obj);
    }

    public b call(List list)
    {
        if (list.isEmpty())
        {
            return b.just(Collections.emptyList());
        } else
        {
            return MyProfileOperations.access$600(MyProfileOperations.this).syncUsers(list).flatMap(MyProfileOperations.access$700(MyProfileOperations.this, val$pageSize, val$fromPosition));
        }
    }

    ()
    {
        this$0 = final_myprofileoperations;
        val$pageSize = i;
        val$fromPosition = J.this;
        super();
    }
}
