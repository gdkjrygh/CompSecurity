// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceImplCreator, PlaceLocalization

public final class PlaceImpl
    implements SafeParcelable, Place
{

    public static final PlaceImplCreator CREATOR = new PlaceImplCreator();
    final String mAddress;
    final Bundle mAddressComponentsBundle;
    private final Map mAddressComponentsMap = Collections.unmodifiableMap(new HashMap());
    final List mAttributions;
    final String mId;
    final boolean mIsLoggingEnabled;
    final boolean mIsPermanentlyClosed;
    final LatLng mLatLng;
    final float mLevelNumber;
    private Locale mLocale;
    final PlaceLocalization mLocalization;
    final String mName;
    final String mPhoneNumber;
    final List mPlaceTypes;
    final int mPriceLevel;
    final float mRating;
    final String mRegularOpenHours;
    private final TimeZone mTimeZone = null;
    final String mTimeZoneId;
    final long mTimestampSecs;
    final List mTypesDeprecated;
    final int mVersionCode;
    final LatLngBounds mViewport;
    final Uri mWebsiteUri;

    PlaceImpl(int i, String s, List list, List list1, Bundle bundle, String s1, String s2, 
            String s3, String s4, List list2, LatLng latlng, float f, LatLngBounds latlngbounds, String s5, 
            Uri uri, boolean flag, float f1, int j, long l, boolean flag1, 
            PlaceLocalization placelocalization)
    {
        mVersionCode = i;
        mId = s;
        mPlaceTypes = Collections.unmodifiableList(list);
        mTypesDeprecated = list1;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        mAddressComponentsBundle = bundle;
        mName = s1;
        mAddress = s2;
        mPhoneNumber = s3;
        mRegularOpenHours = s4;
        if (list2 == null)
        {
            list2 = Collections.emptyList();
        }
        mAttributions = list2;
        mLatLng = latlng;
        mLevelNumber = f;
        mViewport = latlngbounds;
        if (s5 == null)
        {
            s5 = "UTC";
        }
        mTimeZoneId = s5;
        mWebsiteUri = uri;
        mIsPermanentlyClosed = flag;
        mRating = f1;
        mPriceLevel = j;
        mTimestampSecs = l;
        mLocale = null;
        mIsLoggingEnabled = flag1;
        mLocalization = placelocalization;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceImpl))
            {
                return false;
            }
            obj = (PlaceImpl)obj;
            if (!mId.equals(((PlaceImpl) (obj)).mId) || !Objects.equal(null, null) || mTimestampSecs != ((PlaceImpl) (obj)).mTimestampSecs)
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
            mId, null, Long.valueOf(mTimestampSecs)
        });
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("id", mId).add("placeTypes", mPlaceTypes).add("locale", null).add("name", mName).add("address", mAddress).add("phoneNumber", mPhoneNumber).add("latlng", mLatLng).add("viewport", mViewport).add("websiteUri", mWebsiteUri).add("isPermanentlyClosed", Boolean.valueOf(mIsPermanentlyClosed)).add("priceLevel", Integer.valueOf(mPriceLevel)).add("timestampSecs", Long.valueOf(mTimestampSecs)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PlaceImplCreator.writeToParcel(this, parcel, i);
    }

}
