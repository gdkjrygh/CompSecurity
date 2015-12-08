// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

final class s
{

    public static int a(Context context, int i)
    {
        TypedValue typedvalue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedvalue, true))
        {
            return typedvalue.resourceId;
        } else
        {
            return 0;
        }
    }

    public static Context a(Context context, boolean flag)
    {
        boolean flag2 = a(context);
        boolean flag1 = flag2;
        Object obj = context;
        if (flag2)
        {
            flag1 = flag2;
            obj = context;
            if (flag)
            {
                obj = new ContextThemeWrapper(context, android.support.v7.mediarouter.R.style.Theme_AppCompat);
                flag1 = false;
            }
        }
        int i;
        if (flag1)
        {
            i = android.support.v7.mediarouter.R.style.Theme_MediaRouter_Light;
        } else
        {
            i = android.support.v7.mediarouter.R.style.Theme_MediaRouter;
        }
        return new ContextThemeWrapper(((Context) (obj)), i);
    }

    private static boolean a(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        return context.getTheme().resolveAttribute(android.support.v7.mediarouter.R.attr.isLightTheme, typedvalue, true) && typedvalue.data != 0;
    }

    public static Drawable b(Context context, int i)
    {
        i = a(context, i);
        if (i != 0)
        {
            return context.getResources().getDrawable(i);
        } else
        {
            return null;
        }
    }
}
