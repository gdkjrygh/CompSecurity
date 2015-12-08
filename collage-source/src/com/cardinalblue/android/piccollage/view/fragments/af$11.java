// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.text.TextUtils;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            af

class a
    implements Callable
{

    final String a;
    final af b;

    public CBCollagesResponse a()
        throws Exception
    {
        af.f(b).set(true);
        com.cardinalblue.android.piccollage.controller.cessorFactory.FeedAccessor feedaccessor = FeedAccessorFactory.a(4, null);
        if (TextUtils.isEmpty(a))
        {
            return feedaccessor.a();
        } else
        {
            return feedaccessor.a(a);
        }
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    Response(af af1, String s)
    {
        b = af1;
        a = s;
        super();
    }
}
