// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import bolts.h;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.e;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.model.CBCollageStructResponse;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements i
{

    final h a;
    final OverlayShareMenuFragment b;

    public Intent a(j j1)
        throws Exception
    {
        j1 = (CBCollageStructResponse)j1.e();
        Object obj;
        int l;
        if (k.r())
        {
            l = Math.min(k.c() * 2, 2048);
        } else
        {
            l = 1024;
        }
        obj = com.cardinalblue.android.piccollage.lib.ragment(com.cardinalblue.android.piccollage.lib.ragment(((File)a.a()).getAbsolutePath())).a(l);
        obj = f.a(b.getActivity(), j1.a().getUpdateUrl(), com.cardinalblue.android.b.a.a(((android.graphics.Bitmap) (obj))), com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.e(b).j().getBytes(), OverlayShareMenuFragment.d(b));
        if (obj == null || !((CBCollageStructResponse) (obj)).b())
        {
            throw new com.cardinalblue.android.piccollage.controller.network.vity((new StringBuilder()).append("Cannot update collage: ").append(j1.a().getUrl()).toString());
        } else
        {
            return e.a(null, (File)a.a()).putExtra("android.intent.extra.TEXT", j1.a().getUrl()).putExtra("android.intent.extra.SUBJECT", OverlayShareMenuFragment.d(b));
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (OverlayShareMenuFragment overlaysharemenufragment, h h1)
    {
        b = overlaysharemenufragment;
        a = h1;
        super();
    }
}
