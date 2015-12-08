// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

// Referenced classes of package com.roidapp.photogrid.release:
//            ez

final class fa
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ez a;

    fa(ez ez1)
    {
        a = ez1;
        super();
    }

    public final void onGlobalLayout()
    {
        a.a();
        ez.a(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
