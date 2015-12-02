// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.g;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.f;

public class SectionView extends f
{

    private final FrameLayout a;
    private final ViewGroup b;

    public SectionView(Context context)
    {
        this(context, null);
    }

    public SectionView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SectionView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.contacts_section_view);
        b = (ViewGroup)getView(i.row_list);
        a = (FrameLayout)getView(i.entry_section_root);
        b();
    }

    protected void a(View view)
    {
        int j = b.indexOfChild(view);
        if (j != -1)
        {
            b.removeViewAt(j);
            if (b.getChildCount() != 0)
            {
                b.removeViewAt(j - 1);
                return;
            }
        }
    }

    protected void a(View view, boolean flag)
    {
        if (b.getChildCount() != 0 && flag)
        {
            View view1 = new View(getContext());
            view1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(g.divider_width)));
            view1.setBackgroundDrawable(getResources().getDrawable(h.default_separator_color));
            b.addView(view1);
        }
        b.addView(view);
        a.setVisibility(0);
    }

    protected void b()
    {
        a.setVisibility(8);
        b.removeAllViews();
    }

    protected void b(View view)
    {
        a(view, true);
    }
}
