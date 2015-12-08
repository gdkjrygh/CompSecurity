// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.cast.internal.j;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            S

public class CastDevice
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new S();
    final int a;
    public String b;
    String c;
    public String d;
    String e;
    String f;
    int g;
    List h;
    int i;
    int j;
    private Inet4Address k;

    private CastDevice()
    {
        this(3, null, null, null, null, null, -1, ((List) (new ArrayList())), 0, -1);
    }

    CastDevice(int l, String s, String s1, String s2, String s3, String s4, int i1, 
            List list, int j1, int k1)
    {
        a = l;
        b = s;
        c = s1;
        if (c != null)
        {
            try
            {
                s = InetAddress.getByName(c);
                if (s instanceof Inet4Address)
                {
                    k = (Inet4Address)s;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                k = null;
            }
        }
        d = s2;
        e = s3;
        f = s4;
        g = i1;
        h = list;
        i = j1;
        j = k1;
    }

    public static CastDevice a(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        } else
        {
            bundle.setClassLoader(com/google/android/gms/cast/CastDevice.getClassLoader());
            return (CastDevice)bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof CastDevice))
        {
            return false;
        }
        obj = (CastDevice)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((CastDevice) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (com.google.android.gms.cast.internal.j.a(b, ((CastDevice) (obj)).b) && com.google.android.gms.cast.internal.j.a(k, ((CastDevice) (obj)).k) && com.google.android.gms.cast.internal.j.a(e, ((CastDevice) (obj)).e) && com.google.android.gms.cast.internal.j.a(d, ((CastDevice) (obj)).d) && com.google.android.gms.cast.internal.j.a(f, ((CastDevice) (obj)).f) && g == ((CastDevice) (obj)).g && com.google.android.gms.cast.internal.j.a(h, ((CastDevice) (obj)).h) && i == ((CastDevice) (obj)).i && j == ((CastDevice) (obj)).j) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.hashCode();
        }
    }

    public String toString()
    {
        return String.format("\"%s\" (%s)", new Object[] {
            d, b
        });
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        S.a(this, parcel);
    }

}
