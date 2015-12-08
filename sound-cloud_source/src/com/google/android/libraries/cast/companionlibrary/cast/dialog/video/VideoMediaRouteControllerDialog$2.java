// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.dialog.video;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.dialog.video:
//            VideoMediaRouteControllerDialog

class this._cls0 extends FetchBitmapTask
{

    final VideoMediaRouteControllerDialog this$0;

    protected void onPostExecute(Bitmap bitmap)
    {
        VideoMediaRouteControllerDialog.access$300(VideoMediaRouteControllerDialog.this).setImageBitmap(bitmap);
        if (this == VideoMediaRouteControllerDialog.access$400(VideoMediaRouteControllerDialog.this))
        {
            VideoMediaRouteControllerDialog.access$402(VideoMediaRouteControllerDialog.this, null);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    ()
    {
        this$0 = VideoMediaRouteControllerDialog.this;
        super();
    }
}
