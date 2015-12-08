// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            AutocompletePredictionEntityCreator, SubstringEntityCreator

public class AutocompletePredictionEntity
    implements SafeParcelable, AutocompletePrediction
{
    public static class SubstringEntity
        implements SafeParcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new SubstringEntityCreator();
        final int mLength;
        final int mOffset;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof SubstringEntity))
                {
                    return false;
                }
                obj = (SubstringEntity)obj;
                if (!Objects.equal(Integer.valueOf(mOffset), Integer.valueOf(((SubstringEntity) (obj)).mOffset)) || !Objects.equal(Integer.valueOf(mLength), Integer.valueOf(((SubstringEntity) (obj)).mLength)))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                Integer.valueOf(mOffset), Integer.valueOf(mLength)
            });
        }

        public String toString()
        {
            return Objects.toStringHelper(this).add("offset", Integer.valueOf(mOffset)).add("length", Integer.valueOf(mLength)).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            SubstringEntityCreator.writeToParcel$215b7c31(this, parcel);
        }


        public SubstringEntity(int i, int j, int k)
        {
            mVersionCode = i;
            mOffset = j;
            mLength = k;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new AutocompletePredictionEntityCreator();
    private static final List NO_MATCH = Collections.emptyList();
    final String mFullText;
    final List mFullTextMatchedSubstrings;
    final int mPersonalizationType;
    final String mPlaceId;
    final List mPlaceTypes;
    final String mPrimaryText;
    final List mPrimaryTextMatchedSubstrings;
    final String mSecondaryText;
    final List mSecondaryTextMatchedSubstrings;
    final int mVersionCode;

    AutocompletePredictionEntity(int i, String s, List list, int j, String s1, List list1, String s2, 
            List list2, String s3, List list3)
    {
        mVersionCode = i;
        mPlaceId = s;
        mPlaceTypes = list;
        mPersonalizationType = j;
        mFullText = s1;
        mFullTextMatchedSubstrings = list1;
        mPrimaryText = s2;
        mPrimaryTextMatchedSubstrings = list2;
        mSecondaryText = s3;
        mSecondaryTextMatchedSubstrings = list3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AutocompletePredictionEntity))
            {
                return false;
            }
            obj = (AutocompletePredictionEntity)obj;
            if (!Objects.equal(mPlaceId, ((AutocompletePredictionEntity) (obj)).mPlaceId) || !Objects.equal(mPlaceTypes, ((AutocompletePredictionEntity) (obj)).mPlaceTypes) || !Objects.equal(Integer.valueOf(mPersonalizationType), Integer.valueOf(((AutocompletePredictionEntity) (obj)).mPersonalizationType)) || !Objects.equal(mFullText, ((AutocompletePredictionEntity) (obj)).mFullText) || !Objects.equal(mFullTextMatchedSubstrings, ((AutocompletePredictionEntity) (obj)).mFullTextMatchedSubstrings) || !Objects.equal(mPrimaryText, ((AutocompletePredictionEntity) (obj)).mPrimaryText) || !Objects.equal(mPrimaryTextMatchedSubstrings, ((AutocompletePredictionEntity) (obj)).mPrimaryTextMatchedSubstrings) || !Objects.equal(mSecondaryText, ((AutocompletePredictionEntity) (obj)).mSecondaryText) || !Objects.equal(mSecondaryTextMatchedSubstrings, ((AutocompletePredictionEntity) (obj)).mSecondaryTextMatchedSubstrings))
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

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mPlaceId, mPlaceTypes, Integer.valueOf(mPersonalizationType), mFullText, mFullTextMatchedSubstrings, mPrimaryText, mPrimaryTextMatchedSubstrings, mSecondaryText, mSecondaryTextMatchedSubstrings
        });
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("placeId", mPlaceId).add("placeTypes", mPlaceTypes).add("fullText", mFullText).add("fullTextMatchedSubstrings", mFullTextMatchedSubstrings).add("primaryText", mPrimaryText).add("primaryTextMatchedSubstrings", mPrimaryTextMatchedSubstrings).add("secondaryText", mSecondaryText).add("secondaryTextMatchedSubstrings", mSecondaryTextMatchedSubstrings).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AutocompletePredictionEntityCreator.writeToParcel$5ee7caff(this, parcel);
    }

}
