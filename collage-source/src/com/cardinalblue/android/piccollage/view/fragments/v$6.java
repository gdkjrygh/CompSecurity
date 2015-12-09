// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            v

class a
    implements Callable
{

    final v a;

    public CBCollagesResponse a()
        throws Exception
    {
        return f.j();
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    esResponse(v v1)
    {
        a = v1;
        super();
    }
}
