// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class nob
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new noc();
    public final Uri a;
    public final nod b;

    public nob(Uri uri, nod nod1)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException("uri cannot be null");
        }
        if (nod1 == null)
        {
            throw new IllegalArgumentException("type cannot be null");
        } else
        {
            a = uri;
            b = nod1;
            return;
        }
    }

    public nob(Parcel parcel)
    {
        a = (Uri)parcel.readParcelable(nob.getClassLoader());
        b = nod.valueOf(parcel.readString());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof nob))
            {
                return false;
            }
            obj = (nob)obj;
            if (b != ((nob) (obj)).b || !a.equals(((nob) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.hashCode() + a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(b);
        String s1 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s1).length())).append("MediaUri(").append(s).append(",").append(s1).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
        parcel.writeString(b.name());
    }

}
