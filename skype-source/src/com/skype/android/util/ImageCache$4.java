// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.util:
//            ImageCache, ImageSource

final class a
    implements Callable
{

    final ImageSource a;
    final int b = 0;
    final ImageCache c;

    public final Object call()
        throws Exception
    {
        byte abyte0[] = a.getImageData();
        if (abyte0 == null || abyte0.length == 0)
        {
            return null;
        } else
        {
            long l = a.getImageTimestamp();
            String s = a.getIdentity();
            return ImageCache.a(c, s, l, abyte0, b);
        }
    }

    (ImageCache imagecache, ImageSource imagesource)
    {
        c = imagecache;
        a = imagesource;
        super();
    }
}
