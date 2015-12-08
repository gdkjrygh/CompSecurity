// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.ProgressDialog;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.auth.a.c;
import com.cardinalblue.android.piccollage.auth.a.e;
import com.cardinalblue.android.piccollage.auth.a.f;
import com.cardinalblue.android.piccollage.controller.d;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class b
    implements i
{

    final com.cardinalblue.android.piccollage.auth.a.b a;
    final ProgressDialog b;
    final OverlayShareMenuFragment c;

    public Void a(j j)
        throws Exception
    {
        com.cardinalblue.android.piccollage.a.b.aF("succeeded");
        d.a().c(new com.cardinalblue.android.piccollage.controller.t>(com.cardinalblue.android.piccollage.controller.t>));
        if (k.a(c.getActivity()))
        {
            if (a instanceof com.cardinalblue.android.piccollage.auth.a.d)
            {
                com.cardinalblue.android.piccollage.a.b.av();
                com.cardinalblue.android.piccollage.a.b.aC("cb");
            }
            if (a instanceof c)
            {
                com.cardinalblue.android.piccollage.a.b.bT();
                com.cardinalblue.android.piccollage.a.b.aC("facebook");
            }
            if (a instanceof f)
            {
                com.cardinalblue.android.piccollage.a.b.bU();
                com.cardinalblue.android.piccollage.a.b.aC("twitter");
            }
            if (a instanceof e)
            {
                com.cardinalblue.android.piccollage.a.b.bV();
                com.cardinalblue.android.piccollage.a.b.aC("thumblr");
            }
            k.a(c.getActivity(), b);
            k.a(com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.j(c));
            j = c;
            int l;
            if (OverlayShareMenuFragment.h(c))
            {
                l = 0x7f070266;
            } else
            {
                l = 0x7f070264;
            }
            OverlayShareMenuFragment.a(j, l);
            OverlayShareMenuFragment.g(c);
        }
        return null;
    }

    public Object then(j j)
        throws Exception
    {
        return a(j);
    }

    (OverlayShareMenuFragment overlaysharemenufragment, com.cardinalblue.android.piccollage.auth.a.b b1, ProgressDialog progressdialog)
    {
        c = overlaysharemenufragment;
        a = b1;
        b = progressdialog;
        super();
    }
}
