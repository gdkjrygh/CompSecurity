// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//            ValidateAccountRequest

public final class ValidateAccountRequestCreator
    implements android.os.Parcelable.Creator
{

    public ValidateAccountRequestCreator()
    {
    }

    static void writeToParcel(ValidateAccountRequest validateaccountrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, validateaccountrequest.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, validateaccountrequest.mClientVersion);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, validateaccountrequest.mAccountAccessorBinder);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 4, validateaccountrequest.mScopes, i);
        SafeParcelWriter.writeBundle(parcel, 5, validateaccountrequest.mExtraArgs, false);
        SafeParcelWriter.writeString(parcel, 6, validateaccountrequest.mCallingPackage, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
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
                    ibinder = SafeParcelReader.readIBinder(parcel, l);
                    break;

                case 4: // '\004'
                    ascope = (Scope[])SafeParcelReader.createTypedArray(parcel, l, Scope.CREATOR);
                    break;

                case 5: // '\005'
                    bundle = SafeParcelReader.createBundle(parcel, l);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ValidateAccountRequest(j, i, ibinder, ascope, bundle, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ValidateAccountRequest[i];
    }
}
