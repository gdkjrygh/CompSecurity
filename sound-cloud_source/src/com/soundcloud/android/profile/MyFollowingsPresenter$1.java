// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.users.UserItem;
import com.soundcloud.java.collections.PropertySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            MyFollowingsPresenter

class this._cls0
    implements f
{

    final MyFollowingsPresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public List call(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(UserItem.from((PropertySet)list.next()))) { }
        return arraylist;
    }

    ()
    {
        this$0 = MyFollowingsPresenter.this;
        super();
    }
}
