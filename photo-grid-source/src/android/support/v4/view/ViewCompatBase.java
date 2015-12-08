// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.view.View;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.view:
//            TintableBackgroundView

class ViewCompatBase
{

    private static final String TAG = "ViewCompatBase";
    private static Field sMinHeightField;
    private static boolean sMinHeightFieldFetched;
    private static Field sMinWidthField;
    private static boolean sMinWidthFieldFetched;

    ViewCompatBase()
    {
    }

    static ColorStateList getBackgroundTintList(View view)
    {
        if (view instanceof TintableBackgroundView)
        {
            return ((TintableBackgroundView)view).getSupportBackgroundTintList();
        } else
        {
            return null;
        }
    }

    static android.graphics.PorterDuff.Mode getBackgroundTintMode(View view)
    {
        if (view instanceof TintableBackgroundView)
        {
            return ((TintableBackgroundView)view).getSupportBackgroundTintMode();
        } else
        {
            return null;
        }
    }

    static int getMinimumHeight(View view)
    {
        if (!sMinHeightFieldFetched)
        {
            int i;
            try
            {
                Field field = android/view/View.getDeclaredField("mMinHeight");
                sMinHeightField = field;
                field.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception) { }
            sMinHeightFieldFetched = true;
        }
        if (sMinHeightField == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        i = ((Integer)sMinHeightField.get(view)).intValue();
        return i;
        view;
        return 0;
    }

    static int getMinimumWidth(View view)
    {
        if (!sMinWidthFieldFetched)
        {
            int i;
            try
            {
                Field field = android/view/View.getDeclaredField("mMinWidth");
                sMinWidthField = field;
                field.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception) { }
            sMinWidthFieldFetched = true;
        }
        if (sMinWidthField == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        i = ((Integer)sMinWidthField.get(view)).intValue();
        return i;
        view;
        return 0;
    }

    static boolean isAttachedToWindow(View view)
    {
        return view.getWindowToken() != null;
    }

    static boolean isLaidOut(View view)
    {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    static void setBackgroundTintList(View view, ColorStateList colorstatelist)
    {
        if (view instanceof TintableBackgroundView)
        {
            ((TintableBackgroundView)view).setSupportBackgroundTintList(colorstatelist);
        }
    }

    static void setBackgroundTintMode(View view, android.graphics.PorterDuff.Mode mode)
    {
        if (view instanceof TintableBackgroundView)
        {
            ((TintableBackgroundView)view).setSupportBackgroundTintMode(mode);
        }
    }
}
