// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//            AuthAccountRequest

public final class AuthAccountRequestCreator
    implements android.os.Parcelable.Creator
{

    public AuthAccountRequestCreator()
    {
    }

    static void writeToParcel(AuthAccountRequest authaccountrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, authaccountrequest.mVersionCode);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, authaccountrequest.mAccountAccessorBinder);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 3, authaccountrequest.mScopes, i);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Scope ascope[] = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 3: // '\003'
                    ascope = (Scope[])SafeParcelReader.createTypedArray(parcel, k, Scope.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AuthAccountRequest(i, ibinder, ascope);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AuthAccountRequest[i];
    }
}
