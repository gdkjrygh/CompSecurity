// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.model.PagedRemoteCollection;
import com.soundcloud.android.users.UserItem;
import com.soundcloud.java.collections.PropertySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            UserFollowingsPresenter

class this._cls0
    implements f
{

    final UserFollowingsPresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((PagedRemoteCollection)obj);
    }

    public List call(PagedRemoteCollection pagedremotecollection)
    {
        ArrayList arraylist = new ArrayList();
        for (pagedremotecollection = pagedremotecollection.iterator(); pagedremotecollection.hasNext(); arraylist.add(UserItem.from((PropertySet)pagedremotecollection.next()))) { }
        return arraylist;
    }

    ()
    {
        this$0 = UserFollowingsPresenter.this;
        super();
    }
}
