// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.util;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import eol;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.util:
//            CollectionContains

final class b extends JsonCallbackReceiver
{

    private eol a;
    private String b;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.er.ErrorCause errorcause)
    {
    }

    protected final void onResolved(Response response, Object obj)
    {
        response = (ntainsResponse)obj;
        a.a(b, response.isInCollection());
    }

    ntainsResponse(Handler handler, Class class1, eol eol1, String s)
    {
        a = eol1;
        b = s;
        super(handler, class1);
    }
}
