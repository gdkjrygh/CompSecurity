// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

final class dok
    implements iym
{

    public static final android.os.Parcelable.Creator CREATOR = new dol();
    private int a;
    private List b;

    dok(int i, List list)
    {
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "cannot undo move to trash with empty medias.");
        a = i;
        b = list;
    }

    dok(Parcel parcel)
    {
        a = parcel.readInt();
        b = new ArrayList();
        parcel.readList(b, hpk.getClassLoader());
    }

    public final boolean a(Context context)
    {
        df.a(context, a, b);
        return true;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeList(b);
    }

}
