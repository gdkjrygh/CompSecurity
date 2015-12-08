// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;


// Referenced classes of package com.mopub.volley.toolbox:
//            i

final class j
    implements Runnable
{

    final ImageLoader.ImageContainer a;
    final i b;

    j(i k, ImageLoader.ImageContainer imagecontainer)
    {
        b = k;
        a = imagecontainer;
        super();
    }

    public final void run()
    {
        b.onResponse(a, false);
    }
}
