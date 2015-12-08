// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            eg, dx, dz

public final class ej extends NativeAppInstallAd
{

    private final eg a;
    private final List b;
    private final dz c;

    public ej(eg eg1)
    {
        b = new ArrayList();
        a = eg1;
        Iterator iterator = a.getImages().iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        eg1 = ((eg) (iterator.next()));
        if (!(eg1 instanceof IBinder)) goto _L4; else goto _L3
_L3:
        eg1 = dx.zzt((IBinder)eg1);
_L7:
        if (eg1 == null) goto _L6; else goto _L5
_L5:
        b.add(new dz(eg1));
          goto _L6
        eg1;
        zzb.zzb("Failed to get image.", eg1);
_L2:
        eg1 = a.zzdw();
        if (eg1 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        eg1 = new dz(eg1);
_L8:
        c = eg1;
        return;
_L4:
        eg1 = null;
          goto _L7
        eg1;
        zzb.zzb("Failed to get icon.", eg1);
        eg1 = null;
          goto _L8
    }

    private a b()
    {
        a a1;
        try
        {
            a1 = a.zzdx();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to retrieve native ad engine.", remoteexception);
            return null;
        }
        return a1;
    }

    protected final Object a()
    {
        return b();
    }

    public final CharSequence getBody()
    {
        String s;
        try
        {
            s = a.getBody();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get body.", remoteexception);
            return null;
        }
        return s;
    }

    public final CharSequence getCallToAction()
    {
        String s;
        try
        {
            s = a.getCallToAction();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get call to action.", remoteexception);
            return null;
        }
        return s;
    }

    public final Bundle getExtras()
    {
        Bundle bundle;
        try
        {
            bundle = a.getExtras();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get extras", remoteexception);
            return null;
        }
        return bundle;
    }

    public final CharSequence getHeadline()
    {
        String s;
        try
        {
            s = a.getHeadline();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get headline.", remoteexception);
            return null;
        }
        return s;
    }

    public final com.google.android.gms.ads.formats.NativeAd.Image getIcon()
    {
        return c;
    }

    public final List getImages()
    {
        return b;
    }

    public final CharSequence getPrice()
    {
        String s;
        try
        {
            s = a.getPrice();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get price.", remoteexception);
            return null;
        }
        return s;
    }

    public final Double getStarRating()
    {
        double d;
        try
        {
            d = a.getStarRating();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get star rating.", remoteexception);
            return null;
        }
        if (d == -1D)
        {
            return null;
        } else
        {
            return Double.valueOf(d);
        }
    }

    public final CharSequence getStore()
    {
        String s;
        try
        {
            s = a.getStore();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get store", remoteexception);
            return null;
        }
        return s;
    }
}
