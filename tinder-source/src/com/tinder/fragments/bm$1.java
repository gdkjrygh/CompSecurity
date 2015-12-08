// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package com.tinder.fragments:
//            bm

final class ovider extends ViewOutlineProvider
{

    final bm a;

    public final void getOutline(View view, Outline outline)
    {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
    }

    ovider(bm bm1)
    {
        a = bm1;
        super();
    }
}
