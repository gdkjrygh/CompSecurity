// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;

class ViewCompatBase
{

    private static Field a;
    private static boolean b;
    private static Field c;
    private static boolean d;

    static int a(View view)
    {
        if (!b)
        {
            int i;
            try
            {
                a = android/view/View.getDeclaredField("mMinWidth");
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

    static int b(View view)
    {
        if (!d)
        {
            int i;
            try
            {
                c = android/view/View.getDeclaredField("mMinHeight");
                c.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception) { }
            d = true;
        }
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        i = ((Integer)c.get(view)).intValue();
        return i;
        view;
        return 0;
    }
}
