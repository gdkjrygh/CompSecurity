// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetQueueEntryParcelable

public final class LargeAssetQueueEntryParcelableCreator
    implements android.os.Parcelable.Creator
{

    public LargeAssetQueueEntryParcelableCreator()
    {
    }

    static void writeToParcel(LargeAssetQueueEntryParcelable largeassetqueueentryparcelable, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, largeassetqueueentryparcelable.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, largeassetqueueentryparcelable.mTransferId);
        SafeParcelWriter.writeInt(parcel, 3, largeassetqueueentryparcelable.mState);
        SafeParcelWriter.writeString(parcel, 4, largeassetqueueentryparcelable.mPath, false);
        SafeParcelWriter.writeString(parcel, 5, largeassetqueueentryparcelable.mNodeId, false);
        SafeParcelWriter.writeParcelable(parcel, 6, largeassetqueueentryparcelable.mDestinationUri, i, false);
        SafeParcelWriter.writeInt(parcel, 8, largeassetqueueentryparcelable.mRefuseErrorCode);
        SafeParcelWriter.writeBoolean(parcel, 9, largeassetqueueentryparcelable.mAppend);
        SafeParcelWriter.writeBoolean(parcel, 10, largeassetqueueentryparcelable.mAllowedOverMetered);
        SafeParcelWriter.writeBoolean(parcel, 11, largeassetqueueentryparcelable.mAllowedWithLowBattery);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        long l1 = 0L;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        String s = null;
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
                case 7: // '\007'
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 6: // '\006'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, i1, Uri.CREATOR);
                    break;

                case 8: // '\b'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 9: // '\t'
                    flag2 = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 10: // '\n'
                    flag1 = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 11: // '\013'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new LargeAssetQueueEntryParcelable(k, l1, j, s1, s, uri, i, flag2, flag1, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LargeAssetQueueEntryParcelable[i];
    }
}
