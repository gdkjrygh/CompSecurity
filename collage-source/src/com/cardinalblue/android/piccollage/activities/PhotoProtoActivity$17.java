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
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.h;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class c
    implements i
{

    final WebPhoto a;
    final String b;
    final PointF c;
    final PhotoProtoActivity d;

    public Void a(j j1)
        throws Exception
    {
        Object obj = j1.f();
        if (obj == null)
        {
            obj = a.getOriginalImageUrl();
            String s = a.getPageUrl();
            try
            {
                j1 = h.a(d, (Bitmap)j1.e());
                j1.b(((String) (obj)));
                j1.b(true);
                j1.a(b, ((String) (obj)), s);
                PhotoProtoActivity.e(d).i(j1);
                if (c != null)
                {
                    j1.d(c.x, c.y);
                }
                PhotoProtoActivity.a(d, j1);
            }
            // Misplaced declaration of an exception variable
            catch (j j1)
            {
                f.a(j1);
            }
        } else
        {
            f.a(((Throwable) (obj)));
            k.a(d, 0x7f0701e0, 0);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PhotoProtoActivity photoprotoactivity, WebPhoto webphoto, String s, PointF pointf)
    {
        d = photoprotoactivity;
        a = webphoto;
        b = s;
        c = pointf;
        super();
    }
}
