// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.ResultMapper;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingRecord, TrackingStorage

class this._cls0
    implements ResultMapper
{

    final TrackingStorage this$0;

    public TrackingRecord map(CursorReader cursorreader)
    {
        return new TrackingRecord(cursorreader.getInt("_id"), cursorreader.getLong("timestamp"), cursorreader.getString("backend"), cursorreader.getString("data"));
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    ()
    {
        this$0 = TrackingStorage.this;
        super();
    }
}
