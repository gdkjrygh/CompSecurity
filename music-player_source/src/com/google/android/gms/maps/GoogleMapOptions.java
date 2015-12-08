// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.maps.a.a;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            a

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final com.google.android.gms.maps.a a = new com.google.android.gms.maps.a();
    private final int b;
    private Boolean c;
    private Boolean d;
    private int e;
    private CameraPosition f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;

    public GoogleMapOptions()
    {
        e = -1;
        b = 1;
    }

    GoogleMapOptions(int i1, byte byte0, byte byte1, int j1, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7)
    {
        e = -1;
        b = i1;
        c = com.google.android.gms.maps.a.a.a(byte0);
        d = com.google.android.gms.maps.a.a.a(byte1);
        e = j1;
        f = cameraposition;
        g = com.google.android.gms.maps.a.a.a(byte2);
        h = com.google.android.gms.maps.a.a.a(byte3);
        i = com.google.android.gms.maps.a.a.a(byte4);
        j = com.google.android.gms.maps.a.a.a(byte5);
        k = com.google.android.gms.maps.a.a.a(byte6);
        l = com.google.android.gms.maps.a.a.a(byte7);
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, e.b);
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        if (typedarray.hasValue(0))
        {
            googlemapoptions.e = typedarray.getInt(0, -1);
        }
        if (typedarray.hasValue(13))
        {
            googlemapoptions.c = Boolean.valueOf(typedarray.getBoolean(13, false));
        }
        if (typedarray.hasValue(12))
        {
            googlemapoptions.d = Boolean.valueOf(typedarray.getBoolean(12, false));
        }
        if (typedarray.hasValue(6))
        {
            googlemapoptions.h = Boolean.valueOf(typedarray.getBoolean(6, true));
        }
        if (typedarray.hasValue(7))
        {
            googlemapoptions.l = Boolean.valueOf(typedarray.getBoolean(7, true));
        }
        if (typedarray.hasValue(8))
        {
            googlemapoptions.i = Boolean.valueOf(typedarray.getBoolean(8, true));
        }
        if (typedarray.hasValue(9))
        {
            googlemapoptions.k = Boolean.valueOf(typedarray.getBoolean(9, true));
        }
        if (typedarray.hasValue(11))
        {
            googlemapoptions.j = Boolean.valueOf(typedarray.getBoolean(11, true));
        }
        if (typedarray.hasValue(10))
        {
            googlemapoptions.g = Boolean.valueOf(typedarray.getBoolean(10, true));
        }
        googlemapoptions.f = CameraPosition.a(context, attributeset);
        typedarray.recycle();
        return googlemapoptions;
    }

    final int a()
    {
        return b;
    }

    final byte b()
    {
        return com.google.android.gms.maps.a.a.a(c);
    }

    final byte c()
    {
        return com.google.android.gms.maps.a.a.a(d);
    }

    final byte d()
    {
        return com.google.android.gms.maps.a.a.a(g);
    }

    public final int describeContents()
    {
        return 0;
    }

    final byte e()
    {
        return com.google.android.gms.maps.a.a.a(h);
    }

    final byte f()
    {
        return com.google.android.gms.maps.a.a.a(i);
    }

    final byte g()
    {
        return com.google.android.gms.maps.a.a.a(j);
    }

    final byte h()
    {
        return com.google.android.gms.maps.a.a.a(k);
    }

    final byte i()
    {
        return com.google.android.gms.maps.a.a.a(l);
    }

    public final int j()
    {
        return e;
    }

    public final CameraPosition k()
    {
        return f;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, com.google.android.gms.maps.a.a.a(c));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, com.google.android.gms.maps.a.a.a(d));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, f, i1, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, com.google.android.gms.maps.a.a.a(g));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, com.google.android.gms.maps.a.a.a(h));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, com.google.android.gms.maps.a.a.a(i));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, com.google.android.gms.maps.a.a.a(j));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, com.google.android.gms.maps.a.a.a(k));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, com.google.android.gms.maps.a.a.a(l));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
            return;
        } else
        {
            a(this, parcel, i1);
            return;
        }
    }

}
