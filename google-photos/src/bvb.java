// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class bvb extends Enum
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bvc();
    public static final bvb a;
    public static final bvb b;
    public static final bvb c;
    public static final bvb d;
    private static final bvb g[];
    public final int e;
    private String f;

    private bvb(String s, int i, String s1, int j)
    {
        super(s, i);
        f = s1;
        e = j;
    }

    public static bvb valueOf(String s)
    {
        return (bvb)Enum.valueOf(bvb, s);
    }

    public static bvb[] values()
    {
        return (bvb[])g.clone();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return f;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(ordinal());
    }

    static 
    {
        a = new bvb("SIZE_480P", 0, "480P", 4);
        b = new bvb("SIZE_720P", 1, "720P", 5);
        c = new bvb("SIZE_1080P", 2, "1080P", 6);
        d = new bvb("SIZE_480SBL", 3, "480SBL", 4);
        g = (new bvb[] {
            a, b, c, d
        });
    }
}
