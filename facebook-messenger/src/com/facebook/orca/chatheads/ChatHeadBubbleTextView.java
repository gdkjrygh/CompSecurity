// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.f;
import com.facebook.g;

public class ChatHeadBubbleTextView extends TextView
{

    private boolean a;

    public ChatHeadBubbleTextView(Context context)
    {
        this(context, null, 0);
    }

    public ChatHeadBubbleTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ChatHeadBubbleTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = getResources();
        setShadowLayer(context.getDimension(g.chat_head_nux_bubble_text_shadow_radius), context.getDimension(g.chat_head_nux_bubble_text_shadow_dx), context.getDimension(g.chat_head_nux_bubble_text_shadow_dy), context.getColor(f.chat_heads_nux_bubble_shadow));
    }

    private int getTextRealWidth()
    {
        float f1 = 0.0F;
        for (int i = 0; i < getLayout().getLineCount(); i++)
        {
            f1 = Math.max(f1, getLayout().getLineWidth(i));
        }

        return Math.round((float)getPaddingLeft() + f1 + (float)getPaddingRight());
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (a && android.view.View.MeasureSpec.getMode(i) != 0x40000000 && getLayout().getLineCount() > 1)
        {
            i = getTextRealWidth();
            if (i < getMeasuredWidth())
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
            }
        }
    }

    public void setMaxEms(int i)
    {
        super.setMaxEms(i);
        a = true;
    }

    public void setMaxWidth(int i)
    {
        super.setMaxWidth(i);
        a = true;
    }
}
