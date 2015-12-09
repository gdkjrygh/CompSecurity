// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.graphics.Bitmap;
import android.graphics.PointF;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeData;
import com.cardinalblue.android.piccollage.view.o;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class c
    implements i
{

    final CBYoutubeData a;
    final String b;
    final PointF c;
    final PhotoProtoActivity d;

    public Void a(j j1)
        throws Exception
    {
        Exception exception = j1.f();
        if (exception == null)
        {
            j1 = o.c((Bitmap)j1.e());
            j1.a(a);
            j1.c(b);
            PhotoProtoActivity.e(d).i(j1);
            if (c != null)
            {
                j1.d(c.x, c.y);
            }
            PhotoProtoActivity.a(d, j1);
        } else
        {
            f.a(exception);
            k.a(d, 0x7f0701e0, 0);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PhotoProtoActivity photoprotoactivity, CBYoutubeData cbyoutubedata, String s, PointF pointf)
    {
        d = photoprotoactivity;
        a = cbyoutubedata;
        b = s;
        c = pointf;
        super();
    }
}
