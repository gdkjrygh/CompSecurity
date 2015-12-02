// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            BoostResultFragment

class a
    implements android.view.balLayoutListener
{

    final BoostResultFragment a;

    public void onGlobalLayout()
    {
        BoostResultFragment.a(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        BoostResultFragment.b(a).tyMessage(100);
        a.o();
    }

    (BoostResultFragment boostresultfragment)
    {
        a = boostresultfragment;
        super();
    }
}
