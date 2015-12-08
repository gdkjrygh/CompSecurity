// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetCloudSyncOptInStatusResponse

public final class GetCloudSyncOptInStatusCreator
    implements android.os.Parcelable.Creator
{

    public GetCloudSyncOptInStatusCreator()
    {
    }

    static void writeToParcel$252681cf(GetCloudSyncOptInStatusResponse getcloudsyncoptinstatusresponse, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, getcloudsyncoptinstatusresponse.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, getcloudsyncoptinstatusresponse.statusCode);
        SafeParcelWriter.writeBoolean(parcel, 3, getcloudsyncoptinstatusresponse.isOptInOrOutDone);
        SafeParcelWriter.writeBoolean(parcel, 4, getcloudsyncoptinstatusresponse.isOptedIn);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag = false;
        int j = 0;
        int i = 0;
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

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 4: // '\004'
                    flag1 = SafeParcelReader.readBoolean(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetCloudSyncOptInStatusResponse(i, j, flag, flag1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GetCloudSyncOptInStatusResponse[i];
    }
}
