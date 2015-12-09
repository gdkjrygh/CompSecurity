// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.internal.text.AllCapsTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

public class CompatTextView extends TextView
{

    public CompatTextView(Context context)
    {
        this(context, null);
    }

    public CompatTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CompatTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.CompatTextView, i, 0);
        boolean flag = attributeset.getBoolean(android.support.v7.appcompat.R.styleable.CompatTextView_textAllCaps, false);
        attributeset.recycle();
        if (flag)
        {
            setTransformationMethod(new AllCapsTransformationMethod(context));
        }
    }
}
