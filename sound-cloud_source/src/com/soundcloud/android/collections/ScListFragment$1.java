// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.collections:
//            ScListFragment

class r extends DefaultSubscriber
{

    final ScListFragment this$0;

    public void onNext(CurrentUserChangedEvent currentuserchangedevent)
    {
        if (currentuserchangedevent.getKind() == 1)
        {
            ScListFragment.access$000(ScListFragment.this);
            ScListFragment.access$100(ScListFragment.this);
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((CurrentUserChangedEvent)obj);
    }

    t()
    {
        this$0 = ScListFragment.this;
        super();
    }
}
