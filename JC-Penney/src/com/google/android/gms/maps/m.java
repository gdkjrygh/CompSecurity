// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.b.b;
import com.google.android.gms.b.n;
import com.google.android.gms.maps.a.aj;
import com.google.android.gms.maps.a.cv;
import com.google.android.gms.maps.model.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            h, k, i

class m extends b
{

    protected n a;
    private final Fragment b;
    private Activity c;
    private final List d = new ArrayList();

    m(Fragment fragment)
    {
        b = fragment;
    }

    private void a(Activity activity)
    {
        c = activity;
        g();
    }

    static void a(m m1, Activity activity)
    {
        m1.a(activity);
    }

    protected void a(n n1)
    {
        a = n1;
        g();
    }

    public void g()
    {
        if (c == null || a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        com.google.android.gms.maps.a.j j;
        h.a(c);
        j = cv.a(c).b(com.google.android.gms.b.m.a(c));
        if (j == null)
        {
            return;
        }
        RemoteException remoteexception;
        a.a(new k(b, j));
        i l;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((k)a()).a(l))
        {
            l = (i)iterator.next();
        }

        try
        {
            d.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
        catch (com.google.android.gms.common.b b1) { }
    }
}
