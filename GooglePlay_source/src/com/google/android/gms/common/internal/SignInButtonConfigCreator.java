// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//            SignInButtonConfig

public final class SignInButtonConfigCreator
    implements android.os.Parcelable.Creator
{

    public SignInButtonConfigCreator()
    {
    }

    static void writeToParcel(SignInButtonConfig signinbuttonconfig, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, signinbuttonconfig.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, signinbuttonconfig.mButtonSize);
        SafeParcelWriter.writeInt(parcel, 3, signinbuttonconfig.mColorScheme);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 4, signinbuttonconfig.mScopes, i);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        Scope ascope[] = null;
        int j = 0;
        int i = 0;
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
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    ascope = (Scope[])SafeParcelReader.createTypedArray(parcel, i1, Scope.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new SignInButtonConfig(i, j, k, ascope);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SignInButtonConfig[i];
    }
}
