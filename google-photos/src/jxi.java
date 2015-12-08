// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class jxi
    implements android.os.Parcelable.Creator
{

    public jxi()
    {
    }

    public static LogEventParcelable a(Parcel parcel)
    {
        int j = b.b(parcel);
        byte abyte0[] = null;
        PlayLoggerContext playloggercontext = null;
        int i = 0;
        int ai[] = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    playloggercontext = (PlayLoggerContext)b.a(parcel, k, PlayLoggerContext.CREATOR);
                    break;

                case 3: // '\003'
                    abyte0 = b.l(parcel, k);
                    break;

                case 4: // '\004'
                    ai = b.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LogEventParcelable(i, playloggercontext, abyte0, ai);
            }
        } while (true);
    }

    public static void a(LogEventParcelable logeventparcelable, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, logeventparcelable.a);
        b.a(parcel, 2, logeventparcelable.b, i, false);
        b.a(parcel, 3, logeventparcelable.c, false);
        b.a(parcel, 4, logeventparcelable.d, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new LogEventParcelable[i];
    }
}
