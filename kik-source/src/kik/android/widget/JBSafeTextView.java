// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class JBSafeTextView extends TextView
{

    public JBSafeTextView(Context context)
    {
        this(context, null);
    }

    public JBSafeTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public JBSafeTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        try
        {
            super.onMeasure(i, j);
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            setText(getText().toString());
        }
        super.onMeasure(i, j);
    }
}
