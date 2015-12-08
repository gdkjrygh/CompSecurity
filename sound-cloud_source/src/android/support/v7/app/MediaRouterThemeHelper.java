// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

final class MediaRouterThemeHelper
{

    private MediaRouterThemeHelper()
    {
    }

    public static Context createThemedContext(Context context)
    {
        int i;
        if (isLightTheme(context))
        {
            i = android.support.v7.mediarouter.R.style.Theme_MediaRouter_Light;
        } else
        {
            i = android.support.v7.mediarouter.R.style.Theme_MediaRouter;
        }
        return new ContextThemeWrapper(context, i);
    }

    public static Drawable getThemeDrawable(Context context, int i)
    {
        i = getThemeResource(context, i);
        if (i != 0)
        {
            return context.getResources().getDrawable(i);
        } else
        {
            return null;
        }
    }

    public static int getThemeResource(Context context, int i)
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

    private static boolean isLightTheme(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        return context.getTheme().resolveAttribute(android.support.v7.mediarouter.R.attr.isLightTheme, typedvalue, true) && typedvalue.data != 0;
    }
}
