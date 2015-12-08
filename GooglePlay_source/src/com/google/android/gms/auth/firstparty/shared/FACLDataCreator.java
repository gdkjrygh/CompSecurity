// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            FACLData, FACLConfig

public final class FACLDataCreator
    implements android.os.Parcelable.Creator
{

    public FACLDataCreator()
    {
    }

    static void writeToParcel(FACLData facldata, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, facldata.version);
        SafeParcelWriter.writeParcelable(parcel, 2, facldata.faclConfig, i, false);
        SafeParcelWriter.writeString(parcel, 3, facldata.activityText, false);
        SafeParcelWriter.writeBoolean(parcel, 4, facldata.isSpeedbumpNeeded);
        SafeParcelWriter.writeString(parcel, 5, facldata.speedbumpText, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        FACLConfig faclconfig = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    faclconfig = (FACLConfig)SafeParcelReader.createParcelable(parcel, k, FACLConfig.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FACLData(i, faclconfig, s1, flag, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FACLData[i];
    }
}
