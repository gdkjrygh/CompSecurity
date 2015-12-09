// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import bolts.h;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.controller.f;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.model.CBCollageStructResponse;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements i
{

    final h a;
    final OverlayShareMenuFragment b;

    public CBCollageStructResponse a(j j)
        throws Exception
    {
        j = com.cardinalblue.android.b.a.a(com.cardinalblue.android.piccollage.lib.ragment(com.cardinalblue.android.piccollage.lib.ragment(((File)a.a()).getAbsolutePath())).a(f.b));
        j = com.cardinalblue.android.piccollage.controller.network.f.a(b.getActivity(), j, OverlayShareMenuFragment.d(b));
        if (j == null || !j.b())
        {
            throw new IllegalArgumentException("createResponse is null or response is invalid collage");
        } else
        {
            return j;
        }
    }

    public Object then(j j)
        throws Exception
    {
        return a(j);
    }

    (OverlayShareMenuFragment overlaysharemenufragment, h h1)
    {
        b = overlaysharemenufragment;
        a = h1;
        super();
    }
}
