// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class igs
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new igt();
    final List a;
    final boolean b;
    final boolean c;

    igs(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        parcel.readList(arraylist, ekp.getClassLoader());
        a = Collections.unmodifiableList(arraylist);
        b = b.c(parcel);
        c = b.c(parcel);
    }

    public igs(List list, boolean flag, boolean flag1)
    {
        a = Collections.unmodifiableList(list);
        b = flag;
        c = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(a);
        b.a(parcel, b);
        b.a(parcel, c);
    }

}
