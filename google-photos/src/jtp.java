// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

public final class jtp
    implements android.os.Parcelable.Creator
{

    public jtp()
    {
    }

    public static void a(DocumentSection documentsection, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, documentsection.b, false);
        b.c(parcel, 1000, documentsection.a);
        b.a(parcel, 3, documentsection.c, i, false);
        b.c(parcel, 4, documentsection.d);
        b.a(parcel, 5, documentsection.e, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        byte abyte0[] = null;
        int k = b.b(parcel);
        int j = 0;
        int i = -1;
        RegisterSectionInfo registersectioninfo = null;
        String s = null;
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
                    s = b.i(parcel, l);
                    break;

                case 1000: 
                    j = b.e(parcel, l);
                    break;

                case 3: // '\003'
                    registersectioninfo = (RegisterSectionInfo)b.a(parcel, l, RegisterSectionInfo.CREATOR);
                    break;

                case 4: // '\004'
                    i = b.e(parcel, l);
                    break;

                case 5: // '\005'
                    abyte0 = b.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new DocumentSection(j, s, registersectioninfo, i, abyte0);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DocumentSection[i];
    }
}
