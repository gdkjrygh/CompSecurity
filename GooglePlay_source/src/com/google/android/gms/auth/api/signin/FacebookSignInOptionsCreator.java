// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            FacebookSignInOptions

public final class FacebookSignInOptionsCreator
    implements android.os.Parcelable.Creator
{

    public FacebookSignInOptionsCreator()
    {
    }

    static void writeToParcel(FacebookSignInOptions facebooksigninoptions, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, facebooksigninoptions.versionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, facebooksigninoptions.mIntent, i, false);
        SafeParcelWriter.writeStringList(parcel, 3, facebooksigninoptions.getScopes(), false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        Intent intent = null;
        int i = 0;
        java.util.ArrayList arraylist = null;
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
                    intent = (Intent)SafeParcelReader.createParcelable(parcel, k, Intent.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FacebookSignInOptions(i, intent, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FacebookSignInOptions[i];
    }
}
