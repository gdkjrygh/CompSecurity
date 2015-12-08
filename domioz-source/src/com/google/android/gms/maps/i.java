// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.b.b;
import com.google.android.gms.b.m;
import com.google.android.gms.b.n;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.internal.ak;
import com.google.android.gms.maps.internal.ct;
import com.google.android.gms.maps.model.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            g, d, e

final class i extends b
{

    protected n a;
    private final Fragment b;
    private Activity c;
    private final List d = new ArrayList();

    i(Fragment fragment)
    {
        b = fragment;
    }

    static void a(i j, Activity activity)
    {
        j.c = activity;
        j.g();
    }

    protected final void a(n n1)
    {
        a = n1;
        g();
    }

    public final void a(com.google.android.gms.maps.e e1)
    {
        if (a() != null)
        {
            ((g)a()).a(e1);
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
            break MISSING_BLOCK_LABEL_132;
        }
        try
        {
            com.google.android.gms.maps.d.a(c);
            com.google.android.gms.maps.internal.j j = ct.a(c).b(m.a(c));
            a.a(new g(b, j));
            com.google.android.gms.maps.e e1;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); ((g)a()).a(e1))
            {
                e1 = (com.google.android.gms.maps.e)iterator.next();
            }

        }
        catch (RemoteException remoteexception)
        {
            throw new e(remoteexception);
        }
        catch (c c1)
        {
            return;
        }
        d.clear();
    }
}
