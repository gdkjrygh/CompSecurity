// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            b

public class CastDevice
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private String Ah;
    String Ai;
    private Inet4Address Aj;
    private String Ak;
    private String Al;
    private String Am;
    private int An;
    private List Ao;
    private int Ap;
    private final int xM;

    private CastDevice()
    {
        this(2, null, null, null, null, null, -1, ((List) (new ArrayList())), 0);
    }

    CastDevice(int i, String s, String s1, String s2, String s3, String s4, int j, 
            List list, int k)
    {
        xM = i;
        Ah = s;
        Ai = s1;
        if (Ai != null)
        {
            try
            {
                s = InetAddress.getByName(Ai);
                if (s instanceof Inet4Address)
                {
                    Aj = (Inet4Address)s;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Aj = null;
            }
        }
        Ak = s2;
        Al = s3;
        Am = s4;
        An = j;
        Ao = list;
        Ap = k;
    }

    public static CastDevice getFromBundle(Bundle bundle)
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
        if (getDeviceId() != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((CastDevice) (obj)).getDeviceId() == null) goto _L1; else goto _L3
_L3:
        return false;
        if (gi.a(Ah, ((CastDevice) (obj)).Ah) && gi.a(Aj, ((CastDevice) (obj)).Aj) && gi.a(Al, ((CastDevice) (obj)).Al) && gi.a(Ak, ((CastDevice) (obj)).Ak) && gi.a(Am, ((CastDevice) (obj)).Am) && An == ((CastDevice) (obj)).An && gi.a(Ao, ((CastDevice) (obj)).Ao) && Ap == ((CastDevice) (obj)).Ap) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int getCapabilities()
    {
        return Ap;
    }

    public String getDeviceId()
    {
        return Ah;
    }

    public String getDeviceVersion()
    {
        return Am;
    }

    public String getFriendlyName()
    {
        return Ak;
    }

    public WebImage getIcon(int i, int j)
    {
        WebImage webimage = null;
        if (Ao.isEmpty())
        {
            return null;
        }
        if (i <= 0 || j <= 0)
        {
            return (WebImage)Ao.get(0);
        }
        Iterator iterator = Ao.iterator();
        WebImage webimage1 = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WebImage webimage2 = (WebImage)iterator.next();
            int k = webimage2.getWidth();
            int l = webimage2.getHeight();
            if (k >= i && l >= j)
            {
                if (webimage1 == null || webimage1.getWidth() > k && webimage1.getHeight() > l)
                {
                    webimage1 = webimage2;
                }
            } else
            if (k < i && l < j && (webimage == null || webimage.getWidth() < k && webimage.getHeight() < l))
            {
                webimage = webimage2;
            }
        } while (true);
        if (webimage1 == null)
        {
            if (webimage != null)
            {
                webimage1 = webimage;
            } else
            {
                webimage1 = (WebImage)Ao.get(0);
            }
        }
        return webimage1;
    }

    public List getIcons()
    {
        return Collections.unmodifiableList(Ao);
    }

    public Inet4Address getIpAddress()
    {
        return Aj;
    }

    public String getModelName()
    {
        return Al;
    }

    public int getServicePort()
    {
        return An;
    }

    int getVersionCode()
    {
        return xM;
    }

    public boolean hasIcons()
    {
        return !Ao.isEmpty();
    }

    public int hashCode()
    {
        if (Ah == null)
        {
            return 0;
        } else
        {
            return Ah.hashCode();
        }
    }

    public boolean isSameDevice(CastDevice castdevice)
    {
        if (castdevice != null)
        {
            if (getDeviceId() == null)
            {
                if (castdevice.getDeviceId() == null)
                {
                    return true;
                }
            } else
            {
                return gi.a(getDeviceId(), castdevice.getDeviceId());
            }
        }
        return false;
    }

    public void putInBundle(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
            return;
        }
    }

    public String toString()
    {
        return String.format("\"%s\" (%s)", new Object[] {
            Ak, Ah
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
