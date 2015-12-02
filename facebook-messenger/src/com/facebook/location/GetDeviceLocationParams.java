// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;
import com.google.common.a.fi;
import com.google.common.a.hq;
import java.util.Set;

// Referenced classes of package com.facebook.location:
//            n, o

public class GetDeviceLocationParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final float e;
    public final long f;
    public final float g;
    public final long h;
    public final float i;
    public final Set j;
    public final boolean k;

    private GetDeviceLocationParams(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readLong();
        b = parcel.readLong();
        c = parcel.readFloat();
        d = parcel.readLong();
        e = parcel.readFloat();
        f = parcel.readLong();
        g = parcel.readFloat();
        h = parcel.readLong();
        i = parcel.readFloat();
        java.util.ArrayList arraylist = hq.a();
        parcel.readStringList(arraylist);
        j = fi.a(arraylist);
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        k = flag;
    }

    GetDeviceLocationParams(Parcel parcel, n n1)
    {
        this(parcel);
    }

    GetDeviceLocationParams(o o1)
    {
        a = o1.a();
        b = o1.b();
        c = o1.c();
        d = o1.d();
        e = o1.e();
        f = o1.f();
        g = o1.g();
        h = o1.h();
        i = o1.i();
        j = o1.j();
        k = o1.k();
    }

    public static o newBuilder()
    {
        return new o();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeLong(a);
        parcel.writeLong(b);
        parcel.writeFloat(c);
        parcel.writeLong(d);
        parcel.writeFloat(e);
        parcel.writeLong(f);
        parcel.writeFloat(g);
        parcel.writeLong(h);
        parcel.writeFloat(i);
        parcel.writeStringList(es.a(j));
        if (k)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeInt(l);
    }

}
