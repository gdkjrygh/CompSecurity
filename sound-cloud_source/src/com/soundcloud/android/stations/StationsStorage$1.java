// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.CursorReader;
import java.util.Collections;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            Stations, Station

final class 
    implements f
{

    public final Station call(CursorReader cursorreader)
    {
        Urn urn = new Urn(cursorreader.getString(com.soundcloud.android.storage.ATION_URN));
        String s = cursorreader.getString(com.soundcloud.android.storage.TLE);
        String s1 = cursorreader.getString(com.soundcloud.android.storage.PE);
        java.util.List list = Collections.emptyList();
        String s2 = cursorreader.getString(com.soundcloud.android.storage.RMALINK);
        int i;
        if (cursorreader.isNull(com.soundcloud.android.storage.ST_PLAYED_TRACK_POSITION))
        {
            i = Stations.NEVER_PLAYED;
        } else
        {
            i = cursorreader.getInt(com.soundcloud.android.storage.ST_PLAYED_TRACK_POSITION);
        }
        return new Station(urn, s, s1, list, s2, Integer.valueOf(i));
    }

    public final volatile Object call(Object obj)
    {
        return call((CursorReader)obj);
    }

    ()
    {
    }
}
