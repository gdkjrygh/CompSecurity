// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.q;
import com.facebook.widget.animatablelistview.AnimatingItemView;

// Referenced classes of package com.facebook.orca.common.ui.widgets:
//            f

public class SlidingOutSuggestionView extends f
{

    private final TextView a;
    private final View b;
    private final View c;
    private final Button d;
    private int e;

    public SlidingOutSuggestionView(Context context)
    {
        this(context, null);
    }

    public SlidingOutSuggestionView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingOutSuggestionView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        e = 0;
        setContentView(k.orca_sliding_out_suggestion);
        setContainer((AnimatingItemView)c(i.suggestion_container));
        a = (TextView)c(i.sliding_out_suggestion_text);
        b = c(i.sliding_out_suggestion_separator_top);
        c = c(i.sliding_out_suggestion_separator_bottom);
        d = (Button)c(i.sliding_out_suggestion_button);
        context = context.obtainStyledAttributes(attributeset, q.SlidingOutSuggestionView);
        int l = context.getIndexCount();
        j = 0;
        while (j < l) 
        {
            int i1 = context.getIndex(j);
            if (i1 == q.SlidingOutSuggestionView_dividerPosition)
            {
                setDividerPosition(context.getInt(i1, e));
            } else
            if (i1 == q.SlidingOutSuggestionView_suggestionText)
            {
                setSuggestionText(context.getText(i1));
            } else
            if (i1 == q.SlidingOutSuggestionView_buttonText)
            {
                setButtonText(context.getText(i1));
            }
            j++;
        }
        context.recycle();
    }

    public void a()
    {
        a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public boolean b()
    {
        return (e & 4) == 4;
    }

    public boolean c()
    {
        return (e & 8) == 8;
    }

    public void setButtonText(int j)
    {
        d.setText(j);
    }

    public void setButtonText(CharSequence charsequence)
    {
        d.setText(charsequence);
    }

    public void setDividerPosition(int j)
    {
        boolean flag = false;
        e = j;
        View view = b;
        if (b())
        {
            j = 0;
        } else
        {
            j = 8;
        }
        view.setVisibility(j);
        view = c;
        if (c())
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 8;
        }
        view.setVisibility(j);
    }

    public void setOnButtonClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d.setOnClickListener(onclicklistener);
    }

    public void setSuggestionText(int j)
    {
        a.setText(j);
    }

    public void setSuggestionText(CharSequence charsequence)
    {
        a.setText(charsequence);
    }
}
