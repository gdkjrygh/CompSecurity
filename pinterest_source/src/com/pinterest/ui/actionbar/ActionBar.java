// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionbar;

import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import java.lang.reflect.Field;

public class ActionBar extends LinearLayout
{

    Toolbar _actionBar;
    View _shadow;

    public ActionBar(Context context)
    {
        this(context, null);
    }

    public ActionBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static ImageView findOverflowIcon(Toolbar toolbar)
    {
        int j = toolbar.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = toolbar.getChildAt(i);
            if (view instanceof ActionMenuView)
            {
                toolbar = (ViewGroup)view;
                int k = toolbar.getChildCount();
                for (i = 0; i < k; i++)
                {
                    View view1 = toolbar.getChildAt(i);
                    if (view1 instanceof ImageView)
                    {
                        return (ImageView)view1;
                    }
                }

                return null;
            }
        }

        return null;
    }

    public static TextView findTitleTextView(Toolbar toolbar)
    {
        try
        {
            Field field = toolbar.getClass().getDeclaredField("mTitleTextView");
            field.setAccessible(true);
            toolbar = (TextView)field.get(toolbar);
        }
        // Misplaced declaration of an exception variable
        catch (Toolbar toolbar)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Toolbar toolbar)
        {
            return null;
        }
        return toolbar;
    }

    private void init()
    {
        setOrientation(1);
        inflate(getContext(), 0x7f0301b9, this);
        ButterKnife.a(this);
    }

    public Toolbar getActionBar()
    {
        return _actionBar;
    }

    public void setShadowVisibility(int i)
    {
        _shadow.setVisibility(i);
    }
}
