// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

// Referenced classes of package com.roidapp.photogrid.release:
//            cs

final class cw
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final cs a;

    cw(cs cs1)
    {
        a = cs1;
        super();
    }

    public final void onGlobalLayout()
    {
        cs.b(a);
        cs.c(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
