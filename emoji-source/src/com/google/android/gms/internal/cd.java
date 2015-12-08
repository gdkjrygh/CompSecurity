// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ce

public class cd
    implements android.os.Parcelable.Creator
{

    public cd()
    {
    }

    static void a(ce ce1, Parcel parcel, int j)
    {
        j = b.C(parcel);
        b.c(parcel, 1, ce1.versionCode);
        b.a(parcel, 2, ce1.oa, false);
        b.a(parcel, 3, ce1.ob, false);
        b.a(parcel, 4, ce1.mimeType, false);
        b.a(parcel, 5, ce1.packageName, false);
        b.a(parcel, 6, ce1.oc, false);
        b.a(parcel, 7, ce1.od, false);
        b.a(parcel, 8, ce1.oe, false);
        b.G(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return e(parcel);
    }

    public ce e(Parcel parcel)
    {
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ce(j, s6, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public ce[] i(int j)
    {
        return new ce[j];
    }

    public Object[] newArray(int j)
    {
        return i(j);
    }
}
