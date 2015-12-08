// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.java.functions.Function;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueItem, PlayQueue

class this._cls0
    implements Function
{

    final PlayQueue this$0;

    public Integer apply(PlayQueueItem playqueueitem)
    {
        return Integer.valueOf(playqueueitem.hashCode());
    }

    public volatile Object apply(Object obj)
    {
        return apply((PlayQueueItem)obj);
    }

    m()
    {
        this$0 = PlayQueue.this;
        super();
    }
}
