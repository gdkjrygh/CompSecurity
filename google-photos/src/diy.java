// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Locale;

public final class diy
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new diz();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    diy(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
    }

    public diy(String s, String s1, String s2, String s3)
    {
        a = (String)p.a(s, "mediaKey must be non-empty");
        b = (String)p.a(s1, "name must be non-empty");
        c = s2;
        d = s3;
    }

    public final boolean a(mmx mmx1)
    {
        if (mmx1 == null || TextUtils.isEmpty(c))
        {
            return false;
        } else
        {
            return c.equals(mmx1.b("gaia_id"));
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof diy)
        {
            obj = (diy)obj;
            flag = flag1;
            if (a.equals(((diy) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((diy) (obj)).b))
                {
                    flag = flag1;
                    if (c.c(c, ((diy) (obj)).c))
                    {
                        flag = flag1;
                        if (c.c(d, ((diy) (obj)).d))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(a, c.a(b, c.a(c, c.a(d, 17))));
    }

    public final String toString()
    {
        return String.format(Locale.US, "Actor {mediaKey: %s, displayName: %s, gaiaId: %s, profilePhoto: %s}", new Object[] {
            a, b, c, d
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
    }

}
