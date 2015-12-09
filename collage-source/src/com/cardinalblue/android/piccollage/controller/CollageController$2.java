// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import com.squareup.a.b;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController, d

class a
    implements Callable
{

    final CollageController a;

    public Object call()
        throws Exception
    {
        d.a().c(new dateTapAnywhereEvent(false));
        return null;
    }

    dateTapAnywhereEvent(CollageController collagecontroller)
    {
        a = collagecontroller;
        super();
    }
}
