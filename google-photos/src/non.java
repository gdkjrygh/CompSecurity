// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class non
    implements android.os.Parcelable.Creator
{

    non()
    {
    }

    private static nom a(Parcel parcel)
    {
        noo noo1 = noo.values()[parcel.readByte()];
        int i = parcel.readInt();
        pye pye1;
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pye1 = null;
        if (flag)
        {
            pye1 = new pye();
            try
            {
                qlw.a(pye1, parcel.createByteArray());
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new IllegalArgumentException("Invalid storyboard proto", parcel);
            }
        }
        return new nom(noo1, i, pye1, parcel.readString());
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new nom[i];
    }
}
