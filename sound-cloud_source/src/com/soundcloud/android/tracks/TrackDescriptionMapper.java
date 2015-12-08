// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackProperty

final class TrackDescriptionMapper extends RxResultMapper
{

    TrackDescriptionMapper()
    {
    }

    public final PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        String s = cursorreader.getString("description");
        com.soundcloud.java.collections.Property property = TrackProperty.DESCRIPTION;
        cursorreader = s;
        if (s == null)
        {
            cursorreader = "";
        }
        propertyset.put(property, cursorreader);
        return propertyset;
    }

    public final volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
