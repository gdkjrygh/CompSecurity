// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.playlists.PlaylistPostStorage;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.Pager;
import java.util.Date;
import java.util.List;
import rx.b;

// Referenced classes of package com.soundcloud.android.profile:
//            MyProfileOperations

class this._cls0
    implements com.soundcloud.rx.perations._cls12
{

    final MyProfileOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public b call(List list)
    {
        if (list.size() < 30)
        {
            return Pager.finish();
        } else
        {
            list = (Date)((PropertySet)Iterables.getLast(list)).get(PostProperty.CREATED_AT);
            return MyProfileOperations.access$1200(MyProfileOperations.this).loadPostedPlaylists(30, list.getTime()).doOnNext(MyProfileOperations.access$1100(MyProfileOperations.this)).subscribeOn(MyProfileOperations.access$000(MyProfileOperations.this));
        }
    }

    ()
    {
        this$0 = MyProfileOperations.this;
        super();
    }
}
