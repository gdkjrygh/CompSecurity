// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fedorvlasov.lazylist;

import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package com.fedorvlasov.lazylist:
//            ImageLoader

class photoToLoad
    implements Runnable
{

    Bitmap bitmap;
    eView photoToLoad;
    final ImageLoader this$0;

    public void run()
    {
        while (imageViewReused(photoToLoad) || bitmap == null) 
        {
            return;
        }
        photoToLoad.eView.setImageBitmap(bitmap);
        photoToLoad.eView.setVisibility(0);
    }

    public (Bitmap bitmap1,  )
    {
        this$0 = ImageLoader.this;
        super();
        bitmap = bitmap1;
        photoToLoad = ;
    }
}
