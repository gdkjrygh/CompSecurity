// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import java.util.List;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.profile:
//            MyProfileOperations

class this._cls0
    implements b
{

    final MyProfileOperations this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        if (MyProfileOperations.access$500(MyProfileOperations.this).isWifiConnected() && !list.isEmpty())
        {
            MyProfileOperations.access$600(MyProfileOperations.this).requestPlaylistSync(list);
        }
    }

    ()
    {
        this$0 = MyProfileOperations.this;
        super();
    }
}
