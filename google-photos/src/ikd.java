// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class ikd
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new ike();
    final int a;
    final String b;
    private final elm c;

    public ikd(int i, String s, elm elm1)
    {
        p.a(s);
        a = i;
        b = s;
        c = elm1;
    }

    ikd(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = (elm)parcel.readParcelable(elm.getClassLoader());
    }

    public final ekf a(Class class1)
    {
        return c.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.sharedmedia.SharedCore";
    }

    public final ekf b(Class class1)
    {
        return c.b(class1);
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
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ikd)
        {
            obj = (ikd)obj;
            flag = flag1;
            if (a == ((ikd) (obj)).a)
            {
                flag = flag1;
                if (b.equals(((ikd) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.c(c.a(b, a + 527));
    }

    public final String toString()
    {
        String s = String.valueOf("SharedMediaCollection{accountId=");
        int i = a;
        String s1 = b;
        String s2 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(i).append(", mediaKey=").append(s1).append(", featureSet=").append(s2).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeParcelable(c, i);
    }

}
