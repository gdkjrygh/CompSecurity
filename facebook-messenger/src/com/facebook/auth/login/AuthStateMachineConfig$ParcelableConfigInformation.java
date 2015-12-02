// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.ev;

// Referenced classes of package com.facebook.auth.login:
//            u, AuthFragmentConfig, t

public class b
    implements Parcelable
{

    public static final android.os.gInformation.b CREATOR = new u();
    public ev a;
    public Class b;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeMap(a);
        parcel.writeString(b.getName());
    }


    private (Parcel parcel)
    {
        a = ev.a(parcel.readHashMap(com/facebook/auth/login/AuthFragmentConfig.getClassLoader()));
        try
        {
            b = Class.forName(parcel.readString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new RuntimeException((new StringBuilder()).append("Parceled fragment class for auth start was incorrect: ").append(parcel).toString());
        }
    }

    b(Parcel parcel, t t)
    {
        this(parcel);
    }

    public <init>(ev ev1, Class class1)
    {
        a = ev1;
        b = class1;
    }
}
