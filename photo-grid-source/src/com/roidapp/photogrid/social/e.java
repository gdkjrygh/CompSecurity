// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.social;

import com.facebook.GraphResponse;

// Referenced classes of package com.roidapp.photogrid.social:
//            d

final class e
    implements com.facebook.GraphRequest.Callback
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void onCompleted(GraphResponse graphresponse)
    {
        d.a(a, graphresponse);
    }
}
