// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fedorvlasov.lazylist;

import android.app.Activity;
import android.widget.ImageView;

// Referenced classes of package com.fedorvlasov.lazylist:
//            ImageLoader, MemoryCache

class photoToLoad
    implements Runnable
{

    mageView photoToLoad;
    final ImageLoader this$0;

    public void run()
    {
        if (!imageViewReused(photoToLoad))
        {
            Object obj = ImageLoader.access$000(ImageLoader.this, photoToLoad.rl);
            memoryCache.put(photoToLoad.rl, ((android.graphics.Bitmap) (obj)));
            if (!imageViewReused(photoToLoad))
            {
                obj = new er(ImageLoader.this, ((android.graphics.Bitmap) (obj)), photoToLoad);
                ((Activity)photoToLoad.mageView.getContext()).runOnUiThread(((Runnable) (obj)));
                return;
            }
        }
    }

    er(er er)
    {
        this$0 = ImageLoader.this;
        super();
        photoToLoad = er;
    }
}
