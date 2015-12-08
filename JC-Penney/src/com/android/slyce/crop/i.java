// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.view.MotionEvent;

// Referenced classes of package com.android.slyce.crop:
//            CropImageActivity, CropImageView

class i
    implements Runnable
{

    final MotionEvent a;
    final CropImageActivity b;

    i(CropImageActivity cropimageactivity, MotionEvent motionevent)
    {
        b = cropimageactivity;
        a = motionevent;
        super();
    }

    public void run()
    {
        CropImageActivity.c(b).dispatchTouchEvent(a);
    }
}
