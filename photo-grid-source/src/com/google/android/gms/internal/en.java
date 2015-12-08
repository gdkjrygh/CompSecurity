// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ek, dx, dz

public final class en extends NativeContentAd
{

    private final ek a;
    private final List b;
    private final dz c;

    public en(ek ek1)
    {
        b = new ArrayList();
        a = ek1;
        Iterator iterator = a.getImages().iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ek1 = ((ek) (iterator.next()));
        if (!(ek1 instanceof IBinder)) goto _L4; else goto _L3
_L3:
        ek1 = dx.zzt((IBinder)ek1);
_L7:
        if (ek1 == null) goto _L6; else goto _L5
_L5:
        b.add(new dz(ek1));
          goto _L6
        ek1;
        zzb.zzb("Failed to get image.", ek1);
_L2:
        ek1 = a.zzdA();
        if (ek1 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        ek1 = new dz(ek1);
_L8:
        c = ek1;
        return;
_L4:
        ek1 = null;
          goto _L7
        ek1;
        zzb.zzb("Failed to get icon.", ek1);
        ek1 = null;
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

    public final CharSequence getAdvertiser()
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
            zzb.zzd("Failed to get extras", remoteexception);
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

    public final List getImages()
    {
        return b;
    }

    public final com.google.android.gms.ads.formats.NativeAd.Image getLogo()
    {
        return c;
    }
}
