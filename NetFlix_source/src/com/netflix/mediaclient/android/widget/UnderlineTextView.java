// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.TextView;

public class UnderlineTextView extends TextView
{

    private boolean mUnderline;

    public UnderlineTextView(Context context)
    {
        super(context);
    }

    public UnderlineTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(attributeset);
    }

    public UnderlineTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(attributeset);
    }

    private void init(AttributeSet attributeset)
    {
        int i;
        attributeset = getContext().obtainStyledAttributes(attributeset, com.netflix.mediaclient.R.styleable.UnderlineTextView);
        if (attributeset == null)
        {
            return;
        }
        i = 0;
_L6:
        if (i >= attributeset.getIndexCount()) goto _L2; else goto _L1
_L1:
        int j = attributeset.getIndex(i);
        j;
        JVM INSTR tableswitch 0 0: default 52
    //                   0 59;
           goto _L3 _L4
_L3:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        mUnderline = attributeset.getBoolean(j, false);
        if (true) goto _L3; else goto _L2
_L2:
        attributeset.recycle();
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean isUnderline()
    {
        return mUnderline;
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        if (charsequence != null && mUnderline)
        {
            buffertype = new SpannableString(charsequence);
            buffertype.setSpan(new UnderlineSpan(), 0, charsequence.length(), 0);
            super.setText(buffertype, android.widget.TextView.BufferType.SPANNABLE);
            return;
        } else
        {
            super.setText(charsequence, buffertype);
            return;
        }
    }

    public void setUnderline(boolean flag)
    {
        mUnderline = flag;
    }
}
