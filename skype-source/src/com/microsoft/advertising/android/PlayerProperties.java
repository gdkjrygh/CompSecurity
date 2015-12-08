// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Parcel;
import android.text.TextUtils;

// Referenced classes of package com.microsoft.advertising.android:
//            ReflectedParcelable

public class PlayerProperties extends ReflectedParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new PlayerProperties(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PlayerProperties[i];
        }

    };
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    public String g;

    public PlayerProperties()
    {
        a = false;
        b = false;
        d = false;
        c = false;
        g = "normal";
        f = "normal";
        e = false;
    }

    public PlayerProperties(Parcel parcel)
    {
        super(parcel);
    }

    public final void a(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, String s, String s1)
    {
        a = flag1;
        b = flag2;
        c = flag4;
        d = flag;
        if (TextUtils.isDigitsOnly(s))
        {
            s = "normal";
        }
        g = s;
        if (TextUtils.isDigitsOnly(s1))
        {
            s1 = "normal";
        }
        f = s1;
        e = flag3;
    }

}
