// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.ax;
import java.util.Collection;

// Referenced classes of package com.facebook.user:
//            w, n, UserFbidIdentifier, UserIdentifier, 
//            UserPhoneNumber, UserEmailAddress, u, v

public class UserKey
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new w();
    private final n a;
    private final String b;
    private final String c;

    private UserKey(Parcel parcel)
    {
        this((n)parcel.readSerializable(), parcel.readString());
    }

    UserKey(Parcel parcel, u u1)
    {
        this(parcel);
    }

    public UserKey(n n1, String s)
    {
        a = n1;
        b = s;
        c = (new StringBuilder()).append(n1).append(":").append(s).toString();
    }

    public static UserKey a(UserIdentifier useridentifier)
    {
        if (useridentifier instanceof UserFbidIdentifier)
        {
            return new UserKey(n.FACEBOOK, useridentifier.d());
        }
        if (useridentifier instanceof UserPhoneNumber)
        {
            return new UserKey(n.PHONE_NUMBER, useridentifier.d());
        }
        if (useridentifier instanceof UserEmailAddress)
        {
            return new UserKey(n.EMAIL, useridentifier.d());
        } else
        {
            return null;
        }
    }

    public static UserKey a(String s)
    {
        if (s == null)
        {
            return null;
        }
        String as[] = s.split(":", 2);
        if (as.length != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot parse user key: ").append(s).toString());
        } else
        {
            return new UserKey(n.valueOf(as[0]), as[1]);
        }
    }

    public static Collection a(Collection collection)
    {
        return ax.a(collection, new u());
    }

    public static Collection b(Collection collection)
    {
        return ax.a(collection, new v());
    }

    public n a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public boolean d()
    {
        return a != null && b != null;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UserKey)obj;
            if (!b.equals(((UserKey) (obj)).b))
            {
                return false;
            }
            if (a != ((UserKey) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return b.hashCode() * 31 + a.hashCode();
    }

    public String toString()
    {
        return c;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSerializable(a);
        parcel.writeString(b);
    }

}
