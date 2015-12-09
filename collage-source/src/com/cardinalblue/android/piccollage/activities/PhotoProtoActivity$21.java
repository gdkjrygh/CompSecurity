// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.cardinalblue.android.piccollage.controller.d;
import com.squareup.a.b;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements Callable
{

    final PhotoProtoActivity a;

    public Object call()
        throws Exception
    {
        d.a().c(new com.cardinalblue.android.piccollage.controller.teTapAnywhereEvent(false));
        return null;
    }

    teTapAnywhereEvent(PhotoProtoActivity photoprotoactivity)
    {
        a = photoprotoactivity;
        super();
    }
}
