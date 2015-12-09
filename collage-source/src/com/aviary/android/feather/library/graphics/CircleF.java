// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.graphics;

import android.os.Parcel;

// Referenced classes of package com.aviary.android.feather.library.graphics:
//            IGeom

public class CircleF
    implements IGeom
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public CircleF a(Parcel parcel)
        {
            CircleF circlef = new CircleF();
            circlef.a(parcel);
            return circlef;
        }

        public CircleF[] a(int i)
        {
            return new CircleF[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    protected float a;
    protected float b;
    protected float c;

    public CircleF()
    {
        this(0.0F, 0.0F, 0.0F);
    }

    public CircleF(float f, float f1, float f2)
    {
        a = f2;
        b = f;
        c = f1;
    }

    public float a()
    {
        return b;
    }

    public void a(float f, float f1, float f2)
    {
        b = f;
        c = f1;
        a = f2;
    }

    public void a(Parcel parcel)
    {
        b = parcel.readFloat();
        c = parcel.readFloat();
        a = parcel.readFloat();
    }

    public float b()
    {
        return c;
    }

    public float c()
    {
        return a;
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
            obj = (CircleF)obj;
            if (b != ((CircleF) (obj)).b || c != ((CircleF) (obj)).c || a != ((CircleF) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((Float.valueOf(b).hashCode() + 497) * 71 + Float.valueOf(c).hashCode()) * 71 + Float.valueOf(a).hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("CircleF(").append(b).append(", ").append(c).append(", r=").append(a).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(b);
        parcel.writeFloat(c);
        parcel.writeFloat(a);
    }

}
