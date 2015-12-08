// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            AppMetadata

public final class AppMetadataCreator
    implements android.os.Parcelable.Creator
{

    public AppMetadataCreator()
    {
    }

    static void writeToParcel$4fcb2b27(AppMetadata appmetadata, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, appmetadata.versionCode);
        SafeParcelWriter.writeString(parcel, 2, appmetadata.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, appmetadata.gmpAppId, false);
        SafeParcelWriter.writeString(parcel, 4, appmetadata.appVersion, false);
        SafeParcelWriter.writeString(parcel, 5, appmetadata.appStore, false);
        SafeParcelWriter.writeLong(parcel, 6, appmetadata.gmpVersion);
        SafeParcelWriter.writeLong(parcel, 7, appmetadata.devCertHash);
        SafeParcelWriter.writeString(parcel, 8, appmetadata.healthMonitor, false);
        SafeParcelWriter.writeBoolean(parcel, 9, appmetadata.measurementEnabled);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        long l1 = 0L;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
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
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    l1 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 7: // '\007'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 9: // '\t'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AppMetadata(i, s4, s3, s2, s1, l1, l, s, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AppMetadata[i];
    }
}
