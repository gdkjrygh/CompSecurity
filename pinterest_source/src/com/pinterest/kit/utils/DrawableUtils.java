// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionbar.ActionBar;

public class DrawableUtils
{

    private static final int ICON_COLOR = 0x7f0e006d;

    public DrawableUtils()
    {
    }

    public static void setTextViewLeftDrawable(TextView textview, int i)
    {
        if (textview == null || i == 0)
        {
            return;
        } else
        {
            Drawable adrawable[] = textview.getCompoundDrawables();
            textview.setCompoundDrawablesWithIntrinsicBounds(Resources.drawable(i), adrawable[1], adrawable[2], adrawable[3]);
            return;
        }
    }

    public static void setTextViewRightDrawable(TextView textview, int i)
    {
        if (textview == null || i == 0)
        {
            return;
        } else
        {
            Drawable adrawable[] = textview.getCompoundDrawables();
            Drawable drawable = Resources.drawable(i);
            textview.setCompoundDrawablesWithIntrinsicBounds(adrawable[0], adrawable[1], drawable, adrawable[3]);
            return;
        }
    }

    public static Drawable tintIcon(int i)
    {
        return tintIcon(i, 0x7f0e006d);
    }

    public static Drawable tintIcon(int i, int j)
    {
        return tintIcon(Resources.drawable(i), j);
    }

    public static Drawable tintIcon(Drawable drawable)
    {
        return tintIcon(drawable, 0x7f0e006d);
    }

    public static Drawable tintIcon(Drawable drawable, int i)
    {
        if (drawable == null)
        {
            return null;
        }
        int j = i;
        if (i == 0)
        {
            j = 0x7f0e006d;
        }
        drawable = drawable.mutate();
        try
        {
            i = Resources.color(j);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            i = j;
        }
        drawable.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
        return drawable;
    }

    public static void tintIcon(MenuItem menuitem, int i)
    {
        if (menuitem != null)
        {
            menuitem.setIcon(tintIcon(menuitem.getIcon(), i));
        }
    }

    public static void tintMenu(Menu menu, int i)
    {
        if (menu != null)
        {
            int j = 0;
            int k = menu.size();
            while (j < k) 
            {
                Object obj = menu.getItem(j);
                ((MenuItem) (obj)).setIcon(tintIcon(((MenuItem) (obj)).getIcon(), i));
                obj = ((MenuItem) (obj)).getActionView();
                if (obj != null)
                {
                    tintView(((View) (obj)), i);
                }
                j++;
            }
        }
    }

    public static void tintToolbarIcons(Toolbar toolbar, int i)
    {
        tintToolbarIcons(toolbar, i, true);
    }

    public static void tintToolbarIcons(Toolbar toolbar, int i, boolean flag)
    {
        if (toolbar != null)
        {
            if (flag)
            {
                toolbar.setNavigationIcon(tintIcon(toolbar.getNavigationIcon(), i));
            }
            tintMenu(toolbar.getMenu(), i);
            if (flag)
            {
                toolbar = ActionBar.findOverflowIcon(toolbar);
                if (toolbar != null)
                {
                    toolbar.setImageDrawable(tintIcon(toolbar.getDrawable(), i));
                    return;
                }
            }
        }
    }

    private static void tintView(View view, int i)
    {
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int k = view.getChildCount();
            for (int j = 0; j < k; j++)
            {
                tintView(view.getChildAt(j), i);
            }

        } else
        if ((view instanceof ImageView) && !Resources.string(0x7f0706da).equals(view.getTag()))
        {
            view = (ImageView)view;
            view.setImageDrawable(tintIcon(view.getDrawable(), i));
        }
    }
}
