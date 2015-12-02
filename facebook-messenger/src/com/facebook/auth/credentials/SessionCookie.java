// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.json.jsonmirror.JMStaticKeysDictDestination;

// Referenced classes of package com.facebook.auth.credentials:
//            d, e

public class SessionCookie
    implements Parcelable, JMStaticKeysDictDestination
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private boolean e;
    private String f;

    private SessionCookie()
    {
        a = null;
        b = "";
        c = null;
        d = "";
        e = false;
        f = "";
    }

    public SessionCookie(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        f = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        if (a == null)
        {
            return null;
        }
        e e1 = (new e(this)).a(a, b);
        if (c != null)
        {
            e1.a("Expires", c);
        }
        e1.a("Domain", d).a("Path", f);
        if (e)
        {
            e1.a("secure");
        }
        return e1.a();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        parcel.writeString(f);
    }

}
