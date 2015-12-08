// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.helpers;

import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.helpers:
//            PICAppRoutesService

class a
    implements Callable
{

    final String a;
    final PICAppRoutesService b;

    public PicUser a()
        throws Exception
    {
        return f.u(f.t(a));
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (PICAppRoutesService picapproutesservice, String s)
    {
        b = picapproutesservice;
        a = s;
        super();
    }
}
