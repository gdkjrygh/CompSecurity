// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.internal:
//            ConnectionInfo

public class ConnectionInfoCreator
    implements android.os.Parcelable.Creator
{

    public ConnectionInfoCreator()
    {
    }

    static void a(ConnectionInfo connectioninfo, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.a(parcel, 1, connectioninfo.gi(), false);
        b.c(parcel, 1000, connectioninfo.getVersionCode());
        b.c(parcel, 2, connectioninfo.gj());
        b.F(parcel, i);
    }

    public ConnectionInfo[] aW(int i)
    {
        return new ConnectionInfo[i];
    }

    public ConnectionInfo ap(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ConnectionInfo(i, s, j);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ap(parcel);
    }

    public Object[] newArray(int i)
    {
        return aW(i);
    }
}
