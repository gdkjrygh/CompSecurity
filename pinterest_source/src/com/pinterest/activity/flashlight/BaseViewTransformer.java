// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.view.View;

// Referenced classes of package com.pinterest.activity.flashlight:
//            ViewTransformer, BottomSheetLayout

public abstract class BaseViewTransformer
    implements ViewTransformer
{

    public static final float MAX_DIM_ALPHA = 0.7F;

    public BaseViewTransformer()
    {
    }

    public float getDimAlpha(float f, float f1, float f2, BottomSheetLayout bottomsheetlayout, View view)
    {
        return (f / f1) * 0.7F;
    }
}
