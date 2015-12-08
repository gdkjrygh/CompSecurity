// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class RobotoTextView extends TextView
{

    static Typeface m_typeface = null;

    public RobotoTextView(Context context)
    {
        super(context);
        if (m_typeface == null)
        {
            m_typeface = Typeface.createFromAsset(getContext().getAssets(), "robotoregular.ttf");
        }
    }

    public RobotoTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (m_typeface == null)
        {
            m_typeface = Typeface.createFromAsset(getContext().getAssets(), "robotoregular.ttf");
        }
    }

    public RobotoTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (m_typeface == null)
        {
            m_typeface = Typeface.createFromAsset(getContext().getAssets(), "robotoregular.ttf");
        }
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        if (m_typeface != null)
        {
            setTypeface(m_typeface);
        }
        super.setText(charsequence.toString(), buffertype);
    }

}
