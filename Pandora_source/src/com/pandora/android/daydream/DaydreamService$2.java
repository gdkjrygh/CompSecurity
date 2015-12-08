// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.pandora.android.daydream:
//            DaydreamService, b

class a
    implements android.view.nGlobalLayoutListener
{

    final View a;
    final DaydreamService b;

    public void onGlobalLayout()
    {
        a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        b.b.a(null, false);
    }

    tener(DaydreamService daydreamservice, View view)
    {
        b = daydreamservice;
        a = view;
        super();
    }
}
