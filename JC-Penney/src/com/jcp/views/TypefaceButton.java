// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import com.jcp.d;
import com.jcp.util.z;

public class TypefaceButton extends Button
{

    public TypefaceButton(Context context)
    {
        this(context, null);
    }

    public TypefaceButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TypefaceButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
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
}
