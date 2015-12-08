// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.res.Resources;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package com.tinder.views:
//            RecCard

class vider extends ViewOutlineProvider
{

    final RecCard this$0;

    public void getOutline(View view, Outline outline)
    {
        outline.setRoundRect(0, 0, RecCard.access$800(RecCard.this), RecCard.access$900(RecCard.this), getResources().getDimension(0x7f09017d));
        outline.setAlpha(0.55F);
    }

    es()
    {
        this$0 = RecCard.this;
        super();
    }
}
