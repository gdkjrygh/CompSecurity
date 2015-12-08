// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class duj
    implements dui
{

    public static final android.os.Parcelable.Creator CREATOR = new duk();
    private final int a;
    private final String b;
    private final String c;

    public duj(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public duj(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = parcel.readString();
    }

    public final int a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof duj)
        {
            obj = (duj)obj;
            flag = flag1;
            if (a == ((duj) (obj)).a)
            {
                flag = flag1;
                if (b.equals(((duj) (obj)).b))
                {
                    flag = flag1;
                    if (c.equals(((duj) (obj)).c))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a + (b.hashCode() + (c.hashCode() + 527) * 31) * 31;
    }

    public final String toString()
    {
        int i = a;
        String s = b;
        String s1 = c;
        return (new StringBuilder(String.valueOf(s).length() + 23 + String.valueOf(s1).length())).append("CardId(").append(i).append(", ").append(s).append(", ").append(s1).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
