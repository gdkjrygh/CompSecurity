// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.ContentValues;
import com.soundcloud.java.functions.Function;

// Referenced classes of package com.soundcloud.android.stations:
//            WriteStationsCollectionsCommand, ApiStationMetadata

final class 
    implements Function
{

    public final ContentValues apply(ApiStationMetadata apistationmetadata)
    {
        return WriteStationsCollectionsCommand.access$000(apistationmetadata);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((ApiStationMetadata)obj);
    }

    ()
    {
    }
}
