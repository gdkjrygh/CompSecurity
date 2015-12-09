// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.internal:
//            ConnectionInfo

public final class ConnectionInfoCreator
    implements android.os.Parcelable.Creator
{

    public ConnectionInfoCreator()
    {
    }

    public static ConnectionInfo createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
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
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ConnectionInfo(i, s, j);
            }
        } while (true);
    }

    static void writeToParcel$139b888c(ConnectionInfo connectioninfo, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, connectioninfo.mClientAddress, false);
        SafeParcelWriter.writeInt(parcel, 1000, connectioninfo.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, connectioninfo.mRegistrationLatency);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ConnectionInfo[i];
    }
}
