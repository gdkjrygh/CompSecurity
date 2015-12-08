// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;

final class cf
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
                Field field = android/view/View.getDeclaredField("mMinHeight");
                a = field;
                field.setAccessible(true);
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
}
