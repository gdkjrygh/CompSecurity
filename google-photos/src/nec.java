// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class nec
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ned();
    private final List a;
    private final String b;
    private final int c;

    private nec(int i, List list, String s)
    {
        p.a(list);
        a = Collections.unmodifiableList(list);
        b = s;
        c = i;
    }

    nec(Parcel parcel)
    {
        a = new ArrayList();
        parcel.readList(a, java/lang/Integer.getClassLoader());
        b = parcel.readString();
        c = parcel.readInt();
    }

    public nec(boolean flag, List list, String s)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        this(i, list, s);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof nec)
        {
            obj = (nec)obj;
            return a.equals(((nec) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return c.a(a, 17);
    }

    public final String toString()
    {
        String s = b;
        String s1 = String.valueOf(a.toString());
        return (new StringBuilder(String.valueOf(s).length() + 10 + String.valueOf(s1).length())).append("Folder(").append(s).append(", ").append(s1).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(a);
        parcel.writeString(b);
        parcel.writeInt(c);
    }

}
