// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class djf
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new djg();
    public final String a;
    private final String b;
    private final String c;

    djf(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
    }

    private djf(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
    }

    public static djf a(String s)
    {
        p.a(s, "mediaKey must be non-empty");
        return new djf(s, null, null);
    }

    public static djf a(String s, String s1)
    {
        p.a(s, "photoId must be non-empty");
        p.a(s, "obfuscatedUserId must be non-empty");
        return new djf(null, s, s1);
    }

    public final qeo a()
    {
        qeo qeo1 = new qeo();
        if (!TextUtils.isEmpty(a))
        {
            qeo1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            qeo1.b = new qep();
            qeo1.b.b = b;
            qeo1.b.a = c;
        }
        return qeo1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        if (s.length() != 0)
        {
            s = "MediaLegacyIdentifier{".concat(s);
        } else
        {
            s = new String("MediaLegacyIdentifier{");
        }
        if (s != null)
        {
            return a;
        } else
        {
            return String.valueOf(b).concat("}");
        }
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
