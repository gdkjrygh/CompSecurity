// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class hse
    implements hrr
{

    public static final android.os.Parcelable.Creator CREATOR = new hsf();
    private final String a;
    private String b;
    private boolean c;

    hse(Parcel parcel)
    {
        c = true;
        a = parcel.readString();
        b = parcel.readString();
    }

    public hse(String s, String s1)
    {
        c = true;
        a = s;
        b = s1;
    }

    public final hsw a()
    {
        return hsw.g;
    }

    public final void a(int i)
    {
        throw new UnsupportedOperationException("LocalSuggestions don't support people clustering");
    }

    public final void a(long l)
    {
        throw new UnsupportedOperationException("LocalSuggestions don't support people clustering");
    }

    public final void a(String s)
    {
        throw new UnsupportedOperationException("LocalSuggestions don't support people clustering");
    }

    public final void a(boolean flag)
    {
    }

    public final String aq_()
    {
        return a;
    }

    public final long ar_()
    {
        return -1L;
    }

    public final String as_()
    {
        return null;
    }

    public final boolean at_()
    {
        return c;
    }

    public final int b()
    {
        return -1;
    }

    public final void b(String s)
    {
        b = s;
    }

    public final String c()
    {
        return b;
    }

    public final String d()
    {
        return null;
    }

    public final ekq d_(int i)
    {
        dki dki1 = new dki();
        dki1.c = i;
        dki1.a = b;
        return dki1.a();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return true;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof hse)
        {
            if (c.c(((hse) (obj = (hse)obj)).a, a) && c.c(((hse) (obj)).b, b))
            {
                return true;
            }
        }
        return false;
    }

    public final void h_(boolean flag)
    {
        c = flag;
    }

    public final int hashCode()
    {
        return c.a(b, c.a(a, 17));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }

}
