// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.internal.widget.al;
import android.support.v7.internal.widget.an;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class AppCompatCheckedTextView extends CheckedTextView
{

    private static final int a[] = {
        0x1010108
    };
    private al b;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, (byte)0);
    }

    private AppCompatCheckedTextView(Context context, AttributeSet attributeset, byte byte0)
    {
        super(context, attributeset, 0x10103c8);
        if (al.a)
        {
            context = an.a(getContext(), attributeset, a, 0x10103c8);
            setCheckMarkDrawable(context.a(0));
            ((an) (context)).a.recycle();
            b = context.a();
        }
    }

    public void setCheckMarkDrawable(int i)
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
