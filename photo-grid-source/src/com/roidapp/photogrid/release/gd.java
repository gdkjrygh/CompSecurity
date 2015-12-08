// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.ViewTreeObserver;
import android.widget.EditText;

// Referenced classes of package com.roidapp.photogrid.release:
//            ga

final class gd
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final ga a;

    gd(ga ga1)
    {
        a = ga1;
        super();
    }

    public final boolean onPreDraw()
    {
        if (ga.a(a) != null && ga.f(a) != null)
        {
            ga.g(a);
            ga.a(a).getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return false;
    }
}
