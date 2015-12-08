// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class ContextThemeWrapper extends ContextWrapper
{

    private LayoutInflater mInflater;
    private android.content.res.Resources.Theme mTheme;
    public int mThemeResource;

    public ContextThemeWrapper(Context context, int i)
    {
        super(context);
        mThemeResource = i;
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
        mTheme.applyStyle(mThemeResource, true);
    }

    public final Object getSystemService(String s)
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

    public final android.content.res.Resources.Theme getTheme()
    {
        if (mTheme != null)
        {
            return mTheme;
        }
        if (mThemeResource == 0)
        {
            mThemeResource = 0x7f1101a6;
        }
        initializeTheme();
        return mTheme;
    }

    public final void setTheme(int i)
    {
        mThemeResource = i;
        initializeTheme();
    }
}
