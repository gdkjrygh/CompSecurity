// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class ebv
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new ebw();
    final int a;
    final int b;
    final String c;
    final ekq d;
    private final elm e;

    public ebv(int i, int j, String s, ekq ekq1, elm elm1)
    {
        a = i;
        b = j;
        d = ekq1;
        c = (String)p.a(s, "Missing guns key for the collection");
        e = (elm)p.a(elm1);
    }

    ebv(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readString();
        d = (ekq)parcel.readParcelable(ekq.getClassLoader());
        e = (elm)parcel.readParcelable(elm.getClassLoader());
    }

    public final ekf a(Class class1)
    {
        return e.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.assistant.remote.provider";
    }

    public final ekf b(Class class1)
    {
        return e.b(class1);
    }

    public int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return null;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ebv)
        {
            obj = (ebv)obj;
            flag = flag1;
            if (a == ((ebv) (obj)).a)
            {
                flag = flag1;
                if (b == ((ebv) (obj)).b)
                {
                    flag = flag1;
                    if (c.equals(((ebv) (obj)).c))
                    {
                        flag = flag1;
                        if (c.c(d, ((ebv) (obj)).d))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return b + (a + c.a(c, c.a(d, 17)) * 31) * 31;
    }

    public String toString()
    {
        return c.a("NotificationMediaCollection", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b), c, d, e
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeString(c);
        parcel.writeParcelable(d, i);
        parcel.writeParcelable(e, i);
    }

}
