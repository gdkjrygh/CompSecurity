// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import kik.a.d.l;

// Referenced classes of package kik.android.util:
//            bh

public class KikDisplayOnlyContactParcelable
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bh();
    private l a;

    public KikDisplayOnlyContactParcelable(l l1)
    {
        a = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.a());
        parcel.writeString(a.b());
        if (a.c())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
