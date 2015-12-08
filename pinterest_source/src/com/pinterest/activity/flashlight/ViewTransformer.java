// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.view.View;

// Referenced classes of package com.pinterest.activity.flashlight:
//            BottomSheetLayout

public interface ViewTransformer
{

    public abstract float getDimAlpha(float f, float f1, float f2, BottomSheetLayout bottomsheetlayout, View view);

    public abstract void transformView(float f, float f1, float f2, BottomSheetLayout bottomsheetlayout, View view);
}
