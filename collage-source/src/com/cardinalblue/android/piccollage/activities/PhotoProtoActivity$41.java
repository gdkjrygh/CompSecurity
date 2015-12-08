// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.graphics.Point;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.j;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.controller.g;
import com.cardinalblue.android.piccollage.controller.h;
import com.cardinalblue.android.piccollage.controller.t;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class b
    implements Callable
{

    final g a;
    final boolean b;
    final PhotoProtoActivity c;

    public File a()
        throws Exception
    {
        PhotoProtoActivity.c(c);
        if (PhotoProtoActivity.d(c) != null && !PhotoProtoActivity.d(c).d())
        {
            k.a(c, PhotoProtoActivity.d(c).p());
        }
        a[a.k.ordinal()];
        JVM INSTR tableswitch 1 2: default 84
    //                   1 175
    //                   2 266;
           goto _L1 _L2 _L3
_L1:
        if (!b) goto _L5; else goto _L4
_L4:
        Object obj;
        obj = k.c(PhotoProtoActivity.d(c).w(), PhotoProtoActivity.d(c).v());
        obj = com.cardinalblue.android.piccollage.model.k.a(c.a(((Point) (obj)).x, ((Point) (obj)).y), "jpg");
        obj = j.a(c, ((File) (obj)), k.s(), b);
_L10:
        if (obj == null) goto _L7; else goto _L6
_L6:
        File file = ((File) (obj));
        if (((File) (obj)).exists()) goto _L8; else goto _L7
_L7:
        throw new IOException("can't save file when capturing collage");
_L2:
        file = (new h(a.a(PhotoProtoActivity.e(c)).b(PhotoProtoActivity.d(c).w(), PhotoProtoActivity.d(c).v()).a(PhotoProtoActivity.e(c).a()).a(PhotoProtoActivity.e(c).b()).a(com.cardinalblue.android.piccollage.model.k.a("gif")).a(c))).a();
_L8:
        return file;
_L3:
        return (new t(a.a(PhotoProtoActivity.e(c)).b(PhotoProtoActivity.d(c).w(), PhotoProtoActivity.d(c).v()).a(PhotoProtoActivity.e(c).a()).a(PhotoProtoActivity.e(c).b()).a(com.cardinalblue.android.piccollage.model.k.a("mp4")).a(c))).a();
_L5:
        File file1 = com.cardinalblue.android.piccollage.model.k.a(c.a(a.b, a.c), "jpg");
        obj = file1;
        if (a.i)
        {
            obj = j.a(c, file1, true, false);
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    agment.a(PhotoProtoActivity photoprotoactivity, g g1, boolean flag)
    {
        c = photoprotoactivity;
        a = g1;
        b = flag;
        super();
    }
}
