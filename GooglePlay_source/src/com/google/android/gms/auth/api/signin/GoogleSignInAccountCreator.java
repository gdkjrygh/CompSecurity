// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            GoogleSignInAccount

public final class GoogleSignInAccountCreator
    implements android.os.Parcelable.Creator
{

    public GoogleSignInAccountCreator()
    {
    }

    static void writeToParcel(GoogleSignInAccount googlesigninaccount, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, googlesigninaccount.versionCode);
        SafeParcelWriter.writeString(parcel, 2, googlesigninaccount.mId, false);
        SafeParcelWriter.writeString(parcel, 3, googlesigninaccount.mIdToken, false);
        SafeParcelWriter.writeString(parcel, 4, googlesigninaccount.mEmail, false);
        SafeParcelWriter.writeString(parcel, 5, googlesigninaccount.mDisplayName, false);
        SafeParcelWriter.writeParcelable(parcel, 6, googlesigninaccount.mPhotoUrl, i, false);
        SafeParcelWriter.writeString(parcel, 7, googlesigninaccount.mServerAuthCode, false);
        SafeParcelWriter.writeLong(parcel, 8, googlesigninaccount.mExpirationTimeSecs);
        SafeParcelWriter.writeString(parcel, 9, googlesigninaccount.mObfuscatedIdentifier, false);
        SafeParcelWriter.writeTypedList(parcel, 10, googlesigninaccount.mGrantedScopes, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
        String s = null;
        String s1 = null;
        Uri uri = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
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
                    s5 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 7: // '\007'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 10: // '\n'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, Scope.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GoogleSignInAccount(i, s5, s4, s3, s2, uri, s1, l, s, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GoogleSignInAccount[i];
    }
}
