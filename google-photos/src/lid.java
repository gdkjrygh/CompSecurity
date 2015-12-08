// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.reporting.ReportingState;

public final class lid
    implements android.os.Parcelable.Creator
{

    public lid()
    {
    }

    public static ReportingState a(Parcel parcel)
    {
        int i = 0;
        int j1 = b.b(parcel);
        Integer integer = null;
        int j = 0;
        boolean flag = false;
        boolean flag1 = false;
        int k = 0;
        int l = 0;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                case 6: // '\006'
                default:
                    b.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = b.e(parcel, k1);
                    break;

                case 2: // '\002'
                    l = b.e(parcel, k1);
                    break;

                case 3: // '\003'
                    k = b.e(parcel, k1);
                    break;

                case 4: // '\004'
                    flag1 = b.c(parcel, k1);
                    break;

                case 5: // '\005'
                    flag = b.c(parcel, k1);
                    break;

                case 7: // '\007'
                    j = b.e(parcel, k1);
                    break;

                case 8: // '\b'
                    k1 = b.a(parcel, k1);
                    if (k1 == 0)
                    {
                        integer = null;
                    } else
                    {
                        if (k1 != 4)
                        {
                            throw new ao((new StringBuilder("Expected size ")).append(4).append(" got ").append(k1).append(" (0x").append(Integer.toHexString(k1)).append(")").toString(), parcel);
                        }
                        integer = Integer.valueOf(parcel.readInt());
                    }
                    break;

                case 9: // '\t'
                    i = b.e(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new ReportingState(i1, l, k, flag1, flag, j, i, integer);
            }
        } while (true);
    }

    public static void a(ReportingState reportingstate, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, reportingstate.a);
        b.c(parcel, 2, p.a(reportingstate.b));
        b.c(parcel, 3, p.a(reportingstate.c));
        b.a(parcel, 4, reportingstate.d);
        b.a(parcel, 5, reportingstate.e);
        b.c(parcel, 7, b.q(reportingstate.f));
        Integer integer = reportingstate.h;
        if (integer != null)
        {
            b.b(parcel, 8, 4);
            parcel.writeInt(integer.intValue());
        }
        b.c(parcel, 9, b.q(reportingstate.g));
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ReportingState[i];
    }
}
