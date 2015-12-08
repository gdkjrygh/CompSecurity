// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.microsoft.onlineid.internal.ui.e;

public class StyledTextView extends TextView
{

    public StyledTextView(Context context)
    {
        super(context);
    }

    public StyledTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    public StyledTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, com.microsoft.onlineid.c.a.d.StyledTextView, 0, 0);
        int i = 0;
        while (i < attributeset.getIndexCount()) 
        {
            int j = attributeset.getIndex(i);
            if (j == com.microsoft.onlineid.c.a.d.StyledTextView_font)
            {
                if (!isInEditMode())
                {
                    String s = attributeset.getString(j);
                    if (s != null)
                    {
                        setTypeface(e.valueOf(s).a(context));
                    }
                }
            } else
            if (j == com.microsoft.onlineid.c.a.d.StyledTextView_isUnderlined)
            {
                if (attributeset.getBoolean(j, false))
                {
                    setPaintFlags(getPaintFlags() | 8);
                } else
                {
                    setPaintFlags(getPaintFlags() & -9);
                }
            }
            i++;
        }
        attributeset.recycle();
    }
}
