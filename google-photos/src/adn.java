// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class adn
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ado();
    int a;
    int b;
    boolean c;

    public adn()
    {
    }

    public adn(adn adn1)
    {
        a = adn1.a;
        b = adn1.b;
        c = adn1.c;
    }

    adn(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readInt();
        b = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        c = flag;
    }

    final boolean a()
    {
        return a >= 0;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
