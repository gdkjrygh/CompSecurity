// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gj;
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
    private String Ae;
    String Af;
    private Inet4Address Ag;
    private String Ah;
    private String Ai;
    private String Aj;
    private int Ak;
    private List Al;
    private int Am;
    private final int xJ;

    private CastDevice()
    {
        this(2, null, null, null, null, null, -1, ((List) (new ArrayList())), 0);
    }

    CastDevice(int i, String s, String s1, String s2, String s3, String s4, int j, 
            List list, int k)
    {
        xJ = i;
        Ae = s;
        Af = s1;
        if (Af != null)
        {
            try
            {
                s = InetAddress.getByName(Af);
                if (s instanceof Inet4Address)
                {
                    Ag = (Inet4Address)s;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Ag = null;
            }
        }
        Ah = s2;
        Ai = s3;
        Aj = s4;
        Ak = j;
        Al = list;
        Am = k;
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
        if (gj.a(Ae, ((CastDevice) (obj)).Ae) && gj.a(Ag, ((CastDevice) (obj)).Ag) && gj.a(Ai, ((CastDevice) (obj)).Ai) && gj.a(Ah, ((CastDevice) (obj)).Ah) && gj.a(Aj, ((CastDevice) (obj)).Aj) && Ak == ((CastDevice) (obj)).Ak && gj.a(Al, ((CastDevice) (obj)).Al) && Am == ((CastDevice) (obj)).Am) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int getCapabilities()
    {
        return Am;
    }

    public String getDeviceId()
    {
        return Ae;
    }

    public String getDeviceVersion()
    {
        return Aj;
    }

    public String getFriendlyName()
    {
        return Ah;
    }

    public WebImage getIcon(int i, int j)
    {
        WebImage webimage = null;
        if (Al.isEmpty())
        {
            return null;
        }
        if (i <= 0 || j <= 0)
        {
            return (WebImage)Al.get(0);
        }
        Iterator iterator = Al.iterator();
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
                webimage1 = (WebImage)Al.get(0);
            }
        }
        return webimage1;
    }

    public List getIcons()
    {
        return Collections.unmodifiableList(Al);
    }

    public Inet4Address getIpAddress()
    {
        return Ag;
    }

    public String getModelName()
    {
        return Ai;
    }

    public int getServicePort()
    {
        return Ak;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public boolean hasIcons()
    {
        return !Al.isEmpty();
    }

    public int hashCode()
    {
        if (Ae == null)
        {
            return 0;
        } else
        {
            return Ae.hashCode();
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
                return gj.a(getDeviceId(), castdevice.getDeviceId());
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
            Ah, Ae
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
