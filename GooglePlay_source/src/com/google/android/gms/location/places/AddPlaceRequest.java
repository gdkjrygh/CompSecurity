// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places:
//            AddPlaceRequestCreator

public class AddPlaceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AddPlaceRequestCreator();
    final String mAddress;
    final LatLng mLatLng;
    final String mName;
    final String mPhoneNumber;
    final List mPlaceTypes;
    final int mVersionCode;
    final Uri mWebsiteUri;

    AddPlaceRequest(int i, String s, LatLng latlng, String s1, List list, String s2, Uri uri)
    {
label0:
        {
            boolean flag1 = false;
            super();
            mVersionCode = i;
            mName = Preconditions.checkNotEmpty(s);
            mLatLng = (LatLng)Preconditions.checkNotNull(latlng);
            mAddress = Preconditions.checkNotEmpty(s1);
            mPlaceTypes = new ArrayList((Collection)Preconditions.checkNotNull(list));
            boolean flag;
            if (!mPlaceTypes.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "At least one place type should be provided.");
            if (TextUtils.isEmpty(s2))
            {
                flag = flag1;
                if (uri == null)
                {
                    break label0;
                }
            }
            flag = true;
        }
        Preconditions.checkArgument(flag, "One of phone number or URI should be provided.");
        mPhoneNumber = s2;
        mWebsiteUri = uri;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("name", mName).add("latLng", mLatLng).add("address", mAddress).add("placeTypes", mPlaceTypes).add("phoneNumer", mPhoneNumber).add("websiteUri", mWebsiteUri).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AddPlaceRequestCreator.writeToParcel(this, parcel, i);
    }

}
