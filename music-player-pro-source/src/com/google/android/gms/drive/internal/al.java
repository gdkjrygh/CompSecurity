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

public class al
    implements android.os.Parcelable.Creator
{

    public al()
    {
    }

    static void a(OnContentsResponse oncontentsresponse, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, oncontentsresponse.CK);
        b.a(parcel, 2, oncontentsresponse.PW, i, false);
        b.a(parcel, 3, oncontentsresponse.QJ);
        b.H(parcel, j);
    }

    public OnContentsResponse aq(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        Contents contents = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
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

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new OnContentsResponse(i, contents, flag);
            }
        } while (true);
    }

    public OnContentsResponse[] bF(int i)
    {
        return new OnContentsResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aq(parcel);
    }

    public Object[] newArray(int i)
    {
        return bF(i);
    }
}
