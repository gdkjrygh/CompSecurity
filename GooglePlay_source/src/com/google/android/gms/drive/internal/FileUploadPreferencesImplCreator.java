// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.internal:
//            FileUploadPreferencesImpl

public final class FileUploadPreferencesImplCreator
    implements android.os.Parcelable.Creator
{

    public FileUploadPreferencesImplCreator()
    {
    }

    static void writeToParcel$25ee2196(FileUploadPreferencesImpl fileuploadpreferencesimpl, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, fileuploadpreferencesimpl.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, fileuploadpreferencesimpl.mNetworkTypePreference);
        SafeParcelWriter.writeInt(parcel, 3, fileuploadpreferencesimpl.mBatteryUsagePreference);
        SafeParcelWriter.writeBoolean(parcel, 4, fileuploadpreferencesimpl.mAllowRoaming);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int k = 0;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new FileUploadPreferencesImpl(i, j, k, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FileUploadPreferencesImpl[i];
    }
}
