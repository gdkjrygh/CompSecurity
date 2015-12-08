// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.graphics.Bitmap;

// Referenced classes of package com.soundcloud.android.crop:
//            CropImageActivity

class this._cls0
    implements ecycler
{

    final CropImageActivity this$0;

    public void recycle(Bitmap bitmap)
    {
        bitmap.recycle();
        System.gc();
    }

    ecycler()
    {
        this$0 = CropImageActivity.this;
        super();
    }
}
