// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.p;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class AppCompatCheckedTextView extends CheckedTextView
{

    private static final int a[] = {
        0x1010108
    };
    private o b;

    public AppCompatCheckedTextView(Context context)
    {
        this(context, null);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x10103c8);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (o.a)
        {
            context = p.a(getContext(), attributeset, a, i);
            setCheckMarkDrawable(context.a(0));
            context.b();
            b = context.c();
        }
    }

    public void setCheckMarkDrawable(int i)
    {
        if (b != null)
        {
            setCheckMarkDrawable(b.a(i));
            return;
        } else
        {
            super.setCheckMarkDrawable(i);
            return;
        }
    }

}
