// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;

// Referenced classes of package com.skype.android.widget:
//            PathType

static final class nit> extends PathType
{

    private final int d = 6;
    private final float e = 1.047198F;

    public final PathEffect a(float f)
    {
        return new CornerPathEffect(0.13F * f);
    }

    protected final void a(Path path, RectF rectf)
    {
        float f = rectf.width();
        f = f / 2.0F + (0.13F * f) / 4F;
        float f1 = rectf.centerY();
        float f2 = rectf.centerX();
        int i = 0;
        while (i < 6) 
        {
            float f4 = 1.047198F * (float)i;
            float f3 = f2 + (float)Math.cos(f4) * f;
            f4 = f1 + (float)Math.sin(f4) * f;
            if (i == 0)
            {
                path.moveTo(f3, f4);
            } else
            {
                path.lineTo(f3, f4);
            }
            i++;
        }
    }

    (String s)
    {
        super(s, 1, (byte)0);
    }
}
