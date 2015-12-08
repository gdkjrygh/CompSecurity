// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.LayoutInflater;

public class ContextThemeWrapper extends ContextWrapper
{

    private LayoutInflater mInflater;
    private android.content.res.Resources.Theme mTheme;
    private int mThemeResource;

    public ContextThemeWrapper(Context context, int i)
    {
        super(context);
        mThemeResource = i;
    }

    public ContextThemeWrapper(Context context, android.content.res.Resources.Theme theme)
    {
        super(context);
        mTheme = theme;
    }

    private void initializeTheme()
    {
        boolean flag;
        if (mTheme == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            mTheme = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null)
            {
                mTheme.setTo(theme);
            }
        }
        onApplyThemeResource(mTheme, mThemeResource, flag);
    }

    public Object getSystemService(String s)
    {
        if ("layout_inflater".equals(s))
        {
            if (mInflater == null)
            {
                mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return mInflater;
        } else
        {
            return getBaseContext().getSystemService(s);
        }
    }

    public android.content.res.Resources.Theme getTheme()
    {
        if (mTheme != null)
        {
            return mTheme;
        }
        if (mThemeResource == 0)
        {
            mThemeResource = android.support.v7.appcompat.R.style.Theme_AppCompat_Light;
        }
        initializeTheme();
        return mTheme;
    }

    public int getThemeResId()
    {
        return mThemeResource;
    }

    protected void onApplyThemeResource(android.content.res.Resources.Theme theme, int i, boolean flag)
    {
        theme.applyStyle(i, true);
    }

    public void setTheme(int i)
    {
        if (mThemeResource != i)
        {
            mThemeResource = i;
            initializeTheme();
        }
    }
}
