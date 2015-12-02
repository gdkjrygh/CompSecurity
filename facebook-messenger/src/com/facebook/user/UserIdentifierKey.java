// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.user:
//            t, s

public class UserIdentifierKey
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new t();
    public final s a;
    public final String b;

    private UserIdentifierKey(Parcel parcel)
    {
        a = (s)parcel.readSerializable();
        b = parcel.readString();
    }

    UserIdentifierKey(Parcel parcel, t t1)
    {
        this(parcel);
    }

    public UserIdentifierKey(s s1, String s2)
    {
        a = s1;
        b = s2;
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
            obj = (UserIdentifierKey)obj;
            if (b == null ? ((UserIdentifierKey) (obj)).b != null : !b.equals(((UserIdentifierKey) (obj)).b))
            {
                return false;
            }
            if (a != ((UserIdentifierKey) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
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
        }
        return i * 31 + j;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSerializable(a);
        parcel.writeString(b);
    }

}
