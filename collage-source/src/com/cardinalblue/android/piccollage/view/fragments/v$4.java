// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.NotificationResponse;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            v

class a
    implements Callable
{

    final v a;

    public NotificationResponse a()
        throws Exception
    {
        return f.d(a.getActivity());
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    tionResponse(v v1)
    {
        a = v1;
        super();
    }
}
