// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import android.graphics.Bitmap;
import com.android.volley.Request;
import com.android.volley.VolleyError;

// Referenced classes of package com.google.android.play.image:
//            BitmapLoader

final class this._cls1
    implements com.android.volley.
{

    final l.skipImageCache this$1;

    public final volatile void onResponse(Object obj)
    {
        obj = (Bitmap)obj;
        BitmapLoader.access$200(_fld0, finalModifiedUrl, cacheKey, requestWidth, requestHeight, ((Bitmap) (obj)), skipImageCache);
    }

    l.cacheKey()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/play/image/BitmapLoader$1

/* anonymous class */
    final class BitmapLoader._cls1
        implements BitmapLoader.RemoteRequestCreator
    {

        final BitmapLoader this$0;
        final String val$cacheKey;
        final String val$finalModifiedUrl;
        final int val$requestHeight;
        final int val$requestWidth;
        final boolean val$skipImageCache = false;

        public final Request create()
        {
            return BitmapLoader.createImageRequest(finalModifiedUrl, requestWidth, requestHeight, android.graphics.Bitmap.Config.RGB_565, new BitmapLoader._cls1._cls1(), new BitmapLoader._cls1._cls2());
        }

            
            {
                this$0 = final_bitmaploader;
                requestWidth = i;
                requestHeight = j;
                finalModifiedUrl = s;
                cacheKey = s1;
                super();
            }

        // Unreferenced inner class com/google/android/play/image/BitmapLoader$1$2

/* anonymous class */
        final class BitmapLoader._cls1._cls2
            implements com.android.volley.Response.ErrorListener
        {

            final BitmapLoader._cls1 this$1;

            public final void onErrorResponse(VolleyError volleyerror)
            {
                BitmapLoader.access$300(this$0, finalModifiedUrl);
            }

                    
                    {
                        this$1 = BitmapLoader._cls1.this;
                        super();
                    }
        }

    }

}
