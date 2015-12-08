// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.jcp.c.al;
import com.jcp.d;
import com.jcp.util.z;

public class TypefaceEditText extends EditText
{

    private al a;

    public TypefaceEditText(Context context)
    {
        this(context, null);
        a();
    }

    public TypefaceEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
        a();
    }

    public TypefaceEditText(Context context, AttributeSet attributeset, int i)
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

    public boolean a(TextView textview, MotionEvent motionevent)
    {
        return a.a(textview, motionevent);
    }
}
