// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar

class this._cls0 extends View
{

    final float cx;
    final float cy;
    final NinaBar this$0;

    public void draw(Canvas canvas)
    {
        canvas.scale(1.0F, -1F, cx, cy);
        super.draw(canvas);
    }

    (Context context)
    {
        this$0 = NinaBar.this;
        super(context);
        cx = NinaBar.access$900(NinaBar.this) >> 1;
        cy = NinaBar.access$1000(NinaBar.this) >> 1;
    }
}
