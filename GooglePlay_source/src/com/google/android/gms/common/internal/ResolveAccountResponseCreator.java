// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountResponse

public final class ResolveAccountResponseCreator
    implements android.os.Parcelable.Creator
{

    public ResolveAccountResponseCreator()
    {
    }

    static void writeToParcel(ResolveAccountResponse resolveaccountresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, resolveaccountresponse.mVersionCode);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, resolveaccountresponse.mAccountAccessorBinder);
        SafeParcelWriter.writeParcelable(parcel, 3, resolveaccountresponse.mConnectionResult, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, resolveaccountresponse.mSaveDefaultAccount);
        SafeParcelWriter.writeBoolean(parcel, 5, resolveaccountresponse.mIsFromCrossClientAuth);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        ConnectionResult connectionresult = null;
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        android.os.IBinder ibinder = null;
        int i = 0;
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
                    connectionresult = (ConnectionResult)SafeParcelReader.createParcelable(parcel, k, ConnectionResult.CREATOR);
                    break;

                case 4: // '\004'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ResolveAccountResponse(i, ibinder, connectionresult, flag1, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ResolveAccountResponse[i];
    }
}
