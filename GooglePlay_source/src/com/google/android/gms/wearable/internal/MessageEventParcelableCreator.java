// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            MessageEventParcelable

public final class MessageEventParcelableCreator
    implements android.os.Parcelable.Creator
{

    public MessageEventParcelableCreator()
    {
    }

    static void writeToParcel$6ae86e9a(MessageEventParcelable messageeventparcelable, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, messageeventparcelable.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, messageeventparcelable.mRequestId);
        SafeParcelWriter.writeString(parcel, 3, messageeventparcelable.mPath, false);
        SafeParcelWriter.writeByteArray(parcel, 4, messageeventparcelable.mData, false);
        SafeParcelWriter.writeString(parcel, 5, messageeventparcelable.mSource, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        byte abyte0[] = null;
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
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = SafeParcelReader.createByteArray(parcel, l);
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
                return new MessageEventParcelable(j, i, s1, abyte0, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new MessageEventParcelable[i];
    }
}
