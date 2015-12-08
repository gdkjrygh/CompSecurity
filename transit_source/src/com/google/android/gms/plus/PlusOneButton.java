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
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.fm;

public final class PlusOneButton extends FrameLayout
{
    protected class DefaultOnPlusOneClickListener
        implements android.view.View.OnClickListener, OnPlusOneClickListener
    {

        private final OnPlusOneClickListener ri;
        final PlusOneButton rj;

        public void onClick(View view)
        {
            view = (Intent)PlusOneButton.a(rj).getTag();
            if (ri != null)
            {
                ri.onPlusOneClick(view);
                return;
            } else
            {
                onPlusOneClick(view);
                return;
            }
        }

        public void onPlusOneClick(Intent intent)
        {
            Context context = rj.getContext();
            if ((context instanceof Activity) && intent != null)
            {
                ((Activity)context).startActivityForResult(intent, PlusOneButton.b(rj));
            }
        }

        public DefaultOnPlusOneClickListener(OnPlusOneClickListener onplusoneclicklistener)
        {
            rj = PlusOneButton.this;
            super();
            ri = onplusoneclicklistener;
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
    private String hN;
    private int mSize;
    private View re;
    private int rf;
    private int rg;
    private OnPlusOneClickListener rh;

    public PlusOneButton(Context context)
    {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSize = getSize(context, attributeset);
        rf = getAnnotation(context, attributeset);
        rg = -1;
        p(getContext());
        if (!isInEditMode());
    }

    static View a(PlusOneButton plusonebutton)
    {
        return plusonebutton.re;
    }

    static int b(PlusOneButton plusonebutton)
    {
        return plusonebutton.rg;
    }

    protected static int getAnnotation(Context context, AttributeSet attributeset)
    {
        byte byte0 = 0;
        context = dp.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeset, true, false, "PlusOneButton");
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
        context = dp.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeset, true, false, "PlusOneButton");
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

    private void p(Context context)
    {
        if (re != null)
        {
            removeView(re);
        }
        re = fm.a(context, mSize, rf, hN, rg);
        setOnPlusOneClickListener(rh);
        addView(re);
    }

    public void initialize(String s, int i)
    {
        dm.a(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(PlusClient, String, OnPlusOneClickListener).");
        hN = s;
        rg = i;
        p(getContext());
    }

    public void initialize(String s, OnPlusOneClickListener onplusoneclicklistener)
    {
        hN = s;
        rg = 0;
        p(getContext());
        setOnPlusOneClickListener(onplusoneclicklistener);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        re.layout(0, 0, k - i, l - j);
    }

    protected void onMeasure(int i, int j)
    {
        View view = re;
        measureChild(view, i, j);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i)
    {
        rf = i;
        p(getContext());
    }

    public void setOnPlusOneClickListener(OnPlusOneClickListener onplusoneclicklistener)
    {
        rh = onplusoneclicklistener;
        re.setOnClickListener(new DefaultOnPlusOneClickListener(onplusoneclicklistener));
    }

    public void setSize(int i)
    {
        mSize = i;
        p(getContext());
    }
}
