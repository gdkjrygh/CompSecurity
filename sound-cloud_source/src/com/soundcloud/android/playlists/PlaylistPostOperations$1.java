// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.Pager;
import java.util.Date;
import java.util.List;
import rx.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistPostOperations

class this._cls0
    implements com.soundcloud.rx.stOperations._cls1
{

    final PlaylistPostOperations this$0;

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
            return PlaylistPostOperations.access$000(PlaylistPostOperations.this, ((Date)((PropertySet)Iterables.getLast(list)).get(PostProperty.CREATED_AT)).getTime());
        }
    }

    ()
    {
        this$0 = PlaylistPostOperations.this;
        super();
    }
}
