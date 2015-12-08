// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            ReauthSettingsResponse, PasswordSettings, PinSettings

public final class ReauthSettingsResponseCreator
    implements android.os.Parcelable.Creator
{

    public ReauthSettingsResponseCreator()
    {
    }

    static void writeToParcel(ReauthSettingsResponse reauthsettingsresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, reauthsettingsresponse.version);
        SafeParcelWriter.writeInt(parcel, 2, reauthsettingsresponse.status);
        SafeParcelWriter.writeParcelable(parcel, 3, reauthsettingsresponse.password, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, reauthsettingsresponse.pin, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        PasswordSettings passwordsettings = null;
        int j = 0;
        int i = 0;
        PinSettings pinsettings = null;
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
                    passwordsettings = (PasswordSettings)SafeParcelReader.createParcelable(parcel, l, PasswordSettings.CREATOR);
                    break;

                case 4: // '\004'
                    pinsettings = (PinSettings)SafeParcelReader.createParcelable(parcel, l, PinSettings.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ReauthSettingsResponse(i, j, passwordsettings, pinsettings);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ReauthSettingsResponse[i];
    }
}
