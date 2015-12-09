// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            PinSettings

public final class PinSettingsCreator
    implements android.os.Parcelable.Creator
{

    public PinSettingsCreator()
    {
    }

    static void writeToParcel$14ac7362(PinSettings pinsettings, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, pinsettings.version);
        SafeParcelWriter.writeString(parcel, 2, pinsettings.status, false);
        SafeParcelWriter.writeString(parcel, 3, pinsettings.resetUrl, false);
        SafeParcelWriter.writeString(parcel, 4, pinsettings.setupUrl, false);
        SafeParcelWriter.writeInt(parcel, 5, pinsettings.length);
        SafeParcelWriter.writeString(parcel, 6, pinsettings.recoveryUrl, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int j = 0;
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
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 5: // '\005'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PinSettings(j, s3, s2, s1, s, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PinSettings[i];
    }
}
