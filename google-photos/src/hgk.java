// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Locale;

public final class hgk
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hgl();
    public final long a;
    final String b;
    final String c;

    hgk(Parcel parcel)
    {
        b = parcel.readString();
        c = parcel.readString();
        a = parcel.readLong();
    }

    public hgk(String s, String s1, long l)
    {
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        b = s;
        c = s1;
        a = l;
    }

    static hgk a(long l)
    {
        return new hgk(null, null, l);
    }

    public final boolean a()
    {
        return !b() && !c();
    }

    public final boolean b()
    {
        return !TextUtils.isEmpty(b);
    }

    public final boolean c()
    {
        return !TextUtils.isEmpty(c);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format(Locale.US, "CollectionResumeData {itemsResumeToken: %s, recipientsResumeToken: %s, initialRequestTimeMs : %d}", new Object[] {
            b, c, Long.valueOf(a)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeLong(a);
    }

}
