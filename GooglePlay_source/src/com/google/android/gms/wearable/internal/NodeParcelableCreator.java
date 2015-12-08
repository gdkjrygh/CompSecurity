// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            NodeParcelable

public final class NodeParcelableCreator
    implements android.os.Parcelable.Creator
{

    public NodeParcelableCreator()
    {
    }

    static void writeToParcel$70e0d217(NodeParcelable nodeparcelable, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, nodeparcelable.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, nodeparcelable.mId, false);
        SafeParcelWriter.writeString(parcel, 3, nodeparcelable.mDisplayName, false);
        SafeParcelWriter.writeInt(parcel, 4, nodeparcelable.mHopCount);
        SafeParcelWriter.writeBoolean(parcel, 5, nodeparcelable.mIsNearby);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
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
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NodeParcelable(j, s1, s, i, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new NodeParcelable[i];
    }
}
