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
//            OzEventEntity, ActionTargetEntity, OzDeviceInfoEntity, FavaDiagnosticsEntity

public final class OzEventEntityCreator
    implements android.os.Parcelable.Creator
{

    public OzEventEntityCreator()
    {
    }

    static void writeToParcel(OzEventEntity ozevententity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = ozevententity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, ozevententity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, ozevententity.mActionTarget, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeParcelable(parcel, 5, ozevententity.mDeviceInfo, i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeParcelable(parcel, 7, ozevententity.mFavaDiagnostics, i, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeBoolean(parcel, 10, ozevententity.mIsNativePlatformEvent);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeString(parcel, 14, ozevententity.mThirdPartyAppName, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            SafeParcelWriter.writeString(parcel, 15, ozevententity.mThirdPartyCertificateHash, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        String s1 = null;
        FavaDiagnosticsEntity favadiagnosticsentity = null;
        OzDeviceInfoEntity ozdeviceinfoentity = null;
        ActionTargetEntity actiontargetentity = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                case 4: // '\004'
                case 6: // '\006'
                case 8: // '\b'
                case 9: // '\t'
                case 11: // '\013'
                case 12: // '\f'
                case 13: // '\r'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    actiontargetentity = (ActionTargetEntity)SafeParcelReader.createParcelable(parcel, k, ActionTargetEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 5: // '\005'
                    ozdeviceinfoentity = (OzDeviceInfoEntity)SafeParcelReader.createParcelable(parcel, k, OzDeviceInfoEntity.CREATOR);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 7: // '\007'
                    favadiagnosticsentity = (FavaDiagnosticsEntity)SafeParcelReader.createParcelable(parcel, k, FavaDiagnosticsEntity.CREATOR);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 10: // '\n'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 14: // '\016'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(15));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new OzEventEntity(hashset, i, actiontargetentity, ozdeviceinfoentity, favadiagnosticsentity, flag, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OzEventEntity[i];
    }
}
