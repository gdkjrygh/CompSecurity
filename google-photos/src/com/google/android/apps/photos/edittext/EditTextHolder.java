// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import b;
import fgn;
import noy;
import noz;

public final class EditTextHolder extends FrameLayout
{

    public final TextView a;
    public final EditText b;
    public final int c[];
    public final Rect d;
    public final noz e;
    public String f;

    public EditTextHolder(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EditTextHolder(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new int[2];
        d = new Rect(0, 0, 0, 0);
        e = noz.a(context, 2, "EditTextHolder", new String[0]);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            inflate(getContext(), b.oA, this);
            setBackground(b.a(getResources(), b.ox, null));
        } else
        {
            inflate(getContext(), b.oB, this);
        }
        a = (TextView)findViewById(b.oz);
        b = (EditText)findViewById(b.oy);
        context = context.getTheme().obtainStyledAttributes(attributeset, fgn.a, 0, 0);
        f = context.getString(fgn.b);
        attributeset = context.getString(fgn.c);
        context.recycle();
        a.setSaveEnabled(true);
        b.setSaveEnabled(true);
        if (!TextUtils.isEmpty(f))
        {
            b(f);
            a(f);
        }
        if (!TextUtils.isEmpty(attributeset))
        {
            a.setHint(attributeset);
        }
        a.setPadding(b.getPaddingLeft(), b.getPaddingTop(), b.getPaddingRight(), b.getPaddingBottom());
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public static InputMethodManager a(Context context)
    {
        return (InputMethodManager)context.getSystemService("input_method");
    }

    public final String a()
    {
        return b.getText().toString();
    }

    public final void a(String s)
    {
        if (e.a())
        {
            noy.a("staticText", s);
        }
        a.setText(s);
    }

    public final void b(String s)
    {
        if (e.a())
        {
            noy.a("editableText", s);
        }
        b.setText(s);
    }

    public final boolean b()
    {
        return b.getVisibility() == 0;
    }

    public final void c()
    {
        b.setVisibility(0);
        b.requestFocus();
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }
}
