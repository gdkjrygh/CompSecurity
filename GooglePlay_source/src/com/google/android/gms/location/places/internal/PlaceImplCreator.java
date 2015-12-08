// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceImpl, PlaceLocalization

public final class PlaceImplCreator
    implements android.os.Parcelable.Creator
{

    public PlaceImplCreator()
    {
    }

    static void writeToParcel(PlaceImpl placeimpl, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, placeimpl.mId, false);
        SafeParcelWriter.writeBundle(parcel, 2, placeimpl.mAddressComponentsBundle, false);
        SafeParcelWriter.writeParcelable(parcel, 3, placeimpl.mLocalization, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, placeimpl.mLatLng, i, false);
        SafeParcelWriter.writeFloat(parcel, 5, placeimpl.mLevelNumber);
        SafeParcelWriter.writeParcelable(parcel, 6, placeimpl.mViewport, i, false);
        SafeParcelWriter.writeString(parcel, 7, placeimpl.mTimeZoneId, false);
        SafeParcelWriter.writeParcelable(parcel, 8, placeimpl.mWebsiteUri, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, placeimpl.mIsPermanentlyClosed);
        SafeParcelWriter.writeFloat(parcel, 10, placeimpl.mRating);
        SafeParcelWriter.writeInt(parcel, 11, placeimpl.mPriceLevel);
        SafeParcelWriter.writeLong(parcel, 12, placeimpl.mTimestampSecs);
        SafeParcelWriter.writeIntegerList$62107c48(parcel, 13, placeimpl.mTypesDeprecated);
        SafeParcelWriter.writeString(parcel, 14, placeimpl.mAddress, false);
        SafeParcelWriter.writeString(parcel, 15, placeimpl.mPhoneNumber, false);
        SafeParcelWriter.writeStringList(parcel, 17, placeimpl.mAttributions, false);
        SafeParcelWriter.writeString(parcel, 16, placeimpl.mRegularOpenHours, false);
        SafeParcelWriter.writeInt(parcel, 1000, placeimpl.mVersionCode);
        SafeParcelWriter.writeString(parcel, 19, placeimpl.mName, false);
        SafeParcelWriter.writeBoolean(parcel, 18, placeimpl.mIsLoggingEnabled);
        SafeParcelWriter.writeIntegerList$62107c48(parcel, 20, placeimpl.mPlaceTypes);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String s5 = null;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        android.os.Bundle bundle = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        LatLng latlng = null;
        float f1 = 0.0F;
        LatLngBounds latlngbounds = null;
        String s = null;
        Uri uri = null;
        boolean flag1 = false;
        float f = 0.0F;
        int i = 0;
        long l1 = 0L;
        boolean flag = false;
        PlaceLocalization placelocalization = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    s5 = SafeParcelReader.createString(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = SafeParcelReader.createBundle(parcel, l);
                    break;

                case 3: // '\003'
                    placelocalization = (PlaceLocalization)SafeParcelReader.createParcelable(parcel, l, PlaceLocalization.CREATOR);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)SafeParcelReader.createParcelable(parcel, l, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    f1 = SafeParcelReader.readFloat(parcel, l);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)SafeParcelReader.createParcelable(parcel, l, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 8: // '\b'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, l, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    flag1 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 10: // '\n'
                    f = SafeParcelReader.readFloat(parcel, l);
                    break;

                case 11: // '\013'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 12: // '\f'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist1 = SafeParcelReader.createIntegerList(parcel, l);
                    break;

                case 14: // '\016'
                    s3 = SafeParcelReader.createString(parcel, l);
                    break;

                case 15: // '\017'
                    s2 = SafeParcelReader.createString(parcel, l);
                    break;

                case 17: // '\021'
                    arraylist = SafeParcelReader.createStringList(parcel, l);
                    break;

                case 16: // '\020'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 19: // '\023'
                    s4 = SafeParcelReader.createString(parcel, l);
                    break;

                case 18: // '\022'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 20: // '\024'
                    arraylist2 = SafeParcelReader.createIntegerList(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PlaceImpl(j, s5, arraylist2, arraylist1, bundle, s4, s3, s2, s1, arraylist, latlng, f1, latlngbounds, s, uri, flag1, f, i, l1, flag, placelocalization);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlaceImpl[i];
    }
}
