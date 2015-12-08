// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.widget.TextView;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.FinishCollageEvent;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements i
{

    final OverlayShareMenuFragment a;

    public Object then(j j1)
        throws Exception
    {
        d.a().c(new FinishCollageEvent());
        com.cardinalblue.android.piccollage.a.b.bW();
        if (j1.d() || j1.c())
        {
            f.a(j1.f());
            com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.b(a).setText(0x7f070262);
            throw j1.f();
        } else
        {
            return null;
        }
    }

    (OverlayShareMenuFragment overlaysharemenufragment)
    {
        a = overlaysharemenufragment;
        super();
    }
}
