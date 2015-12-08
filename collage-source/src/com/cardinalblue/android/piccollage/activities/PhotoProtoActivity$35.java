// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.graphics.Point;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements Callable
{

    final PhotoProtoActivity a;

    public Void a()
        throws Exception
    {
        String s = PhotoProtoActivity.d(a).j();
        Object obj = k.c(PhotoProtoActivity.d(a).w(), PhotoProtoActivity.d(a).v());
        obj = a.a(((Point) (obj)).x, ((Point) (obj)).y);
        f.a(a, a.g(), com.cardinalblue.android.b.a.a(((android.graphics.Bitmap) (obj))), s.toString().getBytes());
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (PhotoProtoActivity photoprotoactivity)
    {
        a = photoprotoactivity;
        super();
    }
}
