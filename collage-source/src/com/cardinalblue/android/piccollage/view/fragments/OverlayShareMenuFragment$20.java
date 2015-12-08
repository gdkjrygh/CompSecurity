// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.controller.e;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements i
{

    final OverlayShareMenuFragment a;

    public Intent a(j j1)
        throws Exception
    {
        return e.a(null, (File)j1.e()).putExtra("android.intent.extra.SUBJECT", OverlayShareMenuFragment.d(a));
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
