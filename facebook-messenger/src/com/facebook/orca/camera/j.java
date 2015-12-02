// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.graphics.Bitmap;

// Referenced classes of package com.facebook.orca.camera:
//            CropImage, CropImageView

class j
    implements Runnable
{

    final Bitmap a;
    final CropImage b;

    j(CropImage cropimage, Bitmap bitmap)
    {
        b = cropimage;
        a = bitmap;
        super();
    }

    public void run()
    {
        CropImage.d(b).a();
        a.recycle();
    }
}
