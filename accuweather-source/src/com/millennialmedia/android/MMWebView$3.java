// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;

// Referenced classes of package com.millennialmedia.android:
//            MMWebView, MMAdImpl, MMLog

class val.adImpl
    implements Callable
{

    final MMWebView this$0;
    final MMAdImpl val$adImpl;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
    {
        Bitmap bitmap;
        buildDrawingCache();
        bitmap = getDrawingCache();
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        bitmap = Bitmap.createBitmap(bitmap);
        val$adImpl.prepareTransition(bitmap);
        destroyDrawingCache();
_L2:
        return null;
        Exception exception;
        exception;
        MMLog.e("MMWebView", "Animation exception: ", exception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    ()
    {
        this$0 = final_mmwebview;
        val$adImpl = MMAdImpl.this;
        super();
    }
}
