// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public final class ace
{

    private static final int a[] = {
        0x1010034
    };
    private static final int b[];
    private final TextView c;

    public ace(TextView textview)
    {
        c = textview;
    }

    public final void a(Context context, int i)
    {
        context = context.obtainStyledAttributes(i, b);
        if (context.hasValue(0))
        {
            a(context.getBoolean(0, false));
        }
        context.recycle();
    }

    public final void a(AttributeSet attributeset, int i)
    {
        Context context = c.getContext();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, a, i, 0);
        int j = typedarray.getResourceId(0, -1);
        typedarray.recycle();
        if (j != -1)
        {
            TypedArray typedarray1 = context.obtainStyledAttributes(j, uh.bm);
            if (typedarray1.hasValue(uh.br))
            {
                a(typedarray1.getBoolean(uh.br, false));
            }
            typedarray1.recycle();
        }
        attributeset = context.obtainStyledAttributes(attributeset, b, i, 0);
        if (attributeset.hasValue(0))
        {
            a(attributeset.getBoolean(0, false));
        }
        attributeset.recycle();
        attributeset = c.getTextColors();
        if (attributeset != null && !attributeset.isStateful())
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                i = yd.c(context, 0x1010038);
            } else
            {
                i = yd.a(context, 0x1010038);
            }
            c.setTextColor(yd.a(attributeset.getDefaultColor(), i));
        }
    }

    public final void a(boolean flag)
    {
        TextView textview = c;
        va va1;
        if (flag)
        {
            va1 = new va(c.getContext());
        } else
        {
            va1 = null;
        }
        textview.setTransformationMethod(va1);
    }

    static 
    {
        b = (new int[] {
            b.S
        });
    }
}
