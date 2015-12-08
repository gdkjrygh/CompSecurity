// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import com.soundcloud.java.optional.Optional;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.facebookinvites:
//            FacebookInvitesItem, FacebookInvitesOperations

class this._cls0
    implements f
{

    final FacebookInvitesOperations this$0;

    public Optional call(List list)
    {
        return Optional.of(new FacebookInvitesItem(list));
    }

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    ()
    {
        this$0 = FacebookInvitesOperations.this;
        super();
    }
}
