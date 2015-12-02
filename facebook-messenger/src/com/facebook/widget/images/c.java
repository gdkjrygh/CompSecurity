// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images;


// Referenced classes of package com.facebook.widget.images:
//            ImageViewTouchBase, e

class c
    implements Runnable
{

    final e a;
    final boolean b;
    final ImageViewTouchBase c;

    c(ImageViewTouchBase imageviewtouchbase, e e, boolean flag)
    {
        c = imageviewtouchbase;
        a = e;
        b = flag;
        super();
    }

    public void run()
    {
        c.a(a, b);
    }
}
