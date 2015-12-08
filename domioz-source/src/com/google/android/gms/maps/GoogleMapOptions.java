// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.af;
import com.google.android.gms.maps.internal.ag;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            k

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    private final int a;
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;

    public GoogleMapOptions()
    {
        d = -1;
        a = 1;
    }

    GoogleMapOptions(int i1, byte byte0, byte byte1, int j1, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9)
    {
        d = -1;
        a = i1;
        b = af.a(byte0);
        c = af.a(byte1);
        d = j1;
        e = cameraposition;
        f = af.a(byte2);
        g = af.a(byte3);
        h = af.a(byte4);
        i = af.a(byte5);
        j = af.a(byte6);
        k = af.a(byte7);
        l = af.a(byte8);
        m = af.a(byte9);
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, c.d);
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        if (typedarray.hasValue(c.k))
        {
            googlemapoptions.d = typedarray.getInt(c.k, -1);
        }
        if (typedarray.hasValue(c.t))
        {
            googlemapoptions.b = Boolean.valueOf(typedarray.getBoolean(c.t, false));
        }
        if (typedarray.hasValue(c.s))
        {
            googlemapoptions.c = Boolean.valueOf(typedarray.getBoolean(c.s, false));
        }
        if (typedarray.hasValue(c.l))
        {
            googlemapoptions.g = Boolean.valueOf(typedarray.getBoolean(c.l, true));
        }
        if (typedarray.hasValue(c.n))
        {
            googlemapoptions.k = Boolean.valueOf(typedarray.getBoolean(c.n, true));
        }
        if (typedarray.hasValue(c.o))
        {
            googlemapoptions.h = Boolean.valueOf(typedarray.getBoolean(c.o, true));
        }
        if (typedarray.hasValue(c.p))
        {
            googlemapoptions.j = Boolean.valueOf(typedarray.getBoolean(c.p, true));
        }
        if (typedarray.hasValue(c.r))
        {
            googlemapoptions.i = Boolean.valueOf(typedarray.getBoolean(c.r, true));
        }
        if (typedarray.hasValue(c.q))
        {
            googlemapoptions.f = Boolean.valueOf(typedarray.getBoolean(c.q, true));
        }
        if (typedarray.hasValue(c.j))
        {
            googlemapoptions.l = Boolean.valueOf(typedarray.getBoolean(c.j, false));
        }
        if (typedarray.hasValue(c.m))
        {
            googlemapoptions.m = Boolean.valueOf(typedarray.getBoolean(c.m, true));
        }
        googlemapoptions.e = CameraPosition.a(context, attributeset);
        typedarray.recycle();
        return googlemapoptions;
    }

    final int a()
    {
        return a;
    }

    final byte b()
    {
        return af.a(b);
    }

    final byte c()
    {
        return af.a(c);
    }

    final byte d()
    {
        return af.a(f);
    }

    public final int describeContents()
    {
        return 0;
    }

    final byte e()
    {
        return af.a(g);
    }

    final byte f()
    {
        return af.a(h);
    }

    final byte g()
    {
        return af.a(i);
    }

    final byte h()
    {
        return af.a(j);
    }

    final byte i()
    {
        return af.a(k);
    }

    final byte j()
    {
        return af.a(l);
    }

    final byte k()
    {
        return af.a(m);
    }

    public final int l()
    {
        return d;
    }

    public final CameraPosition m()
    {
        return e;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        if (ag.a())
        {
            int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, af.a(b));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, af.a(c));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e, i1);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, af.a(f));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, af.a(g));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, af.a(h));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, af.a(i));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, af.a(j));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, af.a(k));
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
            return;
        } else
        {
            com.google.android.gms.maps.k.a(this, parcel, i1);
            return;
        }
    }

}
