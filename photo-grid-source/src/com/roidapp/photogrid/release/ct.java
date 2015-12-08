// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.HorizontalScrollView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ih, cs

final class ct
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final cs a;

    ct(cs cs1)
    {
        a = cs1;
        super();
    }

    public final void onGlobalLayout()
    {
        if (ih.C().d() > 0)
        {
            cs.a(a).scrollTo(ih.C().d(), 0);
        }
    }
}
