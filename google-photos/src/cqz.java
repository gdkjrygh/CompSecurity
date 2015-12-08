// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.List;

public final class cqz
    implements crd
{

    public static final android.os.Parcelable.Creator CREATOR = new cra();
    private final int a;
    private final cnq b;

    public cqz(int i)
    {
        a = i;
        b = null;
    }

    public cqz(int i, cnq cnq1)
    {
        a = i;
        b = (cnq)b.a(cnq1, "clip", null);
    }

    cqz(Parcel parcel)
    {
        a = parcel.readInt();
        if (parcel.readInt() == 0)
        {
            b = null;
            return;
        } else
        {
            b = new cnq(parcel);
            return;
        }
    }

    public final void a(List list)
    {
        list.remove(a);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = 1;
        }
        parcel.writeInt(j);
        if (b != null)
        {
            b.writeToParcel(parcel, i);
        }
    }

}
