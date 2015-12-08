// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.l;
import android.support.v7.internal.b.a;
import android.util.AttributeSet;
import android.widget.TextView;

public class AppCompatTextView extends TextView
{

    public AppCompatTextView(Context context)
    {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010084);
    }

    public AppCompatTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, l.N, i, 0);
        int j = typedarray.getResourceId(l.O, -1);
        typedarray.recycle();
        if (j != -1)
        {
            TypedArray typedarray1 = context.obtainStyledAttributes(j, l.aY);
            if (typedarray1.hasValue(l.ba))
            {
                setAllCaps(typedarray1.getBoolean(l.ba, false));
            }
            typedarray1.recycle();
        }
        context = context.obtainStyledAttributes(attributeset, l.N, i, 0);
        if (context.hasValue(l.P))
        {
            setAllCaps(context.getBoolean(l.P, false));
        }
        context.recycle();
    }

    public void setAllCaps(boolean flag)
    {
        a a1;
        if (flag)
        {
            a1 = new a(getContext());
        } else
        {
            a1 = null;
        }
        setTransformationMethod(a1);
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        context = context.obtainStyledAttributes(i, l.aY);
        if (context.hasValue(l.ba))
        {
            setAllCaps(context.getBoolean(l.ba, false));
        }
        context.recycle();
    }
}
