// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package com.soundcloud.android.utils:
//            ViewHelper

class val.dimension extends ViewOutlineProvider
{

    final ViewHelper this$0;
    final int val$dimension;

    public void getOutline(View view, Outline outline)
    {
        outline.setOval(0, 0, val$dimension, val$dimension);
    }

    ()
    {
        this$0 = final_viewhelper;
        val$dimension = I.this;
        super();
    }
}
