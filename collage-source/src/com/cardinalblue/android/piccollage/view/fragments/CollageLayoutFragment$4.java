// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.graphics.Bitmap;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeData;
import com.cardinalblue.android.piccollage.view.o;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            CollageLayoutFragment

class b
    implements i
{

    final CBYoutubeData a;
    final String b;
    final CollageLayoutFragment c;

    public Void a(j j1)
        throws Exception
    {
        Exception exception = j1.f();
        if (exception == null)
        {
            j1 = o.c((Bitmap)j1.e());
            j1.a(a);
            j1.c(b);
            CollageLayoutFragment.b(c).a(j1);
        } else
        {
            f.a(exception);
            k.a(c.getActivity(), 0x7f0701e0, 0);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (CollageLayoutFragment collagelayoutfragment, CBYoutubeData cbyoutubedata, String s)
    {
        c = collagelayoutfragment;
        a = cbyoutubedata;
        b = s;
        super();
    }
}
