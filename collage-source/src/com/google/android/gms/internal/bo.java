// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            bn, bk, bj

public class bo extends NativeAppInstallAd
{

    private final bn a;
    private final List b;
    private final bk c;

    public bo(bn bn1)
    {
        b = new ArrayList();
        a = bn1;
        bn1 = a.getImages().iterator();
_L2:
        bj bj;
        do
        {
            if (!bn1.hasNext())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            bj = a(bn1.next());
        } while (bj == null);
        b.add(new bk(bj));
        if (true) goto _L2; else goto _L1
_L1:
        bn1;
        zzb.zzb("Failed to get image.", bn1);
        bn1 = a.zzds();
        if (bn1 == null) goto _L4; else goto _L3
_L3:
        bn1 = new bk(bn1);
_L6:
        c = bn1;
        return;
        bn1;
        zzb.zzb("Failed to get icon.", bn1);
_L4:
        bn1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected a a()
    {
        a a1;
        try
        {
            a1 = a.zzdt();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to retrieve native ad engine.", remoteexception);
            return null;
        }
        return a1;
    }

    bj a(Object obj)
    {
        if (obj instanceof IBinder)
        {
            return bj.a.zzt((IBinder)obj);
        } else
        {
            return null;
        }
    }

    public CharSequence getBody()
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

    public CharSequence getCallToAction()
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

    public Bundle getExtras()
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

    public CharSequence getHeadline()
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

    public com.google.android.gms.ads.formats.NativeAd.Image getIcon()
    {
        return c;
    }

    public List getImages()
    {
        return b;
    }

    public CharSequence getPrice()
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

    public Double getStarRating()
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

    public CharSequence getStore()
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

    protected Object zzaH()
    {
        return a();
    }
}
