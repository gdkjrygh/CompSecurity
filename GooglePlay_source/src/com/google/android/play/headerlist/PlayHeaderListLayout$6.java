// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListLayout

final class this._cls0 extends TransitionDrawable
{

    final PlayHeaderListLayout this$0;

    public final void getOutline(Outline outline)
    {
        outline.setRect(getBounds());
        outline.setAlpha(1.0F);
    }

    (Drawable adrawable[])
    {
        this$0 = PlayHeaderListLayout.this;
        super(adrawable);
    }
}
