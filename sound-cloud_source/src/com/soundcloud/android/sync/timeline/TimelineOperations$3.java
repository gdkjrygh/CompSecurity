// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.timeline;

import com.soundcloud.rx.Pager;
import java.util.Date;
import java.util.List;
import rx.b;

// Referenced classes of package com.soundcloud.android.sync.timeline:
//            TimelineOperations

class this._cls0
    implements com.soundcloud.rx.melineOperations._cls3
{

    final TimelineOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public b call(List list)
    {
        if (list == TimelineOperations.access$300(TimelineOperations.this))
        {
            return Pager.finish();
        }
        list = getLastItemTimestamp(list);
        if (list != null)
        {
            long l = list.getTime();
            return TimelineOperations.access$200(TimelineOperations.this, l, false);
        } else
        {
            return Pager.finish();
        }
    }

    ()
    {
        this$0 = TimelineOperations.this;
        super();
    }
}
