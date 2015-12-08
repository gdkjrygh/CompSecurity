// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//            GetServiceRequest

public final class GetServiceRequestCreator
    implements android.os.Parcelable.Creator
{

    public GetServiceRequestCreator()
    {
    }

    static void writeToParcel(GetServiceRequest getservicerequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, getservicerequest.version);
        SafeParcelWriter.writeInt(parcel, 2, getservicerequest.serviceId);
        SafeParcelWriter.writeInt(parcel, 3, getservicerequest.clientVersion);
        SafeParcelWriter.writeString(parcel, 4, getservicerequest.callingPackage, false);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 5, getservicerequest.accountAccessorBinder);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 6, getservicerequest.scopes, i);
        SafeParcelWriter.writeBundle(parcel, 7, getservicerequest.extraArgs, false);
        SafeParcelWriter.writeParcelable(parcel, 8, getservicerequest.clientRequestedAccount, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        Account account = null;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        String s = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder = SafeParcelReader.readIBinder(parcel, i1);
                    break;

                case 6: // '\006'
                    ascope = (Scope[])SafeParcelReader.createTypedArray(parcel, i1, Scope.CREATOR);
                    break;

                case 7: // '\007'
                    bundle = SafeParcelReader.createBundle(parcel, i1);
                    break;

                case 8: // '\b'
                    account = (Account)SafeParcelReader.createParcelable(parcel, i1, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GetServiceRequest(k, j, i, s, ibinder, ascope, bundle, account);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GetServiceRequest[i];
    }
}
