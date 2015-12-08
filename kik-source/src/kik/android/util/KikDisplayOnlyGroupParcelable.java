// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.l;
import kik.a.d.m;

// Referenced classes of package kik.android.util:
//            bi, KikDisplayOnlyContactParcelable

public class KikDisplayOnlyGroupParcelable
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bi();
    private m a;

    public KikDisplayOnlyGroupParcelable(m m1)
    {
        a = m1;
    }

    public final m a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.b());
        parcel.writeString(a.c());
        parcel.writeString(a.a());
        parcel.writeString(a.e());
        parcel.writeString(a.f());
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.d().iterator(); iterator.hasNext(); arraylist.add(new KikDisplayOnlyContactParcelable((l)iterator.next()))) { }
        parcel.writeTypedList(arraylist);
    }

}
