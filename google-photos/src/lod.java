// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.photos.autobackup.model.MediaState;

public final class lod
    implements android.os.Parcelable.Creator
{

    public lod()
    {
    }

    public static void a(MediaState mediastate, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, mediastate.a);
        b.a(parcel, 2, mediastate.b, false);
        b.a(parcel, 3, mediastate.c, false);
        mediastate = mediastate.d;
        if (mediastate != null)
        {
            int j = b.q(parcel, 4);
            parcel.writeLongArray(mediastate);
            b.r(parcel, j);
        }
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
        int ai[] = null;
        String as[] = null;
        int i = 0;
        long al[] = null;
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
                    as = b.n(parcel, k);
                    break;

                case 3: // '\003'
                    ai = b.m(parcel, k);
                    break;

                case 4: // '\004'
                    k = b.a(parcel, k);
                    int l = parcel.dataPosition();
                    if (k == 0)
                    {
                        al = null;
                    } else
                    {
                        al = parcel.createLongArray();
                        parcel.setDataPosition(k + l);
                    }
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new MediaState(i, as, ai, al);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new MediaState[i];
    }
}
