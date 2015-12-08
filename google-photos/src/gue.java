// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class gue
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new guf();
    public final int a;
    public final ekq b;
    public final ekp c;
    public final Uri d;
    public final Uri e;
    public final byte f[];
    public final Uri g;
    public final gvl h;
    public final boolean i;

    gue(Parcel parcel)
    {
        a = parcel.readInt();
        b = (ekq)parcel.readParcelable(ekq.getClassLoader());
        c = (ekp)parcel.readParcelable(ekp.getClassLoader());
        d = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        e = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        f = parcel.createByteArray();
        g = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        h = gvl.values()[parcel.readInt()];
        i = b.c(parcel);
    }

    gue(gug gug1)
    {
        a = gug1.a;
        b = gug1.b;
        c = gug1.c;
        d = gug1.d;
        e = gug1.e;
        f = gug1.f;
        h = gug1.h;
        g = gug1.g;
        i = gug1.i;
    }

    static int a(gue gue1)
    {
        return gue1.a;
    }

    static ekq b(gue gue1)
    {
        return gue1.b;
    }

    static ekp c(gue gue1)
    {
        return gue1.c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        int j = a;
        String s = String.valueOf(b);
        String s1 = String.valueOf(c);
        String s2 = String.valueOf(d);
        String s3 = String.valueOf(e);
        int k = f.length;
        String s4 = String.valueOf(g);
        String s5 = String.valueOf(h);
        boolean flag = i;
        return (new StringBuilder(String.valueOf(s).length() + 190 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append("SaveEditDetails {accountId: ").append(j).append(", collection: ").append(s).append(", media: ").append(s1).append(", originalUri: ").append(s2).append(", processedMediaUri: ").append(s3).append(", editListBytes(length): ").append(k).append(", outputUri: ").append(s4).append(", saveStrategy: ").append(s5).append(", writeToMediaStore: ").append(flag).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeInt(a);
        parcel.writeParcelable(b, j);
        parcel.writeParcelable(c, j);
        parcel.writeParcelable(d, j);
        parcel.writeParcelable(e, j);
        parcel.writeByteArray(f);
        parcel.writeParcelable(g, j);
        parcel.writeInt(h.ordinal());
        b.a(parcel, i);
    }

}
