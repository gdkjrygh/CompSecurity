// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class fjs
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new fjt();
    final int a;
    final fjz b;
    private final elm c;

    public fjs(int i, fjz fjz1)
    {
        p.a(fjz1);
        a = i;
        b = fjz1;
        c = elm.a;
    }

    public fjs(Parcel parcel)
    {
        a = parcel.readInt();
        b = (fjz)parcel.readParcelable(fjz.getClassLoader());
        c = (elm)parcel.readParcelable(elm.getClassLoader());
    }

    public final ekf a(Class class1)
    {
        return c.a(class1);
    }

    public final String a()
    {
        return "ExternalMediaCore";
    }

    public final ekf b(Class class1)
    {
        return c.b(class1);
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
        if (obj instanceof fjs)
        {
            obj = (fjs)obj;
            flag = flag1;
            if (b.equals(((fjs) (obj)).b))
            {
                flag = flag1;
                if (a == ((fjs) (obj)).a)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return c.a(b, a + 527);
    }

    public String toString()
    {
        String s = String.valueOf("ExternalMediaCollection{externalMediaState=");
        String s1 = String.valueOf(b.toString());
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
    }

}
