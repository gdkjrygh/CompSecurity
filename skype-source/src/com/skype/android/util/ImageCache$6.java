// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.android.util.cache.CompositeBitmapCache;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.util:
//            ImageCache

final class a
    implements Callable
{

    final String a;
    final ImageCache b;

    public final Object call()
        throws Exception
    {
        return ImageCache.b(b).c(a);
    }

    teBitmapCache(ImageCache imagecache, String s)
    {
        b = imagecache;
        a = s;
        super();
    }
}
