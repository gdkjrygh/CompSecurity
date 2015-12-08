// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyRequest

public final class ProxyRequestCreator
    implements android.os.Parcelable.Creator
{

    public ProxyRequestCreator()
    {
    }

    static void writeToParcel$2c5dc67a(ProxyRequest proxyrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, proxyrequest.url, false);
        SafeParcelWriter.writeInt(parcel, 1000, proxyrequest.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, proxyrequest.httpMethod);
        SafeParcelWriter.writeLong(parcel, 3, proxyrequest.timeoutMillis);
        SafeParcelWriter.writeByteArray(parcel, 4, proxyrequest.body, false);
        SafeParcelWriter.writeBundle(parcel, 5, proxyrequest.headers, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        long l1 = 0L;
        byte abyte0[] = null;
        String s = null;
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
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = SafeParcelReader.createByteArray(parcel, l);
                    break;

                case 5: // '\005'
                    bundle = SafeParcelReader.createBundle(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ProxyRequest(j, s, i, l1, abyte0, bundle);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ProxyRequest[i];
    }
}
