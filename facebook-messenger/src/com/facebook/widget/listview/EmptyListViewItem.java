// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.q;
import com.facebook.widget.f;

public class EmptyListViewItem extends f
{

    private LayoutInflater a;
    private View b;
    private RelativeLayout c;
    private ProgressBar d;
    private TextView e;

    public EmptyListViewItem(Context context)
    {
        super(context);
        a(((AttributeSet) (null)));
    }

    public EmptyListViewItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(attributeset);
    }

    public EmptyListViewItem(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a(attributeset);
    }

    private void a(AttributeSet attributeset)
    {
        a = (LayoutInflater)getInjector().a(android/view/LayoutInflater);
        b = a.inflate(k.orca_empty_list_view_item, this);
        c = (RelativeLayout)b.findViewById(i.empty_item_wrapper);
        d = (ProgressBar)b.findViewById(i.empty_item_progress);
        e = (TextView)b.findViewById(i.empty_item_text);
        attributeset = getContext().obtainStyledAttributes(attributeset, q.EmptyListViewItem);
        if (attributeset.peekValue(q.EmptyListViewItem_textColor) != null)
        {
            e.setTextColor(attributeset.getColor(q.EmptyListViewItem_textColor, 0));
        }
        if (attributeset.peekValue(q.EmptyListViewItem_empty_background_color) != null)
        {
            c.setBackgroundDrawable(new ColorDrawable(attributeset.getColor(q.EmptyListViewItem_empty_background_color, 0)));
        }
        attributeset.recycle();
    }

    public void a(boolean flag)
    {
        ProgressBar progressbar = d;
        int j;
        if (flag)
        {
            j = 0;
        } else
        {
            j = 4;
        }
        progressbar.setVisibility(j);
    }

    public boolean a()
    {
        return d.getVisibility() == 0;
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        c.setBackgroundDrawable(drawable);
    }

    public void setMessage(int j)
    {
        e.setText(j);
    }

    public void setMessage(CharSequence charsequence)
    {
        e.setText(charsequence);
    }

    public void setMovementMethod(MovementMethod movementmethod)
    {
        e.setMovementMethod(movementmethod);
    }

    public void setTextColor(int j)
    {
        e.setTextColor(j);
    }
}
