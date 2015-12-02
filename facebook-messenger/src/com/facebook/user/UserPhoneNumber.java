// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.w.q;

// Referenced classes of package com.facebook.user:
//            UserIdentifier, ab, UserIdentifierKey, s

public class UserPhoneNumber extends UserIdentifier
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    private final UserIdentifierKey a;
    private final String b;
    private final int c;
    private final q d;

    private UserPhoneNumber(Parcel parcel)
    {
        a = new UserIdentifierKey(s.PHONE, parcel.readString());
        b = parcel.readString();
        c = parcel.readInt();
        d = q.valueOf(parcel.readString());
    }

    UserPhoneNumber(Parcel parcel, ab ab1)
    {
        this(parcel);
    }

    public UserPhoneNumber(String s1, String s2, int i)
    {
        this(s1, s2, i, q.UNSET);
    }

    public UserPhoneNumber(String s1, String s2, int i, q q1)
    {
        a = new UserIdentifierKey(s.PHONE, s2);
        b = s1;
        c = i;
        d = q1;
    }

    public String a()
    {
        return b;
    }

    public String a(Resources resources)
    {
        resources = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, c, null);
        if (resources != null)
        {
            return (new StringBuilder()).append(b).append(" (").append(resources).append(")").toString();
        } else
        {
            return b;
        }
    }

    public String b()
    {
        return a.b;
    }

    public UserIdentifierKey c()
    {
        return a;
    }

    public String d()
    {
        return a.b;
    }

    public int describeContents()
    {
        return 0;
    }

    public s e()
    {
        return s.PHONE;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UserPhoneNumber)obj;
            if (c != ((UserPhoneNumber) (obj)).c)
            {
                return false;
            }
            if (b == null ? ((UserPhoneNumber) (obj)).b != null : !b.equals(((UserPhoneNumber) (obj)).b))
            {
                return false;
            }
            if (d != ((UserPhoneNumber) (obj)).d)
            {
                return false;
            }
            if (a == null ? ((UserPhoneNumber) (obj)).a != null : !a.equals(((UserPhoneNumber) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int f()
    {
        return c;
    }

    public q g()
    {
        return d;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        int l;
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
        l = c;
        if (d != null)
        {
            k = d.hashCode();
        }
        return ((j + i * 31) * 31 + l) * 31 + k;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(d());
        parcel.writeString(b);
        parcel.writeInt(c);
        parcel.writeString(d.name());
    }

}
