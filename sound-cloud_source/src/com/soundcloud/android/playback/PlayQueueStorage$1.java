// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.propeller.ChangeResult;
import com.soundcloud.propeller.rx.PropellerRx;
import java.util.List;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueStorage

class val.newItems
    implements f
{

    final PlayQueueStorage this$0;
    final List val$newItems;

    public volatile Object call(Object obj)
    {
        return call((ChangeResult)obj);
    }

    public b call(ChangeResult changeresult)
    {
        return PlayQueueStorage.access$100(PlayQueueStorage.this).bulkInsert(PlayQueueStorage.access$000(), val$newItems);
    }

    ()
    {
        this$0 = final_playqueuestorage;
        val$newItems = List.this;
        super();
    }
}
