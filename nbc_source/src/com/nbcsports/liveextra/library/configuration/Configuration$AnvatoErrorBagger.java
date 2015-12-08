// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;
import com.hannesdorfmann.parcelableplease.ParcelBagger;
import com.phunware.nbc.sochi.content.ParcelableUtils;
import java.util.Map;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            Configuration

public static class 
    implements ParcelBagger
{

    public volatile Object read(Parcel parcel)
    {
        return read(parcel);
    }

    public Map read(Parcel parcel)
    {
        try
        {
            parcel = ParcelableUtils.readIntStringMap(parcel);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            Timber.i(parcel, "Exception while reading AdBeaconConfiguration map bundle.", new Object[0]);
            return null;
        }
        return parcel;
    }

    public volatile void write(Object obj, Parcel parcel, int i)
    {
        write((Map)obj, parcel, i);
    }

    public void write(Map map, Parcel parcel, int i)
    {
        ParcelableUtils.writeIntStringMap(parcel, map);
    }

    public ()
    {
    }
}
