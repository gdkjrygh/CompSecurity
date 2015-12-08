// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.dynamic.h;
import com.google.android.gms.maps.internal.al;
import com.google.android.gms.maps.internal.p;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            SupportMapFragment, f, g

static class b extends b
{

    protected h a;
    private final Fragment b;
    private Activity c;
    private final List d = new ArrayList();

    private void a(Activity activity)
    {
        c = activity;
        i();
    }

    static void a(i j, Activity activity)
    {
        j.a(activity);
    }

    protected void a(h h1)
    {
        a = h1;
        i();
    }

    public void a(g g1)
    {
        if (a() != null)
        {
            ((a)a()).a(g1);
            return;
        } else
        {
            d.add(g1);
            return;
        }
    }

    public void i()
    {
        if (c == null || a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        try
        {
            f.a(c);
            com.google.android.gms.maps.internal.d d1 = al.a(c).b(f.a(c));
            a.a(new <init>(b, d1));
            g g1;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); ((d)a()).a(g1))
            {
                g1 = (g)iterator.next();
            }

        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            return;
        }
        d.clear();
    }

    otAvailableException(Fragment fragment)
    {
        b = fragment;
    }
}
