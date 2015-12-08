// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import android.graphics.Bitmap;

// Referenced classes of package com.mopub.volley.toolbox:
//            ImageLoader

final class e
    implements com.mopub.volley.Response.Listener
{

    final String a;
    final ImageLoader b;

    e(ImageLoader imageloader, String s)
    {
        b = imageloader;
        a = s;
        super();
    }

    public final void onResponse(Bitmap bitmap)
    {
        b.a(a, bitmap);
    }

    public final volatile void onResponse(Object obj)
    {
        onResponse((Bitmap)obj);
    }
}
