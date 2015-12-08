// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class hpc
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hpd();
    public final String a;
    public final Long b;

    hpc(Parcel parcel)
    {
        a = parcel.readString();
        b = (Long)parcel.readValue(getClass().getClassLoader());
    }

    public hpc(String s, Long long1)
    {
        a = s;
        b = long1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof hpc)
        {
            obj = (hpc)obj;
            flag = flag1;
            if (c.c(a, ((hpc) (obj)).a))
            {
                flag = flag1;
                if (c.c(b, ((hpc) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return c.a(a, Arrays.hashCode(new Object[] {
            b, Integer.valueOf(17)
        }));
    }

    public String toString()
    {
        String s = String.valueOf("ResolvedMediaCollection {remoteMediaKey: ");
        String s1 = a;
        String s2 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 18 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", remoteAlbumId: ").append(s2).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeValue(b);
    }

}
