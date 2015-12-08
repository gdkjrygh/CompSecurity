// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.ProgressDialog;
import bolts.h;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class b
    implements i
{

    final ProgressDialog a;
    final h b;
    final OverlayShareMenuFragment c;

    public Void a(j j1)
        throws Exception
    {
        a.show();
        if (!k.b(c.getActivity()))
        {
            throw new IllegalStateException("no internet");
        } else
        {
            b.a(j1.e());
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (OverlayShareMenuFragment overlaysharemenufragment, ProgressDialog progressdialog, h h1)
    {
        c = overlaysharemenufragment;
        a = progressdialog;
        b = h1;
        super();
    }
}
