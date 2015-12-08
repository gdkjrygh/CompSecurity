// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.server:
//            FavaDiagnosticsEntity

public final class FavaDiagnosticsEntityCreator
    implements android.os.Parcelable.Creator
{

    public FavaDiagnosticsEntityCreator()
    {
    }

    public static FavaDiagnosticsEntity createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
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
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new FavaDiagnosticsEntity(j, s, i);
            }
        } while (true);
    }

    static void writeToParcel$1beddb7d(FavaDiagnosticsEntity favadiagnosticsentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, favadiagnosticsentity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, favadiagnosticsentity.namespace, false);
        SafeParcelWriter.writeInt(parcel, 3, favadiagnosticsentity.typeNum);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FavaDiagnosticsEntity[i];
    }
}
