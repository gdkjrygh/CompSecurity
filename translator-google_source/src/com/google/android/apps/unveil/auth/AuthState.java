// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.unveil.env.af;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.auth:
//            a

public class AuthState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public String a;
    public String b;
    public String c;
    public Map d;
    public long e;
    private final af f = new af();

    public AuthState()
    {
        d = new HashMap();
        e = System.currentTimeMillis();
        a = "";
        b = "";
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeLong(e);
        parcel.writeTypedList(new ArrayList(d.values()));
    }

}
