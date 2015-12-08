// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public final class abr extends CheckedTextView
{

    private static final int a[] = {
        0x1010108
    };
    private yh b;

    public abr(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x10103c8);
    }

    private abr(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, 0x10103c8);
        if (yh.a)
        {
            context = yj.a(getContext(), attributeset, a, 0x10103c8, 0);
            setCheckMarkDrawable(context.a(0));
            ((yj) (context)).a.recycle();
            b = context.a();
        }
    }

    public final void setCheckMarkDrawable(int i)
    {
        if (b != null)
        {
            setCheckMarkDrawable(b.a(i, false));
            return;
        } else
        {
            super.setCheckMarkDrawable(i);
            return;
        }
    }

}
