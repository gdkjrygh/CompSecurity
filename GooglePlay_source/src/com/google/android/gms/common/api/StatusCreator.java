// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            Status

public final class StatusCreator
    implements android.os.Parcelable.Creator
{

    public StatusCreator()
    {
    }

    static void writeToParcel(Status status, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, status.mStatusCode);
        SafeParcelWriter.writeInt(parcel, 1000, status.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, status.mStatusMessage, false);
        SafeParcelWriter.writeParcelable(parcel, 3, status.mPendingIntent, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        PendingIntent pendingintent = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        int i = 0;
        String s = null;
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

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)SafeParcelReader.createParcelable(parcel, l, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new Status(i, j, s, pendingintent);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Status[i];
    }
}
