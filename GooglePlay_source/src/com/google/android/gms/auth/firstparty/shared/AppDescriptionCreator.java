// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            AppDescription

public final class AppDescriptionCreator
    implements android.os.Parcelable.Creator
{

    public AppDescriptionCreator()
    {
    }

    static void writeToParcel$8f79f6f(AppDescription appdescription, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, appdescription.version);
        SafeParcelWriter.writeInt(parcel, 2, appdescription.callingUid);
        SafeParcelWriter.writeString(parcel, 3, appdescription.sessionId, false);
        SafeParcelWriter.writeString(parcel, 4, appdescription.sessionSig, false);
        SafeParcelWriter.writeString(parcel, 5, appdescription.callingPkg, false);
        SafeParcelWriter.writeBoolean(parcel, 6, appdescription.isSetupWizardInProgress);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        String s2 = null;
        int i = 0;
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
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 6: // '\006'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AppDescription(j, i, s2, s1, s, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AppDescription[i];
    }
}
