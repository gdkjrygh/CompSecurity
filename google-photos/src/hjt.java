// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;

public final class hjt
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new hju();
    public final String a;
    public final Uri b;
    public final long c;

    hjt(Parcel parcel)
    {
        a = parcel.readString();
        Object obj = parcel.readString();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = null;
        } else
        {
            obj = Uri.parse(((String) (obj)));
        }
        b = ((Uri) (obj));
        c = parcel.readLong();
    }

    public hjt(String s, Uri uri, long l)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        a = s1;
        b = uri;
        c = l;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b.toString();
        }
        parcel.writeString(s);
        parcel.writeLong(c);
    }

}
