// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class jga
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jgb();
    boolean a;
    float b;
    float c;

    jga()
    {
        b = 0.25F;
        c = 0.75F;
    }

    jga(Parcel parcel)
    {
        b = 0.25F;
        c = 0.75F;
        b = parcel.readFloat();
        c = parcel.readFloat();
        a = b.c(parcel);
    }

    public static float a(jga jga1)
    {
        return jga1.b;
    }

    public static float b(jga jga1)
    {
        return jga1.c;
    }

    public static boolean c(jga jga1)
    {
        return jga1.a;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(b);
        parcel.writeFloat(c);
        b.a(parcel, a);
    }

}
