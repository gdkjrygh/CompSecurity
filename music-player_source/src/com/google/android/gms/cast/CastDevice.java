// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fi;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            b

public class CastDevice
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    String a;
    private final int b;
    private String c;
    private Inet4Address d;
    private String e;
    private String f;
    private String g;
    private int h;
    private List i;

    private CastDevice()
    {
        this(1, null, null, null, null, null, -1, ((List) (new ArrayList())));
    }

    CastDevice(int j, String s, String s1, String s2, String s3, String s4, int k, 
            List list)
    {
        b = j;
        c = s;
        a = s1;
        if (a != null)
        {
            try
            {
                s = InetAddress.getByName(a);
                if (s instanceof Inet4Address)
                {
                    d = (Inet4Address)s;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                d = null;
            }
        }
        e = s2;
        f = s3;
        g = s4;
        h = k;
        i = list;
    }

    final int a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return e;
    }

    public final String d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return g;
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
        if (c != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((CastDevice) (obj)).c == null) goto _L1; else goto _L3
_L3:
        return false;
        if (fi.a(c, ((CastDevice) (obj)).c) && fi.a(d, ((CastDevice) (obj)).d) && fi.a(f, ((CastDevice) (obj)).f) && fi.a(e, ((CastDevice) (obj)).e) && fi.a(g, ((CastDevice) (obj)).g) && h == ((CastDevice) (obj)).h && fi.a(i, ((CastDevice) (obj)).i)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int f()
    {
        return h;
    }

    public final List g()
    {
        return Collections.unmodifiableList(i);
    }

    public int hashCode()
    {
        if (c == null)
        {
            return 0;
        } else
        {
            return c.hashCode();
        }
    }

    public String toString()
    {
        return String.format("\"%s\" (%s)", new Object[] {
            e, c
        });
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.cast.b.a(this, parcel);
    }

}
