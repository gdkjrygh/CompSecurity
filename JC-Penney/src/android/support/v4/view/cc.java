// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.view.View;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.view:
//            bk

class cc
{

    private static Field a;
    private static boolean b;

    static int a(View view)
    {
        if (!b)
        {
            int i;
            try
            {
                a = android/view/View.getDeclaredField("mMinHeight");
                a.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception) { }
            b = true;
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        i = ((Integer)a.get(view)).intValue();
        return i;
        view;
        return 0;
    }

    static void a(View view, ColorStateList colorstatelist)
    {
        if (view instanceof bk)
        {
            ((bk)view).setSupportBackgroundTintList(colorstatelist);
        }
    }

    static void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        if (view instanceof bk)
        {
            ((bk)view).setSupportBackgroundTintMode(mode);
        }
    }

    static boolean b(View view)
    {
        return view.getWindowToken() != null;
    }
}
