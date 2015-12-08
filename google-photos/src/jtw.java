// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;

public final class jtw
    implements android.os.Parcelable.Creator
{

    public jtw()
    {
    }

    public static void a(UsageInfo usageinfo, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, usageinfo.b, i, false);
        b.c(parcel, 1000, usageinfo.a);
        b.a(parcel, 2, usageinfo.c);
        b.c(parcel, 3, usageinfo.d);
        b.a(parcel, 4, usageinfo.e, false);
        b.a(parcel, 5, usageinfo.f, i, false);
        b.a(parcel, 6, usageinfo.g);
        b.c(parcel, 7, usageinfo.h);
        b.c(parcel, 8, usageinfo.i);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        DocumentContents documentcontents = null;
        int i = 0;
        int i1 = b.b(parcel);
        long l1 = 0L;
        int j = -1;
        boolean flag = false;
        String s = null;
        int k = 0;
        DocumentId documentid = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    b.b(parcel, j1);
                    break;

                case 1: // '\001'
                    documentid = (DocumentId)b.a(parcel, j1, DocumentId.CREATOR);
                    break;

                case 1000: 
                    l = b.e(parcel, j1);
                    break;

                case 2: // '\002'
                    l1 = b.f(parcel, j1);
                    break;

                case 3: // '\003'
                    k = b.e(parcel, j1);
                    break;

                case 4: // '\004'
                    s = b.i(parcel, j1);
                    break;

                case 5: // '\005'
                    documentcontents = (DocumentContents)b.a(parcel, j1, DocumentContents.CREATOR);
                    break;

                case 6: // '\006'
                    flag = b.c(parcel, j1);
                    break;

                case 7: // '\007'
                    j = b.e(parcel, j1);
                    break;

                case 8: // '\b'
                    i = b.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new UsageInfo(l, documentid, l1, k, s, documentcontents, flag, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new UsageInfo[i];
    }
}
