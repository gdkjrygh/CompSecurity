// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlacePhotoMetadata;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            SafeDataBufferRef, PlacePhotoMetadataEntity

public final class PlacePhotoMetadataRef extends SafeDataBufferRef
    implements PlacePhotoMetadata
{

    private final String mFifeUrl = getString("photo_fife_url");

    public PlacePhotoMetadataRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public final volatile Object freeze()
    {
        String s1 = mFifeUrl;
        int i = getIntegerSafe$505cff29("photo_max_width");
        int j = getIntegerSafe$505cff29("photo_max_height");
        String s;
        if (hasColumn("photo_attributions") && !hasNull("photo_attributions"))
        {
            s = getString("photo_attributions");
        } else
        {
            s = null;
        }
        return new PlacePhotoMetadataEntity(s1, i, j, s, mDataRow);
    }
}
