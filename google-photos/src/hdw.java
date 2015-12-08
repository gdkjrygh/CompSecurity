// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Parcel;

public final class hdw
    implements hdv
{

    public static final android.os.Parcelable.Creator CREATOR = new hdx();
    private final boolean a;

    public hdw(Parcel parcel)
    {
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    public hdw(boolean flag)
    {
        a = flag;
    }

    public static hdv a(Cursor cursor, String s)
    {
        boolean flag;
        if (cursor.getInt(cursor.getColumnIndexOrThrow(s)) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new hdw(flag);
    }

    public static hdv a(qgg qgg)
    {
        return new hdw(b.b(qgg));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean m()
    {
        return a;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
