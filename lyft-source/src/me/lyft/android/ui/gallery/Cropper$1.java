// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.gallery;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package me.lyft.android.ui.gallery:
//            Cropper

class this._cls0
    implements android.view.chListener
{

    final Cropper this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return interceptTouch(view, motionevent);
    }

    ()
    {
        this$0 = Cropper.this;
        super();
    }
}
