// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import com.roidapp.baselib.view.FixedDrawerLayout;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector

final class ka
    implements Runnable
{

    final ImageSelector a;

    ka(ImageSelector imageselector)
    {
        a = imageselector;
        super();
    }

    public final void run()
    {
        if (FixedDrawerLayout.g(ImageSelector.q(a)))
        {
            ImageSelector.r(a).f(ImageSelector.q(a));
        }
    }
}
