// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.widget.TextView;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.f;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements i
{

    final OverlayShareMenuFragment a;

    public Void a(j j1)
        throws Exception
    {
        if (j1.d())
        {
            f.a(j1.f());
            OverlayShareMenuFragment.b(a).setText(0x7f07024c);
        } else
        {
            OverlayShareMenuFragment.c(a);
            a.startActivityForResult((Intent)j1.e(), 117);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (OverlayShareMenuFragment overlaysharemenufragment)
    {
        a = overlaysharemenufragment;
        super();
    }
}
