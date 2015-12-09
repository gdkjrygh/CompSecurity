// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.g;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.c;
import com.cardinalblue.android.piccollage.events.e;
import com.squareup.a.b;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements i
{

    final c a;
    final PhotoProtoActivity b;

    public Void a(j j1)
        throws Exception
    {
        if (j1.d() || j1.c())
        {
            d.a().c(new e(null, a.a, false));
            return null;
        } else
        {
            com.cardinalblue.android.piccollage.a.b.t(g.c(((File)j1.e()).getAbsolutePath()));
            d.a().c(new e((File)j1.e(), a.a, true));
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PhotoProtoActivity photoprotoactivity, c c1)
    {
        b = photoprotoactivity;
        a = c1;
        super();
    }
}
