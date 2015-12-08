// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.download;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.download:
//            DownloadDetails

public final class DownloadDetailsCreator
    implements android.os.Parcelable.Creator
{

    public DownloadDetailsCreator()
    {
    }

    static void writeToParcel$401a9d73(DownloadDetails downloaddetails, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, downloaddetails.versionCode);
        SafeParcelWriter.writeString(parcel, 2, downloaddetails.filename, false);
        SafeParcelWriter.writeString(parcel, 3, downloaddetails.url, false);
        SafeParcelWriter.writeLong(parcel, 4, downloaddetails.sizeBytes);
        SafeParcelWriter.writeString(parcel, 5, downloaddetails.sha1, false);
        SafeParcelWriter.writeString(parcel, 6, downloaddetails.destination, false);
        SafeParcelWriter.writeInt(parcel, 7, downloaddetails.minVersion);
        SafeParcelWriter.writeInt(parcel, 8, downloaddetails.maxVersion);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        long l1 = 0L;
        int j = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int k = 0;
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
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 4: // '\004'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 7: // '\007'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 8: // '\b'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new DownloadDetails(k, s3, s2, l1, s1, s, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new DownloadDetails[i];
    }
}
