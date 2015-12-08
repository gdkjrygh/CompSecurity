// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetEnqueueRequest

public final class LargeAssetEnqueueRequestCreator
    implements android.os.Parcelable.Creator
{

    public LargeAssetEnqueueRequestCreator()
    {
    }

    static void writeToParcel(LargeAssetEnqueueRequest largeassetenqueuerequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, largeassetenqueuerequest.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, largeassetenqueuerequest.nodeId, false);
        SafeParcelWriter.writeString(parcel, 3, largeassetenqueuerequest.path, false);
        SafeParcelWriter.writeParcelable(parcel, 4, largeassetenqueuerequest.destinationUri, i, false);
        SafeParcelWriter.writeString(parcel, 5, largeassetenqueuerequest.destinationCanonicalPath, false);
        SafeParcelWriter.writeBoolean(parcel, 6, largeassetenqueuerequest.append);
        SafeParcelWriter.writeBoolean(parcel, 7, largeassetenqueuerequest.allowedOverMetered);
        SafeParcelWriter.writeBoolean(parcel, 8, largeassetenqueuerequest.allowedWithLowBattery);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        Uri uri = null;
        String s1 = null;
        String s2 = null;
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
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 7: // '\007'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 8: // '\b'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LargeAssetEnqueueRequest(i, s2, s1, uri, s, flag2, flag1, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LargeAssetEnqueueRequest[i];
    }
}
