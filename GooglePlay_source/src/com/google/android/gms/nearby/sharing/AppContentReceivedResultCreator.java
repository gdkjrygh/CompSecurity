// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            AppContentReceivedResult

public final class AppContentReceivedResultCreator
    implements android.os.Parcelable.Creator
{

    public AppContentReceivedResultCreator()
    {
    }

    static void writeToParcel(AppContentReceivedResult appcontentreceivedresult, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, appcontentreceivedresult.versionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, appcontentreceivedresult.destinationUri, i, false);
        SafeParcelWriter.writeInt(parcel, 3, appcontentreceivedresult.statusCode);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        Uri uri = null;
        int i = 0;
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
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, l, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AppContentReceivedResult(i, uri, j);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AppContentReceivedResult[i];
    }
}
