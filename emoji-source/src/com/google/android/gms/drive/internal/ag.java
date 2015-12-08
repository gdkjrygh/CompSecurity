// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnContentsResponse

public class ag
    implements android.os.Parcelable.Creator
{

    public ag()
    {
    }

    static void a(OnContentsResponse oncontentsresponse, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, oncontentsresponse.xM);
        b.a(parcel, 2, oncontentsresponse.HG, i, false);
        b.G(parcel, j);
    }

    public OnContentsResponse ah(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        Contents contents = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    contents = (Contents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Contents.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new OnContentsResponse(i, contents);
            }
        } while (true);
    }

    public OnContentsResponse[] bd(int i)
    {
        return new OnContentsResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ah(parcel);
    }

    public Object[] newArray(int i)
    {
        return bd(i);
    }
}
