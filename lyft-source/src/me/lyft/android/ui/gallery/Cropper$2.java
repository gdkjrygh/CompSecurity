// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.gallery;

import android.graphics.Bitmap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.gallery:
//            Cropper

class this._cls0
    implements Action1
{

    final Cropper this$0;

    public void call(Bitmap bitmap)
    {
        Cropper.access$002(Cropper.this, bitmap);
        Cropper.access$100(Cropper.this);
        invalidate();
    }

    public volatile void call(Object obj)
    {
        call((Bitmap)obj);
    }

    ()
    {
        this$0 = Cropper.this;
        super();
    }
}
