// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            LocalContent

public final class LocalContentCreator
    implements android.os.Parcelable.Creator
{

    public LocalContentCreator()
    {
    }

    static void writeToParcel$462a4253(LocalContent localcontent, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, localcontent.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, localcontent.type);
        SafeParcelWriter.writeString(parcel, 3, localcontent.contentUri, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        int i = 0;
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

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new LocalContent(i, j, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LocalContent[i];
    }
}
