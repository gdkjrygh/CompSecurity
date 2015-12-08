// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class fjz
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fka();
    final Uri a;
    final euv b;
    final long c;

    public fjz(Uri uri, euv euv1, long l)
    {
        p.a(uri);
        boolean flag;
        if (!Uri.EMPTY.equals(uri))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        p.a(euv1);
        a = uri;
        b = euv1;
        c = l;
    }

    fjz(Parcel parcel)
    {
        a = Uri.parse(parcel.readString());
        b = euv.a(parcel.readInt());
        c = parcel.readLong();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof fjz)
            {
                if (!a.equals(((fjz) (obj = (fjz)obj)).a) || !b.equals(((fjz) (obj)).b) || c != ((fjz) (obj)).c)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return c.a(a, c.a(b, 17));
    }

    public String toString()
    {
        String s = String.valueOf("ExternalMediaState{uri=");
        String s1 = String.valueOf(a.toString());
        String s2 = String.valueOf(b.toString());
        long l = c;
        return (new StringBuilder(String.valueOf(s).length() + 42 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", avType=").append(s2).append(", timestamp=").append(l).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.toString());
        parcel.writeInt(b.f);
        parcel.writeLong(c);
    }

}
