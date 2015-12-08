// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.n;
import com.google.android.gms.maps.model.internal.q;

// Referenced classes of package com.google.android.gms.maps.model:
//            ai, aj, k

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final ai CREATOR = new ai();
    private final int a;
    private q b;
    private k c;
    private boolean d;
    private float e;
    private boolean f;

    public TileOverlayOptions()
    {
        d = true;
        f = true;
        a = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f1, boolean flag1)
    {
        d = true;
        f = true;
        a = i;
        b = com.google.android.gms.maps.model.internal.q.a.a(ibinder);
        if (b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new _cls1();
        }
        c = ibinder;
        d = flag;
        e = f1;
        f = flag1;
    }

    static q a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    int a()
    {
        return a;
    }

    public TileOverlayOptions a(float f1)
    {
        e = f1;
        return this;
    }

    public TileOverlayOptions a(k k)
    {
        c = k;
        if (c == null)
        {
            k = null;
        } else
        {
            k = new _cls2(k);
        }
        b = k;
        return this;
    }

    public TileOverlayOptions a(boolean flag)
    {
        d = flag;
        return this;
    }

    IBinder b()
    {
        return b.asBinder();
    }

    public TileOverlayOptions b(boolean flag)
    {
        f = flag;
        return this;
    }

    public k c()
    {
        return c;
    }

    public float d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return d;
    }

    public boolean f()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (n.a())
        {
            aj.a(this, parcel, i);
            return;
        } else
        {
            ai.a(this, parcel, i);
            return;
        }
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
