// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Parcel;

// Referenced classes of package com.microsoft.advertising.android:
//            ReflectedParcelable

public class ExpandProperties extends ReflectedParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ExpandProperties(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ExpandProperties[i];
        }

    };
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public float g;
    public boolean h;

    public ExpandProperties()
    {
        e = false;
        f = 0;
        g = 0.0F;
        h = true;
        a = 0;
        b = 0;
        c = false;
        d = false;
    }

    protected ExpandProperties(Parcel parcel)
    {
        super(parcel);
    }

}
