// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.w.n;

// Referenced classes of package com.facebook.user:
//            h

public class Name
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final String a;
    private final String b;
    private final String c;
    private String d;

    private Name(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
    }

    Name(Parcel parcel, h h1)
    {
        this(parcel);
    }

    public Name(String s, String s1)
    {
        this(s, s1, null);
    }

    public Name(String s, String s1, String s2)
    {
        a = n.b(s);
        b = n.b(s1);
        c = n.b(s2);
    }

    public boolean a()
    {
        return a != null;
    }

    public boolean b()
    {
        return b != null;
    }

    public boolean c()
    {
        return a != null && b != null;
    }

    public String d()
    {
        if (d == null)
        {
            if (a != null && a.length() > 0 && b != null && b.length() > 0)
            {
                d = (new StringBuilder()).append(a).append(" ").append(b).toString();
            } else
            if (a != null && a.length() > 0)
            {
                d = a;
            } else
            if (b != null && b.length() > 0)
            {
                d = b;
            } else
            {
                d = "";
            }
        }
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return c != null;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Name)obj;
            if (c == null ? ((Name) (obj)).c != null : !c.equals(((Name) (obj)).c))
            {
                return false;
            }
            if (a == null ? ((Name) (obj)).a != null : !a.equals(((Name) (obj)).a))
            {
                return false;
            }
            if (d == null ? ((Name) (obj)).d != null : !d.equals(((Name) (obj)).d))
            {
                return false;
            }
            if (b == null ? ((Name) (obj)).b != null : !b.equals(((Name) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public String f()
    {
        if (c != null)
        {
            return c;
        } else
        {
            return d();
        }
    }

    public String getDisplayName()
    {
        return c;
    }

    public String getFirstName()
    {
        return a;
    }

    public String getLastName()
    {
        return b;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        } else
        {
            j = 0;
        }
        if (c != null)
        {
            k = c.hashCode();
        } else
        {
            k = 0;
        }
        if (d != null)
        {
            l = d.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    public String toString()
    {
        return d();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
