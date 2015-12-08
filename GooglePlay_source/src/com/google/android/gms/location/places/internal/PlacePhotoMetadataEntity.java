// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.location.places.PlacePhotoMetadata;
import java.util.Arrays;

public final class PlacePhotoMetadataEntity
    implements PlacePhotoMetadata
{

    private final CharSequence mAttributions;
    private final String mFifeUrl;
    private int mIndex;
    private final int mMaxHeight;
    private final int mMaxWidth;

    public PlacePhotoMetadataEntity(String s, int i, int j, CharSequence charsequence, int k)
    {
        mFifeUrl = s;
        mMaxWidth = i;
        mMaxHeight = j;
        mAttributions = charsequence;
        mIndex = k;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof PlacePhotoMetadataEntity))
            {
                return false;
            }
            obj = (PlacePhotoMetadataEntity)obj;
            if (((PlacePhotoMetadataEntity) (obj)).mMaxWidth != mMaxWidth || ((PlacePhotoMetadataEntity) (obj)).mMaxHeight != mMaxHeight || !Objects.equal(((PlacePhotoMetadataEntity) (obj)).mFifeUrl, mFifeUrl) || !Objects.equal(((PlacePhotoMetadataEntity) (obj)).mAttributions, mAttributions))
            {
                return false;
            }
        }
        return true;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mMaxWidth), Integer.valueOf(mMaxHeight), mFifeUrl, mAttributions
        });
    }

    public final boolean isDataValid()
    {
        return true;
    }
}
