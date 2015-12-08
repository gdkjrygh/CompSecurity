// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core;

import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;

// Referenced classes of package com.nostra13.universalimageloader.core:
//            LoadAndDisplayImageTask

class this._cls0
    implements Runnable
{

    final LoadAndDisplayImageTask this$0;

    public void run()
    {
        listener.onLoadingCancelled(uri, imageAware.getWrappedView());
    }

    r()
    {
        this$0 = LoadAndDisplayImageTask.this;
        super();
    }
}
