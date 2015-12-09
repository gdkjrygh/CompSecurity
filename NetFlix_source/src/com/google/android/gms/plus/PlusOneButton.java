// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.ft;
import com.google.android.gms.plus.internal.g;

public final class PlusOneButton extends FrameLayout
{
    protected class DefaultOnPlusOneClickListener
        implements android.view.View.OnClickListener, OnPlusOneClickListener
    {

        private final OnPlusOneClickListener TX;
        final PlusOneButton TY;

        public void onClick(View view)
        {
            view = (Intent)PlusOneButton.a(TY).getTag();
            if (TX != null)
            {
                TX.onPlusOneClick(view);
                return;
            } else
            {
                onPlusOneClick(view);
                return;
            }
        }

        public void onPlusOneClick(Intent intent)
        {
            Context context = TY.getContext();
            if ((context instanceof Activity) && intent != null)
            {
                ((Activity)context).startActivityForResult(intent, PlusOneButton.b(TY));
            }
        }

        public DefaultOnPlusOneClickListener(OnPlusOneClickListener onplusoneclicklistener)
        {
            TY = PlusOneButton.this;
            super();
            TX = onplusoneclicklistener;
        }
    }

    public static interface OnPlusOneClickListener
    {

        public abstract void onPlusOneClick(Intent intent);
    }


    public static final int ANNOTATION_BUBBLE = 1;
    public static final int ANNOTATION_INLINE = 2;
    public static final int ANNOTATION_NONE = 0;
    public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
    public static final int SIZE_MEDIUM = 1;
    public static final int SIZE_SMALL = 0;
    public static final int SIZE_STANDARD = 3;
    public static final int SIZE_TALL = 2;
    private View TT;
    private int TU;
    private int TV;
    private OnPlusOneClickListener TW;
    private int mSize;
    private String ro;

    public PlusOneButton(Context context)
    {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSize = getSize(context, attributeset);
        TU = getAnnotation(context, attributeset);
        TV = -1;
        v(getContext());
        if (!isInEditMode());
    }

    static View a(PlusOneButton plusonebutton)
    {
        return plusonebutton.TT;
    }

    static int b(PlusOneButton plusonebutton)
    {
        return plusonebutton.TV;
    }

    protected static int getAnnotation(Context context, AttributeSet attributeset)
    {
        byte byte0 = 0;
        context = ft.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeset, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(context))
        {
            byte0 = 2;
        } else
        if (!"NONE".equalsIgnoreCase(context))
        {
            return 1;
        }
        return byte0;
    }

    protected static int getSize(Context context, AttributeSet attributeset)
    {
        context = ft.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeset, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(context))
        {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(context))
        {
            return 1;
        }
        return !"TALL".equalsIgnoreCase(context) ? 3 : 2;
    }

    private void v(Context context)
    {
        if (TT != null)
        {
            removeView(TT);
        }
        TT = g.a(context, mSize, TU, ro, TV);
        setOnPlusOneClickListener(TW);
        addView(TT);
    }

    public void initialize(String s, int i)
    {
        fq.a(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
        ro = s;
        TV = i;
        v(getContext());
    }

    public void initialize(String s, OnPlusOneClickListener onplusoneclicklistener)
    {
        ro = s;
        TV = 0;
        v(getContext());
        setOnPlusOneClickListener(onplusoneclicklistener);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        TT.layout(0, 0, k - i, l - j);
    }

    protected void onMeasure(int i, int j)
    {
        View view = TT;
        measureChild(view, i, j);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i)
    {
        TU = i;
        v(getContext());
    }

    public void setOnPlusOneClickListener(OnPlusOneClickListener onplusoneclicklistener)
    {
        TW = onplusoneclicklistener;
        TT.setOnClickListener(new DefaultOnPlusOneClickListener(onplusoneclicklistener));
    }

    public void setSize(int i)
    {
        mSize = i;
        v(getContext());
    }
}
