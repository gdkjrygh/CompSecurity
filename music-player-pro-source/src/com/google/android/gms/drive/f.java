// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive:
//            RealtimeDocumentSyncRequest

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(RealtimeDocumentSyncRequest realtimedocumentsyncrequest, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, realtimedocumentsyncrequest.CK);
        b.b(parcel, 2, realtimedocumentsyncrequest.OK, false);
        b.b(parcel, 3, realtimedocumentsyncrequest.OL, false);
        b.H(parcel, i);
    }

    public RealtimeDocumentSyncRequest U(Parcel parcel)
    {
        java.util.ArrayList arraylist1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new RealtimeDocumentSyncRequest(i, arraylist, arraylist1);
            }
        } while (true);
    }

    public RealtimeDocumentSyncRequest[] bc(int i)
    {
        return new RealtimeDocumentSyncRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return U(parcel);
    }

    public Object[] newArray(int i)
    {
        return bc(i);
    }
}
