// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class epf
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new epg();
    private static final List f = Collections.unmodifiableList(Arrays.asList(new String[] {
        "http", "https", "android.resource"
    }));
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public epk e;
    private final String g;

    epf(Parcel parcel)
    {
        a = parcel.readString();
        g = parcel.readString();
        b = parcel.readString();
        c = parcel.readInt();
        d = parcel.readInt();
        e = (epk)parcel.readParcelable(getClass().getClassLoader());
    }

    epf(eph eph1)
    {
        a = eph1.a;
        g = eph1.b;
        b = eph1.c;
        c = eph1.d;
        d = eph1.e;
        e = eph1.f;
    }

    static List f()
    {
        return f;
    }

    public final boolean a()
    {
        return c != 0;
    }

    public final boolean b()
    {
        return d == -100;
    }

    public final boolean c()
    {
        return d == 1;
    }

    public final boolean d()
    {
        return c == 1;
    }

    public int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return c == 8;
    }

    public String toString()
    {
        String s = a;
        String s1 = g;
        String s2 = b;
        int i = c;
        String s3 = String.valueOf(e);
        return (new StringBuilder(String.valueOf(s).length() + 102 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("ManualAwesomeType {name: ").append(s).append(", failureMessage: ").append(s1).append(", imageUrl: ").append(s2).append(", renderType: ").append(i).append(", sourceConstraints: ").append(s3).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(g);
        parcel.writeString(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeParcelable(e, i);
    }

}
