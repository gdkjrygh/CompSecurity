// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.view.ViewTreeObserver;
import com.roidapp.photogrid.release.hr;

// Referenced classes of package com.roidapp.photogrid.video:
//            ScrollImageViewEx

final class n
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ScrollImageViewEx a;

    n(ScrollImageViewEx scrollimageviewex)
    {
        a = scrollimageviewex;
        super();
    }

    public final void onGlobalLayout()
    {
        if (ScrollImageViewEx.a(a) != null)
        {
            ScrollImageViewEx.a(a).a();
        }
        if (ScrollImageViewEx.b(a) != 0 && a.a != 0)
        {
            a.a(ScrollImageViewEx.b(a), false);
        } else
        {
            a.c = -a.b;
            a.setX(a.c);
        }
        a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
