// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1whitelisted.models:
//            FavaDiagnosticsEntity, FavaDiagnosticsNamespacedTypeEntity

public final class FavaDiagnosticsEntityCreator
    implements android.os.Parcelable.Creator
{

    public FavaDiagnosticsEntityCreator()
    {
    }

    static void writeToParcel(FavaDiagnosticsEntity favadiagnosticsentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = favadiagnosticsentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, favadiagnosticsentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeParcelable(parcel, 3, favadiagnosticsentity.mActionType, i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeParcelable(parcel, 4, favadiagnosticsentity.mEndView, i, true);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            SafeParcelWriter.writeParcelable(parcel, 20, favadiagnosticsentity.mStartView, i, true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            SafeParcelWriter.writeInt(parcel, 24, favadiagnosticsentity.mTotalTimeMs);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        FavaDiagnosticsNamespacedTypeEntity favadiagnosticsnamespacedtypeentity = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        FavaDiagnosticsNamespacedTypeEntity favadiagnosticsnamespacedtypeentity1 = null;
        FavaDiagnosticsNamespacedTypeEntity favadiagnosticsnamespacedtypeentity2 = null;
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
                    hashset.add(Integer.valueOf(1));
                    break;

                case 3: // '\003'
                    favadiagnosticsnamespacedtypeentity2 = (FavaDiagnosticsNamespacedTypeEntity)SafeParcelReader.createParcelable(parcel, l, FavaDiagnosticsNamespacedTypeEntity.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    favadiagnosticsnamespacedtypeentity1 = (FavaDiagnosticsNamespacedTypeEntity)SafeParcelReader.createParcelable(parcel, l, FavaDiagnosticsNamespacedTypeEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 20: // '\024'
                    favadiagnosticsnamespacedtypeentity = (FavaDiagnosticsNamespacedTypeEntity)SafeParcelReader.createParcelable(parcel, l, FavaDiagnosticsNamespacedTypeEntity.CREATOR);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 24: // '\030'
                    i = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(24));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new FavaDiagnosticsEntity(hashset, j, favadiagnosticsnamespacedtypeentity2, favadiagnosticsnamespacedtypeentity1, favadiagnosticsnamespacedtypeentity, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FavaDiagnosticsEntity[i];
    }
}
