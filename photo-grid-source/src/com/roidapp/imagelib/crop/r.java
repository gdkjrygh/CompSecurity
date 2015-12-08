// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;


// Referenced classes of package com.roidapp.imagelib.crop:
//            ImageViewTouchBase, t

final class r
    implements Runnable
{

    final t a;
    final boolean b;
    final ImageViewTouchBase c;

    r(ImageViewTouchBase imageviewtouchbase, t t, boolean flag)
    {
        c = imageviewtouchbase;
        a = t;
        b = flag;
        super();
    }

    public final void run()
    {
        c.a(a, b);
    }
}
