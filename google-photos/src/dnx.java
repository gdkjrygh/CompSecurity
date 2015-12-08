// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.text.TextUtils;
import java.util.Locale;

public final class dnx
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new dny();
    public final String a;
    public final int b;
    public final int c;
    final String d;
    final String e;
    private final elm f;

    dnx(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        f = (elm)parcel.readParcelable(elm.getClassLoader());
        e = parcel.readString();
    }

    dnx(String s, int i, int j, String s1, elm elm1, String s2)
    {
        a = s;
        b = i;
        c = j;
        d = s1;
        f = elm1;
        e = s2;
    }

    dnx(String s, int i, int j, String s1, String s2)
    {
        this(s, i, j, s1, elm.a, s2);
    }

    public final ekf a(Class class1)
    {
        return f.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final ekf b(Class class1)
    {
        return f.b(class1);
    }

    public final boolean b()
    {
        return b != -1;
    }

    public final String c()
    {
        if (b())
        {
            return String.valueOf(b);
        } else
        {
            return a;
        }
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
        if (this != obj)
        {
            if (!(obj instanceof dnx))
            {
                return false;
            }
            obj = (dnx)obj;
            if (b != ((dnx) (obj)).b || c != ((dnx) (obj)).c || !TextUtils.equals(a, ((dnx) (obj)).a) || !TextUtils.equals(d, ((dnx) (obj)).d) || !TextUtils.equals(e, ((dnx) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b + (c + c.a(a, c.a(d, c.a(e, 17))) * 31) * 31;
    }

    public final String toString()
    {
        return String.format(Locale.US, "SearchQueryMediaCollection {accountId: %d, query: %s, clusterId: %d, entityId: %s, featureSet: %s}", new Object[] {
            Integer.valueOf(c), a, Integer.valueOf(b), d, f
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeParcelable(f, i);
        parcel.writeString(e);
    }

}
