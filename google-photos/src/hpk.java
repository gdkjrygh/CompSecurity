// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

public class hpk
    implements Parcelable, num
{

    public static final android.os.Parcelable.Creator CREATOR = new hpl();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public String e;

    hpk(Parcel parcel)
    {
        e = parcel.readString();
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
    }

    hpk(hpm hpm1)
    {
        e = hpm1.a;
        a = hpm1.b;
        b = hpm1.c;
        c = hpm1.d;
        d = hpm1.e;
    }

    public final boolean a()
    {
        return !TextUtils.isEmpty(c);
    }

    public final String b()
    {
        return c;
    }

    public final long c()
    {
        return Long.parseLong(b);
    }

    public final boolean d()
    {
        return !TextUtils.isEmpty(b);
    }

    public int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return !TextUtils.isEmpty(a);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof hpk)
        {
            obj = (hpk)obj;
            flag = flag1;
            if (c.c(e, ((hpk) (obj)).e))
            {
                flag = flag1;
                if (c.c(a, ((hpk) (obj)).a))
                {
                    flag = flag1;
                    if (c.c(c, ((hpk) (obj)).c))
                    {
                        flag = flag1;
                        if (c.c(d, ((hpk) (obj)).d))
                        {
                            flag = flag1;
                            if (c.c(b, ((hpk) (obj)).b))
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final boolean f()
    {
        return !TextUtils.isEmpty(e);
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b, c, d, e
        });
    }

    public String toString()
    {
        String s = String.valueOf("ResolvedMedia{remotePhotoId: ");
        String s1 = b;
        String s2 = c;
        String s3 = d;
        String s4 = a;
        String s5 = e;
        return (new StringBuilder(String.valueOf(s).length() + 65 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append(s).append(s1).append(", remoteMediaKey: ").append(s2).append(", collectionMediaKey: ").append(s3).append(", localUri: ").append(s4).append(", dedupKey: ").append(s5).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(e);
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
    }

}
