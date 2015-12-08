// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.volley.toolbox:
//            ImageLoader

final class f
    implements com.mopub.volley.Response.ErrorListener
{

    final String a;
    final ImageLoader b;

    f(ImageLoader imageloader, String s)
    {
        b = imageloader;
        a = s;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        b.a(a, volleyerror);
    }
}
