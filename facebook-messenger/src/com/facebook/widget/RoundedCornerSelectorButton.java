// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.q;

// Referenced classes of package com.facebook.widget:
//            f

public class RoundedCornerSelectorButton extends f
{

    private TextView a;

    public RoundedCornerSelectorButton(Context context)
    {
        this(context, null, 0);
    }

    public RoundedCornerSelectorButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RoundedCornerSelectorButton(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.rounded_corner_selector_button);
        View view = getView(i.item_root);
        a = (TextView)getView(i.item_label);
        setClickable(true);
        setBackgroundDrawable(getResources().getDrawable(h.solid_white));
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            view.setBackgroundResource(h.orca_item_background_holo_light);
        } else
        {
            view.setBackgroundResource(0x1080062);
        }
        context = context.obtainStyledAttributes(attributeset, q.RoundedCornerSelectorButton);
        a.setText(context.getString(q.RoundedCornerSelectorButton_text));
        if (context.hasValue(q.RoundedCornerSelectorButton_textColor))
        {
            j = context.getColor(q.RoundedCornerSelectorButton_textColor, Color.rgb(0, 0, 0));
            a.setTextColor(j);
        }
        if (context.hasValue(q.RoundedCornerSelectorButton_textSize))
        {
            j = context.getDimensionPixelSize(q.RoundedCornerSelectorButton_textSize, 14);
            a.setTextSize(0, j);
        }
        if (context.hasValue(q.RoundedCornerSelectorButton_textGravity))
        {
            j = context.getInteger(q.RoundedCornerSelectorButton_textGravity, 3);
            a.setGravity(j);
        }
        if (context.hasValue(q.RoundedCornerSelectorButton_textStyle) || context.hasValue(q.RoundedCornerSelectorButton_typeface))
        {
            j = context.getInteger(q.RoundedCornerSelectorButton_textStyle, 0);
            a(context.getInt(q.RoundedCornerSelectorButton_typeface, -1), j);
        }
        if (context.getBoolean(q.RoundedCornerSelectorButton_showChevronOnRight, false))
        {
            a.setCompoundDrawablesWithIntrinsicBounds(0, 0, h.list_chevron, 0);
        }
        context.recycle();
    }

    private void a(int j, int l)
    {
        Typeface typeface = null;
        j;
        JVM INSTR tableswitch 1 3: default 28
    //                   1 35
    //                   2 42
    //                   3 49;
           goto _L1 _L2 _L3 _L4
_L1:
        a(typeface, l);
        return;
_L2:
        typeface = Typeface.SANS_SERIF;
        continue; /* Loop/switch isn't completed */
_L3:
        typeface = Typeface.SERIF;
        continue; /* Loop/switch isn't completed */
_L4:
        typeface = Typeface.MONOSPACE;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void a(Typeface typeface, int j)
    {
        a.setTypeface(typeface, j);
    }

    public void setText(String s)
    {
        a.setText(s);
    }

    public void setTextColor(int j)
    {
        a.setTextColor(j);
    }

    public void setTextSize(float f1)
    {
        a.setTextSize(f1);
    }
}
