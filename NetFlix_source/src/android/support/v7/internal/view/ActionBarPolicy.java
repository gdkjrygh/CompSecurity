// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;

public class ActionBarPolicy
{

    private Context mContext;

    private ActionBarPolicy(Context context)
    {
        mContext = context;
    }

    public static ActionBarPolicy get(Context context)
    {
        return new ActionBarPolicy(context);
    }

    public boolean enableHomeButtonByDefault()
    {
        return mContext.getApplicationInfo().targetSdkVersion < 14;
    }

    public int getEmbeddedMenuWidthLimit()
    {
        return mContext.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int getMaxActionButtons()
    {
        return mContext.getResources().getInteger(android.support.v7.appcompat.R.integer.abc_max_action_buttons);
    }

    public int getStackedTabMaxWidth()
    {
        return mContext.getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    public int getTabContainerHeight()
    {
        TypedArray typedarray = mContext.obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
        int j = typedarray.getLayoutDimension(1, 0);
        Resources resources = mContext.getResources();
        int i = j;
        if (!hasEmbeddedTabs())
        {
            i = Math.min(j, resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_action_bar_stacked_max_height));
        }
        typedarray.recycle();
        return i;
    }

    public boolean hasEmbeddedTabs()
    {
        return mContext.getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_action_bar_embed_tabs_pre_jb);
    }

    public boolean showsOverflowMenuButton()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }
}
