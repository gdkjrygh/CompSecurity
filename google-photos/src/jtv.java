// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

public final class jtv
    implements android.os.Parcelable.Creator
{

    public jtv()
    {
    }

    public static void a(RegisterSectionInfo registersectioninfo, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, registersectioninfo.b, false);
        b.c(parcel, 1000, registersectioninfo.a);
        b.a(parcel, 2, registersectioninfo.c, false);
        b.a(parcel, 3, registersectioninfo.d);
        b.c(parcel, 4, registersectioninfo.e);
        b.a(parcel, 5, registersectioninfo.f);
        b.a(parcel, 6, registersectioninfo.g, false);
        b.a(parcel, 7, registersectioninfo.h, i, false);
        b.a(parcel, 8, registersectioninfo.i, false);
        b.a(parcel, 11, registersectioninfo.j, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = b.b(parcel);
        int i = 1;
        int ai[] = null;
        Feature afeature[] = null;
        String s1 = null;
        boolean flag1 = false;
        String s2 = null;
        String s3 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    b.b(parcel, l);
                    break;

                case 1: // '\001'
                    s3 = b.i(parcel, l);
                    break;

                case 1000: 
                    j = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    s2 = b.i(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = b.c(parcel, l);
                    break;

                case 4: // '\004'
                    i = b.e(parcel, l);
                    break;

                case 5: // '\005'
                    flag = b.c(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = b.i(parcel, l);
                    break;

                case 7: // '\007'
                    afeature = (Feature[])b.b(parcel, l, Feature.CREATOR);
                    break;

                case 8: // '\b'
                    ai = b.m(parcel, l);
                    break;

                case 11: // '\013'
                    s = b.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new RegisterSectionInfo(j, s3, s2, flag1, i, flag, s1, afeature, ai, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RegisterSectionInfo[i];
    }
}
