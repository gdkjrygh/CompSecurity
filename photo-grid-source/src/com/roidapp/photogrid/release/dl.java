// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk

final class dl
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    boolean a;
    final View b;
    final dk c;

    dl(dk dk1, View view)
    {
        c = dk1;
        b = view;
        super();
        a = true;
    }

    public final void onGlobalLayout()
    {
        b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (a)
        {
            a = false;
            c.c();
        }
    }
}
