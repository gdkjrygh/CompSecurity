// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public final class mvf
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mvg();
    private static final onh a = new onh("debug.social.die_hard");
    private qlw b;
    private byte c[];

    mvf(Parcel parcel)
    {
        c = parcel.createByteArray();
    }

    public mvf(qlw qlw1)
    {
        b = qlw1;
    }

    public final qlw a(qlw qlw1)
    {
        qlw qlw2;
        if (b == null && c != null)
        {
            try
            {
                b = qlw.a(qlw1, c);
                c = null;
            }
            catch (qlv qlv1)
            {
                Log.e("MessageNano", "Failed to deserialize", qlv1);
            }
        }
        try
        {
            qlw2 = b;
        }
        catch (ClassCastException classcastexception)
        {
            try
            {
                qlw1 = qlw.a(qlw1, qlw.a(b));
            }
            // Misplaced declaration of an exception variable
            catch (qlw qlw1)
            {
                return null;
            }
            return qlw1;
        }
        return qlw2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ParcelableMessageNano(");
        if (b != null)
        {
            stringbuilder.append(b);
        } else
        if (c != null)
        {
            stringbuilder.append("byte[").append(c.length).append(']');
        } else
        {
            stringbuilder.append("null");
        }
        return stringbuilder.append(')').toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (c == null && b != null)
        {
            c = qlw.a(b);
            b = null;
        }
        parcel.writeByteArray(c);
    }

}
