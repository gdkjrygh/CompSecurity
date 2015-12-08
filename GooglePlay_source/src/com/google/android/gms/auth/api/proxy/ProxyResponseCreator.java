// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyResponse

public final class ProxyResponseCreator
    implements android.os.Parcelable.Creator
{

    public ProxyResponseCreator()
    {
    }

    static void writeToParcel(ProxyResponse proxyresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, proxyresponse.googlePlayServicesStatusCode);
        SafeParcelWriter.writeInt(parcel, 1000, proxyresponse.versionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, proxyresponse.recoveryAction, i, false);
        SafeParcelWriter.writeInt(parcel, 3, proxyresponse.statusCode);
        SafeParcelWriter.writeBundle(parcel, 4, proxyresponse.headers, false);
        SafeParcelWriter.writeByteArray(parcel, 5, proxyresponse.body, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        byte abyte0[] = null;
        int i = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundle = null;
        PendingIntent pendingintent = null;
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
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    pendingintent = (PendingIntent)SafeParcelReader.createParcelable(parcel, i1, PendingIntent.CREATOR);
                    break;

                case 3: // '\003'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    bundle = SafeParcelReader.createBundle(parcel, i1);
                    break;

                case 5: // '\005'
                    abyte0 = SafeParcelReader.createByteArray(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ProxyResponse(k, j, pendingintent, i, bundle, abyte0);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ProxyResponse[i];
    }
}
