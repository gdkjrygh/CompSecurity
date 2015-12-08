// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.facebook.login:
//            LoginClient, LoginBehavior, DefaultAudience

public static class e
    implements Parcelable
{

    public static final android.os.Request.f CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new LoginClient.Request(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new LoginClient.Request[i];
        }

    };
    final LoginBehavior a;
    Set b;
    final DefaultAudience c;
    final String d;
    final String e;
    boolean f;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        String s;
        if (a != null)
        {
            s = a.name();
        } else
        {
            s = null;
        }
        parcel.writeString(s);
        parcel.writeStringList(new ArrayList(b));
        s = obj;
        if (c != null)
        {
            s = c.name();
        }
        parcel.writeString(s);
        parcel.writeString(d);
        parcel.writeString(e);
        if (f)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }


    private _cls1(Parcel parcel)
    {
        Object obj1 = null;
        super();
        f = false;
        Object obj = parcel.readString();
        String s;
        boolean flag;
        if (obj != null)
        {
            obj = LoginBehavior.valueOf(((String) (obj)));
        } else
        {
            obj = null;
        }
        a = ((LoginBehavior) (obj));
        obj = new ArrayList();
        parcel.readStringList(((java.util.List) (obj)));
        b = new HashSet(((java.util.Collection) (obj)));
        s = parcel.readString();
        obj = obj1;
        if (s != null)
        {
            obj = DefaultAudience.valueOf(s);
        }
        c = ((DefaultAudience) (obj));
        d = parcel.readString();
        e = parcel.readString();
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    f(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    <init>(LoginBehavior loginbehavior, Set set, DefaultAudience defaultaudience, String s, String s1)
    {
        f = false;
        a = loginbehavior;
        if (set == null)
        {
            set = new HashSet();
        }
        b = set;
        c = defaultaudience;
        d = s;
        e = s1;
    }
}
