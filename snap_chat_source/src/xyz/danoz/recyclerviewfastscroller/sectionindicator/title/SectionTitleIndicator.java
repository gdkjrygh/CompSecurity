// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package xyz.danoz.recyclerviewfastscroller.sectionindicator.title;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import xyz.danoz.recyclerviewfastscroller.sectionindicator.AbsSectionIndicator;

public abstract class SectionTitleIndicator extends AbsSectionIndicator
{

    private static final int a[];
    private final View b;
    private final TextView c;

    public SectionTitleIndicator(Context context)
    {
        this(context, null);
    }

    public SectionTitleIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SectionTitleIndicator(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = findViewById(aoA.a.section_title_popup);
        c = (TextView)findViewById(aoA.a.section_indicator_text);
        context = getContext().getTheme().obtainStyledAttributes(attributeset, a, 0, 0);
        setIndicatorBackgroundColor(context.getColor(aoA.c.SectionTitleIndicator_rfs_backgroundColor, 0x1060000));
        setIndicatorTextColor(context.getColor(aoA.c.SectionTitleIndicator_rfs_textColor, 0x1060000));
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public void setIndicatorBackgroundColor(int i)
    {
        android.graphics.drawable.Drawable drawable = b.getBackground();
        if (drawable instanceof GradientDrawable)
        {
            ((GradientDrawable)drawable).setColor(i);
            return;
        } else
        {
            b.setBackgroundColor(i);
            return;
        }
    }

    public void setIndicatorTextColor(int i)
    {
        c.setTextColor(i);
    }

    public void setTitleText(String s)
    {
        c.setText(s);
    }

    static 
    {
        a = aoA.c.SectionTitleIndicator;
    }
}
