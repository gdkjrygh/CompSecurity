// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.graphics.Matrix;
import android.os.Handler;
import android.util.Log;
import it.sephiroth.android.library.imagezoom.a.b;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            CropImageView, e

class a
    implements Runnable
{

    final CropImageView a;

    public void run()
    {
label0:
        {
            android.graphics.drawable.Drawable drawable = a.getDrawable();
            if (drawable != null && ((b)drawable).a() != null && CropImageView.a(a) != null)
            {
                if (!CropImageView.a(a).e())
                {
                    break label0;
                }
                a.a.post(this);
            }
            return;
        }
        Log.d("ImageViewTouchBase", "onLayoutRunnable.. running");
        CropImageView.a(a).f().set(a.getImageMatrix());
        CropImageView.a(a).d();
    }

    (CropImageView cropimageview)
    {
        a = cropimageview;
        super();
    }
}
