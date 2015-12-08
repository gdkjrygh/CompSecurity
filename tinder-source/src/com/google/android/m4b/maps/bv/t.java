// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.cg.ar;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            q

public final class t
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new t(parcel);
        }

        public final Object[] newArray(int i)
        {
            return new t[i];
        }

    };
    public final float a;
    public final int b;
    public final String c;
    public final int d;
    public String e;

    private t(float f, String s, int i, String s1)
    {
        a = f;
        b = ar.q(f);
        c = s;
        d = i;
        e = s1;
    }

    public t(Parcel parcel)
    {
        a = parcel.readFloat();
        b = parcel.readInt();
        c = parcel.readString();
        d = parcel.readInt();
        e = parcel.readString();
    }

    public t(a a1)
    {
        this(com.google.android.m4b.maps.bv.q.a(a1.d(53)), a1.g(54), a1.d(55), a1.g(56));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (t)obj;
            if (!c.equals(((t) (obj)).c) || !e.equals(((t) (obj)).e) || d != ((t) (obj)).d || Float.floatToRawIntBits(a) != Float.floatToRawIntBits(((t) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(a);
        parcel.writeInt(b);
        parcel.writeString(c);
        parcel.writeInt(d);
        parcel.writeString(e);
    }

}
