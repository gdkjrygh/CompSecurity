// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public final class gum
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gun();
    public final long a;
    public final Uri b;
    public final String c;
    public final Uri d;
    public final String e;
    final gup f;
    public final byte g[];
    final guq h;

    public gum(Parcel parcel)
    {
        a = parcel.readLong();
        b = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        c = parcel.readString();
        d = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        e = parcel.readString();
        f = (gup)parcel.readSerializable();
        g = parcel.createByteArray();
        h = (guq)parcel.readSerializable();
    }

    gum(guo guo1)
    {
        a = guo1.a;
        b = guo1.b;
        c = guo1.c;
        d = guo1.d;
        e = guo1.e;
        f = guo1.f;
        g = guo1.g;
        h = guo1.h;
    }

    public final boolean a()
    {
        return d != null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gum)
        {
            obj = (gum)obj;
            flag = flag1;
            if (a == ((gum) (obj)).a)
            {
                flag = flag1;
                if (b.equals(((gum) (obj)).b))
                {
                    flag = flag1;
                    if (c.equals(((gum) (obj)).c))
                    {
                        flag = flag1;
                        if (Objects.equals(d, ((gum) (obj)).d))
                        {
                            flag = flag1;
                            if (Objects.equals(e, ((gum) (obj)).e))
                            {
                                flag = flag1;
                                if (f == ((gum) (obj)).f)
                                {
                                    flag = flag1;
                                    if (Arrays.equals(g, ((gum) (obj)).g))
                                    {
                                        flag = flag1;
                                        if (h.equals(((gum) (obj)).h))
                                        {
                                            flag = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Objects.hash(new Object[] {
            Long.valueOf(a), Integer.valueOf(Objects.hash(new Object[] {
                b, Integer.valueOf(Objects.hash(new Object[] {
                    c, Integer.valueOf(Objects.hash(new Object[] {
                        d, Integer.valueOf(Objects.hash(new Object[] {
                            e, Integer.valueOf(Objects.hash(new Object[] {
                                f, Integer.valueOf(Objects.hash(new Object[] {
                                    Integer.valueOf(Arrays.hashCode(g)), Integer.valueOf(Objects.hash(new Object[] {
                                        h, Integer.valueOf(17)
                                    }))
                                }))
                            }))
                        }))
                    }))
                }))
            }))
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        parcel.writeParcelable(b, i);
        parcel.writeString(c);
        parcel.writeParcelable(d, i);
        parcel.writeString(e);
        parcel.writeSerializable(f);
        parcel.writeByteArray(g);
        parcel.writeSerializable(h);
    }

}
