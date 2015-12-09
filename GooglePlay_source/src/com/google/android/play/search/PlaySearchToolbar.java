// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PlaySearchToolbar extends Toolbar
    implements android.support.v4.view.MenuItemCompat.OnActionExpandListener
{

    private Drawable mBackground;
    private int mExpandedMenuItemId;
    private final Map mPreviousVisibility = new HashMap();
    private int mSearchBoxTopMargin;

    public PlaySearchToolbar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = getContext().getResources();
        mSearchBoxTopMargin = context.getDimensionPixelSize(0x7f0c0332) + context.getDimensionPixelSize(0x7f0c02b9);
    }

    protected void onMeasure(int i, int j)
    {
        if (hasExpandedActionView())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            if (hasExpandedActionView())
            {
                throw new NullPointerException();
            }
            for (i = 0; i < getChildCount(); i++)
            {
                View view = getChildAt(i);
                if (view != null && view != null && view.getVisibility() != 8)
                {
                    mPreviousVisibility.put(view, Integer.valueOf(view.getVisibility()));
                    view.setVisibility(8);
                }
            }

        } else
        if (mPreviousVisibility.size() != 0)
        {
            Iterator iterator = mPreviousVisibility.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (entry.getKey() != null)
                {
                    ((View)entry.getKey()).setVisibility(((Integer)entry.getValue()).intValue());
                }
            } while (true);
            mPreviousVisibility.clear();
        }
        throw new NullPointerException();
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        mExpandedMenuItemId = -1;
        return true;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            View view = findViewById(menuitem.getItemId());
            if (view != null)
            {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                new Point(new Point(rect.centerX(), rect.centerY()));
            }
        }
        mExpandedMenuItemId = menuitem.getItemId();
        menuitem = getLayoutParams();
        if (menuitem != null && (((android.view.ViewGroup.LayoutParams) (menuitem)).height != -2 || ViewCompat.getMinimumHeight(this) != 0))
        {
            menuitem.height = -2;
            setMinimumHeight(0);
        }
        return true;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            mExpandedMenuItemId = parcelable.getInt("play_search_toolbar.expanded_menu_item_id");
            parcelable.getParcelable("play_search_toolbar.search_view_state");
            throw new NullPointerException();
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("play_search_toolbar.parent_instance_state", super.onSaveInstanceState());
        bundle.putInt("play_search_toolbar.expanded_menu_item_id", mExpandedMenuItemId);
        throw new NullPointerException();
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mBackground = drawable;
        super.setBackgroundDrawable(drawable);
    }

    public final void setNavigationOnClickListener(final android.view.View.OnClickListener listener)
    {
        super.setNavigationOnClickListener(listener);
        new android.view.View.OnClickListener() {

            final PlaySearchToolbar this$0;
            final android.view.View.OnClickListener val$listener;

            public final void onClick(View view)
            {
                throw new NullPointerException();
            }

            
            {
                this$0 = PlaySearchToolbar.this;
                listener = onclicklistener;
                super();
            }
        };
        throw new NullPointerException();
    }
}
