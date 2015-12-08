// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.graphics.BitmapFactory;
import android.net.Uri;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.lib.i;
import com.cardinalblue.android.piccollage.model.k;
import com.cardinalblue.android.piccollage.view.g;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements Callable
{

    final g a;
    final PhotoProtoActivity b;

    public Uri a()
        throws Exception
    {
        if (!a.h())
        {
            PhotoProtoActivity.e(b).h(a);
        }
        Object obj = com.cardinalblue.android.piccollage.lib.ity._cls14.a(a.i());
        if (obj == com.cardinalblue.android.piccollage.lib.ity._cls14.a || obj == com.cardinalblue.android.piccollage.lib.ity._cls14.a)
        {
            obj = i.a(b).a(a.i());
            if (obj != null)
            {
                return Uri.fromFile(k.a(BitmapFactory.decodeByteArray(((com.android.volley.Array) (obj)).Array, 0, ((com.android.volley.Array) (obj)).Array.length), "png"));
            } else
            {
                return Uri.fromFile(a.k());
            }
        }
        obj = a.i();
        if (com.cardinalblue.android.piccollage.lib.ity._cls14.a(((String) (obj))) == com.cardinalblue.android.piccollage.lib.ity._cls14.a)
        {
            return Uri.parse(f.c(((String) (obj)), -1));
        } else
        {
            return Uri.parse(((String) (obj)));
        }
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (PhotoProtoActivity photoprotoactivity, g g1)
    {
        b = photoprotoactivity;
        a = g1;
        super();
    }
}
