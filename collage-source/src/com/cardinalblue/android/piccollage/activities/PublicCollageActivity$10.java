// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.text.TextUtils;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PublicCollageActivity

class a
    implements Callable
{

    final String a;
    final PublicCollageActivity b;

    public CBCollagesResponse a()
        throws Exception
    {
        PublicCollageActivity.k(b).set(true);
        if (TextUtils.isEmpty(a))
        {
            return PublicCollageActivity.l(b).a();
        } else
        {
            return f.i(a);
        }
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    ccessor(PublicCollageActivity publiccollageactivity, String s)
    {
        b = publiccollageactivity;
        a = s;
        super();
    }
}
