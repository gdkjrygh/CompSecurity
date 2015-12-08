// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;

public final class oiu
{

    public static int a(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        if (!context.getTheme().resolveAttribute(0x101004d, typedvalue, true))
        {
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
        } else
        {
            return (int)typedvalue.getDimension(context.getResources().getDisplayMetrics());
        }
    }

    public static boolean a(View view)
    {
        return view.getWindowToken() != null;
    }

    public static String b(View view)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(view);
        view = view.getParent();
        for (int i = 1; view != null; i++)
        {
            for (int j = 0; j < i; j++)
            {
                stringbuilder.append(' ');
            }

            stringbuilder.append(view);
            stringbuilder.append('\n');
            view = view.getParent();
        }

        return stringbuilder.toString();
    }

    public static void c(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            view.setLayoutDirection(0);
        }
    }

    static 
    {
        new Rect();
        new Rect();
    }
}
