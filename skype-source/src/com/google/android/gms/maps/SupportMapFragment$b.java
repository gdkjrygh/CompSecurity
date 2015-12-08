// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.b.b;
import com.google.android.gms.b.d;
import com.google.android.gms.b.e;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.a.ak;
import com.google.android.gms.maps.a.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            SupportMapFragment, d, e

static final class b extends b
{

    protected e a;
    private final Fragment b;
    private Activity c;
    private final List d = new ArrayList();

    static void a(b b1, Activity activity)
    {
        b1.c = activity;
        b1.g();
    }

    protected final void a(e e1)
    {
        a = e1;
        g();
    }

    public final void a(com.google.android.gms.maps.e e1)
    {
        if (a() != null)
        {
            ((a)a()).a(e1);
            return;
        } else
        {
            d.add(e1);
            return;
        }
    }

    public final void g()
    {
        if (c == null || a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        com.google.android.gms.maps.a.d d1;
        com.google.android.gms.maps.d.a(c);
        d1 = ak.a(c).b(com.google.android.gms.b.d.a(c));
        if (d1 == null)
        {
            return;
        }
        RemoteException remoteexception;
        a.a(new <init>(b, d1));
        com.google.android.gms.maps.e e1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((d)a()).a(e1))
        {
            e1 = (com.google.android.gms.maps.e)iterator.next();
        }

        try
        {
            d.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            throw new com.google.android.gms.maps.model.c(remoteexception);
        }
        catch (c c1) { }
    }

    (Fragment fragment)
    {
        b = fragment;
    }
}
