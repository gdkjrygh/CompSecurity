// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class loh
    implements android.os.Parcelable.Creator
{

    public loh()
    {
    }

    public static void a(PlayLoggerContext playloggercontext, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, playloggercontext.a);
        b.a(parcel, 2, playloggercontext.b, false);
        b.c(parcel, 3, playloggercontext.c);
        b.c(parcel, 4, playloggercontext.d);
        b.a(parcel, 5, playloggercontext.e, false);
        b.a(parcel, 6, playloggercontext.f, false);
        b.a(parcel, 7, playloggercontext.g);
        b.a(parcel, 8, playloggercontext.h, false);
        b.a(parcel, 9, playloggercontext.i);
        b.c(parcel, 10, playloggercontext.j);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int i1 = b.b(parcel);
        boolean flag1 = true;
        boolean flag = false;
        String s1 = null;
        String s2 = null;
        int j = 0;
        int k = 0;
        String s3 = null;
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
                    l = b.e(parcel, j1);
                    break;

                case 2: // '\002'
                    s3 = b.i(parcel, j1);
                    break;

                case 3: // '\003'
                    k = b.e(parcel, j1);
                    break;

                case 4: // '\004'
                    j = b.e(parcel, j1);
                    break;

                case 5: // '\005'
                    s2 = b.i(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = b.i(parcel, j1);
                    break;

                case 7: // '\007'
                    flag1 = b.c(parcel, j1);
                    break;

                case 8: // '\b'
                    s = b.i(parcel, j1);
                    break;

                case 9: // '\t'
                    flag = b.c(parcel, j1);
                    break;

                case 10: // '\n'
                    i = b.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new PlayLoggerContext(l, s3, k, j, s2, s1, flag1, s, flag, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlayLoggerContext[i];
    }
}
