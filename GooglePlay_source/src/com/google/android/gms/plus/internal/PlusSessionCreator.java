// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.plus.internal:
//            PlusSession, PlusCommonExtras

public final class PlusSessionCreator
    implements android.os.Parcelable.Creator
{

    public PlusSessionCreator()
    {
    }

    static void writeToParcel(PlusSession plussession, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, plussession.mAccountName, false);
        SafeParcelWriter.writeInt(parcel, 1000, plussession.mVersionCode);
        SafeParcelWriter.writeStringArray(parcel, 2, plussession.mRequestedScopes, false);
        SafeParcelWriter.writeStringArray(parcel, 3, plussession.mVisibleActions, false);
        SafeParcelWriter.writeStringArray(parcel, 4, plussession.mRequiredFeatures, false);
        SafeParcelWriter.writeString(parcel, 5, plussession.mPackageNameForAuth, false);
        SafeParcelWriter.writeString(parcel, 6, plussession.mCallingPackageName, false);
        SafeParcelWriter.writeString(parcel, 7, plussession.mApplicationName, false);
        SafeParcelWriter.writeString(parcel, 8, plussession.mClientId_DEPRECATED, false);
        SafeParcelWriter.writeParcelable(parcel, 9, plussession.mExtras, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        PlusCommonExtras pluscommonextras = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String as[] = null;
        String as1[] = null;
        String as2[] = null;
        String s4 = null;
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
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    as2 = SafeParcelReader.createStringArray(parcel, k);
                    break;

                case 3: // '\003'
                    as1 = SafeParcelReader.createStringArray(parcel, k);
                    break;

                case 4: // '\004'
                    as = SafeParcelReader.createStringArray(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 9: // '\t'
                    pluscommonextras = (PlusCommonExtras)SafeParcelReader.createParcelable(parcel, k, PlusCommonExtras.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlusSession(i, s4, as2, as1, as, s3, s2, s1, s, pluscommonextras);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlusSession[i];
    }
}
