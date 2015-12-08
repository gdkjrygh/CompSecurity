// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ik;
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
    private final int BR;
    private String ER;
    String ES;
    private Inet4Address ET;
    private String EU;
    private String EV;
    private String EW;
    private int EX;
    private List EY;
    private int EZ;
    private int Fa;

    private CastDevice()
    {
        this(3, null, null, null, null, null, -1, ((List) (new ArrayList())), 0, -1);
    }

    CastDevice(int i, String s, String s1, String s2, String s3, String s4, int j, 
            List list, int k, int l)
    {
        BR = i;
        ER = s;
        ES = s1;
        if (ES != null)
        {
            try
            {
                s = InetAddress.getByName(ES);
                if (s instanceof Inet4Address)
                {
                    ET = (Inet4Address)s;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ET = null;
            }
        }
        EU = s2;
        EV = s3;
        EW = s4;
        EX = j;
        EY = list;
        EZ = k;
        Fa = l;
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
        if (ik.a(ER, ((CastDevice) (obj)).ER) && ik.a(ET, ((CastDevice) (obj)).ET) && ik.a(EV, ((CastDevice) (obj)).EV) && ik.a(EU, ((CastDevice) (obj)).EU) && ik.a(EW, ((CastDevice) (obj)).EW) && EX == ((CastDevice) (obj)).EX && ik.a(EY, ((CastDevice) (obj)).EY) && EZ == ((CastDevice) (obj)).EZ && Fa == ((CastDevice) (obj)).Fa) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int getCapabilities()
    {
        return EZ;
    }

    public String getDeviceId()
    {
        return ER;
    }

    public String getDeviceVersion()
    {
        return EW;
    }

    public String getFriendlyName()
    {
        return EU;
    }

    public WebImage getIcon(int i, int j)
    {
        WebImage webimage = null;
        if (EY.isEmpty())
        {
            return null;
        }
        if (i <= 0 || j <= 0)
        {
            return (WebImage)EY.get(0);
        }
        Iterator iterator = EY.iterator();
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
                webimage1 = (WebImage)EY.get(0);
            }
        }
        return webimage1;
    }

    public List getIcons()
    {
        return Collections.unmodifiableList(EY);
    }

    public Inet4Address getIpAddress()
    {
        return ET;
    }

    public String getModelName()
    {
        return EV;
    }

    public int getServicePort()
    {
        return EX;
    }

    public int getStatus()
    {
        return Fa;
    }

    int getVersionCode()
    {
        return BR;
    }

    public boolean hasIcons()
    {
        return !EY.isEmpty();
    }

    public int hashCode()
    {
        if (ER == null)
        {
            return 0;
        } else
        {
            return ER.hashCode();
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
                return ik.a(getDeviceId(), castdevice.getDeviceId());
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
            EU, ER
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
