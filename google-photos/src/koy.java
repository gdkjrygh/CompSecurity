// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.feedback.FileTeleporter;

public final class koy
    implements android.os.Parcelable.Creator
{

    public koy()
    {
    }

    public static void a(FileTeleporter fileteleporter, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, fileteleporter.a);
        b.a(parcel, 2, fileteleporter.b, i, false);
        b.a(parcel, 3, fileteleporter.c, false);
        b.a(parcel, 4, fileteleporter.d, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
        String s = null;
        ParcelFileDescriptor parcelfiledescriptor = null;
        int i = 0;
        String s1 = null;
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
                    parcelfiledescriptor = (ParcelFileDescriptor)b.a(parcel, k, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    s = b.i(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FileTeleporter(i, parcelfiledescriptor, s, s1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new FileTeleporter[i];
    }
}
