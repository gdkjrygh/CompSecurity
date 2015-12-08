// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.support.v4.app.FragmentActivity;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.model.k;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements i
{

    final OverlayShareMenuFragment a;

    public File a(j j1)
        throws Exception
    {
        return k.a((File)j1.e(), a.getActivity().getApplicationContext());
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
