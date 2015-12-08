// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.disc;

import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.nostra13.universalimageloader.cache.disc:
//            LimitedDiscCache

class this._cls0
    implements Runnable
{

    final LimitedDiscCache this$0;

    public void run()
    {
        int j = 0;
        File afile[] = cacheDir.listFiles();
        if (afile != null)
        {
            int k = afile.length;
            for (int i = 0; i < k; i++)
            {
                File file = afile[i];
                j += getSize(file);
                LimitedDiscCache.access$000(LimitedDiscCache.this).put(file, Long.valueOf(file.lastModified()));
            }

            LimitedDiscCache.access$100(LimitedDiscCache.this).set(j);
        }
    }

    ()
    {
        this$0 = LimitedDiscCache.this;
        super();
    }
}
