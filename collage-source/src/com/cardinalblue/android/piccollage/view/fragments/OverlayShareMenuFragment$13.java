// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.ProgressDialog;
import android.widget.TextView;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.FinishCollageEvent;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements i
{

    final ProgressDialog a;
    final OverlayShareMenuFragment b;

    public Void a(j j1)
        throws Exception
    {
        k.a(b.getActivity(), a);
        if (j1.d())
        {
            j1 = j1.f();
            com.cardinalblue.android.piccollage.a.b.aF("error");
            com.cardinalblue.android.piccollage.a.b.aG(j1.getMessage());
            f.a(j1);
            com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.b(b).setText(0x7f070265);
            throw j1;
        } else
        {
            d.a().c(new FinishCollageEvent());
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (OverlayShareMenuFragment overlaysharemenufragment, ProgressDialog progressdialog)
    {
        b = overlaysharemenufragment;
        a = progressdialog;
        super();
    }
}
