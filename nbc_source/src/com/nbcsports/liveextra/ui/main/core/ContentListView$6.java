// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import org.joda.time.DateTime;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            ContentListView, AssetViewAdapter

class val.date
    implements rx.ribe
{

    final ContentListView this$0;
    final DateTime val$date;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        subscriber.onNext(Integer.valueOf(adapter.findFirstPositionForDate(val$date)));
        subscriber.onCompleted();
    }

    ()
    {
        this$0 = final_contentlistview;
        val$date = DateTime.this;
        super();
    }
}
