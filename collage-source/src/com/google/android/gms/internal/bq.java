// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            bp, bk, bj

public class bq extends NativeContentAd
{

    private final bp a;
    private final List b;
    private final bk c;

    public bq(bp bp1)
    {
        b = new ArrayList();
        a = bp1;
        bp1 = a.getImages().iterator();
_L2:
        bj bj;
        do
        {
            if (!bp1.hasNext())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            bj = a(bp1.next());
        } while (bj == null);
        b.add(new bk(bj));
        if (true) goto _L2; else goto _L1
_L1:
        bp1;
        zzb.zzb("Failed to get image.", bp1);
        bp1 = a.zzdw();
        if (bp1 == null) goto _L4; else goto _L3
_L3:
        bp1 = new bk(bp1);
_L6:
        c = bp1;
        return;
        bp1;
        zzb.zzb("Failed to get icon.", bp1);
_L4:
        bp1 = null;
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

    public CharSequence getAdvertiser()
    {
        String s;
        try
        {
            s = a.getAdvertiser();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get attribution.", remoteexception);
            return null;
        }
        return s;
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
            zzb.zzd("Failed to get extras", remoteexception);
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

    public List getImages()
    {
        return b;
    }

    public com.google.android.gms.ads.formats.NativeAd.Image getLogo()
    {
        return c;
    }

    protected Object zzaH()
    {
        return a();
    }
}
