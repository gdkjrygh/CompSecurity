// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PromotedTrackingEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.presentation.PromotedListItem;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamOperations, MarkPromotedItemAsStaleCommand

class this._cls0
    implements b
{

    final SoundStreamOperations this$0;

    private void publishTrackingEvent(PromotedListItem promotedlistitem)
    {
        SoundStreamOperations.access$200(SoundStreamOperations.this).publish(EventQueue.TRACKING, PromotedTrackingEvent.forImpression(promotedlistitem, Screen.STREAM.get()));
    }

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        list = (PromotedListItem)SoundStreamOperations.access$000(SoundStreamOperations.this, list, );
        if (list != null)
        {
            SoundStreamOperations.access$100(SoundStreamOperations.this).call(list);
            publishTrackingEvent(list);
        }
    }

    ommand()
    {
        this$0 = SoundStreamOperations.this;
        super();
    }
}
