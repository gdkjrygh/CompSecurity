// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.video;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.video:
//            VideoConfiguration

public final class VideoConfigurationCreator
    implements android.os.Parcelable.Creator
{

    public VideoConfigurationCreator()
    {
    }

    static void writeToParcel$31bc329b(VideoConfiguration videoconfiguration, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, videoconfiguration.mQualityLevel);
        SafeParcelWriter.writeInt(parcel, 1000, videoconfiguration.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, videoconfiguration.mCaptureMode);
        SafeParcelWriter.writeString(parcel, 3, videoconfiguration.mStreamUrl, false);
        SafeParcelWriter.writeString(parcel, 4, videoconfiguration.mStreamKey, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        int j = 0;
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
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new VideoConfiguration(k, j, i, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new VideoConfiguration[i];
    }
}
