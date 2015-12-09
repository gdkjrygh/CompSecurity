// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.a.a;
import android.util.AttributeSet;
import android.widget.TextView;
import com.jcp.c.al;
import com.jcp.d;
import com.jcp.util.bt;
import com.jcp.util.z;

public class TypefaceTextView extends TextView
{

    private al a;

    public TypefaceTextView(Context context)
    {
        this(context, null);
        a();
    }

    public TypefaceTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
        a();
    }

    public TypefaceTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
        if (!isInEditMode())
        {
            if ((attributeset = context.obtainStyledAttributes(attributeset, d.TypefaceTextView)) != null)
            {
                context = z.a(context, attributeset.getInteger(0, 0));
                if (context != null)
                {
                    setTypeface(context);
                }
                attributeset.recycle();
                return;
            }
        }
    }

    private void a()
    {
        a = new al();
    }

    public void a(int i, int j)
    {
        j = bt.a(getContext(), j);
        setCompoundDrawables(bt.a(android.support.v4.a.a.a(getContext(), i), j, j), null, null, null);
    }
}
