// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            DeleteRequest

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(DeleteRequest deleterequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, deleterequest.a(), i, false);
        c.a(parcel, 1000, deleterequest.a);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        Credential credential = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    credential = (Credential)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Credential.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new DeleteRequest(i, credential);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DeleteRequest[i];
    }
}
