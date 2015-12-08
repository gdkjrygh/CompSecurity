// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            bo, bl

public final class bp extends c
{

    private final bo a;
    private final List b;
    private final bl c;

    public bp(bo bo1)
    {
        b = new ArrayList();
        a = bo1;
        Iterator iterator = a.b().iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        bo1 = ((bo) (iterator.next()));
        if (!(bo1 instanceof IBinder)) goto _L4; else goto _L3
_L3:
        bo1 = bk.a.a((IBinder)bo1);
_L7:
        if (bo1 == null) goto _L6; else goto _L5
_L5:
        b.add(new bl(bo1));
          goto _L6
        bo1;
        com.google.android.gms.ads.internal.util.client.b.a("Failed to get image.", bo1);
_L2:
        bo1 = a.d();
        if (bo1 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        bo1 = new bl(bo1);
_L8:
        c = bo1;
        return;
_L4:
        bo1 = null;
          goto _L7
        bo1;
        com.google.android.gms.ads.internal.util.client.b.a("Failed to get icon.", bo1);
        bo1 = null;
          goto _L8
    }

    private com.google.android.gms.b.c j()
    {
        com.google.android.gms.b.c c1;
        try
        {
            c1 = a.i();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to retrieve native ad engine.", remoteexception);
            return null;
        }
        return c1;
    }

    protected final Object a()
    {
        return j();
    }

    public final CharSequence b()
    {
        String s;
        try
        {
            s = a.a();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get headline.", remoteexception);
            return null;
        }
        return s;
    }

    public final List c()
    {
        return b;
    }

    public final CharSequence d()
    {
        String s;
        try
        {
            s = a.c();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get body.", remoteexception);
            return null;
        }
        return s;
    }

    public final com.google.android.gms.ads.formats.a.a e()
    {
        return c;
    }

    public final CharSequence f()
    {
        String s;
        try
        {
            s = a.e();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get call to action.", remoteexception);
            return null;
        }
        return s;
    }

    public final Double g()
    {
        double d1;
        try
        {
            d1 = a.f();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get star rating.", remoteexception);
            return null;
        }
        if (d1 == -1D)
        {
            return null;
        } else
        {
            return Double.valueOf(d1);
        }
    }

    public final CharSequence h()
    {
        String s;
        try
        {
            s = a.g();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get store", remoteexception);
            return null;
        }
        return s;
    }

    public final CharSequence i()
    {
        String s;
        try
        {
            s = a.h();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get price.", remoteexception);
            return null;
        }
        return s;
    }
}
