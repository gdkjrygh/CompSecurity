// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.gallery;

import me.lyft.android.logging.L;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.gallery:
//            Cropper

class this._cls0
    implements Action1
{

    final Cropper this$0;

    public volatile void call(Object obj)
    {
        call((Throwable)obj);
    }

    public void call(Throwable throwable)
    {
        L.e(throwable, "failed to load image", new Object[0]);
    }

    ()
    {
        this$0 = Cropper.this;
        super();
    }
}
