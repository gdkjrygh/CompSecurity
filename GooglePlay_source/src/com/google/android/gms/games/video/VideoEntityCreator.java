// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.video;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.video:
//            VideoEntity

public final class VideoEntityCreator
    implements android.os.Parcelable.Creator
{

    public VideoEntityCreator()
    {
    }

    static void writeToParcel$538f6138(VideoEntity videoentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, videoentity.mDuration);
        SafeParcelWriter.writeInt(parcel, 1000, videoentity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, videoentity.mFilePath, false);
        SafeParcelWriter.writeLong(parcel, 3, videoentity.mFileSize);
        SafeParcelWriter.writeLong(parcel, 4, videoentity.mStartTime);
        SafeParcelWriter.writeString(parcel, 5, videoentity.mPackageName, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        String s = null;
        int i = 0;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        long l2 = 0L;
        String s1 = null;
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
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    l2 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 4: // '\004'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new VideoEntity(j, i, s1, l2, l1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new VideoEntity[i];
    }
}
