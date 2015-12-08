// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            EmailSignInOptions

public final class EmailSignInOptionsCreator
    implements android.os.Parcelable.Creator
{

    public EmailSignInOptionsCreator()
    {
    }

    static void writeToParcel(EmailSignInOptions emailsigninoptions, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, emailsigninoptions.versionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, emailsigninoptions.mServerWidgetUrl, i, false);
        SafeParcelWriter.writeString(parcel, 3, emailsigninoptions.mModeQueryName, false);
        SafeParcelWriter.writeParcelable(parcel, 4, emailsigninoptions.mTosUrl, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        Uri uri = null;
        int i = 0;
        Uri uri1 = null;
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
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    uri1 = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new EmailSignInOptions(i, uri, s, uri1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new EmailSignInOptions[i];
    }
}
