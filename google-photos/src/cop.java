// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class cop extends coi
{

    public static final android.os.Parcelable.Creator CREATOR = new coq();
    private volatile int f;

    public cop()
    {
        super(coj.b);
    }

    public cop(long l, int i, int j, int k)
    {
        super(l, i, j, k, coj.b);
    }

    public cop(Parcel parcel)
    {
        super(parcel);
        f = parcel.readInt();
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof cop))
            {
                return false;
            }
            obj = (cop)obj;
            if (a != ((cop) (obj)).a || b != ((cop) (obj)).b || c != ((cop) (obj)).c || d != ((cop) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        if (f == 0)
        {
            f = a + b.a(b, c + (d + 527) * 31) * 31;
        }
        return f;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeInt(f);
    }

}
