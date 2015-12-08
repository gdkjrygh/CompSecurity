// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.util.Property;

// Referenced classes of package com.pinterest.activity.flashlight:
//            BottomSheetLayout

final class  extends Property
{

    public final Float get(BottomSheetLayout bottomsheetlayout)
    {
        return Float.valueOf(BottomSheetLayout.access$000(bottomsheetlayout));
    }

    public final volatile Object get(Object obj)
    {
        return get((BottomSheetLayout)obj);
    }

    public final void set(BottomSheetLayout bottomsheetlayout, Float float1)
    {
        bottomsheetlayout.setSheetTranslation(float1.floatValue());
    }

    public final volatile void set(Object obj, Object obj1)
    {
        set((BottomSheetLayout)obj, (Float)obj1);
    }

    (Class class1, String s)
    {
        super(class1, s);
    }
}
