// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.in;
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
    private final int CK;
    private String FG;
    String FH;
    private Inet4Address FI;
    private String FJ;
    private String FK;
    private String FL;
    private int FM;
    private List FN;
    private int FO;
    private int FP;

    private CastDevice()
    {
        this(3, null, null, null, null, null, -1, ((List) (new ArrayList())), 0, -1);
    }

    CastDevice(int i, String s, String s1, String s2, String s3, String s4, int j, 
            List list, int k, int l)
    {
        CK = i;
        FG = s;
        FH = s1;
        if (FH != null)
        {
            try
            {
                s = InetAddress.getByName(FH);
                if (s instanceof Inet4Address)
                {
                    FI = (Inet4Address)s;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                FI = null;
            }
        }
        FJ = s2;
        FK = s3;
        FL = s4;
        FM = j;
        FN = list;
        FO = k;
        FP = l;
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
        if (in.a(FG, ((CastDevice) (obj)).FG) && in.a(FI, ((CastDevice) (obj)).FI) && in.a(FK, ((CastDevice) (obj)).FK) && in.a(FJ, ((CastDevice) (obj)).FJ) && in.a(FL, ((CastDevice) (obj)).FL) && FM == ((CastDevice) (obj)).FM && in.a(FN, ((CastDevice) (obj)).FN) && FO == ((CastDevice) (obj)).FO && FP == ((CastDevice) (obj)).FP) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int getCapabilities()
    {
        return FO;
    }

    public String getDeviceId()
    {
        return FG;
    }

    public String getDeviceVersion()
    {
        return FL;
    }

    public String getFriendlyName()
    {
        return FJ;
    }

    public WebImage getIcon(int i, int j)
    {
        WebImage webimage = null;
        if (FN.isEmpty())
        {
            return null;
        }
        if (i <= 0 || j <= 0)
        {
            return (WebImage)FN.get(0);
        }
        Iterator iterator = FN.iterator();
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
                webimage1 = (WebImage)FN.get(0);
            }
        }
        return webimage1;
    }

    public List getIcons()
    {
        return Collections.unmodifiableList(FN);
    }

    public Inet4Address getIpAddress()
    {
        return FI;
    }

    public String getModelName()
    {
        return FK;
    }

    public int getServicePort()
    {
        return FM;
    }

    public int getStatus()
    {
        return FP;
    }

    int getVersionCode()
    {
        return CK;
    }

    public boolean hasIcons()
    {
        return !FN.isEmpty();
    }

    public int hashCode()
    {
        if (FG == null)
        {
            return 0;
        } else
        {
            return FG.hashCode();
        }
    }

    public boolean isOnLocalNetwork()
    {
        return !FG.startsWith("__cast_nearby__");
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
                return in.a(getDeviceId(), castdevice.getDeviceId());
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
            FJ, FG
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
