// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class iuj
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new iuk();
    public String a;
    private String b;

    public iuj(Parcel parcel)
    {
        b = parcel.readString();
        a = parcel.readString();
    }

    private iuj(String s, String s1)
    {
        b = s;
        a = s1;
    }

    public static iuj a(String s)
    {
        return new iuj(null, s);
    }

    public static iuj a(pgp pgp1)
    {
        return new iuj(pgp1.a, pgp1.b);
    }

    public final String a()
    {
        if (a != null)
        {
            return a;
        } else
        {
            throw new IllegalStateException("StoryRef must have a storyMediaKey");
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeString(a);
    }

}
