// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.HorizontalScrollView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector

final class jo
    implements Runnable
{

    final ImageSelector a;

    jo(ImageSelector imageselector)
    {
        a = imageselector;
        super();
    }

    public final void run()
    {
        ImageSelector.G(a).fullScroll(66);
    }
}
