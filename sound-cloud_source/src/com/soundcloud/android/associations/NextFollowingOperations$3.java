// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.sync.SyncInitiator;
import rx.b.a;

// Referenced classes of package com.soundcloud.android.associations:
//            NextFollowingOperations

class this._cls0
    implements a
{

    final NextFollowingOperations this$0;

    public void call()
    {
        NextFollowingOperations.access$200(NextFollowingOperations.this).pushFollowingsToApi();
    }

    ()
    {
        this$0 = NextFollowingOperations.this;
        super();
    }
}
