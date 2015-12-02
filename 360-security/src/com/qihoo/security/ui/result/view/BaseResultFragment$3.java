// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.view.ViewTreeObserver;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            BaseResultFragment, ResultScrollView

class a
    implements android.view.obalLayoutListener
{

    final BaseResultFragment a;

    public void onGlobalLayout()
    {
        a.l.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int i = a.l.getHeight();
        if (BaseResultFragment.c(a) != i)
        {
            BaseResultFragment.a(a, i);
            BaseResultFragment.d(a);
        }
    }

    (BaseResultFragment baseresultfragment)
    {
        a = baseresultfragment;
        super();
    }
}
