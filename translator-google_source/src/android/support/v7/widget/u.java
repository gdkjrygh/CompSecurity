// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.b.a;
import android.support.v7.internal.widget.ah;
import android.util.AttributeSet;
import android.widget.TextView;

final class u
{

    private static final int a[] = {
        0x1010034
    };
    private static final int b[];
    private final TextView c;

    u(TextView textview)
    {
        c = textview;
    }

    final void a(Context context, int i)
    {
        context = context.obtainStyledAttributes(i, b);
        if (context.hasValue(0))
        {
            a(context.getBoolean(0, false));
        }
        context.recycle();
    }

    final void a(AttributeSet attributeset, int i)
    {
        Context context = c.getContext();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, a, i, 0);
        int j = typedarray.getResourceId(0, -1);
        typedarray.recycle();
        if (j != -1)
        {
            TypedArray typedarray1 = context.obtainStyledAttributes(j, l.TextAppearance);
            if (typedarray1.hasValue(l.TextAppearance_textAllCaps))
            {
                a(typedarray1.getBoolean(l.TextAppearance_textAllCaps, false));
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
                i = ah.c(context, 0x1010038);
            } else
            {
                i = ah.a(context, 0x1010038);
            }
            c.setTextColor(ah.a(attributeset.getDefaultColor(), i));
        }
    }

    final void a(boolean flag)
    {
        TextView textview = c;
        a a1;
        if (flag)
        {
            a1 = new a(c.getContext());
        } else
        {
            a1 = null;
        }
        textview.setTransformationMethod(a1);
    }

    static 
    {
        b = (new int[] {
            b.textAllCaps
        });
    }
}
