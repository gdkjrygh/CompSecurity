// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            FACLConfig

public final class FACLConfigCreator
    implements android.os.Parcelable.Creator
{

    public FACLConfigCreator()
    {
    }

    static void writeToParcel$5331385a(FACLConfig faclconfig, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, faclconfig.version);
        SafeParcelWriter.writeBoolean(parcel, 2, faclconfig.isAllCirclesVisible);
        SafeParcelWriter.writeString(parcel, 3, faclconfig.visibleEdges, false);
        SafeParcelWriter.writeBoolean(parcel, 4, faclconfig.isAllContactsVisible);
        SafeParcelWriter.writeBoolean(parcel, 5, faclconfig.showCircles);
        SafeParcelWriter.writeBoolean(parcel, 6, faclconfig.showContacts);
        SafeParcelWriter.writeBoolean(parcel, 7, faclconfig.hasShowCircles);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
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
                    flag4 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    flag3 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 6: // '\006'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FACLConfig(i, flag4, s, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FACLConfig[i];
    }
}
