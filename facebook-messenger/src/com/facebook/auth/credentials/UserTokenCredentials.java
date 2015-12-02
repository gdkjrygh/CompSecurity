// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.auth.credentials:
//            f

public class UserTokenCredentials
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final String a;
    private final String b;

    public UserTokenCredentials(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UserTokenCredentials))
            {
                return false;
            }
            obj = (UserTokenCredentials)obj;
            if (!Objects.equal(a, ((UserTokenCredentials) (obj)).a))
            {
                return false;
            }
            if (!Objects.equal(b, ((UserTokenCredentials) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("UserTokenCredentials{userId='").append(a).append("'}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }

}
