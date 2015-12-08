// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.soundcloud.android.image.ImageListener;

// Referenced classes of package com.soundcloud.android.view:
//            FullImageDialog

class val.image
    implements ImageListener
{

    final FullImageDialog this$0;
    final ImageView val$image;
    final ProgressBar val$progress;

    public void onLoadingComplete(String s, View view, Bitmap bitmap)
    {
        val$progress.setVisibility(8);
        val$image.setVisibility(0);
    }

    public void onLoadingFailed(String s, View view, String s1)
    {
        FullImageDialog.access$200(FullImageDialog.this).post(FullImageDialog.access$100(FullImageDialog.this));
    }

    public void onLoadingStarted(String s, View view)
    {
        val$progress.setVisibility(0);
    }

    ()
    {
        this$0 = final_fullimagedialog;
        val$progress = progressbar;
        val$image = ImageView.this;
        super();
    }
}
