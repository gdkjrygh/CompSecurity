// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastControllerFragment, VideoCastController

class val.uri extends FetchBitmapTask
{

    final VideoCastControllerFragment this$0;
    final Uri val$uri;

    protected void onPostExecute(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            VideoCastControllerFragment.access$1502(VideoCastControllerFragment.this, new lAndBitmap(VideoCastControllerFragment.this, null));
            lAndBitmap.access._mth1402(VideoCastControllerFragment.access$1500(VideoCastControllerFragment.this), bitmap);
            lAndBitmap.access._mth1702(VideoCastControllerFragment.access$1500(VideoCastControllerFragment.this), val$uri);
            VideoCastControllerFragment.access$200(VideoCastControllerFragment.this).setImage(bitmap);
        }
        if (this == VideoCastControllerFragment.access$1800(VideoCastControllerFragment.this))
        {
            VideoCastControllerFragment.access$1802(VideoCastControllerFragment.this, null);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    lAndBitmap()
    {
        this$0 = final_videocastcontrollerfragment;
        val$uri = Uri.this;
        super();
    }
}
