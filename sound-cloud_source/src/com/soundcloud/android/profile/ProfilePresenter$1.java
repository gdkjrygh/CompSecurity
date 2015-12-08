// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.events.EntityStateChangedEvent;
import java.util.Map;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfilePresenter

class this._cls0
    implements f
{

    final ProfilePresenter this$0;

    public Boolean call(EntityStateChangedEvent entitystatechangedevent)
    {
        return Boolean.valueOf(entitystatechangedevent.getChangeMap().containsKey(ProfilePresenter.access$000(ProfilePresenter.this)));
    }

    public volatile Object call(Object obj)
    {
        return call((EntityStateChangedEvent)obj);
    }

    ent()
    {
        this$0 = ProfilePresenter.this;
        super();
    }
}
