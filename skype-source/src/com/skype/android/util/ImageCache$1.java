// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.content.Context;
import com.skype.android.util.cache.CompositeBitmapCache;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.util:
//            ImageCache

final class a
    implements Callable
{

    final Context a;
    final ImageCache b;

    public final Object call()
        throws Exception
    {
        File file = new File(a.getCacheDir(), "images");
        ImageCache.b(b).a(file, ImageCache.a(b) * 4);
        return ImageCache.b(b);
    }

    teBitmapCache(ImageCache imagecache, Context context)
    {
        b = imagecache;
        a = context;
        super();
    }
}
