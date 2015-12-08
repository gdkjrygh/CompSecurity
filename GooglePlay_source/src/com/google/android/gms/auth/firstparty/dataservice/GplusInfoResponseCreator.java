// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GplusInfoResponse

public final class GplusInfoResponseCreator
    implements android.os.Parcelable.Creator
{

    public GplusInfoResponseCreator()
    {
    }

    static void writeToParcel$12358bf6(GplusInfoResponse gplusinforesponse, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, gplusinforesponse.version);
        SafeParcelWriter.writeBoolean(parcel, 2, gplusinforesponse.isAllowed);
        SafeParcelWriter.writeString(parcel, 3, gplusinforesponse.firstName, false);
        SafeParcelWriter.writeString(parcel, 4, gplusinforesponse.lastName, false);
        SafeParcelWriter.writeString(parcel, 5, gplusinforesponse.picasaUserName, false);
        SafeParcelWriter.writeBoolean(parcel, 6, gplusinforesponse.isGooglePlusEnabled);
        SafeParcelWriter.writeBoolean(parcel, 7, gplusinforesponse.isEsMobileEnabled);
        SafeParcelWriter.writeString(parcel, 8, gplusinforesponse.ropText, false);
        SafeParcelWriter.writeString(parcel, 9, gplusinforesponse.ropRevision, false);
        SafeParcelWriter.writeString(parcel, 10, gplusinforesponse.wireCode, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        String s2 = null;
        boolean flag1 = false;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        boolean flag2 = false;
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
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 3: // '\003'
                    s5 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 8: // '\b'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 9: // '\t'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 10: // '\n'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GplusInfoResponse(i, flag2, s5, s4, s3, flag1, flag, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GplusInfoResponse[i];
    }
}
