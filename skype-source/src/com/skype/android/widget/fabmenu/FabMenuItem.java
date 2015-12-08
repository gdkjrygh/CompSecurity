// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fabmenu;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.SymbolDrawable;

public class FabMenuItem extends FloatingActionButton
{

    private int a;
    private boolean b;
    private boolean c;
    private CharSequence d;
    private int e;

    public FabMenuItem(Context context)
    {
        this(context, null);
    }

    public FabMenuItem(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FabMenuItem(Context context, AttributeSet attributeset, int i)
    {
        boolean flag = true;
        super(context, attributeset, i);
        c = true;
        b = false;
        setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        if (attributeset != null)
        {
            context = getContext().obtainStyledAttributes(attributeset, com.skype.android.widget.R.styleable.FabMenuItem);
            if (context.getInt(1, 0) != 0)
            {
                flag = false;
            }
            b = flag;
            i = context.getInt(0, -1);
            e = context.getColor(2, -1);
            a = context.getDimensionPixelSize(3, getResources().getDimensionPixelSize(com.skype.android.widget.R.dimen.symbol_font_medium));
            if (i != -1)
            {
                setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.a((char)i));
            }
            i = context.getDimensionPixelSize(4, 0);
            setPadding(i, i, i, i);
            d = context.getText(5);
            context.recycle();
        }
    }

    public final boolean d()
    {
        return b;
    }

    public final CharSequence e()
    {
        return d;
    }

    public boolean isEnabled()
    {
        return c;
    }

    public void setEnabled(boolean flag)
    {
        c = flag;
    }

    public void setLabel(CharSequence charsequence)
    {
        d = charsequence;
    }

    public void setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode symbolcode)
    {
        symbolcode = new SymbolDrawable(symbolcode, SegoeTypeFaceFactory.getInstance((Application)getContext().getApplicationContext()), SymbolDrawable.a);
        int i;
        if (e != -1)
        {
            i = e;
        } else
        {
            i = -1;
        }
        symbolcode.setSymbolColor(i);
        symbolcode.a(a);
        symbolcode.a();
        setImageDrawable(symbolcode);
    }
}
