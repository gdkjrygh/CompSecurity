// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserAssociationStorage;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.associations:
//            NextFollowingOperations

class this._cls0
    implements f
{

    final NextFollowingOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((Urn)obj);
    }

    public b call(Urn urn)
    {
        return NextFollowingOperations.access$100(NextFollowingOperations.this).loadFollowing(urn);
    }

    ()
    {
        this$0 = NextFollowingOperations.this;
        super();
    }
}
