// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cn;
import nzw;
import oaw;
import p;

public class LabelPreference extends nzw
{

    private CharSequence a;
    private int b;
    private int c;

    public LabelPreference(Context context)
    {
        super(context);
        c = -1;
        a(context, null);
    }

    public LabelPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = -1;
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        a(p.bM);
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, oaw.a);
            c = context.getDimensionPixelSize(oaw.c, -1);
            b = context.getInt(oaw.b, 1);
            context.recycle();
        }
    }

    protected final View a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((TextView)viewgroup.findViewById(cn.S)).setAutoLinkMask(b);
        return viewgroup;
    }

    protected final void a(View view)
    {
        super.a(view);
        if (c >= 0)
        {
            view.setMinimumHeight(c);
        }
        TextView textview = (TextView)view.findViewById(cn.O);
        View view1 = view.findViewById(cn.R);
        if (textview != null)
        {
            if (TextUtils.isEmpty(a))
            {
                textview.setVisibility(8);
            } else
            {
                textview.setVisibility(0);
                textview.setText(a);
            }
        }
        view.findViewById(cn.S);
        if (view1 != null)
        {
            view1.setVisibility(8);
        }
    }

    public final void a(CharSequence charsequence)
    {
        if (!charsequence.equals(a))
        {
            a = charsequence;
            g();
        }
    }

    public final boolean b()
    {
        return true;
    }
}
