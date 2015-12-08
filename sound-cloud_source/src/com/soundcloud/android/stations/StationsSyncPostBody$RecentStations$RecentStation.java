// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.ApiDateFormat;
import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsSyncPostBody

class lastPlayed
{

    private final String lastPlayed;
    final urn this$0;
    private final String urn;

    public String getLastPlayed()
    {
        return lastPlayed;
    }

    public String getUrn()
    {
        return urn;
    }

    public (Urn urn1, long l)
    {
        this$0 = this._cls0.this;
        super();
        urn = urn1.toString();
        lastPlayed = ApiDateFormat.formatDate(l);
    }
}
