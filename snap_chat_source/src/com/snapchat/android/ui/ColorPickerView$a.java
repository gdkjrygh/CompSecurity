// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.snapchat.android.ui:
//            ColorPickerView

final class c extends Animation
{

    private final int a;
    private final int b;
    private final View c;

    protected final void applyTransformation(float f, Transformation transformation)
    {
        transformation = c.getLayoutParams();
        if (transformation == null)
        {
            return;
        } else
        {
            transformation.width = (int)((float)a + (float)b * f);
            c.setLayoutParams(transformation);
            return;
        }
    }

    public final boolean willChangeBounds()
    {
        return true;
    }

    public (int i, int j, View view)
    {
        a = i;
        b = j - i;
        c = view;
    }
}
