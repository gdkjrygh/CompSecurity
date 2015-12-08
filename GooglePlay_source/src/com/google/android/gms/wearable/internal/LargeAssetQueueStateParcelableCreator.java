// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetQueueStateParcelable

public final class LargeAssetQueueStateParcelableCreator
    implements android.os.Parcelable.Creator
{

    public LargeAssetQueueStateParcelableCreator()
    {
    }

    static void writeToParcel$2673ddc(LargeAssetQueueStateParcelable largeassetqueuestateparcelable, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, largeassetqueuestateparcelable.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, largeassetqueuestateparcelable.mLocalNodeFlags);
        SafeParcelWriter.writeString(parcel, 3, largeassetqueuestateparcelable.mLocalNodeId, false);
        Bundle bundle = new Bundle();
        java.util.Map.Entry entry;
        for (Iterator iterator = largeassetqueuestateparcelable.mRemoteNodeFlags.entrySet().iterator(); iterator.hasNext(); bundle.putInt((String)entry.getKey(), ((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        SafeParcelWriter.writeBundle(parcel, 4, bundle, false);
        SafeParcelWriter.writeInt(parcel, 5, largeassetqueuestateparcelable.mPausedCount);
        SafeParcelWriter.writeInt(parcel, 6, largeassetqueuestateparcelable.mRunningCount);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Bundle bundle = null;
        int i = 0;
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String s = null;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, j1);
                    break;

                case 1: // '\001'
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, j1);
                    break;

                case 4: // '\004'
                    bundle = SafeParcelReader.createBundle(parcel, j1);
                    break;

                case 5: // '\005'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new LargeAssetQueueStateParcelable(l, k, s, bundle, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LargeAssetQueueStateParcelable[i];
    }
}
