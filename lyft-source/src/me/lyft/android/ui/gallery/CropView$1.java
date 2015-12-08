// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.gallery;

import android.view.View;

// Referenced classes of package me.lyft.android.ui.gallery:
//            CropView, Cropper

class this._cls0
    implements android.view.kListener
{

    final CropView this$0;

    public void onClick(View view)
    {
        cropperView.savePicture();
    }

    ()
    {
        this$0 = CropView.this;
        super();
    }
}
