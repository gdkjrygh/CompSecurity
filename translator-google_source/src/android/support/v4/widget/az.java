// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Field;

final class az
{

    private static Field a;

    static void a(PopupWindow popupwindow, boolean flag)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        a.set(popupwindow, Boolean.valueOf(flag));
        return;
        popupwindow;
    }

    static 
    {
        try
        {
            Field field = android/widget/PopupWindow.getDeclaredField("mOverlapAnchor");
            a = field;
            field.setAccessible(true);
        }
        catch (NoSuchFieldException nosuchfieldexception) { }
    }
}
