// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.m4b.maps.da.a;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.da.e;
import com.google.android.m4b.maps.df.o;
import com.google.android.m4b.maps.df.s;
import com.google.android.m4b.maps.df.x;
import com.google.android.m4b.maps.g.f;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps:
//            j, e, f

static final class d extends a
{

    private final Fragment d;
    private e e;
    private Activity f;
    private final List g = new ArrayList();

    static void a( , Activity activity)
    {
        .f = activity;
        .a();
    }

    public final void a()
    {
        if (f == null || e == null || super.a != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        Object obj;
        com.google.android.m4b.maps.e.a(f);
        obj = o.a(f).b(com.google.android.m4b.maps.da.d.a(f));
        if (obj == null)
        {
            return;
        }
        e.a(new <init>(d, ((x) (obj))));
        obj = g.iterator();
_L1:
        com.google.android.m4b.maps.f f2;
         ;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        f2 = (com.google.android.m4b.maps.f)((Iterator) (obj)).next();
         = (g)super.a;
        try
        {
            .a.a(new _cls1(, f2));
        }
        catch (RemoteException remoteexception)
        {
            try
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            catch (RemoteException remoteexception1)
            {
                throw new RuntimeRemoteException(remoteexception1);
            }
            catch (f f1) { }
            break MISSING_BLOCK_LABEL_164;
        }
          goto _L1
        g.clear();
        return;
    }

    protected final void a(e e1)
    {
        e = e1;
        a();
    }

    (Fragment fragment)
    {
        d = fragment;
    }
}
