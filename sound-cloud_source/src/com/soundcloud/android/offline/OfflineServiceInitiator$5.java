// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistOperations;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineServiceInitiator

class this._cls0
    implements f
{

    final OfflineServiceInitiator this$0;

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    public b call(PropertySet propertyset)
    {
        return OfflineServiceInitiator.access$200(OfflineServiceInitiator.this).playlist((Urn)propertyset.get(PlaylistProperty.URN)).subscribeOn(OfflineServiceInitiator.access$100(OfflineServiceInitiator.this));
    }

    ()
    {
        this$0 = OfflineServiceInitiator.this;
        super();
    }
}
