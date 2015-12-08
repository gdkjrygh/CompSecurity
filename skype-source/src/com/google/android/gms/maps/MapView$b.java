// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
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
//            MapView, d, e, GoogleMapOptions

static final class d extends b
{

    protected e a;
    private final ViewGroup b;
    private final Context c;
    private final GoogleMapOptions d;
    private final List e = new ArrayList();

    protected final void a(e e1)
    {
        a = e1;
        if (a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        com.google.android.gms.maps.d.a(c);
        e1 = ak.a(c).a(com.google.android.gms.b.d.a(c), d);
        if (e1 == null)
        {
            return;
        }
        a.a(new <init>(b, e1));
        com.google.android.gms.maps.e e2;
        for (e1 = e.iterator(); e1.hasNext(); ((e)a()).a(e2))
        {
            e2 = (com.google.android.gms.maps.e)e1.next();
        }

        try
        {
            e.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw new com.google.android.gms.maps.model.c(e1);
        }
        // Misplaced declaration of an exception variable
        catch (e e1) { }
    }

    public final void a(com.google.android.gms.maps.e e1)
    {
        if (a() != null)
        {
            ((a)a()).a(e1);
            return;
        } else
        {
            e.add(e1);
            return;
        }
    }

    ptions(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        b = viewgroup;
        c = context;
        d = googlemapoptions;
    }
}
