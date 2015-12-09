// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            CaptchaChallenge

public final class CaptchaChallengeCreator
    implements android.os.Parcelable.Creator
{

    public CaptchaChallengeCreator()
    {
    }

    static void writeToParcel(CaptchaChallenge captchachallenge, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, captchachallenge.version);
        SafeParcelWriter.writeString(parcel, 2, captchachallenge.statusWireCode, false);
        SafeParcelWriter.writeString(parcel, 3, captchachallenge.token, false);
        SafeParcelWriter.writeParcelable(parcel, 4, captchachallenge.captcha, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Bitmap bitmap = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
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
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    bitmap = (Bitmap)SafeParcelReader.createParcelable(parcel, k, Bitmap.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CaptchaChallenge(i, s, s1, bitmap);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CaptchaChallenge[i];
    }
}
