// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package com.tinder.base:
//            f

final class lineProvider extends ViewOutlineProvider
{

    final f a;

    public final void getOutline(View view, Outline outline)
    {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
    }

    line(f f1)
    {
        a = f1;
        super();
    }
}
