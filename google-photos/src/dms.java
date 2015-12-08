// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.text.TextUtils;
import java.util.Locale;

public final class dms
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new dmt();
    final int a;
    final gka b;
    final String c;
    private final elm d;

    dms(Parcel parcel)
    {
        a = parcel.readInt();
        b = (gka)parcel.readParcelable(gka.getClassLoader());
        d = (elm)parcel.readParcelable(elm.getClassLoader());
        c = parcel.readString();
    }

    public dms(gka gka1, String s, int i)
    {
        this(gka1, s, i, elm.a);
    }

    dms(gka gka1, String s, int i, elm elm1)
    {
        a = i;
        b = gka1;
        d = elm1;
        c = s;
    }

    public final ekf a(Class class1)
    {
        return d.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final ekf b(Class class1)
    {
        return d.b(class1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return null;
    }

    public final boolean equals(Object obj)
    {
        if (super.equals(obj) && (obj instanceof dms))
        {
            obj = (dms)obj;
            if (c.c(b, ((dms) (obj)).b) && a == ((dms) (obj)).a && TextUtils.equals(c, ((dms) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return c.a(b, c.a(b, a + c.a(c, 17) * 31));
    }

    public final String toString()
    {
        return String.format(Locale.US, "OnDeviceSearchQueryMediaCollection {tag: %s, accountId: %d, displayName: %s, featureSet: %s}", new Object[] {
            b, Integer.valueOf(a), c, d
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(d, i);
        parcel.writeString(c);
    }

}
