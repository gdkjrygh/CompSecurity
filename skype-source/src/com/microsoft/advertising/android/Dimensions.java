// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Parcel;
import android.view.View;

// Referenced classes of package com.microsoft.advertising.android:
//            ReflectedParcelable

class Dimensions extends ReflectedParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Dimensions(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Dimensions[i];
        }

    };
    protected int a;
    protected int b;
    public int c;
    public int d;

    public Dimensions()
    {
        a = 0;
        b = 0;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
    }

    protected Dimensions(Parcel parcel)
    {
        super(parcel);
        a = 0;
        b = 0;
    }

    public final void a(int i, int j)
    {
        if (i >= 0 && i < c)
        {
            a = (a + c / 2) - i / 2;
            c = i;
        }
        if (j >= 0 && j < d)
        {
            b = (b + d / 2) - j / 2;
            d = j;
        }
    }

    public final void a(View view)
    {
        a = view.getLeft();
        b = view.getTop();
        c = view.getWidth();
        d = view.getHeight();
    }

    public final void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        marginlayoutparams.width = c;
        marginlayoutparams.height = d;
        marginlayoutparams.leftMargin = a;
        marginlayoutparams.topMargin = b;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof Dimensions))
        {
            if (a == ((Dimensions) (obj = (Dimensions)obj)).a && b == ((Dimensions) (obj)).b && c == ((Dimensions) (obj)).c && d == ((Dimensions) (obj)).d)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Integer.valueOf(a + b + c + d).hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[x=").append(a);
        stringbuilder.append(" y=").append(b);
        stringbuilder.append(" w=").append(c);
        stringbuilder.append(" h=").append(d);
        return stringbuilder.toString();
    }

}
