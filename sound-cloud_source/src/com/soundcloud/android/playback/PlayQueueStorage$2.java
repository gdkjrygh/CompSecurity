// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueStorage, PlayQueueItem

class this._cls0 extends RxResultMapper
{

    final PlayQueueStorage this$0;

    public PlayQueueItem map(CursorReader cursorreader)
    {
        Urn urn;
        Urn urn1;
        String s;
        String s1;
        if (PlayQueueStorage.access$200(PlayQueueStorage.this, cursorreader))
        {
            urn = new Urn(cursorreader.getString(com.soundcloud.android.storage.LATED_ENTITY));
        } else
        {
            urn = Urn.NOT_SET;
        }
        if (PlayQueueStorage.access$300(PlayQueueStorage.this, cursorreader))
        {
            urn1 = Urn.forUser(cursorreader.getLong(com.soundcloud.android.storage.POSTER_ID));
        } else
        {
            urn1 = Urn.NOT_SET;
        }
        s = cursorreader.getString(com.soundcloud.android.storage.URCE);
        s1 = cursorreader.getString(com.soundcloud.android.storage.URCE_VERSION);
        return (new der(Urn.forTrack(cursorreader.getLong(com.soundcloud.android.storage.ACK_ID)), urn1)).relatedEntity(urn).fromSource(s, s1).build();
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    der()
    {
        this$0 = PlayQueueStorage.this;
        super();
    }
}
