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
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.h;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class b
    implements i
{

    final String a;
    final PointF b;
    final PhotoProtoActivity c;

    public Void a(j j1)
        throws Exception
    {
        Exception exception = j1.f();
        if (exception == null)
        {
            try
            {
                j1 = h.a(c, (Bitmap)j1.e(), com.cardinalblue.android.piccollage.view.ty._cls19.c);
                j1.b(a);
                j1.b(true);
                j1.a(false);
                PhotoProtoActivity.e(c).i(j1);
                if (b != null)
                {
                    j1.d(b.x, b.y);
                }
                PhotoProtoActivity.a(c, j1);
            }
            // Misplaced declaration of an exception variable
            catch (j j1)
            {
                f.a(j1);
            }
        } else
        {
            f.a(exception);
            k.a(c, 0x7f0701e0, 0);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PhotoProtoActivity photoprotoactivity, String s, PointF pointf)
    {
        c = photoprotoactivity;
        a = s;
        b = pointf;
        super();
    }
}
