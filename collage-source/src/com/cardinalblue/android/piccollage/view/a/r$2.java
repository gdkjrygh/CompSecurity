// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import com.cardinalblue.android.b.i;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.PicUsersData;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            r

class a
    implements Callable
{

    final String a[];
    final r b;

    public PicUsersData a()
        throws Exception
    {
        return f.a(r.b(b), 0, i.a(a));
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    PicUsersData(r r1, String as[])
    {
        b = r1;
        a = as;
        super();
    }
}
