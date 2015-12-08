// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

final class o
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
        Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", popupwindow);
        return;
    }

    static boolean a(PopupWindow popupwindow)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        boolean flag = ((Boolean)a.get(popupwindow)).booleanValue();
        return flag;
        popupwindow;
        Log.i("PopupWindowCompatApi21", "Could not get overlap anchor field in PopupWindow", popupwindow);
        return false;
    }

    static 
    {
        try
        {
            Field field = android/widget/PopupWindow.getDeclaredField("mOverlapAnchor");
            a = field;
            field.setAccessible(true);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", nosuchfieldexception);
        }
    }
}
