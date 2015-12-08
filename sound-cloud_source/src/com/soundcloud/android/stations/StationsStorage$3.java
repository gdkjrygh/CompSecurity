// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.ResultMapper;

// Referenced classes of package com.soundcloud.android.stations:
//            StationProperty

final class ections
    implements ResultMapper
{

    public final PropertySet map(CursorReader cursorreader)
    {
        return PropertySet.from(new PropertyBinding[] {
            StationProperty.URN.bind(new Urn(cursorreader.getString(com.soundcloud.android.storage.lections.STATION_URN))), StationProperty.UPDATED_LOCALLY_AT.bind(Long.valueOf(cursorreader.getLong(com.soundcloud.android.storage.lections.UPDATED_LOCALLY_AT))), StationProperty.POSITION.bind(Integer.valueOf(cursorreader.getInt(com.soundcloud.android.storage.lections.POSITION)))
        });
    }

    public final volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    ections()
    {
    }
}
