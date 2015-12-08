// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public final class ihk
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ihl();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public String e;

    ihk(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = b.c(parcel);
        d = b.c(parcel);
        e = parcel.readString();
    }

    public ihk(ihm ihm1)
    {
        a = ihm1.a;
        b = ihm1.b;
        c = ihm1.c;
        d = ihm1.d;
    }

    public final boolean a()
    {
        return e == null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format(Locale.US, "EnvelopeShareDetails {mediaKey: %s, shortUrl: %s, isCollab: %s, isNew: %s, application: %s}", new Object[] {
            a, b, Boolean.valueOf(c), Boolean.valueOf(d), e
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        b.a(parcel, c);
        b.a(parcel, d);
        parcel.writeString(e);
    }

}
