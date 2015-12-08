// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.List;

public final class cqx
    implements crd
{

    public static final android.os.Parcelable.Creator CREATOR = new cqy();
    private final int a;
    private final cnq b;

    public cqx(int i, cnq cnq1)
    {
        a = i;
        boolean flag;
        if (cnq1.f.a() >= 0x16e360L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "duration >= min length");
        b = (cnq)b.a(cnq1, "clipAfterResizing", null);
    }

    cqx(Parcel parcel)
    {
        a = parcel.readInt();
        b = new cnq(parcel);
    }

    public final void a(List list)
    {
        c.a(a, "mIndex", list);
        cnq cnq1 = (cnq)list.get(a);
        int i = a;
        cns cns1 = b.a();
        cns1.b = cnq1.b;
        list.set(i, cns1.a());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return b.a(cqx, new Object[] {
            Integer.valueOf(a), b
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        b.writeToParcel(parcel, i);
    }

}
