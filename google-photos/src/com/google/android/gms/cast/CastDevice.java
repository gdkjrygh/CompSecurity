// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import jwo;
import jxb;

public class CastDevice
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jxb();
    public final int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public List h;
    public int i;
    public int j;
    private Inet4Address k;

    private CastDevice()
    {
        this(3, null, null, null, null, null, -1, ((List) (new ArrayList())), 0, -1);
    }

    public CastDevice(int l, String s, String s1, String s2, String s3, String s4, int i1, 
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
        if (jwo.a(b, ((CastDevice) (obj)).b) && jwo.a(k, ((CastDevice) (obj)).k) && jwo.a(e, ((CastDevice) (obj)).e) && jwo.a(d, ((CastDevice) (obj)).d) && jwo.a(f, ((CastDevice) (obj)).f) && g == ((CastDevice) (obj)).g && jwo.a(h, ((CastDevice) (obj)).h) && i == ((CastDevice) (obj)).i && j == ((CastDevice) (obj)).j) goto _L1; else goto _L4
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
        jxb.a(this, parcel);
    }

}
