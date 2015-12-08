// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class ioj
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new iok();
    public String a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public boolean l;

    ioj(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readString();
        j = parcel.readString();
        boolean flag;
        if (parcel.readInt() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        if (parcel.readInt() > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        l = flag;
    }

    public ioj(String s, int i1, int j1, String s1, String s2, String s3, String s4, 
            String s5, String s6, String s7, boolean flag, boolean flag1)
    {
        a = s;
        b = i1;
        c = j1;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = s5;
        i = s6;
        j = s7;
        k = flag;
        l = flag1;
    }

    private static boolean a(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            return s.equals(s1);
        }
    }

    public final boolean a()
    {
        return f != null && g != null;
    }

    public final boolean b()
    {
        return i != null && j != null;
    }

    public final boolean c()
    {
        return h != null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ioj)
        {
            if (a(a, ((ioj) (obj = (ioj)obj)).a) && b == ((ioj) (obj)).b && c == ((ioj) (obj)).c && a(d, ((ioj) (obj)).d) && a(e, ((ioj) (obj)).e) && a(f, ((ioj) (obj)).f) && a(g, ((ioj) (obj)).g) && a(h, ((ioj) (obj)).h) && a(i, ((ioj) (obj)).i) && a(j, ((ioj) (obj)).j) && k == ((ioj) (obj)).k && l == ((ioj) (obj)).l)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int k1 = 1;
        int i1 = 17;
        if (a != null)
        {
            i1 = a.hashCode() + 527;
        }
        int j1 = (i1 * 31 + b) * 31 + c;
        i1 = j1;
        if (d != null)
        {
            i1 = j1 * 31 + d.hashCode();
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 * 31 + e.hashCode();
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 * 31 + f.hashCode();
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 * 31 + g.hashCode();
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 * 31 + h.hashCode();
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 * 31 + i.hashCode();
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 * 31 + j.hashCode();
        }
        if (k)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (!l)
        {
            k1 = 0;
        }
        return (j1 + i1 * 31) * 31 + k1;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeString(j);
        if (k)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (l)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
    }

}
