// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.ILocationCallback;
import com.google.android.gms.location.ILocationListener;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestUpdateData, IFusedLocationProviderCallback, LocationRequestInternal

public final class LocationRequestUpdateDataCreator
    implements android.os.Parcelable.Creator
{

    public LocationRequestUpdateDataCreator()
    {
    }

    static void writeToParcel(LocationRequestUpdateData locationrequestupdatedata, Parcel parcel, int i)
    {
        Object obj = null;
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, locationrequestupdatedata.mOperation);
        SafeParcelWriter.writeInt(parcel, 1000, locationrequestupdatedata.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, locationrequestupdatedata.mRequest, i, false);
        android.os.IBinder ibinder;
        if (locationrequestupdatedata.mLocationListener == null)
        {
            ibinder = null;
        } else
        {
            ibinder = locationrequestupdatedata.mLocationListener.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, ibinder);
        SafeParcelWriter.writeParcelable(parcel, 4, locationrequestupdatedata.mPendingIntent, i, false);
        if (locationrequestupdatedata.mLocationCallback == null)
        {
            ibinder = null;
        } else
        {
            ibinder = locationrequestupdatedata.mLocationCallback.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 5, ibinder);
        if (locationrequestupdatedata.mFusedLocationProviderCallback == null)
        {
            locationrequestupdatedata = obj;
        } else
        {
            locationrequestupdatedata = locationrequestupdatedata.mFusedLocationProviderCallback.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 6, locationrequestupdatedata);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        int i = 1;
        android.os.IBinder ibinder1 = null;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder2 = null;
        LocationRequestInternal locationrequestinternal = null;
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
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    locationrequestinternal = (LocationRequestInternal)SafeParcelReader.createParcelable(parcel, l, LocationRequestInternal.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder2 = SafeParcelReader.readIBinder(parcel, l);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)SafeParcelReader.createParcelable(parcel, l, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    ibinder1 = SafeParcelReader.readIBinder(parcel, l);
                    break;

                case 6: // '\006'
                    ibinder = SafeParcelReader.readIBinder(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new LocationRequestUpdateData(j, i, locationrequestinternal, ibinder2, pendingintent, ibinder1, ibinder);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LocationRequestUpdateData[i];
    }
}
